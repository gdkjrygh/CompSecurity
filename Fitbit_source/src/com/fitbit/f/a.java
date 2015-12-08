// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.f;

import android.util.Log;

public class a
{

    private static int a = 4;

    public a()
    {
    }

    public static void a(int i)
    {
        a = i;
    }

    public static void a(String s, String s1)
    {
        if (4 >= a)
        {
            Log.i(s, s1);
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (5 >= a)
        {
            Log.w(s, s1, throwable);
        }
    }

    public static void b(String s, String s1)
    {
        if (6 >= a)
        {
            Log.e(s, s1);
        }
    }

    public static void c(String s, String s1)
    {
        if (3 >= a)
        {
            Log.i(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        if (2 >= a)
        {
            Log.i(s, s1);
        }
    }

    public static void e(String s, String s1)
    {
        if (5 >= a)
        {
            Log.w(s, s1);
        }
    }

}
