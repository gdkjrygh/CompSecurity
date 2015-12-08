// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.y:
//            s, j

public final class o
{

    public final s a;
    public boolean b;
    public long c;

    public o()
    {
        this(s.b());
    }

    private o(s s1)
    {
        a = (s)j.a(s1, "ticker");
    }

    public final long a()
    {
        long l = 0L;
        if (b)
        {
            l = 0L + (a.a() - c);
        }
        return l;
    }

    public final String toString()
    {
        double d;
        long l = a();
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[TimeUnit.values().length];
                try
                {
                    a[TimeUnit.NANOSECONDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TimeUnit.MICROSECONDS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TimeUnit.MILLISECONDS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TimeUnit.SECONDS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        TimeUnit timeunit;
        if (TimeUnit.SECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.SECONDS;
        } else
        if (TimeUnit.MILLISECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.MILLISECONDS;
        } else
        if (TimeUnit.MICROSECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
        {
            timeunit = TimeUnit.MICROSECONDS;
        } else
        {
            timeunit = TimeUnit.NANOSECONDS;
        }
        d = (double)l / (double)TimeUnit.NANOSECONDS.convert(1L, timeunit);
        _cls1.a[timeunit.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 141
    //                   2 165
    //                   3 171
    //                   4 177;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new AssertionError();
_L2:
        String s1 = "ns";
_L7:
        return String.format("%.4g %s", new Object[] {
            Double.valueOf(d), s1
        });
_L3:
        s1 = "\u03BCs";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "ms";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "s";
        if (true) goto _L7; else goto _L6
_L6:
    }
}
