// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


public final class CipherSuite extends Enum
{

    public static final CipherSuite A;
    public static final CipherSuite B;
    public static final CipherSuite C;
    public static final CipherSuite D;
    public static final CipherSuite E;
    public static final CipherSuite F;
    public static final CipherSuite G;
    public static final CipherSuite H;
    public static final CipherSuite I;
    public static final CipherSuite J;
    public static final CipherSuite K;
    public static final CipherSuite L;
    public static final CipherSuite M;
    public static final CipherSuite N;
    public static final CipherSuite O;
    public static final CipherSuite P;
    public static final CipherSuite Q;
    public static final CipherSuite R;
    public static final CipherSuite S;
    public static final CipherSuite T;
    public static final CipherSuite U;
    public static final CipherSuite V;
    public static final CipherSuite W;
    public static final CipherSuite X;
    public static final CipherSuite Y;
    public static final CipherSuite Z;
    public static final CipherSuite a;
    public static final CipherSuite aA;
    public static final CipherSuite aB;
    public static final CipherSuite aC;
    public static final CipherSuite aD;
    public static final CipherSuite aE;
    public static final CipherSuite aF;
    public static final CipherSuite aG;
    public static final CipherSuite aH;
    public static final CipherSuite aI;
    public static final CipherSuite aJ;
    public static final CipherSuite aK;
    public static final CipherSuite aL;
    public static final CipherSuite aM;
    public static final CipherSuite aN;
    public static final CipherSuite aO;
    public static final CipherSuite aP;
    public static final CipherSuite aQ;
    public static final CipherSuite aR;
    private static final CipherSuite aT[];
    public static final CipherSuite aa;
    public static final CipherSuite ab;
    public static final CipherSuite ac;
    public static final CipherSuite ad;
    public static final CipherSuite ae;
    public static final CipherSuite af;
    public static final CipherSuite ag;
    public static final CipherSuite ah;
    public static final CipherSuite ai;
    public static final CipherSuite aj;
    public static final CipherSuite ak;
    public static final CipherSuite al;
    public static final CipherSuite am;
    public static final CipherSuite an;
    public static final CipherSuite ao;
    public static final CipherSuite ap;
    public static final CipherSuite aq;
    public static final CipherSuite ar;
    public static final CipherSuite as;
    public static final CipherSuite at;
    public static final CipherSuite au;
    public static final CipherSuite av;
    public static final CipherSuite aw;
    public static final CipherSuite ax;
    public static final CipherSuite ay;
    public static final CipherSuite az;
    public static final CipherSuite b;
    public static final CipherSuite c;
    public static final CipherSuite d;
    public static final CipherSuite e;
    public static final CipherSuite f;
    public static final CipherSuite g;
    public static final CipherSuite h;
    public static final CipherSuite i;
    public static final CipherSuite j;
    public static final CipherSuite k;
    public static final CipherSuite l;
    public static final CipherSuite m;
    public static final CipherSuite n;
    public static final CipherSuite o;
    public static final CipherSuite p;
    public static final CipherSuite q;
    public static final CipherSuite r;
    public static final CipherSuite s;
    public static final CipherSuite t;
    public static final CipherSuite u;
    public static final CipherSuite v;
    public static final CipherSuite w;
    public static final CipherSuite x;
    public static final CipherSuite y;
    public static final CipherSuite z;
    final String aS;

    private CipherSuite(String s1, int i1, String s2)
    {
        super(s1, i1);
        aS = s2;
    }

    public static CipherSuite a(String s1)
    {
        if (s1.startsWith("SSL_"))
        {
            return valueOf((new StringBuilder("TLS_")).append(s1.substring(4)).toString());
        } else
        {
            return valueOf(s1);
        }
    }

    public static CipherSuite valueOf(String s1)
    {
        return (CipherSuite)Enum.valueOf(com/squareup/okhttp/CipherSuite, s1);
    }

    public static CipherSuite[] values()
    {
        return (CipherSuite[])aT.clone();
    }

    static 
    {
        a = new CipherSuite("TLS_RSA_WITH_NULL_MD5", 0, "SSL_RSA_WITH_NULL_MD5");
        b = new CipherSuite("TLS_RSA_WITH_NULL_SHA", 1, "SSL_RSA_WITH_NULL_SHA");
        c = new CipherSuite("TLS_RSA_EXPORT_WITH_RC4_40_MD5", 2, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        d = new CipherSuite("TLS_RSA_WITH_RC4_128_MD5", 3, "SSL_RSA_WITH_RC4_128_MD5");
        e = new CipherSuite("TLS_RSA_WITH_RC4_128_SHA", 4, "SSL_RSA_WITH_RC4_128_SHA");
        f = new CipherSuite("TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 5, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        g = new CipherSuite("TLS_RSA_WITH_DES_CBC_SHA", 6, "SSL_RSA_WITH_DES_CBC_SHA");
        h = new CipherSuite("TLS_RSA_WITH_3DES_EDE_CBC_SHA", 7, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        i = new CipherSuite("TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 8, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        j = new CipherSuite("TLS_DHE_DSS_WITH_DES_CBC_SHA", 9, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        k = new CipherSuite("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 10, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        l = new CipherSuite("TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 11, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m = new CipherSuite("TLS_DHE_RSA_WITH_DES_CBC_SHA", 12, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        n = new CipherSuite("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 13, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        o = new CipherSuite("TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", 14, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        p = new CipherSuite("TLS_DH_anon_WITH_RC4_128_MD5", 15, "SSL_DH_anon_WITH_RC4_128_MD5");
        q = new CipherSuite("TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 16, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        r = new CipherSuite("TLS_DH_anon_WITH_DES_CBC_SHA", 17, "SSL_DH_anon_WITH_DES_CBC_SHA");
        s = new CipherSuite("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", 18, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        t = new CipherSuite("TLS_KRB5_WITH_DES_CBC_SHA", 19, "TLS_KRB5_WITH_DES_CBC_SHA");
        u = new CipherSuite("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 20, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        v = new CipherSuite("TLS_KRB5_WITH_RC4_128_SHA", 21, "TLS_KRB5_WITH_RC4_128_SHA");
        w = new CipherSuite("TLS_KRB5_WITH_DES_CBC_MD5", 22, "TLS_KRB5_WITH_DES_CBC_MD5");
        x = new CipherSuite("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 23, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        y = new CipherSuite("TLS_KRB5_WITH_RC4_128_MD5", 24, "TLS_KRB5_WITH_RC4_128_MD5");
        z = new CipherSuite("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 25, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        A = new CipherSuite("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 26, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        B = new CipherSuite("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 27, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        C = new CipherSuite("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 28, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        D = new CipherSuite("TLS_RSA_WITH_AES_128_CBC_SHA", 29, "TLS_RSA_WITH_AES_128_CBC_SHA");
        E = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 30, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        F = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 31, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        G = new CipherSuite("TLS_DH_anon_WITH_AES_128_CBC_SHA", 32, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        H = new CipherSuite("TLS_RSA_WITH_AES_256_CBC_SHA", 33, "TLS_RSA_WITH_AES_256_CBC_SHA");
        I = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 34, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        J = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 35, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        K = new CipherSuite("TLS_DH_anon_WITH_AES_256_CBC_SHA", 36, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        L = new CipherSuite("TLS_RSA_WITH_NULL_SHA256", 37, "TLS_RSA_WITH_NULL_SHA256");
        M = new CipherSuite("TLS_RSA_WITH_AES_128_CBC_SHA256", 38, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        N = new CipherSuite("TLS_RSA_WITH_AES_256_CBC_SHA256", 39, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        O = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 40, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        P = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 41, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Q = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 42, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        R = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 43, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        S = new CipherSuite("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 44, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        T = new CipherSuite("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 45, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        U = new CipherSuite("TLS_RSA_WITH_AES_128_GCM_SHA256", 46, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        V = new CipherSuite("TLS_RSA_WITH_AES_256_GCM_SHA384", 47, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        W = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 48, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        X = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 49, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        Y = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 50, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        Z = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 51, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        aa = new CipherSuite("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 52, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ab = new CipherSuite("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 53, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        ac = new CipherSuite("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 54, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        ad = new CipherSuite("TLS_ECDH_ECDSA_WITH_NULL_SHA", 55, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        ae = new CipherSuite("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 56, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        af = new CipherSuite("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 57, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ag = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 58, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        ah = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 59, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ai = new CipherSuite("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 60, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        aj = new CipherSuite("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 61, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        ak = new CipherSuite("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 62, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        al = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 63, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        am = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 64, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        an = new CipherSuite("TLS_ECDH_RSA_WITH_NULL_SHA", 65, "TLS_ECDH_RSA_WITH_NULL_SHA");
        ao = new CipherSuite("TLS_ECDH_RSA_WITH_RC4_128_SHA", 66, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        ap = new CipherSuite("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 67, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        aq = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 68, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        ar = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 69, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        as = new CipherSuite("TLS_ECDHE_RSA_WITH_NULL_SHA", 70, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        at = new CipherSuite("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 71, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        au = new CipherSuite("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 72, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        av = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 73, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        aw = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 74, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        ax = new CipherSuite("TLS_ECDH_anon_WITH_NULL_SHA", 75, "TLS_ECDH_anon_WITH_NULL_SHA");
        ay = new CipherSuite("TLS_ECDH_anon_WITH_RC4_128_SHA", 76, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        az = new CipherSuite("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 77, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        aA = new CipherSuite("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 78, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        aB = new CipherSuite("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 79, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        aC = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 80, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        aD = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 81, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        aE = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 82, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        aF = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 83, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        aG = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 84, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        aH = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 85, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        aI = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 86, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        aJ = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 87, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        aK = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 88, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        aL = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 89, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        aM = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 90, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        aN = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 91, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        aO = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 92, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        aP = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 93, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        aQ = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 94, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        aR = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 95, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        aT = (new CipherSuite[] {
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
