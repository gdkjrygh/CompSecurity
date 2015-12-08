// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;


public final class ai extends Enum
{

    public static final ai a;
    public static final ai b;
    public static final ai c;
    public static final ai d;
    private static final ai f[];
    private int e;

    private ai(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static ai a(int i)
    {
        switch (i)
        {
        default:
            return a;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
            return d;
        }
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/roidapp/imagelib/filter/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])f.clone();
    }

    public final String toString()
    {
        return String.valueOf(e);
    }

    static 
    {
        a = new ai("LIGHTNESS", 0, 0);
        b = new ai("CONTRAST", 1, 1);
        c = new ai("SATURATION", 2, 2);
        d = new ai("HUE", 3, 3);
        f = (new ai[] {
            a, b, c, d
        });
    }
}
