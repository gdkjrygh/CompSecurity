// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.a;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    static i d;
    private static final i g[];
    private String e;
    private int f;

    private i(String s, int j, String s1, int k)
    {
        super(s, j);
        e = s1;
        f = k;
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/facebook/share/a/i, s);
    }

    public static i[] values()
    {
        return (i[])g.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new i("STANDARD", 0, "standard", 0);
        b = new i("BUTTON", 1, "button", 1);
        c = new i("BOX_COUNT", 2, "box_count", 2);
        g = (new i[] {
            a, b, c
        });
        d = a;
    }
}
