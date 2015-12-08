// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class ab extends Enum
{

    public static final ab a;
    public static final ab b;
    private static final ab d[];
    private final String c;

    private ab(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(com/nuance/b/b/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])d.clone();
    }

    public final String toString()
    {
        return c;
    }

    static 
    {
        a = new ab("HINT", 0, "hint");
        b = new ab("UNSPECIFIED", 1, "UNSPECIFIED");
        d = (new ab[] {
            a, b
        });
    }
}
