// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;


public final class f extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    private static final f f[];
    private final int e;

    private f(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/microsoft/applications/skypetelemetry/f, s);
    }

    public static f[] values()
    {
        return (f[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new f("UNKNOWN", 0, 0);
        b = new f("UNMETERED", 1, 1);
        c = new f("METERED", 2, 2);
        d = new f("OVER_DATA_LIMIT", 3, 3);
        f = (new f[] {
            a, b, c, d
        });
    }
}
