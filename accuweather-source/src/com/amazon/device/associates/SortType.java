// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


public final class SortType extends Enum
{

    public static final SortType BESTSELLING;
    public static final SortType PRICE_HIGH_TO_LOW;
    public static final SortType PRICE_LOW_TO_HIGH;
    public static final SortType RELEVANCE;
    private static final SortType a[];

    private SortType(String s, int i)
    {
        super(s, i);
    }

    public static SortType valueOf(String s)
    {
        return (SortType)Enum.valueOf(com/amazon/device/associates/SortType, s);
    }

    public static SortType[] values()
    {
        return (SortType[])a.clone();
    }

    static 
    {
        PRICE_LOW_TO_HIGH = new SortType("PRICE_LOW_TO_HIGH", 0);
        PRICE_HIGH_TO_LOW = new SortType("PRICE_HIGH_TO_LOW", 1);
        RELEVANCE = new SortType("RELEVANCE", 2);
        BESTSELLING = new SortType("BESTSELLING", 3);
        a = (new SortType[] {
            PRICE_LOW_TO_HIGH, PRICE_HIGH_TO_LOW, RELEVANCE, BESTSELLING
        });
    }
}
