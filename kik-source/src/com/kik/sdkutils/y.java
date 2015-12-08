// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;


public final class y extends android.os.Build.VERSION_CODES
{

    private static int a = 0;

    public static boolean a(int i)
    {
        return a >= i;
    }

    public static boolean b(int i)
    {
        return a < i;
    }

    public static boolean c(int i)
    {
        return a == i;
    }

    static 
    {
        a = android.os.Build.VERSION.SDK_INT;
    }
}
