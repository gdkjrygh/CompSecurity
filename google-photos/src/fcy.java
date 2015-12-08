// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class fcy extends Enum
{

    public static final fcy a;
    public static final fcy b;
    public static final fcy c;
    public static final fcy d;
    private static final SparseArray f;
    private static final fcy g[];
    final int e;

    private fcy(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static fcy a(int i)
    {
        return (fcy)f.get(i);
    }

    public static fcy valueOf(String s)
    {
        return (fcy)Enum.valueOf(fcy, s);
    }

    public static fcy[] values()
    {
        return (fcy[])g.clone();
    }

    static 
    {
        int i = 0;
        a = new fcy("UNKNOWN_STORAGE", 0, -1);
        b = new fcy("OK_STORAGE", 1, 0);
        c = new fcy("LOW_STORAGE", 2, 1);
        d = new fcy("VERY_LOW_STORAGE", 3, 2);
        g = (new fcy[] {
            a, b, c, d
        });
        f = new SparseArray();
        fcy afcy[] = values();
        for (int j = afcy.length; i < j; i++)
        {
            fcy fcy1 = afcy[i];
            f.put(fcy1.e, fcy1);
        }

    }
}
