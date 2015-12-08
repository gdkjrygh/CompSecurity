// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


// Referenced classes of package crittercism.android:
//            ci

public final class bq extends Enum
{

    public static final bq a;
    public static final bq b;
    public static final bq c;
    public static final bq d;
    public static final bq e;
    public static final bq f;
    public static final bq g;
    public static final bq h;
    public static final bq i;
    public static final bq j;
    public static final bq k;
    private static final bq r[];
    private String l;
    private int m;
    private int n;
    private br.a o;
    private ci p;
    private String q;

    private bq(String s, int i1, String s1, int j1, int k1, br.a a1, ci ci, 
            String s2)
    {
        super(s, i1);
        l = s1;
        m = j1;
        n = k1;
        o = a1;
        p = ci;
        q = s2;
    }

    public static bq valueOf(String s)
    {
        return (bq)Enum.valueOf(crittercism/android/bq, s);
    }

    public static bq[] values()
    {
        return (bq[])r.clone();
    }

    public final String a()
    {
        return l;
    }

    public final int b()
    {
        return m;
    }

    public final br.a c()
    {
        return o;
    }

    public final ci d()
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
        a = new bq("APP_LOADS", 0, "app_loads_2", 10, 0x7fffffff, new br.a(0), new bz.a(), null);
        b = new bq("HAND_EXCS", 1, "exceptions", 5, 50, new br.a(0), new bz.a(), "exceptions");
        c = new bq("INTERNAL_EXCS", 2, "internal_excs", 3, 3, new br.a(0), new bz.a(), "exceptions");
        d = new bq("NDK_CRASHES", 3, "ndk_crashes", 5, 0x7fffffff, new br.a(0), new bz.a(), "crashes");
        e = new bq("SDK_CRASHES", 4, "sdk_crashes", 5, 0x7fffffff, new br.a(0), new bz.a(), "crashes");
        f = new bq("CURR_BCS", 5, "current_bcs", 50, 0x7fffffff, new br.a(1), new by.a(), null);
        g = new bq("NW_BCS", 6, "network_bcs", 10, 0x7fffffff, new br.a(0), new by.a(), null);
        h = new bq("PREV_BCS", 7, "previous_bcs", 50, 0x7fffffff, new br.a(0), new by.a(), null);
        i = new bq("STARTED_TXNS", 8, "started_txns", 50, 0x7fffffff, new br.a(0), new by.a(), null);
        j = new bq("FINISHED_TXNS", 9, "finished_txns", 0x7fffffff, 0x7fffffff, new br.a(0), new by.a(), null);
        k = new bq("SYSTEM_BCS", 10, "system_bcs", 100, 0x7fffffff, new br.a(0), new by.a(), null);
        r = (new bq[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
