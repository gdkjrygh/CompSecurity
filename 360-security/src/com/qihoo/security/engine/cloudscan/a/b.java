// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan.a;

import java.io.IOException;
import java.util.Vector;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.a;
import net.jarlehansen.protobuf.javame.c;

// Referenced classes of package com.qihoo.security.engine.cloudscan.a:
//            a

public final class b extends net.jarlehansen.protobuf.javame.a
{
    public static class a
    {

        private int A;
        private boolean B;
        private net.jarlehansen.protobuf.javame.b C;
        private boolean D;
        private net.jarlehansen.protobuf.javame.b E;
        private boolean F;
        private int G;
        private boolean H;
        private String I;
        private boolean J;
        private net.jarlehansen.protobuf.javame.b K;
        private boolean L;
        private Vector M;
        private boolean N;
        private int O;
        private boolean P;
        private long Q;
        private boolean R;
        private int a;
        private boolean b;
        private net.jarlehansen.protobuf.javame.b c;
        private boolean d;
        private net.jarlehansen.protobuf.javame.b e;
        private boolean f;
        private net.jarlehansen.protobuf.javame.b g;
        private boolean h;
        private int i;
        private boolean j;
        private String k;
        private boolean l;
        private String m;
        private boolean n;
        private long o;
        private boolean p;
        private String q;
        private boolean r;
        private String s;
        private boolean t;
        private String u;
        private boolean v;
        private String w;
        private boolean x;
        private int y;
        private boolean z;

        static int A(a a1)
        {
            return a1.A;
        }

        static boolean B(a a1)
        {
            return a1.B;
        }

        static net.jarlehansen.protobuf.javame.b C(a a1)
        {
            return a1.C;
        }

        static boolean D(a a1)
        {
            return a1.D;
        }

        static net.jarlehansen.protobuf.javame.b E(a a1)
        {
            return a1.E;
        }

        static boolean F(a a1)
        {
            return a1.F;
        }

        static int G(a a1)
        {
            return a1.G;
        }

        static boolean H(a a1)
        {
            return a1.H;
        }

        static String I(a a1)
        {
            return a1.I;
        }

        static boolean J(a a1)
        {
            return a1.J;
        }

        static net.jarlehansen.protobuf.javame.b K(a a1)
        {
            return a1.K;
        }

        static boolean L(a a1)
        {
            return a1.L;
        }

        static Vector M(a a1)
        {
            return a1.M;
        }

        static int N(a a1)
        {
            return a1.O;
        }

        static boolean O(a a1)
        {
            return a1.P;
        }

        static long P(a a1)
        {
            return a1.Q;
        }

        static boolean Q(a a1)
        {
            return a1.R;
        }

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

        static net.jarlehansen.protobuf.javame.b e(a a1)
        {
            return a1.e;
        }

        static boolean f(a a1)
        {
            return a1.f;
        }

        static net.jarlehansen.protobuf.javame.b g(a a1)
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

        static String k(a a1)
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

        static long o(a a1)
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

        static String w(a a1)
        {
            return a1.w;
        }

        static boolean x(a a1)
        {
            return a1.x;
        }

        static int y(a a1)
        {
            return a1.y;
        }

        static boolean z(a a1)
        {
            return a1.z;
        }

        public a a(int i1)
        {
            a = i1;
            b = true;
            return this;
        }

        public a a(long l1)
        {
            o = l1;
            p = true;
            return this;
        }

        public a a(com.qihoo.security.engine.cloudscan.a.a a1)
        {
            if (!N)
            {
                N = true;
            }
            M.addElement(a1);
            return this;
        }

        public a a(String s1)
        {
            k = s1;
            l = true;
            return this;
        }

        public a a(net.jarlehansen.protobuf.javame.b b1)
        {
            c = b1;
            d = true;
            return this;
        }

        public b a()
        {
            return new b(this, null);
        }

        public a b(int i1)
        {
            i = i1;
            j = true;
            return this;
        }

        public a b(long l1)
        {
            Q = l1;
            R = true;
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
            e = b1;
            f = true;
            return this;
        }

        public a c(int i1)
        {
            y = i1;
            z = true;
            return this;
        }

        public a c(String s1)
        {
            q = s1;
            r = true;
            return this;
        }

        public a c(net.jarlehansen.protobuf.javame.b b1)
        {
            g = b1;
            h = true;
            return this;
        }

        public a d(int i1)
        {
            A = i1;
            B = true;
            return this;
        }

        public a d(String s1)
        {
            s = s1;
            t = true;
            return this;
        }

        public a d(net.jarlehansen.protobuf.javame.b b1)
        {
            C = b1;
            D = true;
            return this;
        }

        public a e(int i1)
        {
            G = i1;
            H = true;
            return this;
        }

        public a e(String s1)
        {
            u = s1;
            v = true;
            return this;
        }

        public a e(net.jarlehansen.protobuf.javame.b b1)
        {
            E = b1;
            F = true;
            return this;
        }

        public a f(int i1)
        {
            O = i1;
            P = true;
            return this;
        }

        public a f(String s1)
        {
            w = s1;
            x = true;
            return this;
        }

        public a f(net.jarlehansen.protobuf.javame.b b1)
        {
            K = b1;
            L = true;
            return this;
        }

        public a g(String s1)
        {
            I = s1;
            J = true;
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
            x = false;
            z = false;
            B = false;
            D = false;
            F = false;
            H = false;
            J = false;
            L = false;
            M = new Vector();
            N = false;
            P = false;
            R = false;
        }

        a(a a1)
        {
            this();
        }
    }


    private static net.jarlehansen.protobuf.javame.a.a.b a = net.jarlehansen.protobuf.javame.a.a.a.a();
    private final int A;
    private final boolean B;
    private final net.jarlehansen.protobuf.javame.b C;
    private final boolean D;
    private final net.jarlehansen.protobuf.javame.b E;
    private final boolean F;
    private final int G;
    private final boolean H;
    private final String I;
    private final boolean J;
    private final net.jarlehansen.protobuf.javame.b K;
    private final boolean L;
    private final Vector M;
    private final int N;
    private final boolean O;
    private final long P;
    private final boolean Q;
    private final int b;
    private final net.jarlehansen.protobuf.javame.b c;
    private final boolean d;
    private final net.jarlehansen.protobuf.javame.b e;
    private final boolean f;
    private final net.jarlehansen.protobuf.javame.b g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final String k;
    private final boolean l;
    private final String m;
    private final boolean n;
    private final long o;
    private final boolean p;
    private final String q;
    private final boolean r;
    private final String s;
    private final boolean t;
    private final String u;
    private final boolean v;
    private final String w;
    private final boolean x;
    private final int y;
    private final boolean z;

    private b(a a1)
    {
        if (com.qihoo.security.engine.cloudscan.a.a.a(a1))
        {
            b = a.b(a1);
            c = com.qihoo.security.engine.cloudscan.a.a.c(a1);
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
            w = a.w(a1);
            x = a.x(a1);
            y = a.y(a1);
            z = a.z(a1);
            A = a.A(a1);
            B = a.B(a1);
            C = a.C(a1);
            D = a.D(a1);
            E = a.E(a1);
            F = a.F(a1);
            G = a.G(a1);
            H = a.H(a1);
            I = a.I(a1);
            J = a.J(a1);
            K = a.K(a1);
            L = a.L(a1);
            M = a.M(a1);
            N = a.N(a1);
            O = a.O(a1);
            P = a.P(a1);
            Q = a.Q(a1);
            return;
        } else
        {
            throw new UninitializedMessageException((new StringBuilder("Not all required fields were included (false = not included in message),  id:")).append(com.qihoo.security.engine.cloudscan.a.a.a(a1)).toString());
        }
    }

    b(a a1, b b1)
    {
        this(a1);
    }

    static int a(net.jarlehansen.protobuf.javame.a.a a1)
        throws IOException
    {
        return a1.a();
    }

    public static a a()
    {
        return new a(null);
    }

    static boolean a(net.jarlehansen.protobuf.javame.a.a a1, a a2, int i1)
        throws IOException
    {
        i1;
        JVM INSTR lookupswitch 22: default 188
    //                   1: 190
    //                   2: 202
    //                   3: 214
    //                   4: 226
    //                   5: 238
    //                   6: 250
    //                   7: 262
    //                   8: 274
    //                   9: 286
    //                   10: 298
    //                   11: 310
    //                   12: 322
    //                   13: 334
    //                   14: 346
    //                   15: 358
    //                   16: 370
    //                   17: 382
    //                   18: 394
    //                   19: 406
    //                   20: 418
    //                   21: 505
    //                   1000: 517;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23
_L1:
        return false;
_L2:
        a2.a(a1.a(i1));
        return true;
_L3:
        a2.a(a1.e(i1));
        return true;
_L4:
        a2.b(a1.e(i1));
        return true;
_L5:
        a2.c(a1.e(i1));
        return true;
_L6:
        a2.b(a1.a(i1));
        return true;
_L7:
        a2.a(a1.b(i1));
        return true;
_L8:
        a2.b(a1.b(i1));
        return true;
_L9:
        a2.a(a1.d(i1));
        return true;
_L10:
        a2.c(a1.b(i1));
        return true;
_L11:
        a2.d(a1.b(i1));
        return true;
_L12:
        a2.e(a1.b(i1));
        return true;
_L13:
        a2.f(a1.b(i1));
        return true;
_L14:
        a2.c(a1.a(i1));
        return true;
_L15:
        a2.d(a1.a(i1));
        return true;
_L16:
        a2.d(a1.e(i1));
        return true;
_L17:
        a2.e(a1.e(i1));
        return true;
_L18:
        a2.e(a1.a(i1));
        return true;
_L19:
        a2.g(a1.b(i1));
        return true;
_L20:
        a2.f(a1.e(i1));
        return true;
_L21:
        a1 = a1.f(20);
        i1 = 0;
_L25:
        if (i1 >= a1.size())
        {
            return true;
        }
        byte abyte0[] = (byte[])a1.elementAt(i1);
        a.a a3 = com.qihoo.security.engine.cloudscan.a.a.a();
        net.jarlehansen.protobuf.javame.a.a a4 = new net.jarlehansen.protobuf.javame.a.a(abyte0, a);
        boolean flag = true;
        do
        {
            if (!flag)
            {
                a2.a(a3.a());
                i1++;
                continue; /* Loop/switch isn't completed */
            }
            flag = com.qihoo.security.engine.cloudscan.a.a.a(a4, a3, a(a4));
        } while (true);
_L22:
        a2.f(a1.a(i1));
        return true;
_L23:
        a2.b(a1.d(i1));
        return true;
        if (true) goto _L25; else goto _L24
_L24:
    }

    private int c()
    {
        return 0 + net.jarlehansen.protobuf.javame.c.a(20, 8, M);
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
        if (x)
        {
            a1.a(12, w);
        }
        if (z)
        {
            a1.a(13, y);
        }
        if (B)
        {
            a1.a(14, A);
        }
        if (D)
        {
            a1.a(15, C);
        }
        if (F)
        {
            a1.a(16, E);
        }
        if (H)
        {
            a1.a(17, G);
        }
        if (J)
        {
            a1.a(18, I);
        }
        if (L)
        {
            a1.a(19, K);
        }
        a1.a(20, 8, M);
        if (O)
        {
            a1.a(21, N);
        }
        if (Q)
        {
            a1.a(1000, P);
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
        i1 = j1;
        if (x)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(12, w);
        }
        j1 = i1;
        if (z)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(13, y);
        }
        i1 = j1;
        if (B)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(14, A);
        }
        j1 = i1;
        if (D)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(15, C);
        }
        i1 = j1;
        if (F)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(16, E);
        }
        j1 = i1;
        if (H)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(17, G);
        }
        i1 = j1;
        if (J)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(18, I);
        }
        j1 = i1;
        if (L)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(19, K);
        }
        i1 = j1;
        if (O)
        {
            i1 = j1 + net.jarlehansen.protobuf.javame.c.a(21, N);
        }
        j1 = i1;
        if (Q)
        {
            j1 = i1 + net.jarlehansen.protobuf.javame.c.a(1000, P);
        }
        return j1 + c();
    }

    public String toString()
    {
        String s2 = (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append(getClass().getName()).append("(").toString()))).append("id = ").append(b).append("   ").toString();
        String s1 = s2;
        if (d)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("mf_sha1 = ").append(c).append("   ").toString();
        }
        s2 = s1;
        if (f)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("sha1 = ").append(e).append("   ").toString();
        }
        s1 = s2;
        if (h)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("sign_hash = ").append(g).append("   ").toString();
        }
        s2 = s1;
        if (j)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("version_code = ").append(i).append("   ").toString();
        }
        s1 = s2;
        if (l)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("pkg_name = ").append(k).append("   ").toString();
        }
        s2 = s1;
        if (n)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("file_type = ").append(m).append("   ").toString();
        }
        s1 = s2;
        if (p)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("file_size = ").append(o).append("   ").toString();
        }
        s2 = s1;
        if (r)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("file_path = ").append(q).append("   ").toString();
        }
        s1 = s2;
        if (t)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("app_label = ").append(s).append("   ").toString();
        }
        s2 = s1;
        if (v)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("flags = ").append(u).append("   ").toString();
        }
        s1 = s2;
        if (x)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("source = ").append(w).append("   ").toString();
        }
        s2 = s1;
        if (z)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("scan_type = ").append(y).append("   ").toString();
        }
        s1 = s2;
        if (B)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("local_level = ").append(A).append("   ").toString();
        }
        s2 = s1;
        if (D)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("start_info = ").append(C).append("   ").toString();
        }
        s1 = s2;
        if (F)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("privilege_info = ").append(E).append("   ").toString();
        }
        s2 = s1;
        if (H)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("start_pos = ").append(G).append("   ").toString();
        }
        s1 = s2;
        if (J)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("ext = ").append(I).append("   ").toString();
        }
        s2 = s1;
        if (L)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("action = ").append(K).append("   ").toString();
        }
        s2 = (new StringBuilder(String.valueOf(s2))).append("ad_plugins = ").append(M).append("   ").toString();
        s1 = s2;
        if (O)
        {
            s1 = (new StringBuilder(String.valueOf(s2))).append("install_type = ").append(N).append("   ").toString();
        }
        s2 = s1;
        if (Q)
        {
            s2 = (new StringBuilder(String.valueOf(s1))).append("resflag = ").append(P).append("   ").toString();
        }
        return (new StringBuilder(String.valueOf(s2))).append(")").toString();
    }

}
