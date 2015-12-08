// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;


public final class Log
{

    private static boolean DEBUG_ENABLED = false;

    private Log()
    {
    }

    public static void d(String s, String s1)
    {
        if (DEBUG_ENABLED)
        {
            android.util.Log.d(s, s1);
        }
    }

    public static void e(String s, String s1)
    {
        if (DEBUG_ENABLED)
        {
            android.util.Log.e(s, s1);
        }
    }

    public static void i(String s, String s1)
    {
        if (DEBUG_ENABLED)
        {
            android.util.Log.i(s, s1);
        }
    }

    public static void setDebug(boolean flag)
    {
        DEBUG_ENABLED = flag;
    }

    public static void v(String s, String s1)
    {
        if (DEBUG_ENABLED)
        {
            android.util.Log.v(s, s1);
        }
    }

    public static void w(String s, String s1)
    {
        if (DEBUG_ENABLED)
        {
            android.util.Log.w(s, s1);
        }
    }

}
