// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, AbstractMapBasedMultiset, Iterators

class delegate extends ForwardingSet
{

    private final Set _flddelegate;
    private final Map map;
    final AbstractMapBasedMultiset this$0;

    public void clear()
    {
        if (map == AbstractMapBasedMultiset.access$100(AbstractMapBasedMultiset.this))
        {
            AbstractMapBasedMultiset.this.clear();
        } else
        {
            Iterator iterator1 = iterator();
            while (iterator1.hasNext()) 
            {
                iterator1.next();
                iterator1.remove();
            }
        }
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Collection _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Set _mthdelegate()
    {
        return _flddelegate;
    }

    public Map getMap()
    {
        return map;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final AbstractMapBasedMultiset.MapBasedElementSet this$1;
            java.util.Map.Entry toRemove;
            final Iterator val$entries;

            public boolean hasNext()
            {
                return entries.hasNext();
            }

            public Object next()
            {
                toRemove = (java.util.Map.Entry)entries.next();
                return toRemove.getKey();
            }

            public void remove()
            {
                boolean flag;
                if (toRemove != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "no calls to next() since the last call to remove()");
                AbstractMapBasedMultiset.access$222(this$0, ((AtomicInteger)toRemove.getValue()).getAndSet(0));
                entries.remove();
                toRemove = null;
            }

            
            {
                this$1 = AbstractMapBasedMultiset.MapBasedElementSet.this;
                entries = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        return AbstractMapBasedMultiset.access$300(AbstractMapBasedMultiset.this, obj, map) != 0;
    }

    public boolean removeAll(Collection collection)
    {
        return Iterators.removeAll(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return Iterators.retainAll(iterator(), collection);
    }

    _cls1.val.entries(Map map1)
    {
        this$0 = AbstractMapBasedMultiset.this;
        super();
        map = map1;
        _flddelegate = map1.keySet();
    }
}
