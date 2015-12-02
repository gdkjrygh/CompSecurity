// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            iq, gg, ag, x

class af extends iq
{

    final Map a;
    final x b;

    af(x x1, Map map)
    {
        b = x1;
        super();
        a = map;
    }

    Map a()
    {
        return a;
    }

    public void clear()
    {
        gg.f(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return a.keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.keySet().equals(obj);
    }

    public int hashCode()
    {
        return a.keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new ag(this);
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)a.remove(obj);
        int i;
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            x.b(b, i);
        } else
        {
            i = 0;
        }
        return i > 0;
    }
}
