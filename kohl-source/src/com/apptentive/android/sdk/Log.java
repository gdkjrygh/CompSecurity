// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk;

import java.util.IllegalFormatException;

public class Log
{

    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int DEFAULT = 4;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    private static final String TAG = "Apptentive";
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static int logLevel = 4;

    public Log()
    {
    }

    public static transient void a(String s, Throwable throwable, Object aobj[])
    {
        doLog(7, throwable, s, aobj);
    }

    public static transient void a(String s, Object aobj[])
    {
        doLog(7, null, s, aobj);
    }

    public static boolean canLog(int j)
    {
        return j >= logLevel;
    }

    public static transient void d(String s, Throwable throwable, Object aobj[])
    {
        doLog(3, throwable, s, aobj);
    }

    public static transient void d(String s, Object aobj[])
    {
        doLog(3, null, s, aobj);
    }

    private static transient void doLog(int j, Throwable throwable, String s, Object aobj[])
    {
        if (!canLog(j) || s == null) goto _L2; else goto _L1
_L1:
        String s1;
        int k;
        k = j;
        s1 = s;
        if (aobj.length <= 0)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        s1 = String.format(s, aobj);
        k = j;
_L4:
        android.util.Log.println(k, "Apptentive", s1);
        if (throwable != null)
        {
            if (throwable.getMessage() != null)
            {
                android.util.Log.println(k, "Apptentive", throwable.getMessage());
            }
            android.util.Log.println(k, "Apptentive", android.util.Log.getStackTraceString(throwable));
        }
_L2:
        return;
        aobj;
        s1 = (new StringBuilder()).append("Error formatting log message [level=").append(j).append("]: ").append(s).toString();
        k = 6;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static transient void e(String s, Throwable throwable, Object aobj[])
    {
        doLog(6, throwable, s, aobj);
    }

    public static transient void e(String s, Object aobj[])
    {
        doLog(6, null, s, aobj);
    }

    public static transient void i(String s, Throwable throwable, Object aobj[])
    {
        doLog(4, throwable, s, aobj);
    }

    public static transient void i(String s, Object aobj[])
    {
        doLog(4, null, s, aobj);
    }

    public static void overrideLogLevel(int j)
    {
        logLevel = j;
    }

    public static transient void v(String s, Throwable throwable, Object aobj[])
    {
        doLog(2, throwable, s, aobj);
    }

    public static transient void v(String s, Object aobj[])
    {
        doLog(2, null, s, aobj);
    }

    public static transient void w(String s, Throwable throwable, Object aobj[])
    {
        doLog(5, throwable, s, aobj);
    }

    public static transient void w(String s, Object aobj[])
    {
        doLog(5, null, s, aobj);
    }

}
