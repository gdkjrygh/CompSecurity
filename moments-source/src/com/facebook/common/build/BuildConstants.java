// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.build;

import com.facebook.common.build.config.BuildConfig;

public class BuildConstants
{

    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    private static final boolean e;
    private static final boolean f;
    private static final boolean g;
    private static final boolean h;
    private static final String i;
    private static final String j;
    private static final String k;
    private static final String l;

    public BuildConstants()
    {
    }

    public static final boolean a()
    {
        return g;
    }

    public static final boolean b()
    {
        return h;
    }

    public static final boolean c()
    {
        return e;
    }

    public static final boolean d()
    {
        return (BuildConfig.b & 2) != 0;
    }

    public static final boolean e()
    {
        return f;
    }

    public static final String f()
    {
        return i;
    }

    public static final String g()
    {
        if (e())
        {
            return c;
        }
        if (c())
        {
            return "com.facebook.wakizashi";
        } else
        {
            return "com.facebook.katana";
        }
    }

    static 
    {
        e = BuildConfig.c;
        f = BuildConfig.g;
        g = BuildConfig.a;
        h = BuildConfig.f;
        i = BuildConfig.e;
        a = BuildConfig.h;
        j = BuildConfig.i;
        k = BuildConfig.j;
        l = BuildConfig.k;
        String s;
        if (f)
        {
            s = "com.facebook.workchat";
        } else
        {
            s = "com.facebook.orca";
        }
        b = s;
        if (e)
        {
            s = "com.facebook.workdev";
        } else
        {
            s = "com.facebook.work";
        }
        c = s;
        d = BuildConfig.l;
    }
}
