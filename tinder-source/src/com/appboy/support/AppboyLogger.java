// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.support;

import android.util.Log;

public class AppboyLogger
{

    public static int LogLevel = 0;
    public static final int SUPPRESS = 0x7fffffff;

    public AppboyLogger()
    {
    }

    public static int d(String s, String s1)
    {
        if (LogLevel <= 3)
        {
            return Log.d(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int d(String s, String s1, Throwable throwable)
    {
        if (LogLevel <= 3)
        {
            return Log.d(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int e(String s, String s1)
    {
        if (LogLevel <= 6)
        {
            return Log.e(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int e(String s, String s1, Throwable throwable)
    {
        if (LogLevel <= 6)
        {
            return Log.e(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int i(String s, String s1)
    {
        if (LogLevel <= 4)
        {
            return Log.i(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int i(String s, String s1, Throwable throwable)
    {
        if (LogLevel <= 4)
        {
            return Log.i(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int v(String s, String s1)
    {
        if (LogLevel <= 2)
        {
            return Log.v(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int v(String s, String s1, Throwable throwable)
    {
        if (LogLevel <= 2)
        {
            return Log.v(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1)
    {
        if (LogLevel <= 5)
        {
            return Log.w(s, s1);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, String s1, Throwable throwable)
    {
        if (LogLevel <= 5)
        {
            return Log.w(s, s1, throwable);
        } else
        {
            return 0;
        }
    }

    public static int w(String s, Throwable throwable)
    {
        if (LogLevel <= 5)
        {
            return Log.w(s, throwable);
        } else
        {
            return 0;
        }
    }

    static 
    {
        LogLevel = 2;
    }
}
