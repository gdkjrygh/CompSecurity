// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Map;

public final class ck
{

    private String a;
    private Map b;

    public ck()
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
        b = map;
    }

    public final Map b()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("(").append(a).append(",endpoints=").append(b).append(")").toString();
    }
}
