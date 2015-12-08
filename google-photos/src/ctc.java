// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.Comparator;

final class ctc
    implements Comparator
{

    private LongSparseArray a;
    private long b;

    ctc(LongSparseArray longsparsearray, long l)
    {
        a = longsparsearray;
        b = l;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Long)obj;
        obj1 = (Long)obj1;
        return Float.compare(((ctd)a.get(((Long) (obj)).longValue())).a - ctb.a(((Long) (obj)).longValue(), b), ((ctd)a.get(((Long) (obj1)).longValue())).a - ctb.a(((Long) (obj1)).longValue(), b));
    }
}
