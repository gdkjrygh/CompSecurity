// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.a;

import com.google.android.gms.internal.am;
import java.util.HashMap;
import java.util.Map;

public class b
{

    public static final String a = "detail";
    public static final String b = "click";
    public static final String c = "add";
    public static final String d = "remove";
    public static final String e = "checkout";
    public static final String f = "checkout_option";
    public static final String g = "checkout_options";
    public static final String h = "purchase";
    public static final String i = "refund";
    Map j;

    public b(String s)
    {
        j = new HashMap();
        a("&pa", s);
    }

    public b a(double d1)
    {
        a("&tr", Double.toString(d1));
        return this;
    }

    public b a(int k)
    {
        a("&cos", Integer.toString(k));
        return this;
    }

    public b a(String s)
    {
        a("&ti", s);
        return this;
    }

    public Map a()
    {
        return new HashMap(j);
    }

    void a(String s, String s1)
    {
        am.a(s, "Name should be non-null");
        j.put(s, s1);
    }

    public b b(double d1)
    {
        a("&tt", Double.toString(d1));
        return this;
    }

    public b b(String s)
    {
        a("&ta", s);
        return this;
    }

    public b c(double d1)
    {
        a("&ts", Double.toString(d1));
        return this;
    }

    public b c(String s)
    {
        a("&tcc", s);
        return this;
    }

    public b d(String s)
    {
        a("&col", s);
        return this;
    }

    public b e(String s)
    {
        a("&pal", s);
        return this;
    }

    public b f(String s)
    {
        a("&pls", s);
        return this;
    }
}
