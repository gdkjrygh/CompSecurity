// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Multimaps

private static class delegate extends ForwardingCollection
{

    final Collection _flddelegate;

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

            final Multimaps.UnmodifiableAsMapValues this$0;
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
                return Multimaps.access$100((Collection)iterator.next());
            }

            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            
            {
                this$0 = Multimaps.UnmodifiableAsMapValues.this;
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

    _cls1.val.iterator(Collection collection)
    {
        _flddelegate = Collections.unmodifiableCollection(collection);
    }
}
