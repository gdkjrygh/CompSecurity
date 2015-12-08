// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, bl

abstract class g
    implements Iterator
{

    final Iterator b;
    Object c;
    Collection d;
    Iterator e;
    final AbstractMapBasedMultimap f;

    g(AbstractMapBasedMultimap abstractmapbasedmultimap)
    {
        f = abstractmapbasedmultimap;
        super();
        b = AbstractMapBasedMultimap.access$000(abstractmapbasedmultimap).entrySet().iterator();
        c = null;
        d = null;
        e = bl.b();
    }

    abstract Object a(Object obj, Object obj1);

    public boolean hasNext()
    {
        return b.hasNext() || e.hasNext();
    }

    public Object next()
    {
        if (!e.hasNext())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)b.next();
            c = entry.getKey();
            d = (Collection)entry.getValue();
            e = d.iterator();
        }
        return a(c, e.next());
    }

    public void remove()
    {
        e.remove();
        if (d.isEmpty())
        {
            b.remove();
        }
        int _tmp = AbstractMapBasedMultimap.access$210(f);
    }
}
