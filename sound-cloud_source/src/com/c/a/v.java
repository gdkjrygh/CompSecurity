// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.io.IOException;

public final class v extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;
    private static final v f[];
    private final String e;

    private v(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static v a(String s)
        throws IOException
    {
        if (s.equals(a.e))
        {
            return a;
        }
        if (s.equals(b.e))
        {
            return b;
        }
        if (s.equals(d.e))
        {
            return d;
        }
        if (s.equals(c.e))
        {
            return c;
        } else
        {
            throw new IOException((new StringBuilder("Unexpected protocol: ")).append(s).toString());
        }
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/c/a/v, s);
    }

    public static v[] values()
    {
        return (v[])f.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new v("HTTP_1_0", 0, "http/1.0");
        b = new v("HTTP_1_1", 1, "http/1.1");
        c = new v("SPDY_3", 2, "spdy/3.1");
        d = new v("HTTP_2", 3, "h2");
        f = (new v[] {
            a, b, c, d
        });
    }
}
