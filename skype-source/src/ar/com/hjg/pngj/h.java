// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.util.HashMap;

public final class h extends Enum
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
    private static HashMap q;
    private static final h r[];
    public final int p;

    private h(String s, int i1, int j1)
    {
        super(s, i1);
        p = j1;
    }

    public static h a(int i1)
    {
        return (h)q.get(Integer.valueOf(i1));
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(ar/com/hjg/pngj/h, s);
    }

    public static h[] values()
    {
        return (h[])r.clone();
    }

    static 
    {
        a = new h("FILTER_NONE", 0, 0);
        b = new h("FILTER_SUB", 1, 1);
        c = new h("FILTER_UP", 2, 2);
        d = new h("FILTER_AVERAGE", 3, 3);
        e = new h("FILTER_PAETH", 4, 4);
        f = new h("FILTER_DEFAULT", 5, -1);
        g = new h("FILTER_AGGRESSIVE", 6, -2);
        h = new h("FILTER_VERYAGGRESSIVE", 7, -4);
        i = new h("FILTER_ADAPTIVE_FULL", 8, -4);
        j = new h("FILTER_ADAPTIVE_MEDIUM", 9, -3);
        k = new h("FILTER_ADAPTIVE_FAST", 10, -2);
        l = new h("FILTER_SUPER_ADAPTIVE", 11, -10);
        m = new h("FILTER_PRESERVE", 12, -40);
        n = new h("FILTER_CYCLIC", 13, -50);
        o = new h("FILTER_UNKNOWN", 14, -100);
        r = (new h[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
        q = new HashMap();
        h ah[] = values();
        int j1 = ah.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            h h1 = ah[i1];
            q.put(Integer.valueOf(h1.p), h1);
        }

    }
}
