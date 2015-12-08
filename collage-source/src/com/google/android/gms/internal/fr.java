// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

class fr
{

    private final List a;
    private final List b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;
    private String i;
    private int j;

    public fr(int k, Map map)
    {
        i = (String)map.get("url");
        d = (String)map.get("base_uri");
        e = (String)map.get("post_parameters");
        g = b((String)map.get("drt_include"));
        c = (String)map.get("activation_overlay_url");
        b = c((String)map.get("check_packages"));
        h = (String)map.get("request_id");
        f = (String)map.get("type");
        a = c((String)map.get("errors"));
        j = k;
    }

    private static boolean b(String s)
    {
        return s != null && (s.equals("1") || s.equals("true"));
    }

    private List c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    public int a()
    {
        return j;
    }

    public void a(String s)
    {
        i = s;
    }

    public List b()
    {
        return a;
    }

    public String c()
    {
        return e;
    }

    public String d()
    {
        return i;
    }

    public String e()
    {
        return f;
    }

    public boolean f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }
}
