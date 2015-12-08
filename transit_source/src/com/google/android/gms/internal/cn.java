// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

public final class cn
{

    public static void a(String s, Throwable throwable)
    {
        if (k(3))
        {
            Log.d("Ads", s, throwable);
        }
    }

    public static void b(String s, Throwable throwable)
    {
        if (k(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean k(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && i != 2;
    }

    public static void m(String s)
    {
        if (k(3))
        {
            Log.d("Ads", s);
        }
    }

    public static void n(String s)
    {
        if (k(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void o(String s)
    {
        if (k(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void p(String s)
    {
        if (k(2))
        {
            Log.v("Ads", s);
        }
    }

    public static void q(String s)
    {
        if (k(5))
        {
            Log.w("Ads", s);
        }
    }
}
