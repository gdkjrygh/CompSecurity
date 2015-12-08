// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableMultimap, ImmutableMap, ej

final class a extends ImmutableCollection
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableMultimap a;

    public final boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    final int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = a.map.values().iterator(); iterator1.hasNext();)
        {
            i = ((ImmutableCollection)iterator1.next()).copyIntoArray(aobj, i);
        }

        return i;
    }

    final boolean isPartialView()
    {
        return true;
    }

    public final ej iterator()
    {
        return a.valueIterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return a.size();
    }

    (ImmutableMultimap immutablemultimap)
    {
        a = immutablemultimap;
    }
}
