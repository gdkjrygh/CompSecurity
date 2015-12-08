// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


public final class aq extends Enum
{

    public static final aq a;
    public static final aq b;
    public static final aq c;
    private static final aq e[];
    final int d;

    private aq(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static aq valueOf(String s)
    {
        return (aq)Enum.valueOf(com/squareup/a/aq, s);
    }

    public static aq[] values()
    {
        return (aq[])e.clone();
    }

    static 
    {
        a = new aq("MEMORY", 0, 0xff00ff00);
        b = new aq("DISK", 1, 0xff0000ff);
        c = new aq("NETWORK", 2, 0xffff0000);
        e = (new aq[] {
            a, b, c
        });
    }
}
