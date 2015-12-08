// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;


final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    private static final h d[];

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/yume/android/bsp/h, s);
    }

    public static h[] values()
    {
        h ah[] = d;
        int i = ah.length;
        h ah1[] = new h[i];
        System.arraycopy(ah, 0, ah1, 0, i);
        return ah1;
    }

    static 
    {
        a = new h("NONE", 0);
        b = new h("PLAYLIST", 1);
        c = new h("TRACKER", 2);
        d = (new h[] {
            a, b, c
        });
    }
}
