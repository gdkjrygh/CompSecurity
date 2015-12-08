// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce;

import java.security.cert.CertStoreParameters;
import org.spongycastle.x509.X509StoreParameters;

public class X509LDAPCertStoreParameters
    implements CertStoreParameters, X509StoreParameters
{
    public static class Builder
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

        static String A(Builder builder)
        {
            return builder.A;
        }

        static String B(Builder builder)
        {
            return builder.B;
        }

        static String C(Builder builder)
        {
            return builder.C;
        }

        static String D(Builder builder)
        {
            return builder.D;
        }

        static String E(Builder builder)
        {
            return builder.E;
        }

        static String F(Builder builder)
        {
            return builder.F;
        }

        static String G(Builder builder)
        {
            return builder.G;
        }

        static String H(Builder builder)
        {
            return builder.H;
        }

        static String I(Builder builder)
        {
            return builder.I;
        }

        static String J(Builder builder)
        {
            return builder.J;
        }

        static String a(Builder builder)
        {
            return builder.a;
        }

        static String b(Builder builder)
        {
            return builder.b;
        }

        static String c(Builder builder)
        {
            return builder.c;
        }

        static String d(Builder builder)
        {
            return builder.d;
        }

        static String e(Builder builder)
        {
            return builder.e;
        }

        static String f(Builder builder)
        {
            return builder.f;
        }

        static String g(Builder builder)
        {
            return builder.g;
        }

        static String h(Builder builder)
        {
            return builder.h;
        }

        static String i(Builder builder)
        {
            return builder.i;
        }

        static String j(Builder builder)
        {
            return builder.j;
        }

        static String k(Builder builder)
        {
            return builder.k;
        }

        static String l(Builder builder)
        {
            return builder.l;
        }

        static String m(Builder builder)
        {
            return builder.m;
        }

        static String n(Builder builder)
        {
            return builder.n;
        }

        static String o(Builder builder)
        {
            return builder.o;
        }

        static String p(Builder builder)
        {
            return builder.p;
        }

        static String q(Builder builder)
        {
            return builder.q;
        }

        static String r(Builder builder)
        {
            return builder.r;
        }

        static String s(Builder builder)
        {
            return builder.s;
        }

        static String t(Builder builder)
        {
            return builder.t;
        }

        static String u(Builder builder)
        {
            return builder.u;
        }

        static String v(Builder builder)
        {
            return builder.v;
        }

        static String w(Builder builder)
        {
            return builder.w;
        }

        static String x(Builder builder)
        {
            return builder.x;
        }

        static String y(Builder builder)
        {
            return builder.y;
        }

        static String z(Builder builder)
        {
            return builder.z;
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

        public Builder()
        {
            this("ldap://localhost:389", "");
        }

        public Builder(String s1, String s2)
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

    private X509LDAPCertStoreParameters(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
        d = Builder.d(builder);
        e = Builder.e(builder);
        f = Builder.f(builder);
        g = Builder.g(builder);
        h = Builder.h(builder);
        i = Builder.i(builder);
        j = Builder.j(builder);
        k = Builder.k(builder);
        l = Builder.l(builder);
        m = Builder.m(builder);
        n = Builder.n(builder);
        o = Builder.o(builder);
        p = Builder.p(builder);
        q = Builder.q(builder);
        r = Builder.r(builder);
        s = Builder.s(builder);
        t = Builder.t(builder);
        u = Builder.u(builder);
        v = Builder.v(builder);
        w = Builder.w(builder);
        x = Builder.x(builder);
        y = Builder.y(builder);
        z = Builder.z(builder);
        A = Builder.A(builder);
        B = Builder.B(builder);
        C = Builder.C(builder);
        D = Builder.D(builder);
        E = Builder.E(builder);
        F = Builder.F(builder);
        G = Builder.G(builder);
        H = Builder.H(builder);
        I = Builder.I(builder);
        J = Builder.J(builder);
    }

    X509LDAPCertStoreParameters(Builder builder, byte byte0)
    {
        this(builder);
    }

    private static int a(int i1, Object obj)
    {
        int j1;
        if (obj == null)
        {
            j1 = 0;
        } else
        {
            j1 = obj.hashCode();
        }
        return j1 + i1 * 29;
    }

    public final String A()
    {
        return s;
    }

    public final String B()
    {
        return o;
    }

    public final String C()
    {
        return q;
    }

    public final String D()
    {
        return p;
    }

    public final String E()
    {
        return r;
    }

    public final String F()
    {
        return a;
    }

    public final String G()
    {
        return n;
    }

    public final String H()
    {
        return J;
    }

    public final String I()
    {
        return c;
    }

    public final String J()
    {
        return y;
    }

    public final String a()
    {
        return j;
    }

    public final String b()
    {
        return F;
    }

    public final String c()
    {
        return m;
    }

    public Object clone()
    {
        return this;
    }

    public final String d()
    {
        return I;
    }

    public final String e()
    {
        return i;
    }

    public final String f()
    {
        return E;
    }

    public final String g()
    {
        return l;
    }

    public final String h()
    {
        return H;
    }

    public int hashCode()
    {
        return a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(a(0, c), d), e), f), g), h), i), j), k), l), m), n), o), p), q), r), s), t), u), v), w), x), y), z), A), B), C), D), E), F), G), H), I), J);
    }

    public final String i()
    {
        return k;
    }

    public final String j()
    {
        return G;
    }

    public final String k()
    {
        return h;
    }

    public final String l()
    {
        return D;
    }

    public final String m()
    {
        return b;
    }

    public final String n()
    {
        return d;
    }

    public final String o()
    {
        return z;
    }

    public final String p()
    {
        return f;
    }

    public final String q()
    {
        return B;
    }

    public final String r()
    {
        return e;
    }

    public final String s()
    {
        return A;
    }

    public final String t()
    {
        return g;
    }

    public final String u()
    {
        return C;
    }

    public final String v()
    {
        return u;
    }

    public final String w()
    {
        return x;
    }

    public final String x()
    {
        return t;
    }

    public final String y()
    {
        return w;
    }

    public final String z()
    {
        return v;
    }
}
