// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import java.util.Hashtable;

public final class bn extends Enum
{

    public static final bn a;
    public static final bn b;
    public static final bn c;
    public static final bn d;
    private static final Hashtable f;
    private static final bn g[];
    private final String e;

    private bn(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static bn a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (bn)f.get(s.toLowerCase());
        }
    }

    public static bn valueOf(String s)
    {
        return (bn)Enum.valueOf(com/android/slyce/a/c/bn, s);
    }

    public static bn[] values()
    {
        return (bn[])g.clone();
    }

    public String toString()
    {
        return e;
    }

    static 
    {
        a = new bn("HTTP_1_0", 0, "http/1.0");
        b = new bn("HTTP_1_1", 1, "http/1.1");
        c = new bn("SPDY_3", 2, "spdy/3.1");
        d = new bn("HTTP_2", 3, "h2-13");
        g = (new bn[] {
            a, b, c, d
        });
        f = new Hashtable();
        f.put(a.toString(), a);
        f.put(b.toString(), b);
        f.put(c.toString(), c);
        f.put(d.toString(), d);
    }
}
