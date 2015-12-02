// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            kl, gg, jq, kv

final class kw
{

    private kw()
    {
    }

    public static Collection a(Comparator comparator, Iterator iterator)
    {
        comparator = kl.a(comparator);
        gg.a(comparator, iterator);
        return comparator;
    }

    public static boolean a(Comparator comparator, Iterable iterable)
    {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet)
        {
            Comparator comparator1 = ((SortedSet)iterable).comparator();
            iterable = comparator1;
            if (comparator1 == null)
            {
                iterable = jq.b();
            }
        } else
        if (iterable instanceof kv)
        {
            iterable = ((kv)iterable).comparator();
        } else
        {
            iterable = null;
        }
        return comparator.equals(iterable);
    }
}
