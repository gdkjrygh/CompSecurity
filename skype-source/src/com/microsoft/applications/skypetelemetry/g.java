// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    private static final g f[];
    private final int e;

    private g(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/microsoft/applications/skypetelemetry/g, s);
    }

    public static g[] values()
    {
        return (g[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new g("UNKNOWN", 0, 0);
        b = new g("WIRED", 1, 1);
        c = new g("WIFI", 2, 2);
        d = new g("WWAN", 3, 3);
        f = (new g[] {
            a, b, c, d
        });
    }
}
