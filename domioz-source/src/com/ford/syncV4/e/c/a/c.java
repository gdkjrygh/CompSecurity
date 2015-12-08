// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    private static final c c[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c a(String s)
    {
        return valueOf(s);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/ford/syncV4/e/c/a/c, s);
    }

    public static c[] values()
    {
        return (c[])c.clone();
    }

    static 
    {
        a = new c("DD_ON", 0);
        b = new c("DD_OFF", 1);
        c = (new c[] {
            a, b
        });
    }
}
