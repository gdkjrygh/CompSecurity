// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap

private class subMap extends AbstractSet
{

    final Map subMap;
    final AbstractMultimap this$0;

    public boolean contains(Object obj)
    {
        return subMap.containsKey(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return subMap.keySet().containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || subMap.keySet().equals(obj);
    }

    public int hashCode()
    {
        return subMap.keySet().hashCode();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            java.util.Map.Entry entry;
            final Iterator entryIterator;
            final AbstractMultimap.KeySet this$1;

            public boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public Object next()
            {
                entry = (java.util.Map.Entry)entryIterator.next();
                return entry.getKey();
            }

            public void remove()
            {
                Collection collection;
                boolean flag;
                if (entry != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag);
                collection = (Collection)entry.getValue();
                entryIterator.remove();
                AbstractMultimap.access$220(this$0, collection.size());
                collection.clear();
            }

            
            {
                this$1 = AbstractMultimap.KeySet.this;
                super();
                entryIterator = subMap.entrySet().iterator();
            }
        };
    }

    public boolean remove(Object obj)
    {
        int i = 0;
        obj = (Collection)subMap.remove(obj);
        if (obj != null)
        {
            i = ((Collection) (obj)).size();
            ((Collection) (obj)).clear();
            AbstractMultimap.access$220(AbstractMultimap.this, i);
        }
        return i > 0;
    }

    public boolean removeAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        return super.removeAll(collection);
    }

    public int size()
    {
        return subMap.size();
    }

    subMap(Map map)
    {
        this$0 = AbstractMultimap.this;
        super();
        subMap = map;
    }
}
