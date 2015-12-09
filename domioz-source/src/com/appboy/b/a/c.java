// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b.a;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/appboy/b/a/c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new c("SLIDEUP", 0);
        b = new c("MODAL", 1);
        c = new c("FULL", 2);
        d = (new c[] {
            a, b, c
        });
    }
}
