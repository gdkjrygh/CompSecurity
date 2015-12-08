// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.useraccounts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class States
{

    private static final HashMap abbrevFiftyStatesMap = new HashMap();
    private static final HashMap abbrevMap = new HashMap();
    private static final HashMap fullNamMap = new HashMap();

    public States()
    {
    }

    public static String[] getAbreviationArray()
    {
        Collection collection = getFiftyStatesAbbrevMap().values();
        Object aobj[] = collection.toArray();
        String as[] = new String[collection.size()];
        for (int i = 0; i < collection.size(); i++)
        {
            as[i] = (String)aobj[i];
        }

        Arrays.sort(as);
        return as;
    }

    public static List getAbreviationsList()
    {
        return new ArrayList(getFiftyStatesAbbrevMap().values());
    }

    public static HashMap getAllAbbrevMap()
    {
        if (abbrevMap == null || abbrevMap.isEmpty())
        {
            abbrevMap.clear();
            abbrevMap.putAll(getFiftyStatesAbbrevMap());
            abbrevMap.put("AMERICAN SAMOA", "AS");
            abbrevMap.put("FEDERATED STATES OF MICRONESIA", "FM");
            abbrevMap.put("GUAM", "GU");
            abbrevMap.put("MARSHALL ISLANDS", "MH");
            abbrevMap.put("NORTHERN MARIANA ISLANDS", "MP");
            abbrevMap.put("PALAU", "PW");
            abbrevMap.put("PUERTO RICO", "PR");
            abbrevMap.put("VIRGIN ISLANDS", "VI");
        }
        return abbrevMap;
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

    public static HashMap getFiftyStatesFullNameMap()
    {
        if (fullNamMap == null || fullNamMap.isEmpty())
        {
            fullNamMap.put("AL", "ALABAMA");
            fullNamMap.put("AK", "ALASKA");
            fullNamMap.put("AZ", "ARIZONA");
            fullNamMap.put("AR", "ARKANSAS");
            fullNamMap.put("CA", "CALIFORNIA");
            fullNamMap.put("CO", "COLORADO");
            fullNamMap.put("CT", "CONNECTICUT");
            fullNamMap.put("DE", "DELAWARE");
            fullNamMap.put("DC", "DISTRICT OF COLUMBIA");
            fullNamMap.put("FL", "FLORIDA");
            fullNamMap.put("GA", "GEORGIA");
            fullNamMap.put("HI", "HAWAII");
            fullNamMap.put("ID", "IDAHO");
            fullNamMap.put("IL", "ILLINOIS");
            fullNamMap.put("IN", "INDIANA");
            fullNamMap.put("IA", "IOWA");
            fullNamMap.put("KS", "KANSAS");
            fullNamMap.put("KY", "KENTUCKY");
            fullNamMap.put("LA", "LOUISIANA");
            fullNamMap.put("ME", "MAINE");
            fullNamMap.put("MD", "MARYLAND");
            fullNamMap.put("MA", "MASSACHUSETTS");
            fullNamMap.put("MI", "MICHIGAN");
            fullNamMap.put("MN", "MINNESOTA");
            fullNamMap.put("MS", "MISSISSIPPI");
            fullNamMap.put("MO", "MISSOURI");
            fullNamMap.put("MT", "MONTANA");
            fullNamMap.put("NE", "NEBRASKA");
            fullNamMap.put("NV", "NEVADA");
            fullNamMap.put("NH", "NEW HAMPSHIRE");
            fullNamMap.put("NJ", "NEW JERSEY");
            fullNamMap.put("NM", "NEW MEXICO");
            fullNamMap.put("NEW YORK", "NY");
            fullNamMap.put("NC", "NORTH CAROLINA");
            fullNamMap.put("ND", "NORTH DAKOTA");
            fullNamMap.put("OH", "OHIO");
            fullNamMap.put("OK", "OKLAHOMA");
            fullNamMap.put("OR", "OREGON");
            fullNamMap.put("PA", "PENNSYLVANIA");
            fullNamMap.put("RI", "RHODE ISLAND");
            fullNamMap.put("SC", "SOUTH CAROLINA");
            fullNamMap.put("SD", "SOUTH DAKOTA");
            fullNamMap.put("TN", "TENNESSEE");
            fullNamMap.put("TX", "TEXAS");
            fullNamMap.put("UT", "UTAH");
            fullNamMap.put("VT", "VERMONT");
            fullNamMap.put("VA", "VIRGINIA");
            fullNamMap.put("WA", "WASHINGTON");
            fullNamMap.put("WV", "WEST VIRGINIA");
            fullNamMap.put("WI", "WISCONSIN");
            fullNamMap.put("WY", "WYOMING");
        }
        return fullNamMap;
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

    public static String getStateFromZip(long l)
    {
        String s1 = "";
        String s;
        if (l >= Long.valueOf("99501").longValue() && l <= Long.valueOf("99950").longValue())
        {
            s = "AK";
        } else
        {
            if (l >= Long.valueOf("35004").longValue() && l <= Long.valueOf("36925").longValue())
            {
                return "AL";
            }
            if (l >= Long.valueOf("71601").longValue() && l <= Long.valueOf("72959").longValue())
            {
                return "AR";
            }
            if (l >= Long.valueOf("75502").longValue() && l <= Long.valueOf("75502").longValue())
            {
                return "AR";
            }
            if (l >= Long.valueOf("85001").longValue() && l <= Long.valueOf("86556").longValue())
            {
                return "AZ";
            }
            if (l >= Long.valueOf("90001").longValue() && l <= Long.valueOf("96162").longValue())
            {
                return "CA";
            }
            if (l >= Long.valueOf("80001").longValue() && l <= Long.valueOf("81658").longValue())
            {
                return "CO";
            }
            if (l >= Long.valueOf("06001").longValue() && l <= Long.valueOf("06389").longValue())
            {
                return "CT";
            }
            if (l >= Long.valueOf("06401").longValue() && l <= Long.valueOf("06928").longValue())
            {
                return "CT";
            }
            if (l >= Long.valueOf("20001").longValue() && l <= Long.valueOf("20039").longValue())
            {
                return "DC";
            }
            if (l >= Long.valueOf("20042").longValue() && l <= Long.valueOf("20599").longValue())
            {
                return "DC";
            }
            if (l >= Long.valueOf("20799").longValue() && l <= Long.valueOf("20799").longValue())
            {
                return "DC";
            }
            if (l >= Long.valueOf("19701").longValue() && l <= Long.valueOf("19980").longValue())
            {
                return "DE";
            }
            if (l >= Long.valueOf("32004").longValue() && l <= Long.valueOf("34997").longValue())
            {
                return "FL";
            }
            if (l >= Long.valueOf("30001").longValue() && l <= Long.valueOf("31999").longValue())
            {
                return "GA";
            }
            if (l >= Long.valueOf("39901").longValue() && l <= Long.valueOf("39901").longValue())
            {
                return "GA";
            }
            if (l >= Long.valueOf("96701").longValue() && l <= Long.valueOf("96898").longValue())
            {
                return "HI";
            }
            if (l >= Long.valueOf("50001").longValue() && l <= Long.valueOf("52809").longValue())
            {
                return "IA";
            }
            if (l >= Long.valueOf("68119").longValue() && l <= Long.valueOf("68120").longValue())
            {
                return "IA";
            }
            if (l >= Long.valueOf("83201").longValue() && l <= Long.valueOf("83876").longValue())
            {
                return "ID";
            }
            if (l >= Long.valueOf("60001").longValue() && l <= Long.valueOf("62999").longValue())
            {
                return "IL";
            }
            if (l >= Long.valueOf("46001").longValue() && l <= Long.valueOf("47997").longValue())
            {
                return "IN";
            }
            if (l >= Long.valueOf("66002").longValue() && l <= Long.valueOf("67954").longValue())
            {
                return "KS";
            }
            if (l >= Long.valueOf("40003").longValue() && l <= Long.valueOf("42788").longValue())
            {
                return "KY";
            }
            if (l >= Long.valueOf("70001").longValue() && l <= Long.valueOf("71232").longValue())
            {
                return "LA";
            }
            if (l >= Long.valueOf("71234").longValue() && l <= Long.valueOf("71497").longValue())
            {
                return "LA";
            }
            if (l >= Long.valueOf("01001").longValue() && l <= Long.valueOf("02791").longValue())
            {
                return "MA";
            }
            if (l >= Long.valueOf("05501").longValue() && l <= Long.valueOf("05544").longValue())
            {
                return "MA";
            }
            if (l >= Long.valueOf("20331").longValue() && l <= Long.valueOf("20331").longValue())
            {
                return "MD";
            }
            if (l >= Long.valueOf("20335").longValue() && l <= Long.valueOf("20797").longValue())
            {
                return "MD";
            }
            if (l >= Long.valueOf("20812").longValue() && l <= Long.valueOf("21930").longValue())
            {
                return "MD";
            }
            if (l >= Long.valueOf("03901").longValue() && l <= Long.valueOf("04992").longValue())
            {
                return "ME";
            }
            if (l >= Long.valueOf("48001").longValue() && l <= Long.valueOf("49971").longValue())
            {
                return "MI";
            }
            if (l >= Long.valueOf("55001").longValue() && l <= Long.valueOf("56763").longValue())
            {
                return "MN";
            }
            if (l >= Long.valueOf("63001").longValue() && l <= Long.valueOf("65899").longValue())
            {
                return "MO";
            }
            if (l >= Long.valueOf("38601").longValue() && l <= Long.valueOf("39776").longValue())
            {
                return "MS";
            }
            if (l >= Long.valueOf("71233").longValue() && l <= Long.valueOf("71233").longValue())
            {
                return "MS";
            }
            if (l >= Long.valueOf("59001").longValue() && l <= Long.valueOf("59937").longValue())
            {
                return "MT";
            }
            if (l >= Long.valueOf("27006").longValue() && l <= Long.valueOf("28909").longValue())
            {
                return "NC";
            }
            if (l >= Long.valueOf("58001").longValue() && l <= Long.valueOf("58856").longValue())
            {
                return "ND";
            }
            if (l >= Long.valueOf("68001").longValue() && l <= Long.valueOf("68118").longValue())
            {
                return "NE";
            }
            if (l >= Long.valueOf("68122").longValue() && l <= Long.valueOf("69367").longValue())
            {
                return "NE";
            }
            if (l >= Long.valueOf("03031").longValue() && l <= Long.valueOf("03897").longValue())
            {
                return "NH";
            }
            if (l >= Long.valueOf("07001").longValue() && l <= Long.valueOf("08989").longValue())
            {
                return "NJ";
            }
            if (l >= Long.valueOf("87001").longValue() && l <= Long.valueOf("88441").longValue())
            {
                return "NM";
            }
            if (l >= Long.valueOf("88901").longValue() && l <= Long.valueOf("89883").longValue())
            {
                return "NV";
            }
            if (l >= Long.valueOf("06390").longValue() && l <= Long.valueOf("06390").longValue())
            {
                return "NY";
            }
            if (l >= Long.valueOf("10001").longValue() && l <= Long.valueOf("14975").longValue())
            {
                return "NY";
            }
            if (l >= Long.valueOf("43001").longValue() && l <= Long.valueOf("45999").longValue())
            {
                return "OH";
            }
            if (l >= Long.valueOf("73001").longValue() && l <= Long.valueOf("73199").longValue())
            {
                return "OK";
            }
            if (l >= Long.valueOf("73401").longValue() && l <= Long.valueOf("74966").longValue())
            {
                return "OK";
            }
            if (l >= Long.valueOf("97001").longValue() && l <= Long.valueOf("97920").longValue())
            {
                return "OR";
            }
            if (l >= Long.valueOf("15001").longValue() && l <= Long.valueOf("19640").longValue())
            {
                return "PA";
            }
            if (l >= Long.valueOf("02801").longValue() && l <= Long.valueOf("02940").longValue())
            {
                return "RI";
            }
            if (l >= Long.valueOf("29001").longValue() && l <= Long.valueOf("29948").longValue())
            {
                return "SC";
            }
            if (l >= Long.valueOf("57001").longValue() && l <= Long.valueOf("57799").longValue())
            {
                return "SD";
            }
            if (l >= Long.valueOf("37010").longValue() && l <= Long.valueOf("38589").longValue())
            {
                return "TN";
            }
            if (l >= Long.valueOf("73301").longValue() && l <= Long.valueOf("73301").longValue())
            {
                return "TX";
            }
            if (l >= Long.valueOf("75001").longValue() && l <= Long.valueOf("75501").longValue())
            {
                return "TX";
            }
            if (l >= Long.valueOf("75503").longValue() && l <= Long.valueOf("79999").longValue())
            {
                return "TX";
            }
            if (l >= Long.valueOf("88510").longValue() && l <= Long.valueOf("88589").longValue())
            {
                return "TX";
            }
            if (l >= Long.valueOf("84001").longValue() && l <= Long.valueOf("84784").longValue())
            {
                return "UT";
            }
            if (l >= Long.valueOf("20040").longValue() && l <= Long.valueOf("20041").longValue())
            {
                return "VA";
            }
            if (l >= Long.valueOf("20040").longValue() && l <= Long.valueOf("20167").longValue())
            {
                return "VA";
            }
            if (l >= Long.valueOf("20042").longValue() && l <= Long.valueOf("20042").longValue())
            {
                return "VA";
            }
            if (l >= Long.valueOf("22001").longValue() && l <= Long.valueOf("24658").longValue())
            {
                return "VA";
            }
            if (l >= Long.valueOf("05001").longValue() && l <= Long.valueOf("05495").longValue())
            {
                return "VT";
            }
            if (l >= Long.valueOf("05601").longValue() && l <= Long.valueOf("05907").longValue())
            {
                return "VT";
            }
            if (l >= Long.valueOf("98001").longValue() && l <= Long.valueOf("99403").longValue())
            {
                return "WA";
            }
            if (l >= Long.valueOf("53001").longValue() && l <= Long.valueOf("54990").longValue())
            {
                return "WI";
            }
            if (l >= Long.valueOf("24701").longValue() && l <= Long.valueOf("26886").longValue())
            {
                return "WV";
            }
            s = s1;
            if (l >= Long.valueOf("82001").longValue())
            {
                s = s1;
                if (l <= Long.valueOf("83128").longValue())
                {
                    return "WY";
                }
            }
        }
        return s;
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

    public String getStateName(String s)
    {
        String s2 = "";
        String s1 = s2;
        if (s != null)
        {
            s1 = s2;
            if (getStatesByAbbrevMap().containsKey(s))
            {
                s1 = (String)getStatesByAbbrevMap().get(getStatesByAbbrevMap());
            }
        }
        return s1;
    }

}
