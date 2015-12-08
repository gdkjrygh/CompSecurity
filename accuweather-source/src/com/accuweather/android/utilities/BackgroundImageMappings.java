// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.util.HashMap;

public class BackgroundImageMappings extends HashMap
{

    private static HashMap DAY_BACKGROUNDS = initDayBackgrounds();
    private static HashMap HALF_DAY_BACKGROUNDS = initHalfDayBackgrounds();
    private static final int INVALID_ICON_CODE = -9999;
    private static HashMap NIGHT_BACKGROUNDS = initNightBackgrounds();

    public BackgroundImageMappings()
    {
    }

    public static String getDayIconCode(int i)
    {
        return (String)DAY_BACKGROUNDS.get(Integer.valueOf(i));
    }

    public static String getHalfDayIconCode(int i)
    {
        return (String)HALF_DAY_BACKGROUNDS.get(Integer.valueOf(i));
    }

    public static String getNightIconCode(int i)
    {
        return (String)NIGHT_BACKGROUNDS.get(Integer.valueOf(i));
    }

    private static HashMap initDayBackgrounds()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(1), "01");
        hashmap.put(Integer.valueOf(2), "03");
        hashmap.put(Integer.valueOf(3), "05");
        hashmap.put(Integer.valueOf(4), "03");
        hashmap.put(Integer.valueOf(5), "01");
        hashmap.put(Integer.valueOf(6), "05");
        hashmap.put(Integer.valueOf(7), "07");
        hashmap.put(Integer.valueOf(8), "07");
        hashmap.put(Integer.valueOf(11), "09");
        hashmap.put(Integer.valueOf(12), "11");
        hashmap.put(Integer.valueOf(13), "11");
        hashmap.put(Integer.valueOf(14), "11");
        hashmap.put(Integer.valueOf(15), "13");
        hashmap.put(Integer.valueOf(16), "13");
        hashmap.put(Integer.valueOf(17), "13");
        hashmap.put(Integer.valueOf(18), "15");
        hashmap.put(Integer.valueOf(19), "19");
        hashmap.put(Integer.valueOf(20), "19");
        hashmap.put(Integer.valueOf(21), "21");
        hashmap.put(Integer.valueOf(22), "22");
        hashmap.put(Integer.valueOf(23), "22");
        hashmap.put(Integer.valueOf(24), "24");
        hashmap.put(Integer.valueOf(25), "24");
        hashmap.put(Integer.valueOf(26), "24");
        hashmap.put(Integer.valueOf(29), "17");
        hashmap.put(Integer.valueOf(30), "03");
        hashmap.put(Integer.valueOf(31), "03");
        hashmap.put(Integer.valueOf(32), "03");
        hashmap.put(Integer.valueOf(33), "02");
        hashmap.put(Integer.valueOf(34), "04");
        hashmap.put(Integer.valueOf(35), "04");
        hashmap.put(Integer.valueOf(36), "04");
        hashmap.put(Integer.valueOf(37), "02");
        hashmap.put(Integer.valueOf(38), "06");
        hashmap.put(Integer.valueOf(39), "12");
        hashmap.put(Integer.valueOf(40), "12");
        hashmap.put(Integer.valueOf(41), "14");
        hashmap.put(Integer.valueOf(42), "14");
        hashmap.put(Integer.valueOf(43), "20");
        hashmap.put(Integer.valueOf(44), "23");
        return hashmap;
    }

    private static HashMap initHalfDayBackgrounds()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(1), "01");
        hashmap.put(Integer.valueOf(2), "03");
        hashmap.put(Integer.valueOf(3), "05");
        hashmap.put(Integer.valueOf(4), "03");
        hashmap.put(Integer.valueOf(5), "01");
        hashmap.put(Integer.valueOf(6), "05");
        hashmap.put(Integer.valueOf(7), "07");
        hashmap.put(Integer.valueOf(8), "07");
        hashmap.put(Integer.valueOf(11), "09");
        hashmap.put(Integer.valueOf(12), "11");
        hashmap.put(Integer.valueOf(13), "11");
        hashmap.put(Integer.valueOf(14), "11");
        hashmap.put(Integer.valueOf(15), "13");
        hashmap.put(Integer.valueOf(16), "13");
        hashmap.put(Integer.valueOf(17), "13");
        hashmap.put(Integer.valueOf(18), "15");
        hashmap.put(Integer.valueOf(19), "19");
        hashmap.put(Integer.valueOf(20), "19");
        hashmap.put(Integer.valueOf(21), "21");
        hashmap.put(Integer.valueOf(22), "22");
        hashmap.put(Integer.valueOf(23), "22");
        hashmap.put(Integer.valueOf(24), "24");
        hashmap.put(Integer.valueOf(25), "24");
        hashmap.put(Integer.valueOf(26), "24");
        hashmap.put(Integer.valueOf(29), "17");
        hashmap.put(Integer.valueOf(30), "03");
        hashmap.put(Integer.valueOf(31), "03");
        hashmap.put(Integer.valueOf(32), "03");
        return hashmap;
    }

    private static HashMap initNightBackgrounds()
    {
        HashMap hashmap = new HashMap();
        hashmap.put(Integer.valueOf(7), "08");
        hashmap.put(Integer.valueOf(8), "08");
        hashmap.put(Integer.valueOf(11), "10");
        hashmap.put(Integer.valueOf(12), "12");
        hashmap.put(Integer.valueOf(15), "14");
        hashmap.put(Integer.valueOf(18), "16");
        hashmap.put(Integer.valueOf(19), "20");
        hashmap.put(Integer.valueOf(22), "23");
        hashmap.put(Integer.valueOf(24), "25");
        hashmap.put(Integer.valueOf(25), "25");
        hashmap.put(Integer.valueOf(26), "25");
        hashmap.put(Integer.valueOf(29), "18");
        hashmap.put(Integer.valueOf(30), "04");
        hashmap.put(Integer.valueOf(31), "04");
        hashmap.put(Integer.valueOf(32), "04");
        hashmap.put(Integer.valueOf(33), "02");
        hashmap.put(Integer.valueOf(34), "04");
        hashmap.put(Integer.valueOf(35), "04");
        hashmap.put(Integer.valueOf(36), "04");
        hashmap.put(Integer.valueOf(37), "02");
        hashmap.put(Integer.valueOf(38), "06");
        hashmap.put(Integer.valueOf(39), "12");
        hashmap.put(Integer.valueOf(40), "12");
        hashmap.put(Integer.valueOf(41), "14");
        hashmap.put(Integer.valueOf(42), "14");
        hashmap.put(Integer.valueOf(43), "20");
        hashmap.put(Integer.valueOf(44), "23");
        return hashmap;
    }

}
