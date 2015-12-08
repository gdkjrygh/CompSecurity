// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import b.a.ff;

public final class a
{

    public static String a = null;
    public static String b = null;
    public static int c;
    public static String d = "";
    public static String e = "";
    public static boolean f = false;
    public static int g;
    public static boolean h = true;
    public static boolean i = true;
    public static boolean j = true;
    public static boolean k = true;
    public static long l = 30000L;
    private static String m = null;
    private static String n = null;
    private static double o[] = null;

    public static String a()
    {
        if (c == 1)
        {
            return "5.5.3.0";
        } else
        {
            return "5.5.3";
        }
    }

    public static String a(Context context)
    {
        if (m == null)
        {
            m = ff.j(context);
        }
        return m;
    }

    public static String b(Context context)
    {
        if (n == null)
        {
            n = ff.n(context);
        }
        return n;
    }

    public static double[] b()
    {
        return o;
    }

}
