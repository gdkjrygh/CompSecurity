// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            t, Count, AbstractMapBasedMultiset

final class s
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final AbstractMapBasedMultiset c;

    s(AbstractMapBasedMultiset abstractmapbasedmultiset, Iterator iterator)
    {
        c = abstractmapbasedmultiset;
        b = iterator;
        super();
    }

    public final boolean hasNext()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
        a = entry;
        return new t(this, entry);
    }

    public final void remove()
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "no calls to next() since the last call to remove()");
        AbstractMapBasedMultiset.access$122(c, ((Count)a.getValue()).getAndSet(0));
        b.remove();
        a = null;
    }
}
