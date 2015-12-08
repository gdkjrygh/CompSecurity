// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class d extends Enum
{

    public static final d a;
    private static final d c[];
    private final String b;

    private d(String s, String s1)
    {
        super(s, 0);
        b = s1;
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/nuance/b/b/d, s);
    }

    public static d[] values()
    {
        return (d[])c.clone();
    }

    public final String toString()
    {
        return b;
    }

    static 
    {
        a = new d("AES_128", "AES-128");
        c = (new d[] {
            a
        });
    }
}
