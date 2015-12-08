// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;


final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    private static final d i[];

    private d(String s, int j)
    {
        super(s, j);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/google/a/d/d, s);
    }

    public static d[] values()
    {
        return (d[])i.clone();
    }

    static 
    {
        a = new d("EMPTY_ARRAY", 0);
        b = new d("NONEMPTY_ARRAY", 1);
        c = new d("EMPTY_OBJECT", 2);
        d = new d("DANGLING_NAME", 3);
        e = new d("NONEMPTY_OBJECT", 4);
        f = new d("EMPTY_DOCUMENT", 5);
        g = new d("NONEMPTY_DOCUMENT", 6);
        h = new d("CLOSED", 7);
        i = (new d[] {
            a, b, c, d, e, f, g, h
        });
    }
}
