// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;


public final class h extends Enum
{

    public static final h A;
    public static final h B;
    public static final h C;
    public static final h D;
    public static final h E;
    public static final h F;
    public static final h G;
    public static final h H;
    public static final h I;
    public static final h J;
    public static final h K;
    public static final h L;
    public static final h M;
    public static final h N;
    public static final h O;
    public static final h P;
    public static final h Q;
    public static final h R;
    public static final h S;
    public static final h T;
    public static final h U;
    public static final h V;
    public static final h W;
    public static final h X;
    public static final h Y;
    public static final h Z;
    public static final h a;
    public static final h aA;
    public static final h aB;
    public static final h aC;
    public static final h aD;
    public static final h aE;
    public static final h aF;
    public static final h aG;
    public static final h aH;
    public static final h aI;
    public static final h aJ;
    public static final h aK;
    public static final h aL;
    public static final h aM;
    public static final h aN;
    public static final h aO;
    public static final h aP;
    public static final h aQ;
    public static final h aR;
    private static final h aT[];
    public static final h aa;
    public static final h ab;
    public static final h ac;
    public static final h ad;
    public static final h ae;
    public static final h af;
    public static final h ag;
    public static final h ah;
    public static final h ai;
    public static final h aj;
    public static final h ak;
    public static final h al;
    public static final h am;
    public static final h an;
    public static final h ao;
    public static final h ap;
    public static final h aq;
    public static final h ar;
    public static final h as;
    public static final h at;
    public static final h au;
    public static final h av;
    public static final h aw;
    public static final h ax;
    public static final h ay;
    public static final h az;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    public static final h q;
    public static final h r;
    public static final h s;
    public static final h t;
    public static final h u;
    public static final h v;
    public static final h w;
    public static final h x;
    public static final h y;
    public static final h z;
    final String aS;

    private h(String s1, int i1, String s2)
    {
        super(s1, i1);
        aS = s2;
    }

    public static h a(String s1)
    {
        if (s1.startsWith("SSL_"))
        {
            return valueOf((new StringBuilder("TLS_")).append(s1.substring(4)).toString());
        } else
        {
            return valueOf(s1);
        }
    }

    public static h valueOf(String s1)
    {
        return (h)Enum.valueOf(com/c/a/h, s1);
    }

    public static h[] values()
    {
        return (h[])aT.clone();
    }

    static 
    {
        a = new h("TLS_RSA_WITH_NULL_MD5", 0, "SSL_RSA_WITH_NULL_MD5");
        b = new h("TLS_RSA_WITH_NULL_SHA", 1, "SSL_RSA_WITH_NULL_SHA");
        c = new h("TLS_RSA_EXPORT_WITH_RC4_40_MD5", 2, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        d = new h("TLS_RSA_WITH_RC4_128_MD5", 3, "SSL_RSA_WITH_RC4_128_MD5");
        e = new h("TLS_RSA_WITH_RC4_128_SHA", 4, "SSL_RSA_WITH_RC4_128_SHA");
        f = new h("TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 5, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        g = new h("TLS_RSA_WITH_DES_CBC_SHA", 6, "SSL_RSA_WITH_DES_CBC_SHA");
        h = new h("TLS_RSA_WITH_3DES_EDE_CBC_SHA", 7, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        i = new h("TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 8, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        j = new h("TLS_DHE_DSS_WITH_DES_CBC_SHA", 9, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        k = new h("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 10, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        l = new h("TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 11, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m = new h("TLS_DHE_RSA_WITH_DES_CBC_SHA", 12, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        n = new h("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 13, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        o = new h("TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", 14, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        p = new h("TLS_DH_anon_WITH_RC4_128_MD5", 15, "SSL_DH_anon_WITH_RC4_128_MD5");
        q = new h("TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 16, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        r = new h("TLS_DH_anon_WITH_DES_CBC_SHA", 17, "SSL_DH_anon_WITH_DES_CBC_SHA");
        s = new h("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", 18, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        t = new h("TLS_KRB5_WITH_DES_CBC_SHA", 19, "TLS_KRB5_WITH_DES_CBC_SHA");
        u = new h("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 20, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        v = new h("TLS_KRB5_WITH_RC4_128_SHA", 21, "TLS_KRB5_WITH_RC4_128_SHA");
        w = new h("TLS_KRB5_WITH_DES_CBC_MD5", 22, "TLS_KRB5_WITH_DES_CBC_MD5");
        x = new h("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 23, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        y = new h("TLS_KRB5_WITH_RC4_128_MD5", 24, "TLS_KRB5_WITH_RC4_128_MD5");
        z = new h("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 25, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        A = new h("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 26, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        B = new h("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 27, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        C = new h("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 28, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        D = new h("TLS_RSA_WITH_AES_128_CBC_SHA", 29, "TLS_RSA_WITH_AES_128_CBC_SHA");
        E = new h("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 30, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        F = new h("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 31, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        G = new h("TLS_DH_anon_WITH_AES_128_CBC_SHA", 32, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        H = new h("TLS_RSA_WITH_AES_256_CBC_SHA", 33, "TLS_RSA_WITH_AES_256_CBC_SHA");
        I = new h("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 34, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        J = new h("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 35, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        K = new h("TLS_DH_anon_WITH_AES_256_CBC_SHA", 36, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        L = new h("TLS_RSA_WITH_NULL_SHA256", 37, "TLS_RSA_WITH_NULL_SHA256");
        M = new h("TLS_RSA_WITH_AES_128_CBC_SHA256", 38, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        N = new h("TLS_RSA_WITH_AES_256_CBC_SHA256", 39, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        O = new h("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 40, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        P = new h("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 41, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Q = new h("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 42, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        R = new h("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 43, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        S = new h("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 44, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        T = new h("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 45, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        U = new h("TLS_RSA_WITH_AES_128_GCM_SHA256", 46, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        V = new h("TLS_RSA_WITH_AES_256_GCM_SHA384", 47, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        W = new h("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 48, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        X = new h("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 49, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        Y = new h("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 50, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        Z = new h("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 51, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        aa = new h("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 52, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ab = new h("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 53, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        ac = new h("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 54, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        ad = new h("TLS_ECDH_ECDSA_WITH_NULL_SHA", 55, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        ae = new h("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 56, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        af = new h("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 57, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ag = new h("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 58, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        ah = new h("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 59, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ai = new h("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 60, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        aj = new h("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 61, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        ak = new h("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 62, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        al = new h("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 63, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        am = new h("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 64, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        an = new h("TLS_ECDH_RSA_WITH_NULL_SHA", 65, "TLS_ECDH_RSA_WITH_NULL_SHA");
        ao = new h("TLS_ECDH_RSA_WITH_RC4_128_SHA", 66, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        ap = new h("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 67, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        aq = new h("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 68, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        ar = new h("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 69, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        as = new h("TLS_ECDHE_RSA_WITH_NULL_SHA", 70, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        at = new h("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 71, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        au = new h("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 72, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        av = new h("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 73, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        aw = new h("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 74, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        ax = new h("TLS_ECDH_anon_WITH_NULL_SHA", 75, "TLS_ECDH_anon_WITH_NULL_SHA");
        ay = new h("TLS_ECDH_anon_WITH_RC4_128_SHA", 76, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        az = new h("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 77, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        aA = new h("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 78, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        aB = new h("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 79, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        aC = new h("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 80, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        aD = new h("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 81, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        aE = new h("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 82, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        aF = new h("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 83, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        aG = new h("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 84, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        aH = new h("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 85, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        aI = new h("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 86, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        aJ = new h("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 87, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        aK = new h("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 88, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        aL = new h("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 89, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        aM = new h("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 90, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        aN = new h("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 91, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        aO = new h("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 92, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        aP = new h("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 93, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        aQ = new h("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 94, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        aR = new h("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 95, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        aT = (new h[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
            ai, aj, ak, al, am, an, ao, ap, aq, ar, 
            as, at, au, av, aw, ax, ay, az, aA, aB, 
            aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, 
            aM, aN, aO, aP, aQ, aR
        });
    }
}
