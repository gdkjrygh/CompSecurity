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
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultiset

private class <init> extends AbstractSet
{

    final AbstractMapBasedMultiset this$0;

    public void clear()
    {
        for (Iterator iterator1 = AbstractMapBasedMultiset.access$100(AbstractMapBasedMultiset.this).values().iterator(); iterator1.hasNext(); ((AtomicInteger)iterator1.next()).set(0)) { }
        AbstractMapBasedMultiset.access$100(AbstractMapBasedMultiset.this).clear();
        AbstractMapBasedMultiset.access$202(AbstractMapBasedMultiset.this, 0L);
    }

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof this._cls0)
        {
            obj = (this._cls0)obj;
            int i = count(((this._cls0) (obj))._mth0());
            flag = flag1;
            if (i == ((this._cls0) (obj))._mth0())
            {
                flag = flag1;
                if (i > 0)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            final AbstractMapBasedMultiset.EntrySet this$1;
            java.util.Map.Entry toRemove;
            final Iterator val$backingEntries;

            public boolean hasNext()
            {
                return backingEntries.hasNext();
            }

            public Multiset.Entry next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)backingEntries.next();
                toRemove = entry;
                return entry. new Multisets.AbstractEntry() {

                    final _cls1 this$2;
                    final java.util.Map.Entry val$mapEntry;

                    public int getCount()
                    {
                        int j = ((AtomicInteger)mapEntry.getValue()).get();
                        int i = j;
                        if (j == 0)
                        {
                            AtomicInteger atomicinteger = (AtomicInteger)AbstractMapBasedMultiset.access$100(this$0).get(getElement());
                            i = j;
                            if (atomicinteger != null)
                            {
                                i = atomicinteger.get();
                            }
                        }
                        return i;
                    }

                    public Object getElement()
                    {
                        return mapEntry.getKey();
                    }

            
            {
                this$2 = final__pcls1;
                mapEntry = java.util.Map.Entry.this;
                super();
            }
                };
            }

            public volatile Object next()
            {
                return next();
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
                backingEntries.remove();
                toRemove = null;
            }

            
            {
                this$1 = AbstractMapBasedMultiset.EntrySet.this;
                backingEntries = iterator1;
                super();
            }
        };
    }

    public boolean remove(Object obj)
    {
        boolean flag = false;
        if (contains(obj))
        {
            obj = (contains)obj;
            int i = ((AtomicInteger)AbstractMapBasedMultiset.access$100(AbstractMapBasedMultiset.this).remove(((this._cls0) (obj))._mth0())).getAndSet(0);
            AbstractMapBasedMultiset.access$222(AbstractMapBasedMultiset.this, i);
            flag = true;
        }
        return flag;
    }

    public int size()
    {
        return AbstractMapBasedMultiset.access$100(AbstractMapBasedMultiset.this).size();
    }

    private _cls1.val.backingEntries()
    {
        this$0 = AbstractMapBasedMultiset.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
