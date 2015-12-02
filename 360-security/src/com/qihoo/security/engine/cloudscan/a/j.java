// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

public final class j extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private String a;
        private boolean b;
        private net.jarlehansen.protobuf.javame.b c;
        private boolean d;

        static boolean a(a a1)
        {
            return a1.b;
        }

        static boolean b(a a1)
        {
            return a1.d;
        }

        static String c(a a1)
        {
            return a1.a;
        }

        static net.jarlehansen.protobuf.javame.b d(a a1)
        {
            return a1.c;
        }

        public a a(String s)
        {
            a = s;
            b = true;
            return this;
        }

        public a a(net.jarlehansen.protobuf.javame.b b1)
        {
            c = b1;
            d = true;
            return this;
        }

        public j a()
        {
            return new j(this, null);
        }

        private a()
        {
            b = false;
            d = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final String b;
    private final net.jarlehansen.protobuf.javame.b c;

    private j(a a1)
    {
        if (com.qihoo.security.engine.cloudscan.a.a.a(a1) && com.qihoo.security.engine.cloudscan.a.a.b(a1))
        {
            b = com.qihoo.security.engine.cloudscan.a.a.c(a1);
            c = a.d(a1);
            return;
        } else
        {
            throw new UninitializedMessageException((new StringBuilder("Not all required fields were included (false = not included in message),  key:")).append(com.qihoo.security.engine.cloudscan.a.a.a(a1)).append(" val:").append(com.qihoo.security.engine.cloudscan.a.a.b(a1)).toString());
        }
    }

    j(a a1, j j1)
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
            a2.a(a1.b(i));
            return true;

        case 2: // '\002'
            a2.a(a1.e(i));
            break;
        }
        return true;
    }

    private int e()
    {
        return 0;
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        a1.a(1, b);
        a1.a(2, c);
    }

    public int b()
    {
        return 0 + net.jarlehansen.protobuf.javame.c.a(1, b) + net.jarlehansen.protobuf.javame.c.a(2, c) + e();
    }

    public String c()
    {
        return b;
    }

    public net.jarlehansen.protobuf.javame.b d()
    {
        return c;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("key = ").append(b).append("   ").toString()))).append("val = ").append(c).append("   ").toString()))).append(")").toString();
    }

}
