// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class guq extends Enum
{

    public static final guq a;
    private static guq c;
    private static guq d;
    private static final SparseArray e;
    private static final guq f[];
    int b;

    private guq(String s, int i, int j)
    {
        super(s, i);
        b = j;
    }

    public static guq a(int i)
    {
        return (guq)e.get(i, a);
    }

    public static guq valueOf(String s)
    {
        return (guq)Enum.valueOf(guq, s);
    }

    public static guq[] values()
    {
        return (guq[])f.clone();
    }

    static 
    {
        int i = 0;
        a = new guq("NONE", 0, 0);
        c = new guq("LOCKED", 1, 1);
        d = new guq("SYNC_NEEDED", 2, 2);
        f = (new guq[] {
            a, c, d
        });
        e = new SparseArray();
        guq aguq[] = values();
        for (int j = aguq.length; i < j; i++)
        {
            guq guq1 = aguq[i];
            e.put(guq1.b, guq1);
        }

    }
}
