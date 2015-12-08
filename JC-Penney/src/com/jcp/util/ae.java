// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.util.Log;

public final class ae
{

    public static void a(String s, String s1)
    {
        if (a(s1))
        {
            Log.e(s, s1);
        }
    }

    public static void a(String s, String s1, Exception exception)
    {
        if (a(s1))
        {
            Log.e(s, s1, exception);
        }
    }

    private static boolean a(String s)
    {
        return false;
    }

    public static void b(String s, String s1)
    {
        if (a(s1))
        {
            Log.w(s, s1);
        }
    }

    public static void c(String s, String s1)
    {
        if (a(s1))
        {
            Log.i(s, s1);
        }
    }

    public static void d(String s, String s1)
    {
        if (a(s1))
        {
            Log.d(s, s1);
        }
    }

    public static void e(String s, String s1)
    {
        if (a(s1))
        {
            Log.d(s, s1);
        }
    }
}
