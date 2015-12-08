// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset, Count

final class u
    implements Iterator
{

    final Iterator a;
    java.util.Map.Entry b;
    int c;
    boolean d;
    final AbstractMapBasedMultiset e;

    u(AbstractMapBasedMultiset abstractmapbasedmultiset)
    {
        e = abstractmapbasedmultiset;
        super();
        a = AbstractMapBasedMultiset.access$000(abstractmapbasedmultiset).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return c > 0 || a.hasNext();
    }

    public final Object next()
    {
        if (c == 0)
        {
            b = (java.util.Map.Entry)a.next();
            c = ((Count)b.getValue()).get();
        }
        c = c - 1;
        d = true;
        return b.getKey();
    }

    public final void remove()
    {
        p.b(d, "no calls to next() since the last call to remove()");
        if (((Count)b.getValue()).get() <= 0)
        {
            throw new ConcurrentModificationException();
        }
        if (((Count)b.getValue()).addAndGet(-1) == 0)
        {
            a.remove();
        }
        long _tmp = AbstractMapBasedMultiset.access$110(e);
        d = false;
    }
}
