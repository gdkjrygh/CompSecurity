// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzad;

public final class zzc
{

    public static String zzE(int i)
    {
        return zzb("&cd", i);
    }

    public static String zzF(int i)
    {
        return zzb("cd", i);
    }

    public static String zzG(int i)
    {
        return zzb("&cm", i);
    }

    public static String zzH(int i)
    {
        return zzb("cm", i);
    }

    public static String zzI(int i)
    {
        return zzb("&pr", i);
    }

    public static String zzJ(int i)
    {
        return zzb("pr", i);
    }

    public static String zzK(int i)
    {
        return zzb("&promo", i);
    }

    public static String zzL(int i)
    {
        return zzb("promo", i);
    }

    public static String zzM(int i)
    {
        return zzb("pi", i);
    }

    public static String zzN(int i)
    {
        return zzb("&il", i);
    }

    public static String zzO(int i)
    {
        return zzb("il", i);
    }

    public static String zzP(int i)
    {
        return zzb("cd", i);
    }

    public static String zzQ(int i)
    {
        return zzb("cm", i);
    }

    private static String zzb(String s, int i)
    {
        if (i < 1)
        {
            zzad.zzf("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }
}
