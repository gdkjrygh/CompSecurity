// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Enums;


public final class CoordinateSystem extends Enum
{

    public static final CoordinateSystem a;
    public static final CoordinateSystem b;
    public static final CoordinateSystem c;
    private static final CoordinateSystem d[];

    private CoordinateSystem(String s, int i)
    {
        super(s, i);
    }

    public static CoordinateSystem valueOf(String s)
    {
        return (CoordinateSystem)Enum.valueOf(com/artfulbits/aiCharts/Enums/CoordinateSystem, s);
    }

    public static CoordinateSystem[] values()
    {
        return (CoordinateSystem[])d.clone();
    }

    static 
    {
        a = new CoordinateSystem("Cartesian", 0);
        b = new CoordinateSystem("Polar", 1);
        c = new CoordinateSystem("None", 2);
        d = (new CoordinateSystem[] {
            a, b, c
        });
    }
}
