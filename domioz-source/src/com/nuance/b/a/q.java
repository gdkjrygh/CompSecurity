// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class q extends Enum
{

    public static final q a;
    public static final q b;
    public static final q c;
    private static final q d[];

    private q(String s, int i)
    {
        super(s, i);
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/nuance/b/a/q, s);
    }

    public static q[] values()
    {
        return (q[])d.clone();
    }

    static 
    {
        a = new q("MANDATORY", 0);
        b = new q("OPTIONAL", 1);
        c = new q("NONE", 2);
        d = (new q[] {
            a, b, c
        });
    }
}
