// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class d extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    private static final d r[];

    private d(String s, int i1)
    {
        super(s, i1);
    }

    public static d a(String s)
    {
        return valueOf(s);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(p/bh/d, s);
    }

    public static d[] values()
    {
        return (d[])r.clone();
    }

    static 
    {
        a = new d("OK", 0);
        b = new d("SEEKLEFT", 1);
        c = new d("SEEKRIGHT", 2);
        d = new d("TUNEUP", 3);
        e = new d("TUNEDOWN", 4);
        f = new d("PRESET_0", 5);
        g = new d("PRESET_1", 6);
        h = new d("PRESET_2", 7);
        i = new d("PRESET_3", 8);
        j = new d("PRESET_4", 9);
        k = new d("PRESET_5", 10);
        l = new d("PRESET_6", 11);
        m = new d("PRESET_7", 12);
        n = new d("PRESET_8", 13);
        o = new d("PRESET_9", 14);
        p = new d("CUSTOM_BUTTON", 15);
        q = new d("SEARCH", 16);
        r = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
