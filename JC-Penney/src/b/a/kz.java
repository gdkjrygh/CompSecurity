// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            la, ld, lp, mb, 
//            md, me, mf, mg, 
//            mi, ll, lw, mh, 
//            mj, mk, ml, mm, 
//            mn, lb, lc, le, 
//            lf, lg, lh, li, 
//            lj, lk, lm, ln, 
//            lo, lq, lr, ls, 
//            lt, lu, lv, lx, 
//            ly, lz, ma, mc

public abstract class kz extends Enum
{

    public static final kz A;
    public static final kz B;
    public static final kz C;
    public static final kz D;
    public static final kz E;
    public static final kz F;
    public static final kz G;
    public static final kz H;
    public static final kz I;
    public static final kz J;
    public static final kz K;
    public static final kz L;
    public static final kz M;
    public static final kz N;
    private static final kz O[];
    public static final kz a;
    public static final kz b;
    public static final kz c;
    public static final kz d;
    public static final kz e;
    public static final kz f;
    public static final kz g;
    public static final kz h;
    public static final kz i;
    public static final kz j;
    public static final kz k;
    public static final kz l;
    public static final kz m;
    public static final kz n;
    public static final kz o;
    public static final kz p;
    public static final kz q;
    public static final kz r;
    public static final kz s;
    public static final kz t;
    public static final kz u;
    public static final kz v;
    public static final kz w;
    public static final kz x;
    public static final kz y;
    public static final kz z;

    private kz(String s1, int i1)
    {
        super(s1, i1);
    }

    kz(String s1, int i1, byte byte0)
    {
        this(s1, i1);
    }

    public static kz valueOf(String s1)
    {
        return (kz)Enum.valueOf(b/a/kz, s1);
    }

    public static kz[] values()
    {
        return (kz[])O.clone();
    }

    static 
    {
        a = new la("FORMAT_00X");
        b = new ld("FORMAT_10X");
        c = new lp("FORMAT_12X");
        d = new mb("FORMAT_11N");
        e = new md("FORMAT_11X");
        f = new me("FORMAT_10T");
        g = new mf("FORMAT_20T");
        h = new mg("FORMAT_20BC");
        i = new mi("FORMAT_22X");
        j = new ll("FORMAT_21T");
        k = new lw("FORMAT_21S");
        l = new mh("FORMAT_21H");
        m = new mj("FORMAT_21C");
        n = new mk("FORMAT_23X");
        o = new ml("FORMAT_22B");
        p = new mm("FORMAT_22T");
        q = new mn("FORMAT_22S");
        r = new lb("FORMAT_22C");
        s = new lc("FORMAT_22CS");
        t = new le("FORMAT_30T");
        u = new lf("FORMAT_32X");
        v = new lg("FORMAT_31I");
        w = new lh("FORMAT_31T");
        x = new li("FORMAT_31C");
        y = new lj("FORMAT_35C");
        z = new lk("FORMAT_35MS");
        A = new lm("FORMAT_35MI");
        B = new ln("FORMAT_3RC");
        C = new lo("FORMAT_3RMS");
        D = new lq("FORMAT_3RMI");
        E = new lr("FORMAT_51L");
        F = new ls("FORMAT_33X");
        G = new lt("FORMAT_32S");
        H = new lu("FORMAT_40SC");
        I = new lv("FORMAT_41C");
        J = new lx("FORMAT_52C");
        K = new ly("FORMAT_5RC");
        L = new lz("FORMAT_PACKED_SWITCH_PAYLOAD");
        M = new ma("FORMAT_SPARSE_SWITCH_PAYLOAD");
        N = new mc("FORMAT_FILL_ARRAY_DATA_PAYLOAD");
        O = (new kz[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N
        });
    }
}
