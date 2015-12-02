// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.StringTokenizer;

class m extends StringTokenizer
{

    private final String a[] = new String[10];
    private int b;
    private int c;
    private int d;
    private int e;

    public m(String s)
    {
        super(s, " .,", true);
        do
        {
            if (!hasMoreTokens() || e >= 10)
            {
                break;
            }
            s = nextToken();
            if (s.length() <= 0 || s.charAt(0) != ' ')
            {
                if (e > 0 && s.charAt(0) == '.')
                {
                    b = b | 1 << e - 1;
                } else
                if (e > 0 && s.charAt(0) == ',')
                {
                    c = c | 1 << e - 1;
                } else
                {
                    a[e] = s;
                    e = e + 1;
                }
            }
        } while (true);
    }

    static int a(m m1)
    {
        return m1.d;
    }

    static int b(m m1)
    {
        return m1.e;
    }

    static String[] c(m m1)
    {
        return m1.a;
    }

    static int d(m m1)
    {
        int i = m1.d;
        m1.d = i + 1;
        return i;
    }
}
