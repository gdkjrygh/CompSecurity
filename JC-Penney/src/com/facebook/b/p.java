// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import com.facebook.s;

public final class p extends Enum
{

    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    private static final p j[];
    private final int i;

    private p(String s1, int k, int l)
    {
        super(s1, k);
        i = l;
    }

    public static p valueOf(String s1)
    {
        return (p)Enum.valueOf(com/facebook/b/p, s1);
    }

    public static p[] values()
    {
        return (p[])j.clone();
    }

    public int a()
    {
        return s.j() + i;
    }

    static 
    {
        a = new p("Login", 0, 0);
        b = new p("Share", 1, 1);
        c = new p("Message", 2, 2);
        d = new p("Like", 3, 3);
        e = new p("GameRequest", 4, 4);
        f = new p("AppGroupCreate", 5, 5);
        g = new p("AppGroupJoin", 6, 6);
        h = new p("AppInvite", 7, 7);
        j = (new p[] {
            a, b, c, d, e, f, g, h
        });
    }
}
