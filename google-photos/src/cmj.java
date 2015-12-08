// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public final class cmj
{

    public final Map a;
    final TreeSet b;

    public cmj()
    {
        a = new HashMap();
        b = new TreeSet();
    }

    public cmj(cmi cmi1)
    {
        a = new HashMap(cmi1.a);
        b = new TreeSet();
        cmi1 = cmi1.a();
        int j = cmi1.length;
        for (int i = 0; i < j; i++)
        {
            long l = cmi1[i];
            b.add(Long.valueOf(l));
        }

    }

    public final cmj a(cos cos, long l, Object obj)
    {
        LongSparseArray longsparsearray1 = (LongSparseArray)a.get(cos);
        LongSparseArray longsparsearray = longsparsearray1;
        if (longsparsearray1 == null)
        {
            longsparsearray = new LongSparseArray();
            a.put(cos, longsparsearray);
        }
        longsparsearray.put(l, obj);
        b.add(Long.valueOf(l));
        return this;
    }
}
