// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    private static final k d[];

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/ford/syncV4/e/c/a/k, s);
    }

    public static k[] values()
    {
        return (k[])d.clone();
    }

    static 
    {
        a = new k("REQUIRED", 0);
        b = new k("OPTIONAL", 1);
        c = new k("OFF", 2);
        d = (new k[] {
            a, b, c
        });
    }
}
