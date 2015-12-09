// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.app;


public final class BrandType extends Enum
{

    public static final BrandType a;
    public static final BrandType b;
    public static final BrandType c;
    private static final BrandType d[];

    private BrandType(String s, int i)
    {
        super(s, i);
    }

    public static BrandType valueOf(String s)
    {
        return (BrandType)Enum.valueOf(com/bmwgroup/connected/car/app/BrandType, s);
    }

    public static BrandType[] values()
    {
        return (BrandType[])d.clone();
    }

    static 
    {
        a = new BrandType("ALL", 0);
        b = new BrandType("MINI", 1);
        c = new BrandType("BMW", 2);
        d = (new BrandType[] {
            a, b, c
        });
    }
}
