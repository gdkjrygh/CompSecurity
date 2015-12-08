// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;


final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    public static final h q;
    private static final h u[];
    public final int r;
    public final int s;
    public final int t;

    private h(String s1, int i1, int j1, int k1, int l1)
    {
        super(s1, i1);
        r = j1;
        s = k1;
        t = l1;
    }

    public static h a(int i1)
    {
        h ah[] = values();
        int k1 = ah.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = ah[j1];
            if (h1.s == i1)
            {
                return h1;
            }
        }

        return null;
    }

    public static h b(int i1)
    {
        h ah[] = values();
        int k1 = ah.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = ah[j1];
            if (h1.r == i1)
            {
                return h1;
            }
        }

        return null;
    }

    public static h c(int i1)
    {
        h ah[] = values();
        int k1 = ah.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            h h1 = ah[j1];
            if (h1.t == i1)
            {
                return h1;
            }
        }

        return null;
    }

    public static h valueOf(String s1)
    {
        return (h)Enum.valueOf(com/android/slyce/a/c/d/h, s1);
    }

    public static h[] values()
    {
        return (h[])u.clone();
    }

    static 
    {
        a = new h("NO_ERROR", 0, 0, -1, 0);
        b = new h("PROTOCOL_ERROR", 1, 1, 1, 1);
        c = new h("INVALID_STREAM", 2, 1, 2, -1);
        d = new h("UNSUPPORTED_VERSION", 3, 1, 4, -1);
        e = new h("STREAM_IN_USE", 4, 1, 8, -1);
        f = new h("STREAM_ALREADY_CLOSED", 5, 1, 9, -1);
        g = new h("INTERNAL_ERROR", 6, 2, 6, 2);
        h = new h("FLOW_CONTROL_ERROR", 7, 3, 7, -1);
        i = new h("STREAM_CLOSED", 8, 5, -1, -1);
        j = new h("FRAME_TOO_LARGE", 9, 6, 11, -1);
        k = new h("REFUSED_STREAM", 10, 7, 3, -1);
        l = new h("CANCEL", 11, 8, 5, -1);
        m = new h("COMPRESSION_ERROR", 12, 9, -1, -1);
        n = new h("CONNECT_ERROR", 13, 10, -1, -1);
        o = new h("ENHANCE_YOUR_CALM", 14, 11, -1, -1);
        p = new h("INADEQUATE_SECURITY", 15, 12, -1, -1);
        q = new h("INVALID_CREDENTIALS", 16, -1, 10, -1);
        u = (new h[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
