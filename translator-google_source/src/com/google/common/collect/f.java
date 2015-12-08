// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            d, AbstractMapBasedMultimap, Maps

final class f
    implements Iterator
{

    final Iterator a;
    Collection b;
    final d c;

    f(d d1)
    {
        c = d1;
        super();
        a = c.a.entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        b = (Collection)entry.getValue();
        d d1 = c;
        Object obj = entry.getKey();
        return Maps.a(obj, d1.b.wrapCollection(obj, (Collection)entry.getValue()));
    }

    public final void remove()
    {
        a.remove();
        AbstractMapBasedMultimap.access$220(c.b, b.size());
        b.clear();
    }
}
