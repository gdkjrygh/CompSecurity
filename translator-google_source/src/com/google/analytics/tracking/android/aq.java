// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.util.Log;

public final class aq
{

    public static boolean a;

    public static int a(String s)
    {
        if (a)
        {
            return Log.d("GAV2", h(s));
        } else
        {
            return 0;
        }
    }

    public static int b(String s)
    {
        return Log.e("GAV2", h(s));
    }

    public static int c(String s)
    {
        return Log.i("GAV2", h(s));
    }

    public static int d(String s)
    {
        if (a)
        {
            return c(s);
        } else
        {
            return 0;
        }
    }

    public static int e(String s)
    {
        if (a)
        {
            return Log.v("GAV2", h(s));
        } else
        {
            return 0;
        }
    }

    public static int f(String s)
    {
        return Log.w("GAV2", h(s));
    }

    public static int g(String s)
    {
        if (a)
        {
            return f(s);
        } else
        {
            return 0;
        }
    }

    private static String h(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }
}
