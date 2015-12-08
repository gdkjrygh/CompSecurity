// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dev;

import android.util.Log;

public class Debug
{

    private static boolean a = true;
    private static String b = "FacebookAdsSDK";

    public Debug()
    {
    }

    public static void d(String s)
    {
    }

    public static void e(String s)
    {
        if (a)
        {
            Log.e(b, s);
        }
    }

    public static void i(String s)
    {
        if (a)
        {
            Log.i(b, s);
        }
    }

    public static void v(String s)
    {
    }

    public static void w(String s)
    {
        if (a)
        {
            Log.w(b, s);
        }
    }

}
