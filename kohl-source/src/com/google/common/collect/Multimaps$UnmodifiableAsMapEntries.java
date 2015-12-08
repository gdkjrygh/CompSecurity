// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingSet, Multimaps, Maps, ForwardingIterator

static class delegate extends ForwardingSet
{

    private final Set _flddelegate;

    public boolean contains(Object obj)
    {
        return Maps.containsEntryImpl(_mthdelegate(), obj);
    }

    public boolean containsAll(Collection collection)
    {
        return standardContainsAll(collection);
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

    public boolean equals(Object obj)
    {
        return standardEquals(obj);
    }

    public Iterator iterator()
    {
        return new ForwardingIterator() {

            final Multimaps.UnmodifiableAsMapEntries this$0;
            final Iterator val$iterator;

            protected volatile Object _mthdelegate()
            {
                return _mthdelegate();
            }

            protected Iterator _mthdelegate()
            {
                return iterator;
            }

            public volatile Object next()
            {
                return next();
            }

            public java.util.Map.Entry next()
            {
                return Multimaps.access$300((java.util.Map.Entry)iterator.next());
            }

            
            {
                this$0 = Multimaps.UnmodifiableAsMapEntries.this;
                iterator = iterator1;
                super();
            }
        };
    }

    public Object[] toArray()
    {
        return standardToArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return standardToArray(aobj);
    }

    _cls1.val.iterator(Set set)
    {
        _flddelegate = set;
    }
}
