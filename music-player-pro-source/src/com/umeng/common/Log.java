// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common;


public class Log
{

    public static boolean LOG = false;

    public Log()
    {
    }

    public static void a(String s, String s1)
    {
        if (LOG)
        {
            android.util.Log.i(s, s1);
        }
    }

    public static void a(String s, String s1, Exception exception)
    {
        if (LOG)
        {
            android.util.Log.i(s, (new StringBuilder(String.valueOf(exception.toString()))).append(":  [").append(s1).append("]").toString());
        }
    }

    public static void b(String s, String s1)
    {
        if (LOG)
        {
            android.util.Log.e(s, s1);
        }
    }

    public static void b(String s, String s1, Exception exception)
    {
        if (!LOG) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        android.util.Log.e(s, (new StringBuilder(String.valueOf(exception.toString()))).append(":  [").append(s1).append("]").toString());
        s1 = exception.getStackTrace();
        j = s1.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        exception = s1[i];
        android.util.Log.e(s, (new StringBuilder("        at\t ")).append(exception.toString()).toString());
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void c(String s, String s1)
    {
        if (LOG)
        {
            android.util.Log.d(s, s1);
        }
    }

    public static void c(String s, String s1, Exception exception)
    {
        if (LOG)
        {
            android.util.Log.d(s, (new StringBuilder(String.valueOf(exception.toString()))).append(":  [").append(s1).append("]").toString());
        }
    }

    public static void d(String s, String s1)
    {
        if (LOG)
        {
            android.util.Log.v(s, s1);
        }
    }

    public static void d(String s, String s1, Exception exception)
    {
        if (LOG)
        {
            android.util.Log.v(s, (new StringBuilder(String.valueOf(exception.toString()))).append(":  [").append(s1).append("]").toString());
        }
    }

    public static void e(String s, String s1)
    {
        if (LOG)
        {
            android.util.Log.w(s, s1);
        }
    }

    public static void e(String s, String s1, Exception exception)
    {
        if (!LOG) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        android.util.Log.w(s, (new StringBuilder(String.valueOf(exception.toString()))).append(":  [").append(s1).append("]").toString());
        s1 = exception.getStackTrace();
        j = s1.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        exception = s1[i];
        android.util.Log.w(s, (new StringBuilder("        at\t ")).append(exception.toString()).toString());
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
