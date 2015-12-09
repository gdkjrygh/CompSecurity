// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.f;

public final class j
{

    public static String a(int l)
    {
        return a("cd", l);
    }

    private static String a(String s, int l)
    {
        if (l < 1)
        {
            com.google.android.gms.analytics.internal.f.a("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(l).toString();
        }
    }

    public static String b(int l)
    {
        return a("cm", l);
    }

    public static String c(int l)
    {
        return a("&pr", l);
    }

    public static String d(int l)
    {
        return a("pr", l);
    }

    public static String e(int l)
    {
        return a("&promo", l);
    }

    public static String f(int l)
    {
        return a("promo", l);
    }

    public static String g(int l)
    {
        return a("pi", l);
    }

    public static String h(int l)
    {
        return a("&il", l);
    }

    public static String i(int l)
    {
        return a("il", l);
    }

    public static String j(int l)
    {
        return a("cd", l);
    }

    public static String k(int l)
    {
        return a("cm", l);
    }
}
