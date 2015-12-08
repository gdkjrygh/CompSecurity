// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.enums;


public final class Month extends Enum
{

    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;
    private static final Month b[];
    private final int a;

    private Month(String s, int i, int j)
    {
        super(s, i);
        a = j;
    }

    public static Month valueOf(String s)
    {
        return (Month)Enum.valueOf(com/appboy/enums/Month, s);
    }

    public static Month[] values()
    {
        return (Month[])b.clone();
    }

    public final int getValue()
    {
        return a;
    }

    static 
    {
        JANUARY = new Month("JANUARY", 0, 0);
        FEBRUARY = new Month("FEBRUARY", 1, 1);
        MARCH = new Month("MARCH", 2, 2);
        APRIL = new Month("APRIL", 3, 3);
        MAY = new Month("MAY", 4, 4);
        JUNE = new Month("JUNE", 5, 5);
        JULY = new Month("JULY", 6, 6);
        AUGUST = new Month("AUGUST", 7, 7);
        SEPTEMBER = new Month("SEPTEMBER", 8, 8);
        OCTOBER = new Month("OCTOBER", 9, 9);
        NOVEMBER = new Month("NOVEMBER", 10, 10);
        DECEMBER = new Month("DECEMBER", 11, 11);
        b = (new Month[] {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, 
            NOVEMBER, DECEMBER
        });
    }
}
