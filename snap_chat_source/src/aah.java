// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aah extends Enum
{

    public static final aah a;
    public static final aah b;
    public static final aah c;
    public static final aah d;
    public static final aah e;
    public static final aah f;
    public static final aah g;
    public static final aah h;
    public static final aah i;
    public static final aah j;
    public static final aah k;
    private static final aah r[];
    String l;
    int m;
    int n;
    aai.a o;
    aaz p;
    String q;

    private aah(String s, int i1, String s1, int j1, int k1, aai.a a1, aaz aaz, 
            String s2)
    {
        super(s, i1);
        l = s1;
        m = j1;
        n = k1;
        o = a1;
        p = aaz;
        q = s2;
    }

    public static aah valueOf(String s)
    {
        return (aah)Enum.valueOf(aah, s);
    }

    public static aah[] values()
    {
        return (aah[])r.clone();
    }

    static 
    {
        a = new aah("APP_LOADS", 0, "app_loads_2", 10, 0x7fffffff, new aai.a(0), new aaq.a(), null);
        b = new aah("HAND_EXCS", 1, "exceptions", 5, 50, new aai.a(0), new aaq.a(), "exceptions");
        c = new aah("INTERNAL_EXCS", 2, "internal_excs", 3, 3, new aai.a(0), new aaq.a(), "exceptions");
        d = new aah("NDK_CRASHES", 3, "ndk_crashes", 5, 0x7fffffff, new aai.a(0), new aaq.a(), "crashes");
        e = new aah("SDK_CRASHES", 4, "sdk_crashes", 5, 0x7fffffff, new aai.a(0), new aaq.a(), "crashes");
        f = new aah("CURR_BCS", 5, "current_bcs", 50, 0x7fffffff, new aai.a(1), new aap.a(), null);
        g = new aah("NW_BCS", 6, "network_bcs", 10, 0x7fffffff, new aai.a(0), new aap.a(), null);
        h = new aah("PREV_BCS", 7, "previous_bcs", 50, 0x7fffffff, new aai.a(0), new aap.a(), null);
        i = new aah("STARTED_TXNS", 8, "started_txns", 50, 0x7fffffff, new aai.a(0), new aap.a(), null);
        j = new aah("FINISHED_TXNS", 9, "finished_txns", 0x7fffffff, 0x7fffffff, new aai.a(0), new aap.a(), null);
        k = new aah("SYSTEM_BCS", 10, "system_bcs", 100, 0x7fffffff, new aai.a(0), new aap.a(), null);
        r = (new aah[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
