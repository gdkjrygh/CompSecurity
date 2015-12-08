// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;


// Referenced classes of package com.fitbit.serverinteraction:
//            PublicAPI

public static final class interval extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];
    private final long interval;
    private final String value;

    static String a(interval interval1)
    {
        return interval1.value;
    }

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/fitbit/serverinteraction/PublicAPI$DataRange, s);
    }

    public static value[] values()
    {
        return (value[])h.clone();
    }

    public long a()
    {
        return interval;
    }

    static 
    {
        a = new <init>("ONE_SEC", 0, "1d/1sec", 0x5265c00L);
        b = new <init>("ONE_MIN", 1, "1d/1min", 0x5265c00L);
        c = new <init>("FIVE_MIN", 2, "1d/5min", 0x5265c00L);
        d = new <init>("DAY", 3, "1d/15min", 0x5265c00L);
        e = new <init>("WEEK", 4, "1w", 0x240c8400L);
        f = new <init>("MONTH", 5, "1m", 0x9fa52400L);
        g = new <init>("HALF_YEAR", 6, "6m", 0x3abd89600L);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i, String s1, long l)
    {
        super(s, i);
        value = s1;
        interval = l;
    }
}
