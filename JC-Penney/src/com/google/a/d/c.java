// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    private static final c k[];

    private c(String s, int l)
    {
        super(s, l);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/google/a/d/c, s);
    }

    public static c[] values()
    {
        return (c[])k.clone();
    }

    static 
    {
        a = new c("BEGIN_ARRAY", 0);
        b = new c("END_ARRAY", 1);
        c = new c("BEGIN_OBJECT", 2);
        d = new c("END_OBJECT", 3);
        e = new c("NAME", 4);
        f = new c("STRING", 5);
        g = new c("NUMBER", 6);
        h = new c("BOOLEAN", 7);
        i = new c("NULL", 8);
        j = new c("END_DOCUMENT", 9);
        k = (new c[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
