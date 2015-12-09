// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static g d;
    private static final g g[];
    private String e;
    private int f;

    private g(String s, int i, String s1, int j)
    {
        super(s, i);
        e = s1;
        f = j;
    }

    public static g a(int i)
    {
        g ag[] = values();
        int k = ag.length;
        for (int j = 0; j < k; j++)
        {
            g g1 = ag[j];
            if (g1.f == i)
            {
                return g1;
            }
        }

        return null;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/share/a/g, s);
    }

    public static g[] values()
    {
        return (g[])g.clone();
    }

    public final int a()
    {
        return f;
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new g("UNKNOWN", 0, "unknown", 0);
        b = new g("OPEN_GRAPH", 1, "open_graph", 1);
        c = new g("PAGE", 2, "page", 2);
        g = (new g[] {
            a, b, c
        });
        d = a;
    }
}
