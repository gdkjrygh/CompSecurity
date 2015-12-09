// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.ae;
import com.google.a.a.t;
import java.util.Collection;

// Referenced classes of package com.google.a.b:
//            bj, bk, by, bl

public final class bi
{

    public static Iterable a(Iterable iterable, ae ae)
    {
        ad.a(iterable);
        ad.a(ae);
        return new bj(iterable, ae);
    }

    public static Iterable a(Iterable iterable, t t)
    {
        ad.a(iterable);
        ad.a(t);
        return new bk(iterable, t);
    }

    static Object[] a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
        } else
        {
            iterable = by.a(iterable.iterator());
        }
        return iterable.toArray();
    }

    public static Object b(Iterable iterable)
    {
        return bl.e(iterable.iterator());
    }
}
