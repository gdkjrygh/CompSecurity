// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.time;


public final class TimeUnit extends Enum
{

    public static final TimeUnit a;
    public static final TimeUnit b;
    public static final TimeUnit c;
    public static final TimeUnit d;
    public static final TimeUnit e;
    public static final TimeUnit f;
    public static final TimeUnit g;
    private static final TimeUnit i[];
    private long h;

    private TimeUnit(String s, int j, long l)
    {
        super(s, j);
        h = l;
    }

    public static TimeUnit valueOf(String s)
    {
        return (TimeUnit)Enum.valueOf(com/pinterest/kit/time/TimeUnit, s);
    }

    public static TimeUnit[] values()
    {
        return (TimeUnit[])i.clone();
    }

    public final long a()
    {
        return h;
    }

    public final long b()
    {
        return h * 1000L;
    }

    static 
    {
        a = new TimeUnit("SECONDS", 0, 1L);
        b = new TimeUnit("MINUTES", 1, 60L * a.h);
        c = new TimeUnit("HOURS", 2, 60L * b.h);
        d = new TimeUnit("DAYS", 3, 24L * c.h);
        e = new TimeUnit("WEEKS", 4, 7L * d.h);
        f = new TimeUnit("MONTHS", 5, 30L * d.h);
        g = new TimeUnit("YEARS", 6, 365L * d.h);
        i = (new TimeUnit[] {
            a, b, c, d, e, f, g
        });
    }
}
