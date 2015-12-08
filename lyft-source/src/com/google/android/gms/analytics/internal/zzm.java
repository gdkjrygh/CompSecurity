// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzm extends Enum
{

    public static final zzm a;
    public static final zzm b;
    public static final zzm c;
    public static final zzm d;
    public static final zzm e;
    public static final zzm f;
    private static final zzm g[];

    private zzm(String s, int i)
    {
        super(s, i);
    }

    public static zzm a(String s)
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

    public static zzm valueOf(String s)
    {
        return (zzm)Enum.valueOf(com/google/android/gms/analytics/internal/zzm, s);
    }

    public static zzm[] values()
    {
        return (zzm[])g.clone();
    }

    static 
    {
        a = new zzm("NONE", 0);
        b = new zzm("BATCH_BY_SESSION", 1);
        c = new zzm("BATCH_BY_TIME", 2);
        d = new zzm("BATCH_BY_BRUTE_FORCE", 3);
        e = new zzm("BATCH_BY_COUNT", 4);
        f = new zzm("BATCH_BY_SIZE", 5);
        g = (new zzm[] {
            a, b, c, d, e, f
        });
    }
}
