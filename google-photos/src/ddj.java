// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class ddj
{

    public final LongSparseArray a = new LongSparseArray();

    public ddj()
    {
    }

    public final void a(long l)
    {
        a.append(l, null);
    }

    public final long[] a()
    {
        int j = a.size();
        long al[] = new long[j];
        for (int i = 0; i < j; i++)
        {
            long l = a.keyAt(i);
            al[i] = l;
            if (i > 0 && l < al[i - 1])
            {
                throw c.a("LongSparseArray not sorted");
            }
        }

        return al;
    }

    public final boolean b(long l)
    {
        return a.indexOfKey(l) >= 0;
    }
}
