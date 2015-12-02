// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.c;

import android.util.Log;

public class a
{

    private static boolean a = true;
    private static String b = "FacebookAdsSDK";

    public static void a(String s)
    {
        if (a)
        {
            Log.v(b, s);
        }
    }

    public static void b(String s)
    {
        if (a)
        {
            Log.d(b, s);
        }
    }

    public static void c(String s)
    {
        if (a)
        {
            Log.i(b, s);
        }
    }

    public static void d(String s)
    {
        if (a)
        {
            Log.e(b, s);
        }
    }

}
