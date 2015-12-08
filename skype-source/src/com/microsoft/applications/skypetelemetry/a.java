// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    private static final a i[];
    private final int h;

    private a(String s, int j, int k)
    {
        super(s, j);
        h = k;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/microsoft/applications/skypetelemetry/a, s);
    }

    public static a[] values()
    {
        return (a[])i.clone();
    }

    public final int a()
    {
        return h;
    }

    static 
    {
        a = new a("UNKNOWN", 0, 0);
        b = new a("LAUNCH", 1, 1);
        c = new a("EXIT", 2, 2);
        d = new a("SUSPEND", 3, 3);
        e = new a("RESUME", 4, 4);
        f = new a("FOREGROUND", 5, 5);
        g = new a("BACKGROUND", 6, 6);
        i = (new a[] {
            a, b, c, d, e, f, g
        });
    }
}
