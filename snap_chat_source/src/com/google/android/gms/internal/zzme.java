// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzme
{

    private static boolean zzbf(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean zzkd()
    {
        return zzbf(11);
    }

    public static boolean zzkf()
    {
        return zzbf(13);
    }

    public static boolean zzkg()
    {
        return zzbf(14);
    }

    public static boolean zzkj()
    {
        return zzbf(19);
    }

    public static boolean zzkk()
    {
        return zzkl();
    }

    public static boolean zzkl()
    {
        return zzbf(21);
    }
}
