// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    private static final ae c[];

    private ae(String s, int i)
    {
        super(s, i);
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/google/android/gms/analytics/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])c.clone();
    }

    static 
    {
        a = new ae("NONE", 0);
        b = new ae("GZIP", 1);
        c = (new ae[] {
            a, b
        });
    }
}
