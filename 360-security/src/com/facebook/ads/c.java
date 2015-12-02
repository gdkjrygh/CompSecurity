// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.util.t;

public class c
{

    public static final c a = new c(1000, "Network Error");
    public static final c b = new c(1001, "No Fill");
    public static final c c = new c(1002, "Ad was re-loaded too frequently");
    public static final c d = new c(2000, "Server Error");
    public static final c e = new c(2001, "Internal Error");
    public static final c f = new c(2002, "Native ad failed to load due to missing properties");
    private final int g;
    private final String h;

    public c(int i, String s)
    {
        String s1 = s;
        if (t.a(s))
        {
            s1 = "unknown error";
        }
        g = i;
        h = s1;
    }

    public int a()
    {
        return g;
    }

    public String b()
    {
        return h;
    }

}
