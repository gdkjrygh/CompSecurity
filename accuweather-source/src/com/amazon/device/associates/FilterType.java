// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


public final class FilterType extends Enum
{

    public static final FilterType Brand;
    public static final FilterType MaximumPrice;
    public static final FilterType MinimumPrice;
    private static final FilterType a[];

    private FilterType(String s, int i)
    {
        super(s, i);
    }

    public static FilterType valueOf(String s)
    {
        return (FilterType)Enum.valueOf(com/amazon/device/associates/FilterType, s);
    }

    public static FilterType[] values()
    {
        return (FilterType[])a.clone();
    }

    static 
    {
        MaximumPrice = new FilterType("MaximumPrice", 0);
        MinimumPrice = new FilterType("MinimumPrice", 1);
        Brand = new FilterType("Brand", 2);
        a = (new FilterType[] {
            MaximumPrice, MinimumPrice, Brand
        });
    }
}
