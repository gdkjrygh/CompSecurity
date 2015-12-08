// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import com.c.a.v;
import java.io.IOException;
import java.net.ProtocolException;

public final class t
{

    public final v a;
    public final int b;
    public final String c;

    private t(v v1, int i, String s)
    {
        a = v1;
        b = i;
        c = s;
    }

    public static t a(String s)
        throws IOException
    {
        byte byte0 = 9;
        Object obj;
        if (s.startsWith("HTTP/1."))
        {
            if (s.length() < 9 || s.charAt(8) != ' ')
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
            int i = s.charAt(7) - 48;
            if (i == 0)
            {
                obj = v.a;
            } else
            if (i == 1)
            {
                obj = v.b;
            } else
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
        } else
        if (s.startsWith("ICY "))
        {
            obj = v.a;
            byte0 = 4;
        } else
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        if (s.length() < byte0 + 3)
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        int j;
        try
        {
            j = Integer.parseInt(s.substring(byte0, byte0 + 3));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
        }
        if (s.length() > byte0 + 3)
        {
            if (s.charAt(byte0 + 3) != ' ')
            {
                throw new ProtocolException((new StringBuilder("Unexpected status line: ")).append(s).toString());
            }
            s = s.substring(byte0 + 4);
        } else
        {
            s = "";
        }
        return new t(((v) (obj)), j, s);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (a == v.a)
        {
            s = "HTTP/1.0";
        } else
        {
            s = "HTTP/1.1";
        }
        stringbuilder.append(s);
        stringbuilder.append(' ').append(b);
        if (c != null)
        {
            stringbuilder.append(' ').append(c);
        }
        return stringbuilder.toString();
    }
}
