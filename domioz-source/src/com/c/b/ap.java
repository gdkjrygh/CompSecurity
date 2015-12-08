// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


public final class ap extends Enum
{

    public static final ap a;
    public static final ap b;
    public static final ap c;
    private static final ap e[];
    final int d;

    private ap(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static ap valueOf(String s)
    {
        return (ap)Enum.valueOf(com/c/b/ap, s);
    }

    public static ap[] values()
    {
        return (ap[])e.clone();
    }

    static 
    {
        a = new ap("MEMORY", 0, 0xff00ff00);
        b = new ap("DISK", 1, 0xff0000ff);
        c = new ap("NETWORK", 2, 0xffff0000);
        e = (new ap[] {
            a, b, c
        });
    }
}
