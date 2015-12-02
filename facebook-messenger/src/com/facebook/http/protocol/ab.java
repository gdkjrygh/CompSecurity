// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.facebook.http.a.a.a.a.a;

public abstract class ab extends a
{

    private final int a;
    private final String b;

    public ab(String s, int i, String s1)
    {
        super(s);
        a = i;
        b = s1;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return null;
    }

    public String d()
    {
        return "binary";
    }

    public long e()
    {
        return (long)a;
    }
}
