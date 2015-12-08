// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.c.a;


final class b extends Enum
{

    public static final b a;
    public static final b b;
    private static final b e[];
    private final char c;
    private final char d;

    private b(String s, int i, char c1, char c2)
    {
        super(s, i);
        c = c1;
        d = c2;
    }

    static b a(char c1)
    {
        b ab[] = values();
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            b b1 = ab[i];
            if (b1.c == c1 || b1.d == c1)
            {
                return b1;
            }
        }

        throw new IllegalArgumentException((new StringBuilder(38)).append("No enum corresponding to given code: ").append(c1).toString());
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/c/c/a/b, s);
    }

    public static b[] values()
    {
        return (b[])e.clone();
    }

    static 
    {
        a = new b("PRIVATE", 0, ':', ',');
        b = new b("ICANN", 1, '!', '?');
        e = (new b[] {
            a, b
        });
    }
}
