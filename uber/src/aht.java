// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;
import java.util.Map;

final class aht
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

    public aht(int k, Map map)
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

    private static List c(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Arrays.asList(s.split(","));
        }
    }

    public final int a()
    {
        return j;
    }

    public final void a(String s)
    {
        i = s;
    }

    public final List b()
    {
        return a;
    }

    public final String c()
    {
        return e;
    }

    public final String d()
    {
        return i;
    }

    public final String e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final String g()
    {
        return h;
    }
}
