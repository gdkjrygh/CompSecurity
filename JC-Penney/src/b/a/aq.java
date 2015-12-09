// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.util.SparseArray;

public final class aq extends Enum
{

    public static final aq a;
    public static final aq b;
    public static final aq c;
    public static final aq d;
    private static SparseArray e;
    private static final aq g[];
    private int f;

    private aq(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static aq a(int i)
    {
        aq aq2 = (aq)e.get(i);
        aq aq1 = aq2;
        if (aq2 == null)
        {
            aq1 = c;
        }
        return aq1;
    }

    public static aq valueOf(String s)
    {
        return (aq)Enum.valueOf(b/a/aq, s);
    }

    public static aq[] values()
    {
        return (aq[])g.clone();
    }

    public final int a()
    {
        return f;
    }

    static 
    {
        a = new aq("MOBILE", 0, 0);
        b = new aq("WIFI", 1, 1);
        c = new aq("UNKNOWN", 2, 2);
        d = new aq("NOT_CONNECTED", 3, 3);
        g = (new aq[] {
            a, b, c, d
        });
        SparseArray sparsearray = new SparseArray();
        e = sparsearray;
        sparsearray.put(0, a);
        e.put(1, b);
    }
}
