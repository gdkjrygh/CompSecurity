// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.b;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    private static final d d[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/nuance/a/a/a/b/b/d, s);
    }

    public static d[] values()
    {
        return (d[])d.clone();
    }

    static 
    {
        a = new d("NO_PROXY", 0);
        b = new d("PROXY_ONLY", 1);
        c = new d("PROXY_IF_AVAIL", 2);
        d = (new d[] {
            a, b, c
        });
    }
}
