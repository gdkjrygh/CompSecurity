// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            bf, cq, co, dc

public final class bd extends Enum
{

    public static final bd a;
    public static final bd b;
    public static final bd c;
    public static final bd d;
    public static final bd e;
    public static final bd f;
    public static final bd g;
    public static final bd h;
    public static final bd i;
    public static final bd j;
    public static final bd k;
    private static final bd r[];
    private String l;
    private int m;
    private int n;
    private bf o;
    private dc p;
    private String q;

    private bd(String s, int i1, String s1, int j1, int k1, bf bf1, dc dc, 
            String s2)
    {
        super(s, i1);
        l = s1;
        m = j1;
        n = k1;
        o = bf1;
        p = dc;
        q = s2;
    }

    public static bd valueOf(String s)
    {
        return (bd)Enum.valueOf(b/a/bd, s);
    }

    public static bd[] values()
    {
        return (bd[])r.clone();
    }

    public final String a()
    {
        return l;
    }

    public final int b()
    {
        return m;
    }

    public final bf c()
    {
        return o;
    }

    public final dc d()
    {
        return p;
    }

    public final int e()
    {
        return n;
    }

    public final String f()
    {
        return q;
    }

    static 
    {
        a = new bd("APP_LOADS", 0, "app_loads_2", 10, 0x7fffffff, new bf(0), new cq(), null);
        b = new bd("HAND_EXCS", 1, "exceptions", 5, 50, new bf(0), new cq(), "exceptions");
        c = new bd("INTERNAL_EXCS", 2, "internal_excs", 3, 3, new bf(0), new cq(), "exceptions");
        d = new bd("NDK_CRASHES", 3, "ndk_crashes", 5, 0x7fffffff, new bf(0), new cq(), "crashes");
        e = new bd("SDK_CRASHES", 4, "sdk_crashes", 5, 0x7fffffff, new bf(0), new cq(), "crashes");
        f = new bd("CURR_BCS", 5, "current_bcs", 50, 0x7fffffff, new bf(1), new co(), null);
        g = new bd("NW_BCS", 6, "network_bcs", 10, 0x7fffffff, new bf(0), new co(), null);
        h = new bd("PREV_BCS", 7, "previous_bcs", 50, 0x7fffffff, new bf(0), new co(), null);
        i = new bd("STARTED_TXNS", 8, "started_txns", 50, 0x7fffffff, new bf(0), new co(), null);
        j = new bd("FINISHED_TXNS", 9, "finished_txns", 0x7fffffff, 0x7fffffff, new bf(0), new co(), null);
        k = new bd("SYSTEM_BCS", 10, "system_bcs", 100, 0x7fffffff, new bf(0), new co(), null);
        r = (new bd[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
