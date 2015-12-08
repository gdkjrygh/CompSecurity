// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.runtrack:
//            Duration

public static final class leadIn extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    private final long factor;
    private final boolean leadIn;
    private final TimeUnit unit;

    static long a(leadIn leadin)
    {
        return leadin.factor;
    }

    static boolean b(factor factor1)
    {
        return factor1.leadIn;
    }

    public static leadIn valueOf(String s)
    {
        return (leadIn)Enum.valueOf(com/fitbit/runtrack/Duration$Unit, s);
    }

    public static leadIn[] values()
    {
        return (leadIn[])e.clone();
    }

    protected long a(long l)
    {
        if (factor != 0L)
        {
            return l / factor;
        } else
        {
            return unit.convert(l, TimeUnit.MILLISECONDS);
        }
    }

    protected long b(long l)
    {
        if (factor != 0L)
        {
            return factor * l;
        } else
        {
            return TimeUnit.MILLISECONDS.convert(l, unit);
        }
    }

    static 
    {
        a = new <init>("Hours", 0, 0x36ee80L, false);
        b = new <init>("Minutes", 1, 60000L, true);
        c = new <init>("Seconds", 2, TimeUnit.SECONDS, true);
        d = new <init>("Tenths", 3, 100L, false);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, long l, boolean flag)
    {
        super(s, i);
        factor = l;
        unit = null;
        leadIn = flag;
    }

    private leadIn(String s, int i, TimeUnit timeunit, boolean flag)
    {
        super(s, i);
        factor = 0L;
        unit = timeunit;
        leadIn = flag;
    }
}
