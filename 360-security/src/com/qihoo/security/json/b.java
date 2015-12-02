// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.json;


final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    private static final b i[];

    private b(String s, int j)
    {
        super(s, j);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/qihoo/security/json/b, s);
    }

    public static b[] values()
    {
        return (b[])i.clone();
    }

    static 
    {
        a = new b("EMPTY_ARRAY", 0);
        b = new b("NONEMPTY_ARRAY", 1);
        c = new b("EMPTY_OBJECT", 2);
        d = new b("DANGLING_NAME", 3);
        e = new b("NONEMPTY_OBJECT", 4);
        f = new b("EMPTY_DOCUMENT", 5);
        g = new b("NONEMPTY_DOCUMENT", 6);
        h = new b("CLOSED", 7);
        i = (new b[] {
            a, b, c, d, e, f, g, h
        });
    }
}
