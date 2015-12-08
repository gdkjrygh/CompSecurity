// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;


final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    private static final d h[];

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/android/slyce/a/c/c/d, s);
    }

    public static d[] values()
    {
        return (d[])h.clone();
    }

    static 
    {
        a = new d("CHUNK_LEN", 0);
        b = new d("CHUNK_LEN_CR", 1);
        c = new d("CHUNK_LEN_CRLF", 2);
        d = new d("CHUNK", 3);
        e = new d("CHUNK_CR", 4);
        f = new d("CHUNK_CRLF", 5);
        g = new d("COMPLETE", 6);
        h = (new d[] {
            a, b, c, d, e, f, g
        });
    }
}
