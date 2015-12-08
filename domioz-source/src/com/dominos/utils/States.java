// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class States
{

    private static final HashMap abbrevFiftyStatesMap = new HashMap();

    public States()
    {
    }

    public static HashMap getFiftyStatesAbbrevMap()
    {
        if (abbrevFiftyStatesMap == null || abbrevFiftyStatesMap.isEmpty())
        {
            abbrevFiftyStatesMap.put("ALABAMA", "AL");
            abbrevFiftyStatesMap.put("ALASKA", "AK");
            abbrevFiftyStatesMap.put("ARIZONA", "AZ");
            abbrevFiftyStatesMap.put("ARKANSAS", "AR");
            abbrevFiftyStatesMap.put("CALIFORNIA", "CA");
            abbrevFiftyStatesMap.put("COLORADO", "CO");
            abbrevFiftyStatesMap.put("CONNECTICUT", "CT");
            abbrevFiftyStatesMap.put("DELAWARE", "DE");
            abbrevFiftyStatesMap.put("DISTRICT OF COLUMBIA", "DC");
            abbrevFiftyStatesMap.put("FLORIDA", "FL");
            abbrevFiftyStatesMap.put("GEORGIA", "GA");
            abbrevFiftyStatesMap.put("HAWAII", "HI");
            abbrevFiftyStatesMap.put("IDAHO", "ID");
            abbrevFiftyStatesMap.put("ILLINOIS", "IL");
            abbrevFiftyStatesMap.put("INDIANA", "IN");
            abbrevFiftyStatesMap.put("IOWA", "IA");
            abbrevFiftyStatesMap.put("KANSAS", "KS");
            abbrevFiftyStatesMap.put("KENTUCKY", "KY");
            abbrevFiftyStatesMap.put("LOUISIANA", "LA");
            abbrevFiftyStatesMap.put("MAINE", "ME");
            abbrevFiftyStatesMap.put("MARYLAND", "MD");
            abbrevFiftyStatesMap.put("MASSACHUSETTS", "MA");
            abbrevFiftyStatesMap.put("MICHIGAN", "MI");
            abbrevFiftyStatesMap.put("MINNESOTA", "MN");
            abbrevFiftyStatesMap.put("MISSISSIPPI", "MS");
            abbrevFiftyStatesMap.put("MISSOURI", "MO");
            abbrevFiftyStatesMap.put("MONTANA", "MT");
            abbrevFiftyStatesMap.put("NEBRASKA", "NE");
            abbrevFiftyStatesMap.put("NEVADA", "NV");
            abbrevFiftyStatesMap.put("NEW HAMPSHIRE", "NH");
            abbrevFiftyStatesMap.put("NEW JERSEY", "NJ");
            abbrevFiftyStatesMap.put("NEW MEXICO", "NM");
            abbrevFiftyStatesMap.put("NEW YORK", "NY");
            abbrevFiftyStatesMap.put("NORTH CAROLINA", "NC");
            abbrevFiftyStatesMap.put("NORTH DAKOTA", "ND");
            abbrevFiftyStatesMap.put("OHIO", "OH");
            abbrevFiftyStatesMap.put("OKLAHOMA", "OK");
            abbrevFiftyStatesMap.put("OREGON", "OR");
            abbrevFiftyStatesMap.put("PENNSYLVANIA", "PA");
            abbrevFiftyStatesMap.put("RHODE ISLAND", "RI");
            abbrevFiftyStatesMap.put("SOUTH CAROLINA", "SC");
            abbrevFiftyStatesMap.put("SOUTH DAKOTA", "SD");
            abbrevFiftyStatesMap.put("TENNESSEE", "TN");
            abbrevFiftyStatesMap.put("TEXAS", "TX");
            abbrevFiftyStatesMap.put("UTAH", "UT");
            abbrevFiftyStatesMap.put("VERMONT", "VT");
            abbrevFiftyStatesMap.put("VIRGINIA", "VA");
            abbrevFiftyStatesMap.put("WASHINGTON", "WA");
            abbrevFiftyStatesMap.put("WEST VIRGINIA", "WV");
            abbrevFiftyStatesMap.put("WISCONSIN", "WI");
            abbrevFiftyStatesMap.put("WYOMING", "WY");
        }
        return abbrevFiftyStatesMap;
    }

    public static String getStateAbbrev(String s)
    {
        String s2 = "";
        String s1 = s2;
        if (s != null)
        {
            s1 = s2;
            if (getFiftyStatesAbbrevMap().containsKey(s))
            {
                s1 = (String)getFiftyStatesAbbrevMap().get(s);
            }
        }
        return s1;
    }

    public static String[] getStateNameArray()
    {
        Collection collection = getStatesByAbbrevMap().values();
        Object aobj[] = collection.toArray();
        String as[] = new String[collection.size()];
        for (int i = 0; i < collection.size(); i++)
        {
            as[i] = (String)aobj[i];
        }

        Arrays.sort(as);
        return as;
    }

    public static HashMap getStatesByAbbrevMap()
    {
        HashMap hashmap = new HashMap();
        Object aobj[] = getFiftyStatesAbbrevMap().keySet().toArray();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            String s = (String)obj;
            hashmap.put((String)getFiftyStatesAbbrevMap().get(obj), s);
        }

        return hashmap;
    }

}
