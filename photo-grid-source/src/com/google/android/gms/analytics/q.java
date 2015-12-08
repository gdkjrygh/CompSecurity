// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.i;

public final class q
{

    public static String a(int k)
    {
        return a("&cd", k);
    }

    private static String a(String s, int k)
    {
        if (k <= 0)
        {
            com.google.android.gms.analytics.internal.i.a("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(k).toString();
        }
    }

    public static String b(int k)
    {
        return a("cd", k);
    }

    public static String c(int k)
    {
        return a("cm", k);
    }

    public static String d(int k)
    {
        return a("&pr", k);
    }

    public static String e(int k)
    {
        return a("pr", k);
    }

    public static String f(int k)
    {
        return a("&promo", k);
    }

    public static String g(int k)
    {
        return a("promo", k);
    }

    public static String h(int k)
    {
        return a("pi", k);
    }

    public static String i(int k)
    {
        return a("&il", k);
    }

    public static String j(int k)
    {
        return a("il", k);
    }
}
