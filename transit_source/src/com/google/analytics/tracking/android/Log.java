// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


public class Log
{

    static final String LOG_TAG = "GAV2";
    private static boolean sDebug;

    private Log()
    {
    }

    public static int d(String s)
    {
        return android.util.Log.d("GAV2", formatMessage(s));
    }

    public static int dDebug(String s)
    {
        if (sDebug)
        {
            return d(s);
        } else
        {
            return 0;
        }
    }

    public static int e(String s)
    {
        return android.util.Log.e("GAV2", formatMessage(s));
    }

    public static int eDebug(String s)
    {
        if (sDebug)
        {
            return e(s);
        } else
        {
            return 0;
        }
    }

    private static String formatMessage(String s)
    {
        return (new StringBuilder()).append(Thread.currentThread().toString()).append(": ").append(s).toString();
    }

    public static int i(String s)
    {
        return android.util.Log.i("GAV2", formatMessage(s));
    }

    public static int iDebug(String s)
    {
        if (sDebug)
        {
            return i(s);
        } else
        {
            return 0;
        }
    }

    public static boolean isDebugEnabled()
    {
        return sDebug;
    }

    public static void setDebug(boolean flag)
    {
        sDebug = flag;
    }

    public static int v(String s)
    {
        return android.util.Log.v("GAV2", formatMessage(s));
    }

    public static int vDebug(String s)
    {
        if (sDebug)
        {
            return v(s);
        } else
        {
            return 0;
        }
    }

    public static int w(String s)
    {
        return android.util.Log.w("GAV2", formatMessage(s));
    }

    public static int wDebug(String s)
    {
        if (sDebug)
        {
            return w(s);
        } else
        {
            return 0;
        }
    }
}
