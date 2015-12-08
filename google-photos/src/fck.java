// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class fck extends Enum
{

    public static final fck a;
    public static final fck b;
    private static final SparseArray d;
    private static final fck e[];
    final int c;

    private fck(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static fck a(int i)
    {
        return (fck)d.get(i);
    }

    public static fck valueOf(String s)
    {
        return (fck)Enum.valueOf(fck, s);
    }

    public static fck[] values()
    {
        return (fck[])e.clone();
    }

    static 
    {
        int i = 0;
        a = new fck("IMAGE", 0, 0);
        b = new fck("VIDEO", 1, 1);
        e = (new fck[] {
            a, b
        });
        d = new SparseArray();
        fck afck[] = values();
        for (int j = afck.length; i < j; i++)
        {
            fck fck1 = afck[i];
            d.put(fck1.c, fck1);
        }

    }
}
