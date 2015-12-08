// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            db, e, AbstractMapBasedMultimap, f, 
//            bl, Maps

class d extends db
{

    final transient Map a;
    final AbstractMapBasedMultimap b;

    d(AbstractMapBasedMultimap abstractmapbasedmultimap, Map map)
    {
        b = abstractmapbasedmultimap;
        super();
        a = map;
    }

    protected final Set a()
    {
        return new e(this);
    }

    public void clear()
    {
        if (a == AbstractMapBasedMultimap.access$000(b))
        {
            b.clear();
            return;
        } else
        {
            bl.d(new f(this));
            return;
        }
    }

    public boolean containsKey(Object obj)
    {
        return Maps.b(a, obj);
    }

    public boolean equals(Object obj)
    {
        return this == obj || a.equals(obj);
    }

    public Object get(Object obj)
    {
        Collection collection = (Collection)Maps.a(a, obj);
        if (collection == null)
        {
            return null;
        } else
        {
            return b.wrapCollection(obj, collection);
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Set keySet()
    {
        return b.keySet();
    }

    public Object remove(Object obj)
    {
        obj = (Collection)a.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = b.createCollection();
            collection.addAll(((Collection) (obj)));
            AbstractMapBasedMultimap.access$220(b, ((Collection) (obj)).size());
            ((Collection) (obj)).clear();
            return collection;
        }
    }

    public int size()
    {
        return a.size();
    }

    public String toString()
    {
        return a.toString();
    }
}
