// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


public final class CipherSuite extends Enum
{

    private static CipherSuite A;
    private static CipherSuite B;
    private static CipherSuite C;
    private static CipherSuite D;
    private static CipherSuite E;
    private static CipherSuite F;
    private static CipherSuite G;
    private static CipherSuite H;
    private static CipherSuite I;
    private static CipherSuite J;
    private static CipherSuite K;
    private static CipherSuite L;
    private static CipherSuite M;
    private static CipherSuite N;
    private static CipherSuite O;
    private static CipherSuite P;
    private static CipherSuite Q;
    private static CipherSuite R;
    private static CipherSuite S;
    private static CipherSuite T;
    private static CipherSuite U;
    private static CipherSuite V;
    private static CipherSuite W;
    private static CipherSuite X;
    private static CipherSuite Y;
    private static CipherSuite Z;
    public static final CipherSuite a;
    private static CipherSuite aA;
    private static CipherSuite aB;
    private static CipherSuite aC;
    private static CipherSuite aD;
    private static CipherSuite aE;
    private static CipherSuite aF;
    private static CipherSuite aG;
    private static CipherSuite aH;
    private static CipherSuite aI;
    private static CipherSuite aJ;
    private static CipherSuite aK;
    private static CipherSuite aL;
    private static CipherSuite aM;
    private static CipherSuite aN;
    private static CipherSuite aO;
    private static CipherSuite aP;
    private static CipherSuite aQ;
    private static CipherSuite aR;
    private static final CipherSuite aS[];
    private static CipherSuite aa;
    private static CipherSuite ab;
    private static CipherSuite ac;
    private static CipherSuite ad;
    private static CipherSuite ae;
    private static CipherSuite af;
    private static CipherSuite ag;
    private static CipherSuite ah;
    private static CipherSuite ai;
    private static CipherSuite aj;
    private static CipherSuite ak;
    private static CipherSuite al;
    private static CipherSuite am;
    private static CipherSuite an;
    private static CipherSuite ao;
    private static CipherSuite ap;
    private static CipherSuite aq;
    private static CipherSuite ar;
    private static CipherSuite as;
    private static CipherSuite at;
    private static CipherSuite au;
    private static CipherSuite av;
    private static CipherSuite aw;
    private static CipherSuite ax;
    private static CipherSuite ay;
    private static CipherSuite az;
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
    private static CipherSuite o;
    private static CipherSuite p;
    private static CipherSuite q;
    private static CipherSuite r;
    private static CipherSuite s;
    private static CipherSuite t;
    private static CipherSuite u;
    private static CipherSuite v;
    private static CipherSuite w;
    private static CipherSuite x;
    private static CipherSuite y;
    private static CipherSuite z;
    public final String javaName;

    private CipherSuite(String s1, int i1, String s2)
    {
        super(s1, i1);
        javaName = s2;
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
        return (CipherSuite[])aS.clone();
    }

    static 
    {
        o = new CipherSuite("TLS_RSA_WITH_NULL_MD5", 0, "SSL_RSA_WITH_NULL_MD5");
        p = new CipherSuite("TLS_RSA_WITH_NULL_SHA", 1, "SSL_RSA_WITH_NULL_SHA");
        q = new CipherSuite("TLS_RSA_EXPORT_WITH_RC4_40_MD5", 2, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        r = new CipherSuite("TLS_RSA_WITH_RC4_128_MD5", 3, "SSL_RSA_WITH_RC4_128_MD5");
        s = new CipherSuite("TLS_RSA_WITH_RC4_128_SHA", 4, "SSL_RSA_WITH_RC4_128_SHA");
        t = new CipherSuite("TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 5, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        u = new CipherSuite("TLS_RSA_WITH_DES_CBC_SHA", 6, "SSL_RSA_WITH_DES_CBC_SHA");
        a = new CipherSuite("TLS_RSA_WITH_3DES_EDE_CBC_SHA", 7, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        v = new CipherSuite("TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 8, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        w = new CipherSuite("TLS_DHE_DSS_WITH_DES_CBC_SHA", 9, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        x = new CipherSuite("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 10, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        y = new CipherSuite("TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 11, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        z = new CipherSuite("TLS_DHE_RSA_WITH_DES_CBC_SHA", 12, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        A = new CipherSuite("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 13, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        B = new CipherSuite("TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", 14, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        C = new CipherSuite("TLS_DH_anon_WITH_RC4_128_MD5", 15, "SSL_DH_anon_WITH_RC4_128_MD5");
        D = new CipherSuite("TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 16, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        E = new CipherSuite("TLS_DH_anon_WITH_DES_CBC_SHA", 17, "SSL_DH_anon_WITH_DES_CBC_SHA");
        F = new CipherSuite("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", 18, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        G = new CipherSuite("TLS_KRB5_WITH_DES_CBC_SHA", 19, "TLS_KRB5_WITH_DES_CBC_SHA");
        H = new CipherSuite("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 20, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        I = new CipherSuite("TLS_KRB5_WITH_RC4_128_SHA", 21, "TLS_KRB5_WITH_RC4_128_SHA");
        J = new CipherSuite("TLS_KRB5_WITH_DES_CBC_MD5", 22, "TLS_KRB5_WITH_DES_CBC_MD5");
        K = new CipherSuite("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 23, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        L = new CipherSuite("TLS_KRB5_WITH_RC4_128_MD5", 24, "TLS_KRB5_WITH_RC4_128_MD5");
        M = new CipherSuite("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 25, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        N = new CipherSuite("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 26, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        O = new CipherSuite("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 27, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        P = new CipherSuite("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 28, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b = new CipherSuite("TLS_RSA_WITH_AES_128_CBC_SHA", 29, "TLS_RSA_WITH_AES_128_CBC_SHA");
        c = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 30, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        d = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 31, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        Q = new CipherSuite("TLS_DH_anon_WITH_AES_128_CBC_SHA", 32, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        e = new CipherSuite("TLS_RSA_WITH_AES_256_CBC_SHA", 33, "TLS_RSA_WITH_AES_256_CBC_SHA");
        R = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 34, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        f = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 35, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        S = new CipherSuite("TLS_DH_anon_WITH_AES_256_CBC_SHA", 36, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        T = new CipherSuite("TLS_RSA_WITH_NULL_SHA256", 37, "TLS_RSA_WITH_NULL_SHA256");
        U = new CipherSuite("TLS_RSA_WITH_AES_128_CBC_SHA256", 38, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        V = new CipherSuite("TLS_RSA_WITH_AES_256_CBC_SHA256", 39, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        W = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 40, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        X = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 41, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Y = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 42, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        Z = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 43, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        aa = new CipherSuite("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 44, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        ab = new CipherSuite("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 45, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        g = new CipherSuite("TLS_RSA_WITH_AES_128_GCM_SHA256", 46, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        ac = new CipherSuite("TLS_RSA_WITH_AES_256_GCM_SHA384", 47, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        h = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 48, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        ad = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 49, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        ae = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 50, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        af = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 51, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        ag = new CipherSuite("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 52, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ah = new CipherSuite("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 53, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        ai = new CipherSuite("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 54, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        aj = new CipherSuite("TLS_ECDH_ECDSA_WITH_NULL_SHA", 55, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        ak = new CipherSuite("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 56, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        al = new CipherSuite("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 57, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        am = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 58, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        an = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 59, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ao = new CipherSuite("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 60, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        ap = new CipherSuite("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 61, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        aq = new CipherSuite("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 62, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        i = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 63, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        j = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 64, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        ar = new CipherSuite("TLS_ECDH_RSA_WITH_NULL_SHA", 65, "TLS_ECDH_RSA_WITH_NULL_SHA");
        as = new CipherSuite("TLS_ECDH_RSA_WITH_RC4_128_SHA", 66, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        at = new CipherSuite("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 67, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        au = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 68, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        av = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 69, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        aw = new CipherSuite("TLS_ECDHE_RSA_WITH_NULL_SHA", 70, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        ax = new CipherSuite("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 71, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        ay = new CipherSuite("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 72, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        k = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 73, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        l = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 74, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        az = new CipherSuite("TLS_ECDH_anon_WITH_NULL_SHA", 75, "TLS_ECDH_anon_WITH_NULL_SHA");
        aA = new CipherSuite("TLS_ECDH_anon_WITH_RC4_128_SHA", 76, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        aB = new CipherSuite("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 77, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        aC = new CipherSuite("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 78, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        aD = new CipherSuite("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 79, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        aE = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 80, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        aF = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 81, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        aG = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 82, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        aH = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 83, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        aI = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 84, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        aJ = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 85, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        aK = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 86, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        aL = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 87, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        m = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 88, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        aM = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 89, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        aN = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 90, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        aO = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 91, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 92, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        aP = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 93, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        aQ = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 94, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        aR = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 95, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        aS = (new CipherSuite[] {
            o, p, q, r, s, t, u, a, v, w, 
            x, y, z, A, B, C, D, E, F, G, 
            H, I, J, K, L, M, N, O, P, b, 
            c, d, Q, e, R, f, S, T, U, V, 
            W, X, Y, Z, aa, ab, g, ac, h, ad, 
            ae, af, ag, ah, ai, aj, ak, al, am, an, 
            ao, ap, aq, i, j, ar, as, at, au, av, 
            aw, ax, ay, k, l, az, aA, aB, aC, aD, 
            aE, aF, aG, aH, aI, aJ, aK, aL, m, aM, 
            aN, aO, n, aP, aQ, aR
        });
    }
}
