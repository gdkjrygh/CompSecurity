// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.c;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    private static final i d[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/nuance/b/c/i, s);
    }

    public static i[] values()
    {
        return (i[])d.clone();
    }

    static 
    {
        a = new i("PENDING", 0);
        b = new i("RESOLVED", 1);
        c = new i("REJECTED", 2);
        d = (new i[] {
            a, b, c
        });
    }
}
