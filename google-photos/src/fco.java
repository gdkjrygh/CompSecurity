// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

final class fco extends Enum
{

    public static final fco a;
    public static final fco b;
    public static final fco c;
    public static final fco d;
    private static final SparseArray f;
    private static final fco g[];
    int e;

    private fco(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static fco a(int i)
    {
        return (fco)f.get(i, a);
    }

    public static fco valueOf(String s)
    {
        return (fco)Enum.valueOf(fco, s);
    }

    public static fco[] values()
    {
        return (fco[])g.clone();
    }

    static 
    {
        int i = 0;
        a = new fco("UNKNOWN", 0, 0);
        b = new fco("YES", 1, 1);
        c = new fco("NO", 2, 2);
        d = new fco("MAYBE", 3, 3);
        g = (new fco[] {
            a, b, c, d
        });
        f = new SparseArray();
        fco afco[] = values();
        for (int j = afco.length; i < j; i++)
        {
            fco fco1 = afco[i];
            f.put(fco1.e, fco1);
        }

    }
}
