// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class ar extends Enum
{

    public static final ar a;
    public static final ar b;
    public static final ar c;
    public static final ar d;
    public static final ar e;
    public static final ar f;
    private static final ar g[];

    private ar(String s, int i)
    {
        super(s, i);
    }

    public static ar a(String s)
    {
        if ("BATCH_BY_SESSION".equalsIgnoreCase(s))
        {
            return b;
        }
        if ("BATCH_BY_TIME".equalsIgnoreCase(s))
        {
            return c;
        }
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s))
        {
            return d;
        }
        if ("BATCH_BY_COUNT".equalsIgnoreCase(s))
        {
            return e;
        }
        if ("BATCH_BY_SIZE".equalsIgnoreCase(s))
        {
            return f;
        } else
        {
            return a;
        }
    }

    public static ar valueOf(String s)
    {
        return (ar)Enum.valueOf(com/google/android/gms/analytics/internal/ar, s);
    }

    public static ar[] values()
    {
        return (ar[])g.clone();
    }

    static 
    {
        a = new ar("NONE", 0);
        b = new ar("BATCH_BY_SESSION", 1);
        c = new ar("BATCH_BY_TIME", 2);
        d = new ar("BATCH_BY_BRUTE_FORCE", 3);
        e = new ar("BATCH_BY_COUNT", 4);
        f = new ar("BATCH_BY_SIZE", 5);
        g = (new ar[] {
            a, b, c, d, e, f
        });
    }
}
