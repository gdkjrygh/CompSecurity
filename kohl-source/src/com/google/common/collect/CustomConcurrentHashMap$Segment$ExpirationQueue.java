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

    final pirable head = new CustomConcurrentHashMap.ReferenceEntry() {

        CustomConcurrentHashMap.ReferenceEntry nextExpirable;
        CustomConcurrentHashMap.ReferenceEntry previousExpirable;
        final CustomConcurrentHashMap.Segment.ExpirationQueue this$2;

        public long getExpirationTime()
        {
            return 0x7fffffffffffffffL;
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
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
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
        }

        public void setNextEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        public void setValueReference(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = CustomConcurrentHashMap.Segment.ExpirationQueue.this;
                super();
                nextExpirable = this;
                previousExpirable = this;
            }
    };
    final _cls1 this$1;

    public void clear()
    {
        this._cls1 _lcls1_1;
        for (this._cls1 _lcls1 = head.pirable(); _lcls1 != head; _lcls1 = _lcls1_1)
        {
            _lcls1_1 = _lcls1.pirable();
            CustomConcurrentHashMap.nullifyExpirable(_lcls1);
        }

        head.pirable(head);
        head.usExpirable(head);
    }

    public boolean contains(Object obj)
    {
        return ((head)obj).pirable() != pirable;
    }

    public boolean isEmpty()
    {
        return head.pirable() == head;
    }

    public Iterator iterator()
    {
        return new AbstractLinkedIterator(peek()) {

            final CustomConcurrentHashMap.Segment.ExpirationQueue this$2;

            protected CustomConcurrentHashMap.ReferenceEntry computeNext(CustomConcurrentHashMap.ReferenceEntry referenceentry)
            {
                CustomConcurrentHashMap.ReferenceEntry referenceentry1 = referenceentry.getNextExpirable();
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
                this$2 = CustomConcurrentHashMap.Segment.ExpirationQueue.this;
                super(referenceentry);
            }
        };
    }

    public boolean offer(_cls2.computeNext computenext)
    {
        CustomConcurrentHashMap.connectExpirables(computenext.usExpirable(), computenext.pirable());
        CustomConcurrentHashMap.connectExpirables(head.usExpirable(), computenext);
        CustomConcurrentHashMap.connectExpirables(computenext, head);
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((offer)obj);
    }

    public offer peek()
    {
        offer offer2 = head.pirable();
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
        peek peek1 = head.pirable();
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
        poll poll1 = ((poll) (obj)).usExpirable();
        poll poll2 = ((usExpirable) (obj)).pirable();
        CustomConcurrentHashMap.connectExpirables(poll1, poll2);
        CustomConcurrentHashMap.nullifyExpirable(((pirable) (obj)));
        return poll2 != pirable;
    }

    public int size()
    {
        int i = 0;
        for (pirable pirable = head.pirable(); pirable != head; pirable = pirable.pirable())
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
