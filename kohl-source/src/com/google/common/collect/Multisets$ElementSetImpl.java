// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multisets, Multiset

private static final class multiset extends AbstractSet
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Multiset multiset;

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        multiset.clear();
    }

    public boolean contains(Object obj)
    {
        return multiset.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return multiset.containsAll(collection);
    }

    public boolean isEmpty()
    {
        return multiset.isEmpty();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final Multisets.ElementSetImpl this$0;
            final Iterator val$entryIterator;

            public boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public Object next()
            {
                return ((Multiset.Entry)entryIterator.next()).getElement();
            }

            public void remove()
            {
                entryIterator.remove();
            }

            
            {
                this$0 = Multisets.ElementSetImpl.this;
                entryIterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        int i = multiset.count(obj);
        if (i > 0)
        {
            multiset.remove(obj, i);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return multiset.entrySet().size();
    }

    _cls1.val.entryIterator(Multiset multiset1)
    {
        multiset = multiset1;
    }
}
