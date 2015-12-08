// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import android.util.Log;

public final class kc
{

    private static int a = 4000;
    private static boolean b = false;
    private static int c = 5;
    private static boolean d = false;

    public static void a()
    {
        b = true;
    }

    public static void a(int i)
    {
        c = i;
    }

    public static void a(int i, String s, String s1)
    {
        c(i, s, s1);
    }

    public static void a(int i, String s, String s1, Throwable throwable)
    {
        c(i, s, s1, throwable);
    }

    public static void a(String s, String s1)
    {
        b(3, s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        b(6, s, s1, throwable);
    }

    public static void a(boolean flag)
    {
        d = flag;
    }

    public static void b()
    {
        b = false;
    }

    private static void b(int i, String s, String s1)
    {
        if (!b && c <= i)
        {
            d(i, s, s1);
        }
    }

    private static void b(int i, String s, String s1, Throwable throwable)
    {
        b(i, s, (new StringBuilder()).append(s1).append('\n').append(Log.getStackTraceString(throwable)).toString());
    }

    public static void b(String s, String s1)
    {
        b(6, s, s1);
    }

    public static int c()
    {
        return c;
    }

    private static void c(int i, String s, String s1)
    {
        if (d)
        {
            d(i, s, s1);
        }
    }

    private static void c(int i, String s, String s1, Throwable throwable)
    {
        c(i, s, (new StringBuilder()).append(s1).append('\n').append(Log.getStackTraceString(throwable)).toString());
    }

    public static void c(String s, String s1)
    {
        b(4, s, s1);
    }

    private static void d(int i, String s, String s1)
    {
        int j;
        int l;
        if (!d)
        {
            s = "FlurryAgent";
        }
        if (TextUtils.isEmpty(s1))
        {
            j = 0;
        } else
        {
            j = s1.length();
        }
        l = 0;
        do
        {
            int k;
label0:
            {
                if (l < j)
                {
                    if (a > j - l)
                    {
                        k = j;
                    } else
                    {
                        k = a + l;
                    }
                    if (Log.println(i, s, s1.substring(l, k)) > 0)
                    {
                        break label0;
                    }
                }
                return;
            }
            l = k;
        } while (true);
    }

    public static void d(String s, String s1)
    {
        b(2, s, s1);
    }

    public static boolean d()
    {
        return d;
    }

    public static void e(String s, String s1)
    {
        b(5, s, s1);
    }

}
