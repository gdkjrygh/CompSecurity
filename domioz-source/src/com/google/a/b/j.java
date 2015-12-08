// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            y, i, e

final class j
    implements Iterator
{

    java.util.Map.Entry a;
    final Iterator b;
    final i c;

    j(i k, Iterator iterator)
    {
        c = k;
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
        y.a(flag);
        collection = (Collection)a.getValue();
        b.remove();
        e.b(c.a, collection.size());
        collection.clear();
    }
}
