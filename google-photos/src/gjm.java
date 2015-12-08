// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.Calendar;

final class gjm
    implements eyc
{

    private Calendar a;
    private gjl b;

    gjm(gjl gjl1)
    {
        b = gjl1;
        super();
        a = ivc.a();
    }

    public final int a(Object obj)
    {
        obj = (Integer)obj;
        return ((Integer)b.a.valueAt(((Integer) (obj)).intValue())).intValue();
    }

    public final long b(Object obj)
    {
        obj = (Integer)obj;
        long l = gjx.a(b.a.keyAt(((Integer) (obj)).intValue()));
        a.setTimeInMillis(l);
        a.set(11, 4);
        return a.getTimeInMillis();
    }
}
