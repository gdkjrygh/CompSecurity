// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;


public final class i extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    private static final i f[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(com/bumptech/glide/i, s);
    }

    public static i[] values()
    {
        return (i[])f.clone();
    }

    static 
    {
        a = new i("IMMEDIATE", 0);
        b = new i("HIGH", 1);
        c = new i("NORMAL", 2);
        d = new i("LOW", 3);
        e = new i("priority", 4);
        f = (new i[] {
            a, b, c, d, e
        });
    }
}
