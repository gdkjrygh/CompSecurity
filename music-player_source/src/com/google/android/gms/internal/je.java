// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class je
{

    private final String a;
    private final String b;
    private String c;
    private int d;

    public je(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final hx.a a()
    {
        return new hx.a(0, a, b, c, d);
    }

    public final je a(int i)
    {
        d = i;
        return this;
    }

    public final je a(String s)
    {
        c = s;
        return this;
    }
}
