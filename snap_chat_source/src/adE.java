// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class adE extends Enum
{

    public static final adE A;
    public static final adE B;
    public static final adE C;
    public static final adE D;
    public static final adE E;
    private static adE F;
    private static adE G;
    private static adE H;
    private static adE I;
    private static adE J;
    private static adE K;
    private static adE L;
    private static adE M;
    private static adE N;
    private static final adE O[];
    public static final adE a;
    public static final adE b;
    public static final adE c;
    public static final adE d;
    public static final adE e;
    public static final adE f;
    public static final adE g;
    public static final adE h;
    public static final adE i;
    public static final adE j;
    public static final adE k;
    public static final adE l;
    public static final adE m;
    public static final adE n;
    public static final adE o;
    public static final adE p;
    public static final adE q;
    public static final adE r;
    public static final adE s;
    public static final adE t;
    public static final adE u;
    public static final adE v;
    public static final adE w;
    public static final adE x;
    public static final adE y;
    public static final adE z;

    private adE(String s1, int i1)
    {
        super(s1, i1);
    }

    adE(String s1, int i1, byte byte0)
    {
        this(s1, i1);
    }

    public static adE valueOf(String s1)
    {
        return (adE)Enum.valueOf(adE, s1);
    }

    public static adE[] values()
    {
        return (adE[])O.clone();
    }

    static 
    {
        a = new adE("FORMAT_00X") {

        };
        b = new adE("FORMAT_10X") {

        };
        c = new adE("FORMAT_12X") {

        };
        d = new adE("FORMAT_11N") {

        };
        e = new adE("FORMAT_11X") {

        };
        f = new adE("FORMAT_10T") {

        };
        g = new adE("FORMAT_20T") {

        };
        F = new adE("FORMAT_20BC") {

        };
        h = new adE("FORMAT_22X") {

        };
        i = new adE("FORMAT_21T") {

        };
        j = new adE("FORMAT_21S") {

        };
        k = new adE("FORMAT_21H") {

        };
        l = new adE("FORMAT_21C") {

        };
        m = new adE("FORMAT_23X") {

        };
        n = new adE("FORMAT_22B") {

        };
        o = new adE("FORMAT_22T") {

        };
        p = new adE("FORMAT_22S") {

        };
        q = new adE("FORMAT_22C") {

        };
        G = new adE("FORMAT_22CS") {

        };
        r = new adE("FORMAT_30T") {

        };
        s = new adE("FORMAT_32X") {

        };
        t = new adE("FORMAT_31I") {

        };
        u = new adE("FORMAT_31T") {

        };
        v = new adE("FORMAT_31C") {

        };
        w = new adE("FORMAT_35C") {

        };
        H = new adE("FORMAT_35MS") {

        };
        I = new adE("FORMAT_35MI") {

        };
        x = new adE("FORMAT_3RC") {

        };
        J = new adE("FORMAT_3RMS") {

        };
        K = new adE("FORMAT_3RMI") {

        };
        y = new adE("FORMAT_51L") {

        };
        L = new adE("FORMAT_33X") {

        };
        M = new adE("FORMAT_32S") {

        };
        N = new adE("FORMAT_40SC") {

        };
        z = new adE("FORMAT_41C") {

        };
        A = new adE("FORMAT_52C") {

        };
        B = new adE("FORMAT_5RC") {

        };
        C = new adE("FORMAT_PACKED_SWITCH_PAYLOAD") {

        };
        D = new adE("FORMAT_SPARSE_SWITCH_PAYLOAD") {

        };
        E = new adE("FORMAT_FILL_ARRAY_DATA_PAYLOAD") {

        };
        O = (new adE[] {
            a, b, c, d, e, f, g, F, h, i, 
            j, k, l, m, n, o, p, q, G, r, 
            s, t, u, v, w, H, I, x, J, K, 
            y, L, M, N, z, A, B, C, D, E
        });
    }
}
