// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            dc, bl, i, AbstractMapBasedMultimap

class h extends dc
{

    final AbstractMapBasedMultimap a;

    h(AbstractMapBasedMultimap abstractmapbasedmultimap, Map map)
    {
        a = abstractmapbasedmultimap;
        super(map);
    }

    public void clear()
    {
        bl.d(iterator());
    }

    public boolean containsAll(Collection collection)
    {
        return super.c.keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || super.c.keySet().equals(obj);
    }

    public int hashCode()
    {
        return super.c.keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new i(this, super.c.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        obj = (Collection)super.c.remove(obj);
        int j;
        if (obj != null)
        {
            j = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            AbstractMapBasedMultimap.access$220(a, j);
        } else
        {
            j = 0;
        }
        return j > 0;
    }
}
