// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import com.htc.lib0.htcdebugflag.HtcWrapHtcDebugFlag;

class Log
{

    private static final boolean ENABLED;
    private static final int FLAG_NOT_ENABLED = -1;

    Log()
    {
    }

    public static int d(String s, String s1)
    {
        if (ENABLED)
        {
            return android.util.Log.d(s, s1);
        } else
        {
            return -1;
        }
    }

    public static int e(String s, String s1)
    {
        return android.util.Log.e(s, s1);
    }

    public static int i(String s, String s1)
    {
        if (ENABLED)
        {
            return android.util.Log.i(s, s1);
        } else
        {
            return -1;
        }
    }

    public static int v(String s, String s1)
    {
        if (ENABLED)
        {
            return android.util.Log.v(s, s1);
        } else
        {
            return -1;
        }
    }

    public static int w(String s, String s1)
    {
        if (ENABLED)
        {
            return android.util.Log.w(s, s1);
        } else
        {
            return -1;
        }
    }

    static 
    {
        ENABLED = HtcWrapHtcDebugFlag.Htc_DEBUG_flag;
    }
}
