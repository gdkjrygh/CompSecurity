// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.b;

import android.util.Log;

public class c
{

    private static boolean a;

    public c()
    {
    }

    public static void a(int i)
    {
        if (com.supersonicads.sdk.data.c.a.a() == i)
        {
            a = false;
            return;
        } else
        {
            a = true;
            return;
        }
    }

    public static void a(String s, String s1)
    {
        if (a)
        {
            Log.i(s, s1);
        }
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            Log.e(s, s1);
        }
    }

    public static void c(String s, String s1)
    {
        if (a)
        {
            Log.d(s, s1);
        }
    }
}
