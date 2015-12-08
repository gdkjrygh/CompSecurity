// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class y extends Enum
{

    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public static final w f;
    public static final w g;
    public static final w h;
    public static final w i;
    public static final w j;
    public static final w k;
    public static final w l;
    public static final w m;
    public static final w n;
    public static final w o;
    public static final w p;
    public static final w q;
    public static final w r;
    public static final w s;
    public static final w t;
    public static final w u;
    public static final w v;
    public static final w w;
    private static final w z[];
    int x;
    int y;

    public static lang.String valueOf(String s1)
    {
        return (Of)Enum.valueOf(bN$b, s1);
    }

    public static lang.String[] values()
    {
        return (s[])z.clone();
    }

    static 
    {
        a = new <init>("NONE", 0, 0, 0);
        b = new <init>("FLOAT_32", 1, 2, 4);
        c = new <init>("FLOAT_64", 2, 3, 8);
        d = new <init>("SIGNED_8", 3, 4, 1);
        e = new <init>("SIGNED_16", 4, 5, 2);
        f = new <init>("SIGNED_32", 5, 6, 4);
        g = new <init>("SIGNED_64", 6, 7, 8);
        h = new <init>("UNSIGNED_8", 7, 8, 1);
        i = new <init>("UNSIGNED_16", 8, 9, 2);
        j = new <init>("UNSIGNED_32", 9, 10, 4);
        k = new <init>("UNSIGNED_64", 10, 11, 8);
        l = new <init>("BOOLEAN", 11, 12, 1);
        m = new <init>("UNSIGNED_5_6_5", 12, 13, 2);
        n = new <init>("UNSIGNED_5_5_5_1", 13, 14, 2);
        o = new <init>("UNSIGNED_4_4_4_4", 14, 15, 2);
        p = new <init>("MATRIX_4X4", 15, 16, 64);
        q = new <init>("MATRIX_3X3", 16, 17, 36);
        r = new <init>("MATRIX_2X2", 17, 18, 16);
        s = new <init>("RS_ELEMENT", 18, 1000, 4);
        t = new <init>("RS_TYPE", 19, 1001, 4);
        u = new <init>("RS_ALLOCATION", 20, 1002, 4);
        v = new <init>("RS_SAMPLER", 21, 1003, 4);
        w = new <init>("RS_SCRIPT", 22, 1004, 4);
        z = (new z[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }

    private >(String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        x = j1;
        y = k1;
    }
}
