// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            ConcurrentHashMultiset, Lists, Multisets

private class <init> extends AbstractSet
{

    final ConcurrentHashMultiset this$0;

    private List snapshot()
    {
        java.util.ArrayList arraylist = Lists.newArrayListWithExpectedSize(size());
        for (Iterator iterator1 = iterator(); iterator1.hasNext(); arraylist.add((iterator)iterator1.next())) { }
        return arraylist;
    }

    public void clear()
    {
        ConcurrentHashMultiset.access$100(ConcurrentHashMultiset.this).clear();
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            Object obj1 = ((this._cls0) (obj))._mth0();
            int i = ((this._cls0) (obj))._mth0();
            flag = flag1;
            if (i > 0)
            {
                flag = flag1;
                if (count(obj1) == i)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ConcurrentHashMultiset.access$100(ConcurrentHashMultiset.this).hashCode();
    }

    public boolean isEmpty()
    {
        return ConcurrentHashMultiset.access$100(ConcurrentHashMultiset.this).isEmpty();
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final ConcurrentHashMultiset.EntrySet this$1;
            final Iterator val$backingIterator;

            public boolean hasNext()
            {
                return backingIterator.hasNext();
            }

            public Multiset.Entry next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)backingIterator.next();
                return Multisets.immutableEntry(entry.getKey(), ((Integer)entry.getValue()).intValue());
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                backingIterator.remove();
            }

            
            {
                this$1 = ConcurrentHashMultiset.EntrySet.this;
                backingIterator = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        if (obj instanceof _cls1.val.backingIterator)
        {
            obj = (_cls1.val.backingIterator)obj;
            Object obj1 = ((_cls1.val.backingIterator) (obj)).backingIterator();
            int i = ((_cls1.val.backingIterator) (obj)).backingIterator();
            return ConcurrentHashMultiset.access$100(ConcurrentHashMultiset.this).remove(obj1, Integer.valueOf(i));
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return ConcurrentHashMultiset.access$100(ConcurrentHashMultiset.this).size();
    }

    public Object[] toArray()
    {
        return snapshot().toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return snapshot().toArray(aobj);
    }

    private _cls1.val.backingIterator()
    {
        this$0 = ConcurrentHashMultiset.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
