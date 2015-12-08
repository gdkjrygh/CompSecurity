// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class z extends Enum
{

    public static final z a;
    public static final z b;
    public static final z c;
    public static final z d;
    public static final z e;
    public static final z f;
    private static final z g[];

    private z(String s, int i)
    {
        super(s, i);
    }

    public static z a(String s)
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

    public static z valueOf(String s)
    {
        return (z)Enum.valueOf(com/google/android/gms/analytics/internal/z, s);
    }

    public static z[] values()
    {
        return (z[])g.clone();
    }

    static 
    {
        a = new z("NONE", 0);
        b = new z("BATCH_BY_SESSION", 1);
        c = new z("BATCH_BY_TIME", 2);
        d = new z("BATCH_BY_BRUTE_FORCE", 3);
        e = new z("BATCH_BY_COUNT", 4);
        f = new z("BATCH_BY_SIZE", 5);
        g = (new z[] {
            a, b, c, d, e, f
        });
    }
}
