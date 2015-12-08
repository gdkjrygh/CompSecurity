// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;


public final class Timeframe extends Enum
{

    public static final Timeframe a;
    public static final Timeframe b;
    public static final Timeframe c;
    public static final Timeframe d;
    private static final Timeframe e[];
    private long interval;

    private Timeframe(String s, int i, long l)
    {
        super(s, i);
        interval = l;
    }

    public static Timeframe valueOf(String s)
    {
        return (Timeframe)Enum.valueOf(com/fitbit/ui/charts/Timeframe, s);
    }

    public static Timeframe[] values()
    {
        return (Timeframe[])e.clone();
    }

    public long a()
    {
        return interval;
    }

    static 
    {
        a = new Timeframe("WEEK", 0, 0x240c8400L);
        b = new Timeframe("MONTH", 1, 0x9a7ec800L);
        c = new Timeframe("THREE_MONTH", 2, 0x1cf7c5800L);
        d = new Timeframe("YEAR", 3, 0x757b12c00L);
        e = (new Timeframe[] {
            a, b, c, d
        });
    }
}
