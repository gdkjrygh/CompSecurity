// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

public final class com.qihoo.security.engine.cloudscan.a.a extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private String a;
        private boolean b;
        private int c;
        private boolean d;

        static String a(a a1)
        {
            return a1.a;
        }

        static boolean b(a a1)
        {
            return a1.b;
        }

        static int c(a a1)
        {
            return a1.c;
        }

        static boolean d(a a1)
        {
            return a1.d;
        }

        public a a(int i)
        {
            c = i;
            d = true;
            return this;
        }

        public a a(String s)
        {
            a = s;
            b = true;
            return this;
        }

        public com.qihoo.security.engine.cloudscan.a.a a()
        {
            return new com.qihoo.security.engine.cloudscan.a.a(this, null);
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
    private final boolean c;
    private final int d;
    private final boolean e;

    private com.qihoo.security.engine.cloudscan.a.a(a a1)
    {
        b = a.a(a1);
        c = com.qihoo.security.engine.cloudscan.a.a.b(a1);
        d = com.qihoo.security.engine.cloudscan.a.a.c(a1);
        e = a.d(a1);
    }

    com.qihoo.security.engine.cloudscan.a.a(a a1, com.qihoo.security.engine.cloudscan.a.a a2)
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
            a2.a(a1.a(i));
            break;
        }
        return true;
    }

    private int c()
    {
        return 0;
    }

    public void a(net.jarlehansen.protobuf.javame.b.a a1)
        throws IOException
    {
        if (c)
        {
            a1.a(1, b);
        }
        if (e)
        {
            a1.a(2, d);
        }
    }

    public int b()
    {
        int i = 0;
        if (c)
        {
            i = 0 + net.jarlehansen.protobuf.javame.c.a(1, b);
        }
        int j = i;
        if (e)
        {
            j = i + net.jarlehansen.protobuf.javame.c.a(2, d);
        }
        return j + c();
    }

    public String toString()
    {
        String s1 = (new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString();
        String s = s1;
        if (c)
        {
            s = (new StringBuilder(String.valueOf(s1))).append("name = ").append(b).append("   ").toString();
        }
        s1 = s;
        if (e)
        {
            s1 = (new StringBuilder(String.valueOf(s))).append("version = ").append(d).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s1))).append(")").toString();
    }

}
