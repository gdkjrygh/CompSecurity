// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap

class this._cls0 extends AbstractMap
{

    Set entrySet;
    final LinkedListMultimap this$0;

    public boolean containsKey(Object obj)
    {
        return LinkedListMultimap.this.containsKey(obj);
    }

    public Set entrySet()
    {
        Set set = entrySet;
        Object obj = set;
        if (set == null)
        {
            obj = new MapEntries(LinkedListMultimap.this, null);
            entrySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        java.util.List list = LinkedListMultimap.this.get(obj);
        obj = list;
        if (list.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public Collection remove(Object obj)
    {
        java.util.List list = removeAll(obj);
        obj = list;
        if (list.isEmpty())
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    MapEntries()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}
