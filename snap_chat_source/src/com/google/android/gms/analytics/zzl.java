// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class zzl extends Enum
{

    public static final zzl zzBF;
    public static final zzl zzBG;
    private static final zzl zzBH[];

    private zzl(String s, int i)
    {
        super(s, i);
    }

    public static zzl valueOf(String s)
    {
        return (zzl)Enum.valueOf(com/google/android/gms/analytics/zzl, s);
    }

    public static zzl[] values()
    {
        return (zzl[])zzBH.clone();
    }

    static 
    {
        zzBF = new zzl("NONE", 0);
        zzBG = new zzl("GZIP", 1);
        zzBH = (new zzl[] {
            zzBF, zzBG
        });
    }
}
