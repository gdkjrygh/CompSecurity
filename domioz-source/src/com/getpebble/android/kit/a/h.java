// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit.a;


final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    private static final h f[];
    public final int e;

    private h(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/getpebble/android/kit/a/h, s);
    }

    public static h[] values()
    {
        return (h[])f.clone();
    }

    static 
    {
        a = new h("NONE", 0, 0);
        b = new h("BYTE", 1, 1);
        c = new h("SHORT", 2, 2);
        d = new h("WORD", 3, 4);
        f = (new h[] {
            a, b, c, d
        });
    }
}
