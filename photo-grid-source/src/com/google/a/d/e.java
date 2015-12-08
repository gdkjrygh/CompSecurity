// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;


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
    private static final e k[];

    private e(String s, int l)
    {
        super(s, l);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/a/d/e, s);
    }

    public static e[] values()
    {
        return (e[])k.clone();
    }

    static 
    {
        a = new e("BEGIN_ARRAY", 0);
        b = new e("END_ARRAY", 1);
        c = new e("BEGIN_OBJECT", 2);
        d = new e("END_OBJECT", 3);
        e = new e("NAME", 4);
        f = new e("STRING", 5);
        g = new e("NUMBER", 6);
        h = new e("BOOLEAN", 7);
        i = new e("NULL", 8);
        j = new e("END_DOCUMENT", 9);
        k = (new e[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
