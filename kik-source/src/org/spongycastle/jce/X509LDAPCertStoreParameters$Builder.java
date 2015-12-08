// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;


// Referenced classes of package org.spongycastle.jce:
//            X509LDAPCertStoreParameters

public static class J
{

    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    static String A(J j1)
    {
        return j1.A;
    }

    static String B(A a1)
    {
        return a1.B;
    }

    static String C(B b1)
    {
        return b1.C;
    }

    static String D(C c1)
    {
        return c1.D;
    }

    static String E(D d1)
    {
        return d1.E;
    }

    static String F(E e1)
    {
        return e1.F;
    }

    static String G(F f1)
    {
        return f1.G;
    }

    static String H(G g1)
    {
        return g1.H;
    }

    static String I(H h1)
    {
        return h1.I;
    }

    static String J(I i1)
    {
        return i1.J;
    }

    static String a(J j1)
    {
        return j1.a;
    }

    static String b(a a1)
    {
        return a1.b;
    }

    static String c(b b1)
    {
        return b1.c;
    }

    static String d(c c1)
    {
        return c1.d;
    }

    static String e(d d1)
    {
        return d1.e;
    }

    static String f(e e1)
    {
        return e1.f;
    }

    static String g(f f1)
    {
        return f1.g;
    }

    static String h(g g1)
    {
        return g1.h;
    }

    static String i(h h1)
    {
        return h1.i;
    }

    static String j(i i1)
    {
        return i1.j;
    }

    static String k(j j1)
    {
        return j1.k;
    }

    static String l(k k1)
    {
        return k1.l;
    }

    static String m(l l1)
    {
        return l1.m;
    }

    static String n(m m1)
    {
        return m1.n;
    }

    static String o(n n1)
    {
        return n1.o;
    }

    static String p(o o1)
    {
        return o1.p;
    }

    static String q(p p1)
    {
        return p1.q;
    }

    static String r(q q1)
    {
        return q1.r;
    }

    static String s(r r1)
    {
        return r1.s;
    }

    static String t(s s1)
    {
        return s1.t;
    }

    static String u(t t1)
    {
        return t1.u;
    }

    static String v(u u1)
    {
        return u1.v;
    }

    static String w(v v1)
    {
        return v1.w;
    }

    static String x(w w1)
    {
        return w1.x;
    }

    static String y(x x1)
    {
        return x1.y;
    }

    static String z(y y1)
    {
        return y1.z;
    }

    public final X509LDAPCertStoreParameters a()
    {
        if (n == null || o == null || p == null || q == null || r == null || s == null || t == null || u == null || v == null || w == null || x == null || y == null || z == null || A == null || B == null || C == null || D == null || E == null || F == null || G == null || H == null || I == null)
        {
            throw new IllegalArgumentException("Necessary parameters not specified.");
        } else
        {
            return new X509LDAPCertStoreParameters(this, (byte)0);
        }
    }

    public ()
    {
        this("ldap://localhost:389", "");
    }

    public <init>(String s1, String s2)
    {
        a = s1;
        if (s2 == null)
        {
            b = "";
        } else
        {
            b = s2;
        }
        c = "userCertificate";
        d = "cACertificate";
        e = "crossCertificatePair";
        f = "certificateRevocationList";
        g = "deltaRevocationList";
        h = "authorityRevocationList";
        i = "attributeCertificateAttribute";
        j = "aACertificate";
        k = "attributeDescriptorCertificate";
        l = "attributeCertificateRevocationList";
        m = "attributeAuthorityRevocationList";
        n = "cn";
        o = "cn ou o";
        p = "cn ou o";
        q = "cn ou o";
        r = "cn ou o";
        s = "cn ou o";
        t = "cn";
        u = "cn o ou";
        v = "cn o ou";
        w = "cn o ou";
        x = "cn o ou";
        y = "cn";
        z = "o ou";
        A = "o ou";
        B = "o ou";
        C = "o ou";
        D = "o ou";
        E = "cn";
        F = "o ou";
        G = "o ou";
        H = "o ou";
        I = "o ou";
        J = "uid serialNumber cn";
    }
}
