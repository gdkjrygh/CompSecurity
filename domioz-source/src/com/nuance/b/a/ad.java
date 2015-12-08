// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class ad extends Enum
{

    public static final ad a;
    public static final ad b;
    private static final ad d[];
    private final String c;

    private ad(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static ad valueOf(String s)
    {
        return (ad)Enum.valueOf(com/nuance/b/a/ad, s);
    }

    public static ad[] values()
    {
        return (ad[])d.clone();
    }

    public final String toString()
    {
        return c;
    }

    static 
    {
        a = new ad("ALLOWED", 0, "PERSISTENT");
        b = new ad("NOT_ALLOWED", 1, "NONPERSISTENT");
        d = (new ad[] {
            a, b
        });
    }
}
