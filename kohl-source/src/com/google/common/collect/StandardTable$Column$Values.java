// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, ImmutableEntry

class this._cls1 extends AbstractCollection
{

    final t this$1;

    public void clear()
    {
        t().clear();
    }

    public boolean isEmpty()
    {
        return !containsColumn(ey);
    }

    public Iterator iterator()
    {
        return StandardTable.valueIteratorImpl(this._cls1.this);
    }

    public boolean remove(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator1;
        Map map;
        iterator1 = backingMap.values().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            map = (Map)iterator1.next();
        } while (!map.entrySet().remove(new ImmutableEntry(ey, obj)));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        if (map.isEmpty())
        {
            iterator1.remove();
        }
        return true;
    }

    public boolean removeAll(final Collection c)
    {
        Preconditions.checkNotNull(c);
        c = new Predicate() {

            final StandardTable.Column.Values this$2;
            final Collection val$c;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return c.contains(entry.getValue());
            }

            
            {
                this$2 = StandardTable.Column.Values.this;
                c = collection;
                super();
            }
        };
        return redicate(c);
    }

    public boolean retainAll(final Collection c)
    {
        Preconditions.checkNotNull(c);
        c = new Predicate() {

            final StandardTable.Column.Values this$2;
            final Collection val$c;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return !c.contains(entry.getValue());
            }

            
            {
                this$2 = StandardTable.Column.Values.this;
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

    _cls2.val.c()
    {
        this$1 = this._cls1.this;
        super();
    }
}
