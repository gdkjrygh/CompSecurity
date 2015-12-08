// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a.a.a;


final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    private static final n d[];

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/google/b/e/a/a/a/n, s);
    }

    public static n[] values()
    {
        return (n[])d.clone();
    }

    static 
    {
        a = new n("NUMERIC", 0);
        b = new n("ALPHA", 1);
        c = new n("ISO_IEC_646", 2);
        d = (new n[] {
            a, b, c
        });
    }
}
