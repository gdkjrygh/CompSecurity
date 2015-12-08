// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;


final class E extends Enum
{

    public static final E a;
    public static final E b;
    public static final E c;
    public static final E d;
    public static final E e;
    private static final E f[];

    private E(String s, int i)
    {
        super(s, i);
    }

    public static E valueOf(String s)
    {
        return (E)Enum.valueOf(com/yume/android/player/E, s);
    }

    public static E[] values()
    {
        E ae[] = f;
        int i = ae.length;
        E ae1[] = new E[i];
        System.arraycopy(ae, 0, ae1, 0, i);
        return ae1;
    }

    static 
    {
        a = new E("NONE", 0);
        b = new E("TOP_LEFT", 1);
        c = new E("TOP_RIGHT", 2);
        d = new E("BOTTOM_LEFT", 3);
        e = new E("BOTTOM_RIGHT", 4);
        f = (new E[] {
            a, b, c, d, e
        });
    }
}
