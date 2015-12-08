// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ce, cj, MapMakerInternalMap, cf

final class cd extends AbstractQueue
{

    final cj a = new ce(this);

    cd()
    {
    }

    private cj a()
    {
        cj cj2 = a.getNextExpirable();
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
        for (cj cj1 = a.getNextExpirable(); cj1 != a; cj1 = cj2)
        {
            cj2 = cj1.getNextExpirable();
            MapMakerInternalMap.nullifyExpirable(cj1);
        }

        a.setNextExpirable(a);
        a.setPreviousExpirable(a);
    }

    public final boolean contains(Object obj)
    {
        return ((cj)obj).getNextExpirable() != MapMakerInternalMap.NullEntry.INSTANCE;
    }

    public final boolean isEmpty()
    {
        return a.getNextExpirable() == a;
    }

    public final Iterator iterator()
    {
        return new cf(this, a());
    }

    public final boolean offer(Object obj)
    {
        obj = (cj)obj;
        MapMakerInternalMap.connectExpirables(((cj) (obj)).getPreviousExpirable(), ((cj) (obj)).getNextExpirable());
        MapMakerInternalMap.connectExpirables(a.getPreviousExpirable(), ((cj) (obj)));
        MapMakerInternalMap.connectExpirables(((cj) (obj)), a);
        return true;
    }

    public final Object peek()
    {
        return a();
    }

    public final Object poll()
    {
        cj cj1 = a.getNextExpirable();
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
        cj cj1 = ((cj) (obj)).getPreviousExpirable();
        cj cj2 = ((cj) (obj)).getNextExpirable();
        MapMakerInternalMap.connectExpirables(cj1, cj2);
        MapMakerInternalMap.nullifyExpirable(((cj) (obj)));
        return cj2 != MapMakerInternalMap.NullEntry.INSTANCE;
    }

    public final int size()
    {
        int i = 0;
        for (cj cj1 = a.getNextExpirable(); cj1 != a; cj1 = cj1.getNextExpirable())
        {
            i++;
        }

        return i;
    }
}
