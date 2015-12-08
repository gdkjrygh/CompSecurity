// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.content;


public class Log
{

    private static final boolean a = false;
    public static int b044604460446044604460446 = 0;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 45;
    public static int b044604460446044604460446 = 1;

    public Log()
    {
    }

    public static int b044604460446044604460446()
    {
        return 40;
    }

    public static void d(String s, String s1)
    {
    }

    public static void e(String s, String s1)
    {
        try
        {
            android.util.Log.e(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 == b044604460446044604460446)
        {
            return;
        } else
        {
            b044604460446044604460446 = 56;
            b044604460446044604460446 = 70;
            return;
        }
    }

    public static void i(String s, String s1)
    {
        android.util.Log.i(s, s1);
    }

    public static void v(String s, String s1)
    {
    }

    public static void w(String s, String s1)
    {
        android.util.Log.w(s, s1);
    }
}
