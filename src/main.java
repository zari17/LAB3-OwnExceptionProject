import java.util.*;
import java.io.*;

public class main {
	 public static void main(String[] args)
	   {
		 try{
			 TestCustomException1.validate();
			 }
		 catch(Exception m){System.out.println("Exception occured: "+ m + " " + "\nkod b³êdu: 999x");}
		 
	     System.out.println("");
	   }
}
class TestCustomException1{
	static void validate()throws InvalidAgeException
	{
		int age;
		System.out.println("Podaj wiek: ");
		Scanner wiek = new Scanner(System.in);
		while(!wiek.hasNextInt()) {
            System.out.println("Podaj liczbe calkowita!");
            System.out.println("Podaj wiek: ");
            wiek.next(); 
        }
		age = wiek.nextInt();
	
		if(age<18){
			 throw new InvalidAgeException("Musisz miec wiecej niz 18 lat aby zaglosowac");
    }
		else
		{
			System.out.println("Witamy w glosowaniu"); 
			} 
		}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
		}