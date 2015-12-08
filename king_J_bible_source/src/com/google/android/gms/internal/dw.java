// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

public final class dw
{

    public static void a(String s, Throwable throwable)
    {
        if (n(3))
        {
            Log.d("Ads", s, throwable);
        }
    }

    public static void b(String s, Throwable throwable)
    {
        if (n(6))
        {
            Log.e("Ads", s, throwable);
        }
    }

    public static void c(String s, Throwable throwable)
    {
        if (n(5))
        {
            Log.w("Ads", s, throwable);
        }
    }

    public static boolean n(int i)
    {
        return (i >= 5 || Log.isLoggable("Ads", i)) && i != 2;
    }

    public static void v(String s)
    {
        if (n(3))
        {
            Log.d("Ads", s);
        }
    }

    public static void w(String s)
    {
        if (n(6))
        {
            Log.e("Ads", s);
        }
    }

    public static void x(String s)
    {
        if (n(4))
        {
            Log.i("Ads", s);
        }
    }

    public static void y(String s)
    {
        if (n(2))
        {
            Log.v("Ads", s);
        }
    }

    public static void z(String s)
    {
        if (n(5))
        {
            Log.w("Ads", s);
        }
    }
}
