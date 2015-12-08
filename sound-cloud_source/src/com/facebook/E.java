// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class E extends Enum
{

    public static final E a;
    public static final E b;
    public static final E c;
    private static final E d[];

    private E(String s, int i)
    {
        super(s, i);
    }

    public static E valueOf(String s)
    {
        return (E)Enum.valueOf(com/facebook/E, s);
    }

    public static E[] values()
    {
        return (E[])d.clone();
    }

    static 
    {
        a = new E("GET", 0);
        b = new E("POST", 1);
        c = new E("DELETE", 2);
        d = (new E[] {
            a, b, c
        });
    }
}
