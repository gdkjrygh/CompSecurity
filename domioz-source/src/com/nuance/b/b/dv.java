// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class dv extends Enum
{

    public static final dv a;
    public static final dv b;
    public static final dv c;
    public static final dv d;
    private static final dv f[];
    private final String e;

    private dv(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static dv valueOf(String s)
    {
        return (dv)Enum.valueOf(com/nuance/b/b/dv, s);
    }

    public static dv[] values()
    {
        return (dv[])f.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new dv("TEXT", 0, "text");
        b = new dv("SSML", 1, "ssml");
        c = new dv("URI", 2, "uri");
        d = new dv("LOCAL_FILE", 3, "local_file");
        f = (new dv[] {
            a, b, c, d
        });
    }
}
