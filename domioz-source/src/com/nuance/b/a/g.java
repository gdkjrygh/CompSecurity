// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    private static final g e[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/nuance/b/a/g, s);
    }

    public static g[] values()
    {
        return (g[])e.clone();
    }

    static 
    {
        a = new g("LOOP", 0);
        b = new g("ANDN", 1);
        c = new g("ORN", 2);
        d = new g("SEQN", 3);
        e = (new g[] {
            a, b, c, d
        });
    }
}
