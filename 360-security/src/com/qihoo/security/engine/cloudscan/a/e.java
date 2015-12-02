// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;
import net.jarlehansen.protobuf.javame.c;

public final class e extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private String a;
        private boolean b;
        private int c;
        private boolean d;
        private int e;
        private boolean f;
        private String g;
        private boolean h;
        private String i;
        private boolean j;
        private String k;
        private boolean l;
        private int m;
        private boolean n;
        private int o;
        private boolean p;

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

        static int e(a a1)
        {
            return a1.e;
        }

        static boolean f(a a1)
        {
            return a1.f;
        }

        static String g(a a1)
        {
            return a1.g;
        }

        static boolean h(a a1)
        {
            return a1.h;
        }

        static String i(a a1)
        {
            return a1.i;
        }

        static boolean j(a a1)
        {
            return a1.j;
        }

        static String k(a a1)
        {
            return a1.k;
        }

        static boolean l(a a1)
        {
            return a1.l;
        }

        static int m(a a1)
        {
            return a1.m;
        }

        static boolean n(a a1)
        {
            return a1.n;
        }

        static int o(a a1)
        {
            return a1.o;
        }

        static boolean p(a a1)
        {
            return a1.p;
        }

        public a a(int i1)
        {
            c = i1;
            d = true;
            return this;
        }

        public a a(String s1)
        {
            a = s1;
            b = true;
            return this;
        }

        public e a()
        {
            return new e(this, null);
        }

        public a b(int i1)
        {
            e = i1;
            f = true;
            return this;
        }

        public a b(String s1)
        {
            g = s1;
            h = true;
            return this;
        }

        public a c(int i1)
        {
            m = i1;
            n = true;
            return this;
        }

        public a c(String s1)
        {
            i = s1;
            j = true;
            return this;
        }

        public a d(int i1)
        {
            o = i1;
            p = true;
            return this;
        }

        public a d(String s1)
        {
            k = s1;
            l = true;
            return this;
        }

        private a()
        {
            b = false;
            d = false;
            f = false;
            h = false;
            j = false;
            l = false;
            n = false;
            p = false;
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
    private final int f;
    private final boolean g;
    private final String h;
    private final boolean i;
    private final String j;
    private final boolean k;
    private final String l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final int p;
    private final boolean q;

    private e(a a1)
    {
        b = com.qihoo.security.engine.cloudscan.a.a.a(a1);
        c = com.qihoo.security.engine.cloudscan.a.a.b(a1);
        d = com.qihoo.security.engine.cloudscan.a.a.c(a1);
        e = a.d(a1);
        f = a.e(a1);
        g = a.f(a1);
        h = a.g(a1);
        i = a.h(a1);
        j = a.i(a1);
        k = a.j(a1);
        l = a.k(a1);
        m = a.l(a1);
        n = a.m(a1);
        o = a.n(a1);
        p = a.o(a1);
        q = a.p(a1);
    }

    e(a a1, e e1)
    {
        this(a1);
    }

    public static a a()
    {
        return new a(null);
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int i1)
        throws IOException
    {
        switch (i1)
        {
        default:
            return false;

        case 1: // '\001'
            a2.a(a1.b(i1));
            return true;

        case 2: // '\002'
            a2.a(a1.a(i1));
            return true;

        case 3: // '\003'
            a2.b(a1.a(i1));
            return true;

        case 4: // '\004'
            a2.b(a1.b(i1));
            return true;

        case 5: // '\005'
            a2.c(a1.b(i1));
            return true;

        case 6: // '\006'
            a2.d(a1.b(i1));
            return true;

        case 7: // '\007'
            a2.c(a1.a(i1));
            return true;

        case 8: // '\b'
            a2.d(a1.a(i1));
            break;
        }
        return true;
    }

    private int s()
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
        if (g)
        {
            a1.a(3, f);
        }
        if (i)
        {
            a1.a(4, h);
        }
        if (k)
        {
            a1.a(5, j);
        }
        if (m)
        {
            a1.a(6, l);
        }
        if (o)
        {
            a1.a(7, n);
        }
        if (q)
        {
            a1.a(8, p);
        }
    }

    public int b()
    {
        int j1 = 0;
        if (c)
        {
            j1 = 0 + net.jarlehansen.protobuf.javame.c.a(1, b);
        }
        int i1 = j1;
        if (e)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(2, d);
        }
        j1 = i1;
        if (g)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(3, f);
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(4, h);
        }
        j1 = i1;
        if (k)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(5, j);
        }
        i1 = j1;
        if (m)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(6, l);
        }
        j1 = i1;
        if (o)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(7, n);
        }
        i1 = j1;
        if (q)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(8, p);
        }
        return i1 + s();
    }

    public String c()
    {
        return b;
    }

    public boolean d()
    {
        return c;
    }

    public int e()
    {
        return d;
    }

    public boolean f()
    {
        return e;
    }

    public int g()
    {
        return f;
    }

    public boolean h()
    {
        return g;
    }

    public String i()
    {
        return h;
    }

    public boolean j()
    {
        return i;
    }

    public String k()
    {
        return j;
    }

    public boolean l()
    {
        return k;
    }

    public String m()
    {
        return l;
    }

    public boolean n()
    {
        return m;
    }

    public int o()
    {
        return n;
    }

    public boolean p()
    {
        return o;
    }

    public int q()
    {
        return p;
    }

    public boolean r()
    {
        return q;
    }

    public String toString()
    {
        String s2 = (new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString();
        String s1 = s2;
        if (c)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("name = ").append(b).append("   ").toString();
        }
        s2 = s1;
        if (e)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("version = ").append(d).append("   ").toString();
        }
        s1 = s2;
        if (g)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("level = ").append(f).append("   ").toString();
        }
        s2 = s1;
        if (i)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("desc = ").append(h).append("   ").toString();
        }
        s1 = s2;
        if (k)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("view_class_name = ").append(j).append("   ").toString();
        }
        s2 = s1;
        if (m)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("host_name_list = ").append(l).append("   ").toString();
        }
        s1 = s2;
        if (o)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("type = ").append(n).append("   ").toString();
        }
        s2 = s1;
        if (q)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("suggest_op = ").append(p).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s2))).append(")").toString();
    }

}
