// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class eun extends Enum
{

    public static final eun a;
    public static final eun b;
    private static eun d;
    private static final SparseArray e;
    private static final eun f[];
    public final int c;

    private eun(String s, int i, int j)
    {
        super(s, i);
        c = j;
    }

    public static eun a(int i)
    {
        return (eun)e.get(i);
    }

    public static eun valueOf(String s)
    {
        return (eun)Enum.valueOf(eun, s);
    }

    public static eun[] values()
    {
        return (eun[])f.clone();
    }

    static 
    {
        int i = 0;
        a = new eun("NONE", 0, 0);
        d = new eun("PENDING_DELETED", 1, 1);
        b = new eun("SOFT_DELETED", 2, 2);
        f = (new eun[] {
            a, d, b
        });
        e = new SparseArray();
        eun aeun[] = values();
        for (int j = aeun.length; i < j; i++)
        {
            eun eun1 = aeun[i];
            e.put(eun1.c, eun1);
        }

    }
}
