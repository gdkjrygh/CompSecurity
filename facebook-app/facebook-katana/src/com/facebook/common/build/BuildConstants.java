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
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;
    private static final boolean g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final String k;

    public BuildConstants()
    {
    }

    public static final boolean a()
    {
        return f;
    }

    public static final boolean b()
    {
        return g;
    }

    public static final boolean c()
    {
        return d;
    }

    public static final boolean d()
    {
        return (BuildConfig.b & 2) != 0;
    }

    public static final boolean e()
    {
        return e;
    }

    public static final String f()
    {
        return h;
    }

    public static final String g()
    {
        return i;
    }

    public static final String h()
    {
        return j;
    }

    public static final String i()
    {
        return k;
    }

    public static final String j()
    {
        if (e())
        {
            if (c())
            {
                return "com.facebook.workdev";
            } else
            {
                return "com.facebook.work";
            }
        }
        if (c())
        {
            return "com.facebook.wakizashi";
        } else
        {
            return "com.facebook.katana";
        }
    }

    public static final String k()
    {
        if (c())
        {
            return "wakizashi";
        } else
        {
            return "katana";
        }
    }

    public static final String l()
    {
        if (c())
        {
            return "https://m.facebook.com/mobile_builds";
        } else
        {
            return "https://market.android.com/details?id=com.facebook.katana";
        }
    }

    static 
    {
        d = BuildConfig.c;
        e = BuildConfig.g;
        f = BuildConfig.a;
        g = BuildConfig.f;
        h = BuildConfig.e;
        a = BuildConfig.h;
        i = BuildConfig.i;
        j = BuildConfig.j;
        k = BuildConfig.k;
        String s;
        if (e)
        {
            s = "com.facebook.workchat";
        } else
        {
            s = "com.facebook.orca";
        }
        b = s;
        c = BuildConfig.l;
    }
}
