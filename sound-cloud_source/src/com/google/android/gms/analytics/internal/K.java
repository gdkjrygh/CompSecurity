// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class K extends Enum
{

    public static final K a;
    public static final K b;
    public static final K c;
    public static final K d;
    public static final K e;
    public static final K f;
    private static final K g[];

    private K(String s, int i)
    {
        super(s, i);
    }

    public static K a(String s)
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

    public static K valueOf(String s)
    {
        return (K)Enum.valueOf(com/google/android/gms/analytics/internal/K, s);
    }

    public static K[] values()
    {
        return (K[])g.clone();
    }

    static 
    {
        a = new K("NONE", 0);
        b = new K("BATCH_BY_SESSION", 1);
        c = new K("BATCH_BY_TIME", 2);
        d = new K("BATCH_BY_BRUTE_FORCE", 3);
        e = new K("BATCH_BY_COUNT", 4);
        f = new K("BATCH_BY_SIZE", 5);
        g = (new K[] {
            a, b, c, d, e, f
        });
    }
}
