// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

public final class d extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private int a;
        private boolean b;
        private int c;
        private boolean d;
        private String e;
        private boolean f;

        static boolean a(a a1)
        {
            return a1.b;
        }

        static boolean b(a a1)
        {
            return a1.d;
        }

        static int c(a a1)
        {
            return a1.a;
        }

        static int d(a a1)
        {
            return a1.c;
        }

        static String e(a a1)
        {
            return a1.e;
        }

        static boolean f(a a1)
        {
            return a1.f;
        }

        public a a(int i)
        {
            a = i;
            b = true;
            return this;
        }

        public a a(String s)
        {
            e = s;
            f = true;
            return this;
        }

        public d a()
        {
            return new d(this, null);
        }

        public a b(int i)
        {
            c = i;
            d = true;
            return this;
        }

        private a()
        {
            b = false;
            d = false;
            f = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final int b;
    private final int c;
    private final String d;
    private final boolean e;

    private d(a a1)
    {
        if (com.qihoo.security.engine.cloudscan.a.a.a(a1) && com.qihoo.security.engine.cloudscan.a.a.b(a1))
        {
            b = com.qihoo.security.engine.cloudscan.a.a.c(a1);
            c = a.d(a1);
            d = a.e(a1);
            e = a.f(a1);
            return;
        } else
        {
            throw new UninitializedMessageException((new StringBuilder("Not all required fields were included (false = not included in message),  val:")).append(com.qihoo.security.engine.cloudscan.a.a.a(a1)).append(" level:").append(com.qihoo.security.engine.cloudscan.a.a.b(a1)).toString());
        }
    }

    d(a a1, d d1)
    {
        this(a1);
    }

    public static a a()
    {
        return new a(null);
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int i)
        throws IOException
    {
        switch (i)
        {
        default:
            return false;

        case 1: // '\001'
            a2.a(a1.a(i));
            return true;

        case 2: // '\002'
            a2.b(a1.a(i));
            return true;

        case 3: // '\003'
            a2.a(a1.b(i));
            break;
        }
        return true;
    }

    private int g()
    {
        return 0;
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        a1.a(1, b);
        a1.a(2, c);
        if (e)
        {
            a1.a(3, d);
        }
    }

    public int b()
    {
        int j = 0 + net.jarlehansen.protobuf.javame.c.a(1, b) + net.jarlehansen.protobuf.javame.c.a(2, c);
        int i = j;
        if (e)
        {
            i = j + net.jarlehansen.protobuf.javame.c.a(3, d);
        }
        return i + g();
    }

    public int c()
    {
        return b;
    }

    public int d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public boolean f()
    {
        return e;
    }

    public String toString()
    {
        String s1 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("val = ").append(b).append("   ").toString()))).append("level = ").append(c).append("   ").toString();
        String s = s1;
        if (e)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("desc = ").append(d).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s))).append(")").toString();
    }

}
