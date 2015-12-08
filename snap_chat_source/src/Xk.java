// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Xk extends Enum
{

    private static Xk A;
    private static Xk B;
    private static Xk C;
    private static Xk D;
    private static Xk E;
    private static Xk F;
    private static Xk G;
    private static Xk H;
    private static Xk I;
    private static Xk J;
    private static Xk K;
    private static Xk L;
    private static Xk M;
    private static Xk N;
    private static Xk O;
    private static Xk P;
    private static Xk Q;
    private static Xk R;
    private static Xk S;
    private static Xk T;
    private static Xk U;
    private static Xk V;
    private static Xk W;
    private static Xk X;
    private static Xk Y;
    private static Xk Z;
    public static final Xk a;
    private static Xk aA;
    private static Xk aB;
    private static Xk aC;
    private static Xk aD;
    private static Xk aE;
    private static Xk aF;
    private static Xk aG;
    private static Xk aH;
    private static Xk aI;
    private static Xk aJ;
    private static Xk aK;
    private static Xk aL;
    private static Xk aM;
    private static Xk aN;
    private static Xk aO;
    private static Xk aP;
    private static Xk aQ;
    private static Xk aR;
    private static Xk aS;
    private static final Xk aT[];
    private static Xk aa;
    private static Xk ab;
    private static Xk ac;
    private static Xk ad;
    private static Xk ae;
    private static Xk af;
    private static Xk ag;
    private static Xk ah;
    private static Xk ai;
    private static Xk aj;
    private static Xk ak;
    private static Xk al;
    private static Xk am;
    private static Xk an;
    private static Xk ao;
    private static Xk ap;
    private static Xk aq;
    private static Xk ar;
    private static Xk as;
    private static Xk at;
    private static Xk au;
    private static Xk av;
    private static Xk aw;
    private static Xk ax;
    private static Xk ay;
    private static Xk az;
    public static final Xk b;
    public static final Xk c;
    public static final Xk d;
    public static final Xk e;
    public static final Xk f;
    public static final Xk g;
    public static final Xk h;
    public static final Xk i;
    public static final Xk j;
    public static final Xk k;
    public static final Xk l;
    public static final Xk m;
    public static final Xk n;
    private static Xk p;
    private static Xk q;
    private static Xk r;
    private static Xk s;
    private static Xk t;
    private static Xk u;
    private static Xk v;
    private static Xk w;
    private static Xk x;
    private static Xk y;
    private static Xk z;
    final String o;

    private Xk(String s1, int i1, String s2)
    {
        super(s1, i1);
        o = s2;
    }

    public static Xk a(String s1)
    {
        if (s1.startsWith("SSL_"))
        {
            return valueOf((new StringBuilder("TLS_")).append(s1.substring(4)).toString());
        } else
        {
            return valueOf(s1);
        }
    }

    public static Xk valueOf(String s1)
    {
        return (Xk)Enum.valueOf(Xk, s1);
    }

    public static Xk[] values()
    {
        return (Xk[])aT.clone();
    }

    static 
    {
        p = new Xk("TLS_RSA_WITH_NULL_MD5", 0, "SSL_RSA_WITH_NULL_MD5");
        q = new Xk("TLS_RSA_WITH_NULL_SHA", 1, "SSL_RSA_WITH_NULL_SHA");
        r = new Xk("TLS_RSA_EXPORT_WITH_RC4_40_MD5", 2, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        s = new Xk("TLS_RSA_WITH_RC4_128_MD5", 3, "SSL_RSA_WITH_RC4_128_MD5");
        t = new Xk("TLS_RSA_WITH_RC4_128_SHA", 4, "SSL_RSA_WITH_RC4_128_SHA");
        u = new Xk("TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 5, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        v = new Xk("TLS_RSA_WITH_DES_CBC_SHA", 6, "SSL_RSA_WITH_DES_CBC_SHA");
        a = new Xk("TLS_RSA_WITH_3DES_EDE_CBC_SHA", 7, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        w = new Xk("TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 8, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        x = new Xk("TLS_DHE_DSS_WITH_DES_CBC_SHA", 9, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        y = new Xk("TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 10, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        z = new Xk("TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 11, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        A = new Xk("TLS_DHE_RSA_WITH_DES_CBC_SHA", 12, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        B = new Xk("TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 13, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        C = new Xk("TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", 14, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        D = new Xk("TLS_DH_anon_WITH_RC4_128_MD5", 15, "SSL_DH_anon_WITH_RC4_128_MD5");
        E = new Xk("TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 16, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        F = new Xk("TLS_DH_anon_WITH_DES_CBC_SHA", 17, "SSL_DH_anon_WITH_DES_CBC_SHA");
        G = new Xk("TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", 18, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        H = new Xk("TLS_KRB5_WITH_DES_CBC_SHA", 19, "TLS_KRB5_WITH_DES_CBC_SHA");
        I = new Xk("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 20, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        J = new Xk("TLS_KRB5_WITH_RC4_128_SHA", 21, "TLS_KRB5_WITH_RC4_128_SHA");
        K = new Xk("TLS_KRB5_WITH_DES_CBC_MD5", 22, "TLS_KRB5_WITH_DES_CBC_MD5");
        L = new Xk("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 23, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        M = new Xk("TLS_KRB5_WITH_RC4_128_MD5", 24, "TLS_KRB5_WITH_RC4_128_MD5");
        N = new Xk("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 25, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        O = new Xk("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 26, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        P = new Xk("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 27, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        Q = new Xk("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 28, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b = new Xk("TLS_RSA_WITH_AES_128_CBC_SHA", 29, "TLS_RSA_WITH_AES_128_CBC_SHA");
        c = new Xk("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 30, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        d = new Xk("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 31, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        R = new Xk("TLS_DH_anon_WITH_AES_128_CBC_SHA", 32, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        e = new Xk("TLS_RSA_WITH_AES_256_CBC_SHA", 33, "TLS_RSA_WITH_AES_256_CBC_SHA");
        S = new Xk("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 34, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        f = new Xk("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 35, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        T = new Xk("TLS_DH_anon_WITH_AES_256_CBC_SHA", 36, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        U = new Xk("TLS_RSA_WITH_NULL_SHA256", 37, "TLS_RSA_WITH_NULL_SHA256");
        V = new Xk("TLS_RSA_WITH_AES_128_CBC_SHA256", 38, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        W = new Xk("TLS_RSA_WITH_AES_256_CBC_SHA256", 39, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        X = new Xk("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 40, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        Y = new Xk("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 41, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        Z = new Xk("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 42, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        aa = new Xk("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 43, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        ab = new Xk("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 44, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        ac = new Xk("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 45, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        g = new Xk("TLS_RSA_WITH_AES_128_GCM_SHA256", 46, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        ad = new Xk("TLS_RSA_WITH_AES_256_GCM_SHA384", 47, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        h = new Xk("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 48, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        ae = new Xk("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 49, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        af = new Xk("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 50, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        ag = new Xk("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 51, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        ah = new Xk("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 52, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ai = new Xk("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 53, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        aj = new Xk("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 54, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        ak = new Xk("TLS_ECDH_ECDSA_WITH_NULL_SHA", 55, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        al = new Xk("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 56, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        am = new Xk("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 57, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        an = new Xk("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 58, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        ao = new Xk("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 59, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ap = new Xk("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 60, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        aq = new Xk("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 61, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        ar = new Xk("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 62, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        i = new Xk("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 63, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        j = new Xk("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 64, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        as = new Xk("TLS_ECDH_RSA_WITH_NULL_SHA", 65, "TLS_ECDH_RSA_WITH_NULL_SHA");
        at = new Xk("TLS_ECDH_RSA_WITH_RC4_128_SHA", 66, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        au = new Xk("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 67, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        av = new Xk("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 68, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        aw = new Xk("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 69, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        ax = new Xk("TLS_ECDHE_RSA_WITH_NULL_SHA", 70, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        ay = new Xk("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 71, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        az = new Xk("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 72, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        k = new Xk("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 73, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        l = new Xk("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 74, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        aA = new Xk("TLS_ECDH_anon_WITH_NULL_SHA", 75, "TLS_ECDH_anon_WITH_NULL_SHA");
        aB = new Xk("TLS_ECDH_anon_WITH_RC4_128_SHA", 76, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        aC = new Xk("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 77, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        aD = new Xk("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 78, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        aE = new Xk("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 79, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        aF = new Xk("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 80, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        aG = new Xk("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 81, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        aH = new Xk("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 82, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        aI = new Xk("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 83, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        aJ = new Xk("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 84, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        aK = new Xk("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 85, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        aL = new Xk("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 86, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        aM = new Xk("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 87, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        m = new Xk("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 88, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        aN = new Xk("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 89, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        aO = new Xk("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 90, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        aP = new Xk("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 91, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = new Xk("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 92, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        aQ = new Xk("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 93, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        aR = new Xk("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 94, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        aS = new Xk("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 95, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        aT = (new Xk[] {
            p, q, r, s, t, u, v, a, w, x, 
            y, z, A, B, C, D, E, F, G, H, 
            I, J, K, L, M, N, O, P, Q, b, 
            c, d, R, e, S, f, T, U, V, W, 
            X, Y, Z, aa, ab, ac, g, ad, h, ae, 
            af, ag, ah, ai, aj, ak, al, am, an, ao, 
            ap, aq, ar, i, j, as, at, au, av, aw, 
            ax, ay, az, k, l, aA, aB, aC, aD, aE, 
            aF, aG, aH, aI, aJ, aK, aL, aM, m, aN, 
            aO, aP, n, aQ, aR, aS
        });
    }
}
