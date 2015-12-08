// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;

public class LOG
{

    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static int LOGLEVEL = 0;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public LOG()
    {
    }

    public static void d(String s, String s1)
    {
        if (3 >= LOGLEVEL)
        {
            Log.d(s, s1);
        }
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        if (3 >= LOGLEVEL)
        {
            Log.d(s, s1, throwable);
        }
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        if (3 >= LOGLEVEL)
        {
            Log.d(s, String.format(s1, aobj));
        }
    }

    public static void e(String s, String s1)
    {
        if (6 >= LOGLEVEL)
        {
            Log.e(s, s1);
        }
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        if (6 >= LOGLEVEL)
        {
            Log.e(s, s1, throwable);
        }
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        if (6 >= LOGLEVEL)
        {
            Log.e(s, String.format(s1, aobj));
        }
    }

    public static void i(String s, String s1)
    {
        if (4 >= LOGLEVEL)
        {
            Log.i(s, s1);
        }
    }

    public static void i(String s, String s1, Throwable throwable)
    {
        if (4 >= LOGLEVEL)
        {
            Log.i(s, s1, throwable);
        }
    }

    public static transient void i(String s, String s1, Object aobj[])
    {
        if (4 >= LOGLEVEL)
        {
            Log.i(s, String.format(s1, aobj));
        }
    }

    public static boolean isLoggable(int j)
    {
        return j >= LOGLEVEL;
    }

    public static void setLogLevel(int j)
    {
        LOGLEVEL = j;
        Log.i("CordovaLog", (new StringBuilder()).append("Changing log level to ").append(j).toString());
    }

    public static void setLogLevel(String s)
    {
        if (!"VERBOSE".equals(s)) goto _L2; else goto _L1
_L1:
        LOGLEVEL = 2;
_L4:
        Log.i("CordovaLog", (new StringBuilder()).append("Changing log level to ").append(s).append("(").append(LOGLEVEL).append(")").toString());
        return;
_L2:
        if ("DEBUG".equals(s))
        {
            LOGLEVEL = 3;
        } else
        if ("INFO".equals(s))
        {
            LOGLEVEL = 4;
        } else
        if ("WARN".equals(s))
        {
            LOGLEVEL = 5;
        } else
        if ("ERROR".equals(s))
        {
            LOGLEVEL = 6;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void v(String s, String s1)
    {
        if (2 >= LOGLEVEL)
        {
            Log.v(s, s1);
        }
    }

    public static void v(String s, String s1, Throwable throwable)
    {
        if (2 >= LOGLEVEL)
        {
            Log.v(s, s1, throwable);
        }
    }

    public static transient void v(String s, String s1, Object aobj[])
    {
        if (2 >= LOGLEVEL)
        {
            Log.v(s, String.format(s1, aobj));
        }
    }

    public static void w(String s, String s1)
    {
        if (5 >= LOGLEVEL)
        {
            Log.w(s, s1);
        }
    }

    public static void w(String s, String s1, Throwable throwable)
    {
        if (5 >= LOGLEVEL)
        {
            Log.w(s, s1, throwable);
        }
    }

    public static transient void w(String s, String s1, Object aobj[])
    {
        if (5 >= LOGLEVEL)
        {
            Log.w(s, String.format(s1, aobj));
        }
    }

    static 
    {
        LOGLEVEL = 6;
    }
}
