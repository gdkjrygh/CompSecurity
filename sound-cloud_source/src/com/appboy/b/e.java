// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.b;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    private static final e n[];
    public final int m;

    private e(String s, int i1, int j1)
    {
        super(s, i1);
        m = j1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/appboy/b/e, s);
    }

    public static e[] values()
    {
        return (e[])n.clone();
    }

    static 
    {
        a = new e("JANUARY", 0, 0);
        b = new e("FEBRUARY", 1, 1);
        c = new e("MARCH", 2, 2);
        d = new e("APRIL", 3, 3);
        e = new e("MAY", 4, 4);
        f = new e("JUNE", 5, 5);
        g = new e("JULY", 6, 6);
        h = new e("AUGUST", 7, 7);
        i = new e("SEPTEMBER", 8, 8);
        j = new e("OCTOBER", 9, 9);
        k = new e("NOVEMBER", 10, 10);
        l = new e("DECEMBER", 11, 11);
        n = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
