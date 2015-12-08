// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

public final class gr
{

    public static void S(String s)
    {
        if (v(3))
        {
            Log.d("Ads", s);
        }
    }

    public static void T(String s)
    {
        if (v(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void U(String s)
    {
        if (v(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void V(String s)
    {
        if (v(2))
        {
            Log.v("Ads", s);
        }
    }

    public static void W(String s)
    {
        if (v(5))
        {
            Log.w("Ads", s);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (v(3))
        {
            Log.d("Ads", s, throwable);
        }
    }

    public static void b(String s, Throwable throwable)
    {
        if (v(6))
        {
            Log.e("Ads", s, throwable);
        }
    }

    public static void c(String s, Throwable throwable)
    {
        if (v(4))
        {
            Log.i("Ads", s, throwable);
        }
    }

    public static void d(String s, Throwable throwable)
    {
        if (v(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean v(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && i != 2;
    }
}
