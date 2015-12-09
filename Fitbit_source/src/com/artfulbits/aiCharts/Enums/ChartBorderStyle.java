// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Enums;


public final class ChartBorderStyle extends Enum
{

    public static final ChartBorderStyle a;
    public static final ChartBorderStyle b;
    private static final ChartBorderStyle c[];

    private ChartBorderStyle(String s, int i)
    {
        super(s, i);
    }

    public static ChartBorderStyle valueOf(String s)
    {
        return (ChartBorderStyle)Enum.valueOf(com/artfulbits/aiCharts/Enums/ChartBorderStyle, s);
    }

    public static ChartBorderStyle[] values()
    {
        return (ChartBorderStyle[])c.clone();
    }

    static 
    {
        a = new ChartBorderStyle("Simple", 0);
        b = new ChartBorderStyle("All", 1);
        c = (new ChartBorderStyle[] {
            a, b
        });
    }
}
