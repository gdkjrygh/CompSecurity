// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;

public final class Protocol extends Enum
{

    public static final Protocol a;
    public static final Protocol b;
    public static final Protocol c;
    public static final Protocol d;
    private static final Protocol f[];
    private final String e;

    private Protocol(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static Protocol a(String s)
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

    public static Protocol valueOf(String s)
    {
        return (Protocol)Enum.valueOf(com/squareup/okhttp/Protocol, s);
    }

    public static Protocol[] values()
    {
        return (Protocol[])f.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new Protocol("HTTP_1_0", 0, "http/1.0");
        b = new Protocol("HTTP_1_1", 1, "http/1.1");
        c = new Protocol("SPDY_3", 2, "spdy/3.1");
        d = new Protocol("HTTP_2", 3, "h2");
        f = (new Protocol[] {
            a, b, c, d
        });
    }
}
