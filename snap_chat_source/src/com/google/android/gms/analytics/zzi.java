// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


public final class zzi extends Enum
{

    public static final zzi zzBA;
    private static final zzi zzBB[];
    public static final zzi zzBv;
    public static final zzi zzBw;
    public static final zzi zzBx;
    public static final zzi zzBy;
    public static final zzi zzBz;

    private zzi(String s, int i)
    {
        super(s, i);
    }

    public static zzi valueOf(String s)
    {
        return (zzi)Enum.valueOf(com/google/android/gms/analytics/zzi, s);
    }

    public static zzi[] values()
    {
        return (zzi[])zzBB.clone();
    }

    static 
    {
        zzBv = new zzi("NONE", 0);
        zzBw = new zzi("BATCH_BY_SESSION", 1);
        zzBx = new zzi("BATCH_BY_TIME", 2);
        zzBy = new zzi("BATCH_BY_BRUTE_FORCE", 3);
        zzBz = new zzi("BATCH_BY_COUNT", 4);
        zzBA = new zzi("BATCH_BY_SIZE", 5);
        zzBB = (new zzi[] {
            zzBv, zzBw, zzBx, zzBy, zzBz, zzBA
        });
    }
}
