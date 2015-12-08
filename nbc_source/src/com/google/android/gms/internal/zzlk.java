// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzlk
{

    public static boolean isAtLeastL()
    {
        return zzoZ();
    }

    private static boolean zzbR(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean zzoU()
    {
        return zzbR(14);
    }

    public static boolean zzoW()
    {
        return zzbR(17);
    }

    public static boolean zzoX()
    {
        return zzbR(19);
    }

    public static boolean zzoZ()
    {
        return zzbR(21);
    }
}
