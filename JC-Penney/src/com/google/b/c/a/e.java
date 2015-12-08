// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;


final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    private static final e h[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/google/b/c/a/e, s);
    }

    public static e[] values()
    {
        return (e[])h.clone();
    }

    static 
    {
        a = new e("PAD_ENCODE", 0);
        b = new e("ASCII_ENCODE", 1);
        c = new e("C40_ENCODE", 2);
        d = new e("TEXT_ENCODE", 3);
        e = new e("ANSIX12_ENCODE", 4);
        f = new e("EDIFACT_ENCODE", 5);
        g = new e("BASE256_ENCODE", 6);
        h = (new e[] {
            a, b, c, d, e, f, g
        });
    }
}
