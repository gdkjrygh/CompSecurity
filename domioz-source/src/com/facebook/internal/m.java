// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.q;

public final class m extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    private static final m j[];
    private final int i;

    private m(String s, int k, int l)
    {
        super(s, k);
        i = l;
    }

    public static m valueOf(String s)
    {
        return (m)Enum.valueOf(com/facebook/internal/m, s);
    }

    public static m[] values()
    {
        return (m[])j.clone();
    }

    public final int a()
    {
        return q.k() + i;
    }

    static 
    {
        a = new m("Login", 0, 0);
        b = new m("Share", 1, 1);
        c = new m("Message", 2, 2);
        d = new m("Like", 3, 3);
        e = new m("GameRequest", 4, 4);
        f = new m("AppGroupCreate", 5, 5);
        g = new m("AppGroupJoin", 6, 6);
        h = new m("AppInvite", 7, 7);
        j = (new m[] {
            a, b, c, d, e, f, g, h
        });
    }
}
