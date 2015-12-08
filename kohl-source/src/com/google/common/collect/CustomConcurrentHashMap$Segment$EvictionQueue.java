// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap, AbstractLinkedIterator

class this._cls1 extends AbstractQueue
{

    final Evictable head = new CustomConcurrentHashMap.ReferenceEntry() {

        CustomConcurrentHashMap.ReferenceEntry nextEvictable;
        CustomConcurrentHashMap.ReferenceEntry previousEvictable;
        final CustomConcurrentHashMap.Segment.EvictionQueue this$2;

        public long getExpirationTime()
        {
            throw new UnsupportedOperationException();
        }

        public int getHash()
        {
            throw new UnsupportedOperationException();
        }

        public Object getKey()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNext()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = CustomConcurrentHashMap.Segment.EvictionQueue.this;
                super();
                nextEvictable = this;
                previousEvictable = this;
            }
    };
    final _cls1 this$1;

    public void clear()
    {
        this._cls1 _lcls1_1;
        for (this._cls1 _lcls1 = head.Evictable(); _lcls1 != head; _lcls1 = _lcls1_1)
        {
            _lcls1_1 = _lcls1.Evictable();
            CustomConcurrentHashMap.nullifyEvictable(_lcls1);
        }

        head.Evictable(head);
        head.iousEvictable(head);
    }

    public boolean contains(Object obj)
    {
        return ((head)obj).Evictable() != Evictable;
    }

    public boolean isEmpty()
    {
        return head.Evictable() == head;
    }

    public Iterator iterator()
    {
        return new AbstractLinkedIterator(peek()) {

            final CustomConcurrentHashMap.Segment.EvictionQueue this$2;

            protected CustomConcurrentHashMap.ReferenceEntry computeNext(CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                CustomConcurrentHashMap.ReferenceEntry referenceentry1 = referenceentry.getNextEvictable();
                referenceentry = referenceentry1;
                if (referenceentry1 == head)
                {
                    referenceentry = null;
                }
                return referenceentry;
            }

            protected volatile Object computeNext(Object obj)
            {
                return computeNext((CustomConcurrentHashMap.ReferenceEntry)obj);
            }

            
            {
                this$2 = CustomConcurrentHashMap.Segment.EvictionQueue.this;
                super(referenceentry);
            }
        };
    }

    public boolean offer(_cls2.computeNext computenext)
    {
        CustomConcurrentHashMap.connectEvictables(computenext.iousEvictable(), computenext.Evictable());
        CustomConcurrentHashMap.connectEvictables(head.iousEvictable(), computenext);
        CustomConcurrentHashMap.connectEvictables(computenext, head);
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((offer)obj);
    }

    public offer peek()
    {
        offer offer2 = head.Evictable();
        offer offer1 = offer2;
        if (offer2 == head)
        {
            offer1 = null;
        }
        return offer1;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public peek poll()
    {
        peek peek1 = head.Evictable();
        if (peek1 == head)
        {
            return null;
        } else
        {
            remove(peek1);
            return peek1;
        }
    }

    public volatile Object poll()
    {
        return poll();
    }

    public boolean remove(Object obj)
    {
        obj = (poll)obj;
        poll poll1 = ((poll) (obj)).iousEvictable();
        poll poll2 = ((iousEvictable) (obj)).Evictable();
        CustomConcurrentHashMap.connectEvictables(poll1, poll2);
        CustomConcurrentHashMap.nullifyEvictable(((Evictable) (obj)));
        return poll2 != Evictable;
    }

    public int size()
    {
        int i = 0;
        for (Evictable evictable = head.Evictable(); evictable != head; evictable = evictable.Evictable())
        {
            i++;
        }

        return i;
    }

    _cls2.this._cls2()
    {
        this$1 = this._cls1.this;
        super();
    }
}
