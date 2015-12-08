// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import com.kik.g.p;

public final class b extends p
{

    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public b(String s, String s1, String s2)
    {
        this(s, s1, s2, (byte)0);
    }

    private b(String s, String s1, String s2, byte byte0)
    {
        d = s2;
        c = s1;
        b = s;
        e = false;
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d;
    }

    public final String c()
    {
        return b;
    }

    public final boolean d()
    {
        return e;
    }
}
