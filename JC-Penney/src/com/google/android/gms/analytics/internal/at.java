// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class at extends Enum
{

    public static final at a;
    public static final at b;
    public static final at c;
    public static final at d;
    public static final at e;
    public static final at f;
    private static final at g[];

    private at(String s, int i)
    {
        super(s, i);
    }

    public static at a(String s)
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

    public static at valueOf(String s)
    {
        return (at)Enum.valueOf(com/google/android/gms/analytics/internal/at, s);
    }

    public static at[] values()
    {
        return (at[])g.clone();
    }

    static 
    {
        a = new at("NONE", 0);
        b = new at("BATCH_BY_SESSION", 1);
        c = new at("BATCH_BY_TIME", 2);
        d = new at("BATCH_BY_BRUTE_FORCE", 3);
        e = new at("BATCH_BY_COUNT", 4);
        f = new at("BATCH_BY_SIZE", 5);
        g = (new at[] {
            a, b, c, d, e, f
        });
    }
}
