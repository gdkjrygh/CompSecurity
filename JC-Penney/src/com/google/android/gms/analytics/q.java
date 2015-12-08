// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.i;

public final class q
{

    public static String a(int j)
    {
        return a("cd", j);
    }

    private static String a(String s, int j)
    {
        if (j < 1)
        {
            com.google.android.gms.analytics.internal.i.a("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(j).toString();
        }
    }

    public static String b(int j)
    {
        return a("cm", j);
    }

    public static String c(int j)
    {
        return a("&pr", j);
    }

    public static String d(int j)
    {
        return a("pr", j);
    }

    public static String e(int j)
    {
        return a("&promo", j);
    }

    public static String f(int j)
    {
        return a("promo", j);
    }

    public static String g(int j)
    {
        return a("pi", j);
    }

    public static String h(int j)
    {
        return a("&il", j);
    }

    public static String i(int j)
    {
        return a("il", j);
    }
}
