// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, Maps, Collections2

private class submap extends AbstractMap
{
    class AsMapEntries extends AbstractSet
    {

        final AbstractMultimap.AsMap this$1;

        public boolean contains(Object obj)
        {
            return Collections2.safeContains(submap.entrySet(), obj);
        }

        public Iterator iterator()
        {
            return new AsMapIterator();
        }

        public boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                AbstractMultimap.access$500(this$0, ((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        public int size()
        {
            return submap.size();
        }

        AsMapEntries()
        {
            this$1 = AbstractMultimap.AsMap.this;
            super();
        }
    }

    class AsMapIterator
        implements Iterator
    {

        Collection collection;
        final Iterator delegateIterator;
        final AbstractMultimap.AsMap this$1;

        public boolean hasNext()
        {
            return delegateIterator.hasNext();
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)delegateIterator.next();
            Object obj = entry.getKey();
            collection = (Collection)entry.getValue();
            return Maps.immutableEntry(obj, AbstractMultimap.access$1300(this$0, obj, collection));
        }

        public void remove()
        {
            delegateIterator.remove();
            AbstractMultimap.access$220(this$0, collection.size());
            collection.clear();
        }

        AsMapIterator()
        {
            this$1 = AbstractMultimap.AsMap.this;
            super();
            delegateIterator = submap.entrySet().iterator();
        }
    }


    transient Set entrySet;
    final transient Map submap;
    final AbstractMultimap this$0;

    public boolean containsKey(Object obj)
    {
        return Maps.safeContainsKey(submap, obj);
    }

    public Set entrySet()
    {
        Set set = entrySet;
        Object obj = set;
        if (set == null)
        {
            obj = new AsMapEntries();
            entrySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public boolean equals(Object obj)
    {
        return this == obj || submap.equals(obj);
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        Collection collection = (Collection)Maps.safeGet(submap, obj);
        if (collection == null)
        {
            return null;
        } else
        {
            return AbstractMultimap.access$1300(AbstractMultimap.this, obj, collection);
        }
    }

    public int hashCode()
    {
        return submap.hashCode();
    }

    public Set keySet()
    {
        return AbstractMultimap.this.keySet();
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public Collection remove(Object obj)
    {
        obj = (Collection)submap.remove(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            Collection collection = createCollection();
            collection.addAll(((Collection) (obj)));
            AbstractMultimap.access$220(AbstractMultimap.this, ((Collection) (obj)).size());
            ((Collection) (obj)).clear();
            return collection;
        }
    }

    public String toString()
    {
        return submap.toString();
    }

    submap(Map map)
    {
        this$0 = AbstractMultimap.this;
        super();
        submap = map;
    }
}
