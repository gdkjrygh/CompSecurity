// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class euv extends Enum
{

    public static final euv a;
    public static final euv b;
    public static final euv c;
    public static final euv d;
    public static final euv e;
    private static final SparseArray h;
    private static final euv i[];
    public final int f;
    public final njx g;

    private euv(String s, int j, int k, njx njx1)
    {
        super(s, j);
        f = k;
        g = njx1;
    }

    public static euv a(int j)
    {
        return (euv)h.get(j, a);
    }

    public static euv a(njx njx1)
    {
        euv euv1 = a;
        if (njx.a.equals(njx1))
        {
            euv1 = b;
        } else
        {
            if (njx.b.equals(njx1))
            {
                return c;
            }
            if (njx.c.equals(njx1))
            {
                return d;
            }
            if (njx.d.equals(njx1))
            {
                return e;
            }
        }
        return euv1;
    }

    public static euv valueOf(String s)
    {
        return (euv)Enum.valueOf(euv, s);
    }

    public static euv[] values()
    {
        return (euv[])i.clone();
    }

    static 
    {
        int j = 0;
        a = new euv("UNKNOWN", 0, 0, null);
        b = new euv("IMAGE", 1, 1, njx.a);
        c = new euv("VIDEO", 2, 2, njx.b);
        d = new euv("PHOTOSPHERE", 3, 3, njx.c);
        e = new euv("ANIMATION", 4, 4, njx.d);
        i = (new euv[] {
            a, b, c, d, e
        });
        h = new SparseArray();
        euv aeuv[] = values();
        for (int k = aeuv.length; j < k; j++)
        {
            euv euv1 = aeuv[j];
            h.put(euv1.f, euv1);
        }

    }
}
