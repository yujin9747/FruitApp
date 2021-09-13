package fruitSorting;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> fl = new ArrayList<Fruit>() ;
	      System.out.println("Fruit List (ordered by name)") ;
	      Fruit sl = new Fruit(101, "Apple", 1000) ;
	      fl.add(sl) ; //adding Fruit class object
	      Fruit s2 = new Fruit(102, "Orange", 1500) ;
	      fl.add(s2) ; //adding Fruit class object
	      Fruit s3 = new Fruit(103, "Kiwi", 2000) ;
	      fl.add(s3) ; 
	      Fruit s4 = new Fruit(104, "Nut", 3000) ;
	      fl.add(s4) ;
	      Fruit s5 = new Fruit(105, "Mango", 5000) ;
	      fl.add(s5) ;
	      Fruit s6 = new Fruit(106, "Strawberry", 2500) ;
	      fl.add(s6) ;
	      Fruit s7 = new Fruit(107, "WaterMelon", 10000) ;
	      fl.add(s7) ;
	      Fruit s8 = new Fruit(108, "Onion", 6000) ;
	      fl.add(s8) ;
	      Fruit s9 = new Fruit(109, "Blueberry", 9000) ;
	      fl.add(s9) ;
	      Fruit s10 = new Fruit(110, "GoldenKiwi", 15000) ;
	      fl.add(s10) ;
	      
	      Collections.sort(fl, new FruitComparator());
	      for( Fruit s : fl) {
	         System.out.println(s.toString()) ;
	      }
	      System.out.println("Fruit List (reverse ordered by name)") ;
	      
	      Collections.sort(fl, new FruitComparatorDesc());
	      for(int i=0  ; i<fl.size(); i++) {
	         System.out.println(fl.get(i).toString()) ;
	      }


	}

}
