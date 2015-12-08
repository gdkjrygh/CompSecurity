// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    private static final h e[];
    private final int d;

    private h(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/microsoft/applications/skypetelemetry/h, s);
    }

    public static h[] values()
    {
        return (h[])e.clone();
    }

    public final int a()
    {
        return d;
    }

    static 
    {
        a = new h("UNKNOWN", 0, 0);
        b = new h("BATTERY", 1, 1);
        c = new h("AC", 2, 2);
        e = (new h[] {
            a, b, c
        });
    }
}
