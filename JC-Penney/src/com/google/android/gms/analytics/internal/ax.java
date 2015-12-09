// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


public final class ax extends Enum
{

    public static final ax a;
    public static final ax b;
    private static final ax c[];

    private ax(String s, int i)
    {
        super(s, i);
    }

    public static ax a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return a;
        }
    }

    public static ax valueOf(String s)
    {
        return (ax)Enum.valueOf(com/google/android/gms/analytics/internal/ax, s);
    }

    public static ax[] values()
    {
        return (ax[])c.clone();
    }

    static 
    {
        a = new ax("NONE", 0);
        b = new ax("GZIP", 1);
        c = (new ax[] {
            a, b
        });
    }
}
