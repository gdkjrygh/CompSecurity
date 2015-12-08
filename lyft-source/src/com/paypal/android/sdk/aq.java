// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Map;

public final class aq
{

    private String a;
    private String b;
    private Map c;

    public aq()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final void a(Map map)
    {
        c = map;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final Map c()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a).append(",endpoints=").append(c).append(")").toString();
    }
}
