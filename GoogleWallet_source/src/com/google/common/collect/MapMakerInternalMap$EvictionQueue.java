// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, AbstractSequentialIterator

static final class _cls2.this._cls0 extends AbstractQueue
{

    final  head = new MapMakerInternalMap.AbstractReferenceEntry() {

        MapMakerInternalMap.ReferenceEntry nextEvictable;
        MapMakerInternalMap.ReferenceEntry previousEvictable;
        final MapMakerInternalMap.EvictionQueue this$0;

        public final MapMakerInternalMap.ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public final MapMakerInternalMap.ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public final void setNextEvictable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public final void setPreviousEvictable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

            
            {
                this$0 = MapMakerInternalMap.EvictionQueue.this;
                super();
                nextEvictable = this;
                previousEvictable = this;
            }
    };

    private boolean offer( )
    {
        MapMakerInternalMap.connectEvictables(.getPreviousEvictable(), .getNextEvictable());
        MapMakerInternalMap.connectEvictables(head.getPreviousEvictable(), );
        MapMakerInternalMap.connectEvictables(, head);
        return true;
    }

    private  peek()
    {
         1 = head.getNextEvictable();
          = 1;
        if (1 == head)
        {
             = null;
        }
        return ;
    }

    private  poll()
    {
          = head.getNextEvictable();
        if ( == head)
        {
            return null;
        } else
        {
            remove();
            return ;
        }
    }

    public final void clear()
    {
         1;
        for (  = head.getNextEvictable();  != head;  = 1)
        {
            1 = .getNextEvictable();
            MapMakerInternalMap.nullifyEvictable();
        }

        head.setNextEvictable(head);
        head.setPreviousEvictable(head);
    }

    public final boolean contains(Object obj)
    {
        return (()obj).getNextEvictable() != ANCE;
    }

    public final boolean isEmpty()
    {
        return head.getNextEvictable() == head;
    }

    public final Iterator iterator()
    {
        return new AbstractSequentialIterator(peek()) {

            final MapMakerInternalMap.EvictionQueue this$0;

            private MapMakerInternalMap.ReferenceEntry computeNext(MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                MapMakerInternalMap.ReferenceEntry referenceentry1 = referenceentry.getNextEvictable();
                referenceentry = referenceentry1;
                if (referenceentry1 == head)
                {
                    referenceentry = null;
                }
                return referenceentry;
            }

            protected final volatile Object computeNext(Object obj)
            {
                return computeNext((MapMakerInternalMap.ReferenceEntry)obj);
            }

            
            {
                this$0 = MapMakerInternalMap.EvictionQueue.this;
                super(referenceentry);
            }
        };
    }

    public final volatile boolean offer(Object obj)
    {
        return offer(()obj);
    }

    public final volatile Object peek()
    {
        return peek();
    }

    public final volatile Object poll()
    {
        return poll();
    }

    public final boolean remove(Object obj)
    {
        obj = ()obj;
          = (() (obj)).getPreviousEvictable();
         1 = (() (obj)).getNextEvictable();
        MapMakerInternalMap.connectEvictables(, 1);
        MapMakerInternalMap.nullifyEvictable((() (obj)));
        return 1 != ANCE;
    }

    public final int size()
    {
        int i = 0;
        for (  = head.getNextEvictable();  != head;  = .getNextEvictable())
        {
            i++;
        }

        return i;
    }

    _cls2.this._cls0()
    {
    }
}
