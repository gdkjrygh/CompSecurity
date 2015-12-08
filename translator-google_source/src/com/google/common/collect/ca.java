// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            cb, cj, MapMakerInternalMap, cc

final class ca extends AbstractQueue
{

    final cj a = new cb(this);

    ca()
    {
    }

    private cj a()
    {
        cj cj2 = a.getNextEvictable();
        cj cj1 = cj2;
        if (cj2 == a)
        {
            cj1 = null;
        }
        return cj1;
    }

    public final void clear()
    {
        cj cj2;
        for (cj cj1 = a.getNextEvictable(); cj1 != a; cj1 = cj2)
        {
            cj2 = cj1.getNextEvictable();
            MapMakerInternalMap.nullifyEvictable(cj1);
        }

        a.setNextEvictable(a);
        a.setPreviousEvictable(a);
    }

    public final boolean contains(Object obj)
    {
        return ((cj)obj).getNextEvictable() != MapMakerInternalMap.NullEntry.INSTANCE;
    }

    public final boolean isEmpty()
    {
        return a.getNextEvictable() == a;
    }

    public final Iterator iterator()
    {
        return new cc(this, a());
    }

    public final boolean offer(Object obj)
    {
        obj = (cj)obj;
        MapMakerInternalMap.connectEvictables(((cj) (obj)).getPreviousEvictable(), ((cj) (obj)).getNextEvictable());
        MapMakerInternalMap.connectEvictables(a.getPreviousEvictable(), ((cj) (obj)));
        MapMakerInternalMap.connectEvictables(((cj) (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
        cj cj1 = a.getNextEvictable();
        if (cj1 == a)
        {
            return null;
        } else
        {
            remove(cj1);
            return cj1;
        }
    }

    public final boolean remove(Object obj)
    {
        obj = (cj)obj;
        cj cj1 = ((cj) (obj)).getPreviousEvictable();
        cj cj2 = ((cj) (obj)).getNextEvictable();
        MapMakerInternalMap.connectEvictables(cj1, cj2);
        MapMakerInternalMap.nullifyEvictable(((cj) (obj)));
        return cj2 != MapMakerInternalMap.NullEntry.INSTANCE;
    }

    public final int size()
    {
        int i = 0;
        for (cj cj1 = a.getNextEvictable(); cj1 != a; cj1 = cj1.getNextEvictable())
        {
            i++;
        }

        return i;
    }
}
