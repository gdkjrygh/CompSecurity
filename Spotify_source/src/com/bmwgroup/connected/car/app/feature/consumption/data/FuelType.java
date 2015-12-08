// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app.feature.consumption.data;


public final class FuelType extends Enum
{

    public static final FuelType a;
    public static final FuelType b;
    public static final FuelType c;
    private static final FuelType d[];

    private FuelType(String s, int i)
    {
        super(s, i);
    }

    public static FuelType valueOf(String s)
    {
        return (FuelType)Enum.valueOf(com/bmwgroup/connected/car/app/feature/consumption/data/FuelType, s);
    }

    public static FuelType[] values()
    {
        return (FuelType[])d.clone();
    }

    static 
    {
        a = new FuelType("UNSPECIFIED", 0);
        b = new FuelType("PETROL", 1);
        c = new FuelType("DIESEL", 2);
        d = (new FuelType[] {
            a, b, c
        });
    }
}
