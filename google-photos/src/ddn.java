// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.TreeMap;

public final class ddn
{

    public final TreeMap a = new TreeMap();
    public final ddr b;
    public final Object c;

    public ddn(LongSparseArray longsparsearray, ddr ddr, Object obj)
    {
        b = ddr;
        c = obj;
        for (int i = 0; i < longsparsearray.size(); i++)
        {
            a.put(Long.valueOf(longsparsearray.keyAt(i)), longsparsearray.valueAt(i));
        }

    }
}
