// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.b.a;

import android.util.Log;
import com.mobvista.sdk.m.a.f.j;
import java.util.HashSet;

public final class a
{

    public static HashSet a = null;
    private static boolean b = false;
    private static long c = 0L;

    public static void a(int i, String s, String s1)
    {
        if (!j.b(s) || !j.b(s1) || b && !a.contains(s))
        {
            return;
        } else
        {
            b(i, s, s1, null);
            return;
        }
    }

    private static void a(int i, String s, String s1, Throwable throwable)
    {
        if (!j.b(s) || !j.b(s1) || throwable == null || b && !a.contains(s))
        {
            return;
        } else
        {
            b(5, s, s1, throwable);
            return;
        }
    }

    public static void a(String s)
    {
        a(1, "Logger", s);
    }

    public static void a(String s, String s1)
    {
        a(1, s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        a(5, s, s1, throwable);
    }

    private static void b(int i, String s, String s1, Throwable throwable)
    {
        if (throwable == null)
        {
            switch (i)
            {
            default:
                return;

            case 5: // '\005'
                Log.e(s, s1);
                return;

            case 4: // '\004'
                Log.w(s, s1);
                return;

            case 3: // '\003'
                Log.i(s, s1);
                return;

            case 2: // '\002'
                Log.d(s, s1);
                return;

            case 1: // '\001'
                Log.v(s, s1);
                return;
            }
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            Log.v(s, s1, throwable);
            return;

        case 5: // '\005'
            Log.e(s, s1, throwable);
            return;

        case 4: // '\004'
            Log.w(s, s1, throwable);
            return;

        case 3: // '\003'
            Log.i(s, s1, throwable);
            return;

        case 2: // '\002'
            Log.d(s, s1, throwable);
            return;
        }
    }

    public static void b(String s, String s1)
    {
        a(2, s, s1);
    }

    public static void c(String s, String s1)
    {
        a(4, s, s1);
    }

    public static void d(String s, String s1)
    {
        a(5, s, s1);
    }

}
