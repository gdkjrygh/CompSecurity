// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


final class A extends Enum
{

    public static final A a;
    public static final A b;
    public static final A c;
    public static final A d;
    public static final A e;
    public static final A f;
    private static final A g[];

    private A(String s, int i)
    {
        super(s, i);
    }

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/yume/android/player/A, s);
    }

    public static A[] values()
    {
        A aa[] = g;
        int i = aa.length;
        A aa1[] = new A[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        a = new A("NONE", 0);
        b = new A("PLAYING", 1);
        c = new A("PAUSED", 2);
        d = new A("FAILED", 3);
        e = new A("COMPLETED", 4);
        f = new A("TIMED_OUT", 5);
        g = (new A[] {
            a, b, c, d, e, f
        });
    }
}
