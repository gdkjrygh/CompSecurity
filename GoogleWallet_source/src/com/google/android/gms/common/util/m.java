// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;


public final class m
{

    private static boolean dD(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean jk()
    {
        return dD(11);
    }

    public static boolean jm()
    {
        return dD(13);
    }

    public static boolean jn()
    {
        return dD(14);
    }

    public static boolean jp()
    {
        return dD(16);
    }
}
