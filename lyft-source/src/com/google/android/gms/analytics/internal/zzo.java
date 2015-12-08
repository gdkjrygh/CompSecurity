// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class zzo extends Enum
{

    public static final zzo a;
    public static final zzo b;
    private static final zzo c[];

    private zzo(String s, int i)
    {
        super(s, i);
    }

    public static zzo a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static zzo valueOf(String s)
    {
        return (zzo)Enum.valueOf(com/google/android/gms/analytics/internal/zzo, s);
    }

    public static zzo[] values()
    {
        return (zzo[])c.clone();
    }

    static 
    {
        a = new zzo("NONE", 0);
        b = new zzo("GZIP", 1);
        c = (new zzo[] {
            a, b
        });
    }
}
