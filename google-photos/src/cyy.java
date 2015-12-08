// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class cyy extends Enum
{

    private static cyy A;
    private static cyy B;
    private static cyy C;
    private static cyy D;
    private static cyy E;
    private static final ddi F;
    private static final cyy H[];
    public static final cyy a;
    public static final cyy b;
    public static final cyy c;
    public static final cyy d;
    public static final cyy e;
    public static final cyy f;
    public static final cyy g;
    public static final cyy h;
    public static final cyy i;
    public static final cyy j;
    public static final cyy k;
    public static final cyy l;
    private static cyy z;
    private int G;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final msp q;
    public final boolean r;
    public final cay s;
    public final czm t;
    public final cyf u;
    public final cyq v;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    private cyy(String s1, int i1, int j1, int k1, int l1, int i2, boolean flag, 
            int j2, msp msp, cay cay1, czm czm, cyf cyf, cyq cyq1, boolean flag1, 
            boolean flag2, boolean flag3)
    {
        super(s1, i1);
        G = j1;
        m = k1;
        n = l1;
        o = i2;
        q = msp;
        r = flag;
        p = j2;
        s = (cay)b.a(cay1, "effect", null);
        t = czm;
        u = cyf;
        v = cyq1;
        w = flag1;
        x = flag2;
        y = flag3;
    }

    public static cyy a(int i1)
    {
        b.a(i1, "cloudThemeType", 0);
        return (cyy)F.get(i1);
    }

    private static ddi a()
    {
        LongSparseArray longsparsearray = new LongSparseArray(values().length);
        cyy acyy[] = values();
        int j1 = acyy.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            cyy cyy1 = acyy[i1];
            longsparsearray.append(cyy1.G, cyy1);
        }

        return ddi.a(longsparsearray);
    }

    public static cyy valueOf(String s1)
    {
        return (cyy)Enum.valueOf(cyy, s1);
    }

    public static cyy[] values()
    {
        return (cyy[])H.clone();
    }

    static 
    {
        a = new cyy("VANILLA", 0, 5, c.bI, b.fy, b.cr, false, 15, pwp.I, new ccq(), czj.a, cyh.a, cyq.a, true, false, true);
        b = new cyy("CINEMASCOPE", 1, 6, c.bs, b.fv, b.cu, false, 1, pwp.A, new cau(), czj.a, cyh.a, cyq.a, false, false, true);
        c = new cyy("DOCUMENTARY", 2, 7, c.bt, b.fw, b.cz, false, 2, pwp.B, new caw(), czj.a, cyh.a, cyq.a, true, false, true);
        d = new cyy("FESTIVAL", 3, 8, c.bu, b.co, b.cC, false, 3, pwp.D, new cbb(), czj.a, cyh.a, cyq.a, true, true, true);
        e = new cyy("GLAMOUR", 4, 10, c.bw, b.co, b.cG, false, 4, pwp.E, new cbk(), czj.a, cyh.a, cyq.a, false, false, true);
        z = new cyy("HARDCORE", 5, 11, c.by, b.fx, b.cK, false, 6, pwp.C, new cbq(), czj.a, cyh.a, cyq.a, true, false, true);
        A = new cyy("LOMOKINO", 6, 12, c.bz, b.co, b.cN, true, 7, pwp.F, new cbs(), czj.a, cyh.a, cyq.a, true, false, true);
        f = new cyy("MEMORY_LANE", 7, 13, c.bA, b.co, b.cP, false, 8, pwp.G, new cbu(), czj.a, cyh.a, cyq.a, false, false, true);
        g = new cyy("MODERNPOP", 8, 14, c.bB, b.co, b.cS, false, 9, pwp.H, new cbw(), czj.a, cyh.a, cyq.a, true, false, true);
        h = new cyy("GREAT_OUTDOORS", 9, 15, c.bx, b.co, b.cI, false, 5, pwp.J, new cbo(), czj.a, cyh.a, cyq.a, true, false, true);
        B = new cyy("PUNK", 10, 16, c.bC, b.co, b.cT, false, 10, pwp.K, new cca(), czj.a, cyh.a, cyq.a, true, false, true);
        i = new cyy("SHOWTIME", 11, 17, c.bD, b.co, b.cV, false, 11, pwp.L, new ccc(), czj.a, cyh.a, cyq.a, true, true, true);
        C = new cyy("SILVER_SCREEN", 12, 18, c.bE, b.co, b.cY, true, 17, pwp.M, new ccd(), czj.a, cyh.a, cyq.a, true, false, true);
        j = new cyy("SUPER_8", 13, 19, c.bF, b.ft, b.da, false, 12, pwp.y, new ccf(), czj.a, cyh.a, cyq.a, false, false, true);
        D = new cyy("TEAL_ORANGE", 14, 20, c.bG, b.fu, b.dd, false, 13, pwp.z, new ccm(), czj.a, cyh.a, cyq.a, true, false, true);
        k = new cyy("URBAN_LANDSCAPE", 15, 21, c.bH, b.co, b.df, false, 14, pwp.N, new cco(), czj.a, cyh.a, cyq.a, true, false, true);
        E = new cyy("VINTAGE", 16, 22, c.bJ, b.co, b.di, true, 16, pwp.O, new ccr(), czj.a, cyh.a, cyq.a, true, false, true);
        l = new cyy("FUN_FACTORY", 17, 23, c.bv, b.co, b.cE, false, 18, null, new cbe(), new czo(), new cyi(), cyq.b, false, false, false);
        H = (new cyy[] {
            a, b, c, d, e, z, A, f, g, h, 
            B, i, C, j, D, k, E, l
        });
        LongSparseArray longsparsearray = new LongSparseArray(values().length);
        cyy acyy[] = values();
        int j1 = acyy.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            cyy cyy1 = acyy[i1];
            longsparsearray.append(cyy1.p, cyy1);
        }

        F = ddi.a(longsparsearray);
        a();
    }
}
