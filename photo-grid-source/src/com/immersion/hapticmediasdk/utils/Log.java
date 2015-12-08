// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.utils;


public class Log
{

    private static final boolean a = false;
    public static int b044A044A044A044A044A044A = 48;
    public static int b044A044A044A044A044A044A = 1;
    public static int b044A044A044A044A044A044A = 0;
    public static int b044A044A044A044A044A044A = 2;

    public Log()
    {
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A() != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = 0;
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
        }
    }

    public static int b044A044A044A044A044A044A()
    {
        return 1;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 1;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 2;
    }

    public static void d(String s, String s1)
    {
    }

    public static void e(String s, String s1)
    {
        android.util.Log.e(s, s1);
        int j = b044A044A044A044A044A044A();
        switch ((j * (b044A044A044A044A044A044A + j)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = 56;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static void i(String s, String s1)
    {
        int j = b044A044A044A044A044A044A;
        switch ((j * (b044A044A044A044A044A044A() + j)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 75;
            b044A044A044A044A044A044A = 9;
            // fall through

        case 0: // '\0'
            android.util.Log.i(s, s1);
            break;
        }
    }

    public static void v(String s, String s1)
    {
    }

    public static void w(String s, String s1)
    {
        android.util.Log.w(s, s1);
    }
}
