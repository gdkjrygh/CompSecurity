// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.a.a.b;

public final class c extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private int a;
        private boolean b;
        private net.jarlehansen.protobuf.javame.b c;
        private boolean d;
        private long e;
        private boolean f;
        private String g;
        private boolean h;
        private int i;
        private boolean j;
        private net.jarlehansen.protobuf.javame.b k;
        private boolean l;
        private String m;
        private boolean n;
        private int o;
        private boolean p;
        private String q;
        private boolean r;
        private String s;
        private boolean t;
        private String u;
        private boolean v;

        static boolean a(a a1)
        {
            return a1.b;
        }

        static int b(a a1)
        {
            return a1.a;
        }

        static net.jarlehansen.protobuf.javame.b c(a a1)
        {
            return a1.c;
        }

        static boolean d(a a1)
        {
            return a1.d;
        }

        static long e(a a1)
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

        static int i(a a1)
        {
            return a1.i;
        }

        static boolean j(a a1)
        {
            return a1.j;
        }

        static net.jarlehansen.protobuf.javame.b k(a a1)
        {
            return a1.k;
        }

        static boolean l(a a1)
        {
            return a1.l;
        }

        static String m(a a1)
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

        static String q(a a1)
        {
            return a1.q;
        }

        static boolean r(a a1)
        {
            return a1.r;
        }

        static String s(a a1)
        {
            return a1.s;
        }

        static boolean t(a a1)
        {
            return a1.t;
        }

        static String u(a a1)
        {
            return a1.u;
        }

        static boolean v(a a1)
        {
            return a1.v;
        }

        public a a(int i1)
        {
            a = i1;
            b = true;
            return this;
        }

        public a a(long l1)
        {
            e = l1;
            f = true;
            return this;
        }

        public a a(String s1)
        {
            g = s1;
            h = true;
            return this;
        }

        public a a(net.jarlehansen.protobuf.javame.b b1)
        {
            c = b1;
            d = true;
            return this;
        }

        public c a()
        {
            return new c(this, null);
        }

        public a b(int i1)
        {
            i = i1;
            j = true;
            return this;
        }

        public a b(String s1)
        {
            m = s1;
            n = true;
            return this;
        }

        public a b(net.jarlehansen.protobuf.javame.b b1)
        {
            k = b1;
            l = true;
            return this;
        }

        public a c(int i1)
        {
            o = i1;
            p = true;
            return this;
        }

        public a c(String s1)
        {
            q = s1;
            r = true;
            return this;
        }

        public a d(String s1)
        {
            s = s1;
            t = true;
            return this;
        }

        public a e(String s1)
        {
            u = s1;
            v = true;
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
            r = false;
            t = false;
            v = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final int b;
    private final net.jarlehansen.protobuf.javame.b c;
    private final boolean d;
    private final long e;
    private final boolean f;
    private final String g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final net.jarlehansen.protobuf.javame.b k;
    private final boolean l;
    private final String m;
    private final boolean n;
    private final int o;
    private final boolean p;
    private final String q;
    private final boolean r;
    private final String s;
    private final boolean t;
    private final String u;
    private final boolean v;

    private c(a a1)
    {
        if (com.qihoo.security.engine.cloudscan.a.a.a(a1))
        {
            b = com.qihoo.security.engine.cloudscan.a.a.b(a1);
            c = a.c(a1);
            d = a.d(a1);
            e = a.e(a1);
            f = a.f(a1);
            g = a.g(a1);
            h = a.h(a1);
            i = a.i(a1);
            j = a.j(a1);
            k = a.k(a1);
            l = a.l(a1);
            m = a.m(a1);
            n = a.n(a1);
            o = a.o(a1);
            p = a.p(a1);
            q = a.q(a1);
            r = a.r(a1);
            s = a.s(a1);
            t = a.t(a1);
            u = a.u(a1);
            v = a.v(a1);
            return;
        } else
        {
            throw new UninitializedMessageException((new StringBuilder("Not all required fields were included (false = not included in message),  id:")).append(com.qihoo.security.engine.cloudscan.a.a.a(a1)).toString());
        }
    }

    c(a a1, c c1)
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
            a2.a(a1.a(i1));
            return true;

        case 2: // '\002'
            a2.a(a1.e(i1));
            return true;

        case 3: // '\003'
            a2.a(a1.d(i1));
            return true;

        case 4: // '\004'
            a2.a(a1.b(i1));
            return true;

        case 5: // '\005'
            a2.b(a1.a(i1));
            return true;

        case 6: // '\006'
            a2.b(a1.e(i1));
            return true;

        case 7: // '\007'
            a2.b(a1.b(i1));
            return true;

        case 8: // '\b'
            a2.c(a1.a(i1));
            return true;

        case 9: // '\t'
            a2.c(a1.b(i1));
            return true;

        case 10: // '\n'
            a2.d(a1.b(i1));
            return true;

        case 11: // '\013'
            a2.e(a1.b(i1));
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
        a1.a(1, b);
        if (d)
        {
            a1.a(2, c);
        }
        if (f)
        {
            a1.a(3, e);
        }
        if (h)
        {
            a1.a(4, g);
        }
        if (j)
        {
            a1.a(5, i);
        }
        if (l)
        {
            a1.a(6, k);
        }
        if (n)
        {
            a1.a(7, m);
        }
        if (p)
        {
            a1.a(8, o);
        }
        if (r)
        {
            a1.a(9, q);
        }
        if (t)
        {
            a1.a(10, s);
        }
        if (v)
        {
            a1.a(11, u);
        }
    }

    public int b()
    {
        int j1 = 0 + net.jarlehansen.protobuf.javame.c.a(1, b);
        int i1 = j1;
        if (d)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(2, c);
        }
        j1 = i1;
        if (f)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(3, e);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(4, g);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(5, i);
        }
        i1 = j1;
        if (l)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(6, k);
        }
        j1 = i1;
        if (n)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(7, m);
        }
        i1 = j1;
        if (p)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(8, o);
        }
        j1 = i1;
        if (r)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(9, q);
        }
        i1 = j1;
        if (t)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(10, s);
        }
        j1 = i1;
        if (v)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(11, u);
        }
        return j1 + c();
    }

    public String toString()
    {
        String s2 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("id = ").append(b).append("   ").toString();
        String s1 = s2;
        if (d)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("sha1 = ").append(c).append("   ").toString();
        }
        s2 = s1;
        if (f)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("file_size = ").append(e).append("   ").toString();
        }
        s1 = s2;
        if (h)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("file_path = ").append(g).append("   ").toString();
        }
        s2 = s1;
        if (j)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("bole_ver = ").append(i).append("   ").toString();
        }
        s1 = s2;
        if (l)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("bole_buf = ").append(k).append("   ").toString();
        }
        s2 = s1;
        if (n)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("bole_ext = ").append(m).append("   ").toString();
        }
        s1 = s2;
        if (p)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("mpattern_ver = ").append(o).append("   ").toString();
        }
        s2 = s1;
        if (r)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("mpattern = ").append(q).append("   ").toString();
        }
        s1 = s2;
        if (t)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("mpattern_ext = ").append(s).append("   ").toString();
        }
        s2 = s1;
        if (v)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("ext = ").append(u).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s2))).append(")").toString();
    }

}
