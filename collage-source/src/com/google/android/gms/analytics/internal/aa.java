// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    public static final aa c;
    public static final aa d;
    public static final aa e;
    public static final aa f;
    private static final aa g[];

    private aa(String s, int i)
    {
        super(s, i);
    }

    public static aa a(String s)
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

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(com/google/android/gms/analytics/internal/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])g.clone();
    }

    static 
    {
        a = new aa("NONE", 0);
        b = new aa("BATCH_BY_SESSION", 1);
        c = new aa("BATCH_BY_TIME", 2);
        d = new aa("BATCH_BY_BRUTE_FORCE", 3);
        e = new aa("BATCH_BY_COUNT", 4);
        f = new aa("BATCH_BY_SIZE", 5);
        g = (new aa[] {
            a, b, c, d, e, f
        });
    }
}
