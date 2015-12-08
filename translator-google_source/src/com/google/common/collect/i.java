// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            h, AbstractMapBasedMultimap

final class i
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final h c;

    i(h h1, Iterator iterator)
    {
        c = h1;
        b = iterator;
        super();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        a = (java.util.Map.Entry)b.next();
        return a.getKey();
    }

    public final void remove()
    {
        Collection collection;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "no calls to next() since the last call to remove()");
        collection = (Collection)a.getValue();
        b.remove();
        AbstractMapBasedMultimap.access$220(c.a, collection.size());
        collection.clear();
    }
}
