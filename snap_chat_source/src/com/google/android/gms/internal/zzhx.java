// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

public final class zzhx
{

    public static boolean zzA(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && i != 2;
    }

    public static void zzY(String s)
    {
        zzA(3);
    }

    public static void zzZ(String s)
    {
        zzA(6);
    }

    public static void zza(String s, Throwable throwable)
    {
        zzA(3);
    }

    public static void zzaa(String s)
    {
        zzA(4);
    }

    public static void zzab(String s)
    {
        zzA(2);
    }

    public static void zzac(String s)
    {
        zzA(5);
    }

    public static void zzb(String s, Throwable throwable)
    {
        zzA(6);
    }

    public static void zzc(String s, Throwable throwable)
    {
        zzA(4);
    }

    public static void zzd(String s, Throwable throwable)
    {
        zzA(5);
    }
}
