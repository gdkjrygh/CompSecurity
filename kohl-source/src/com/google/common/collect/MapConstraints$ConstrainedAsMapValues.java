// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, MapConstraints

private static class entrySet extends ForwardingCollection
{

    final Collection _flddelegate;
    final Set entrySet;

    public boolean contains(Object obj)
    {
        return standardContains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return standardContainsAll(collection);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Collection _mthdelegate()
    {
        return _flddelegate;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final MapConstraints.ConstrainedAsMapValues this$0;
            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public volatile Object next()
            {
                return next();
            }

            public Collection next()
            {
                return (Collection)((java.util.Map.Entry)iterator.next()).getValue();
            }

            public void remove()
            {
                iterator.remove();
            }

            
            {
                this$0 = MapConstraints.ConstrainedAsMapValues.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        return standardRemove(obj);
    }

    public boolean removeAll(Collection collection)
    {
        return standardRemoveAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return standardRetainAll(collection);
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    _cls1.val.iterator(Collection collection, Set set)
    {
        _flddelegate = collection;
        entrySet = set;
    }
}
