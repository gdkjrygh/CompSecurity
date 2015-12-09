// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.a.c;

import com.nuance.a.a.a.a.b.b;
import com.nuance.a.a.a.a.d.a.d;

public class e
{

    private static final com.nuance.a.a.a.a.d.a.e a = d.a(com/nuance/a/a/a/a/c/e);

    public e()
    {
    }

    public static String a(String s)
    {
        a.a();
        int i = 0;
        for (s = new StringBuffer(s); i < s.length();)
        {
            char c1 = s.charAt(i);
            if (c1 == '&')
            {
                i++;
                s.insert(i, "amp;");
                i += 4;
            } else
            if (c1 == '<')
            {
                s.deleteCharAt(i);
                s.insert(i, "&lt;");
                i += 4;
            } else
            if (c1 == '>')
            {
                s.deleteCharAt(i);
                s.insert(i, "&gt;");
                i += 4;
            } else
            if (c1 == '"')
            {
                s.deleteCharAt(i);
                s.insert(i, "&quot;");
                i += 6;
            } else
            if (c1 == '\'')
            {
                s.deleteCharAt(i);
                s.insert(i, "&apos;");
                i += 6;
            } else
            {
                i++;
            }
        }

        s = s.toString();
        a.a();
        return s;
    }

    public static boolean a(b b1)
    {
        short word0 = b1.a();
        return word0 == b.N.a() || word0 == b.P.a() || word0 == b.O.a();
    }

    public static boolean b(b b1)
    {
        short word0 = b1.a();
        return word0 == b.Q.a() || word0 == b.R.a();
    }

    public static b c(b b1)
    {
        b b2;
        if (b1 == b.O || b1 == b.P)
        {
            b2 = b.N;
        } else
        if (b1 == b.T || b1 == b.U || b1 == b.W || b1 == b.V)
        {
            b2 = b.S;
        } else
        {
            b2 = b1;
        }
        if (a.c())
        {
            (new StringBuilder("adjustCodecForBluetooth() ")).append(b1.a()).append(" -> ").append(b2.a());
        }
        return b2;
    }

}
