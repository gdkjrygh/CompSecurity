// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia;

import android.util.Log;

public class c
{

    public static int a = 4;

    public c()
    {
    }

    private static String a(String s)
    {
        return (new StringBuilder()).append("MMSDK-").append(s).append(" <").append(Thread.currentThread().getId()).append(":").append(System.currentTimeMillis()).append(">").toString();
    }

    public static void a(String s, String s1)
    {
        if (a <= 3)
        {
            e(s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (a <= 3)
        {
            e(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    public static boolean a()
    {
        return a <= 3;
    }

    public static void b(String s, String s1)
    {
        if (a <= 4)
        {
            f(s, s1);
        }
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        if (a <= 5)
        {
            g(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    public static void c(String s, String s1)
    {
        if (a <= 5)
        {
            g(s, s1);
        }
    }

    public static void c(String s, String s1, Throwable throwable)
    {
        if (a <= 6)
        {
            h(s, (new StringBuilder()).append(s1).append(": ").append(Log.getStackTraceString(throwable)).toString());
        }
    }

    public static void d(String s, String s1)
    {
        if (a <= 6)
        {
            h(s, s1);
        }
    }

    private static void e(String s, String s1)
    {
        Log.d(a(s), s1);
    }

    private static void f(String s, String s1)
    {
        Log.i(a(s), s1);
    }

    private static void g(String s, String s1)
    {
        Log.w(a(s), s1);
    }

    private static void h(String s, String s1)
    {
        Log.e(a(s), s1);
    }

}
