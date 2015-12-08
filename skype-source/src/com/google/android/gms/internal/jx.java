// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;

public final class jx
{

    private final String a;
    private final Integer b;
    private final String c;
    private final boolean d;
    private final String e;

    public jx(String s, Integer integer, String s1)
    {
        this(s, integer, s1, "");
    }

    private jx(String s, Integer integer, String s1, String s2)
    {
        y.a(s);
        y.a(s2);
        a = s;
        b = integer;
        c = s1;
        d = false;
        e = s2;
    }

    public final String a()
    {
        return a;
    }

    public final Integer b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        if (c != null)
        {
            return (new StringBuilder()).append(c).append("_").append(a).toString();
        } else
        {
            return a;
        }
    }

    public final boolean e()
    {
        return d;
    }

    public final String f()
    {
        return e;
    }
}
