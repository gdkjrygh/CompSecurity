// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable

class this._cls1 extends AbstractSet
{

    final t this$1;

    public void clear()
    {
        t().clear();
    }

    public boolean contains(Object obj)
    {
        return StandardTable.this.contains(obj, ey);
    }

    public boolean isEmpty()
    {
        return !containsColumn(ey);
    }

    public Iterator iterator()
    {
        return StandardTable.keyIteratorImpl(this._cls1.this);
    }

    public boolean remove(Object obj)
    {
        return StandardTable.this.remove(obj, ey) != null;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = false;
        for (collection = collection.iterator(); collection.hasNext();)
        {
            flag |= remove(collection.next());
        }

        return flag;
    }

    public boolean retainAll(final Collection c)
    {
        Preconditions.checkNotNull(c);
        c = new Predicate() {

            final StandardTable.Column.KeySet this$2;
            final Collection val$c;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return !c.contains(entry.getKey());
            }

            
            {
                this$2 = StandardTable.Column.KeySet.this;
                c = collection;
                super();
            }
        };
        return redicate(c);
    }

    public int size()
    {
        return t().size();
    }

    _cls1.val.c()
    {
        this$1 = this._cls1.this;
        super();
    }
}
