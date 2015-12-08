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

    final etNextExpirable head = new MapMakerInternalMap.AbstractReferenceEntry() {

        MapMakerInternalMap.ReferenceEntry nextExpirable;
        MapMakerInternalMap.ReferenceEntry previousExpirable;
        final MapMakerInternalMap.ExpirationQueue this$0;

        public final long getExpirationTime()
        {
            return 0x7fffffffffffffffL;
        }

        public final MapMakerInternalMap.ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public final MapMakerInternalMap.ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public final void setExpirationTime(long l)
        {
        }

        public final void setNextExpirable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public final void setPreviousExpirable(MapMakerInternalMap.ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

            
            {
                this$0 = MapMakerInternalMap.ExpirationQueue.this;
                super();
                nextExpirable = this;
                previousExpirable = this;
            }
    };

    private boolean offer(_cls2.this._cls0 _pcls0)
    {
        MapMakerInternalMap.connectExpirables(_pcls0.etPreviousExpirable(), _pcls0.etNextExpirable());
        MapMakerInternalMap.connectExpirables(head.etPreviousExpirable(), _pcls0);
        MapMakerInternalMap.connectExpirables(_pcls0, head);
        return true;
    }

    private head peek()
    {
        head head2 = head.etNextExpirable();
        head head1 = head2;
        if (head2 == head)
        {
            head1 = null;
        }
        return head1;
    }

    private head poll()
    {
        head head1 = head.etNextExpirable();
        if (head1 == head)
        {
            return null;
        } else
        {
            remove(head1);
            return head1;
        }
    }

    public final void clear()
    {
        remove remove2;
        for (remove remove1 = head.etNextExpirable(); remove1 != head; remove1 = remove2)
        {
            remove2 = remove1.etNextExpirable();
            MapMakerInternalMap.nullifyExpirable(remove1);
        }

        head.etNextExpirable(head);
        head.etPreviousExpirable(head);
    }

    public final boolean contains(Object obj)
    {
        return ((head)obj).etNextExpirable() != CE;
    }

    public final boolean isEmpty()
    {
        return head.etNextExpirable() == head;
    }

    public final Iterator iterator()
    {
        return new AbstractSequentialIterator(peek()) {

            final MapMakerInternalMap.ExpirationQueue this$0;

            private MapMakerInternalMap.ReferenceEntry computeNext(MapMakerInternalMap.ReferenceEntry referenceentry)
            {
                MapMakerInternalMap.ReferenceEntry referenceentry1 = referenceentry.getNextExpirable();
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
                this$0 = MapMakerInternalMap.ExpirationQueue.this;
                super(referenceentry);
            }
        };
    }

    public final volatile boolean offer(Object obj)
    {
        return offer((offer)obj);
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
        obj = (poll)obj;
        poll poll1 = ((poll) (obj)).etPreviousExpirable();
        poll poll2 = ((etPreviousExpirable) (obj)).etNextExpirable();
        MapMakerInternalMap.connectExpirables(poll1, poll2);
        MapMakerInternalMap.nullifyExpirable((() (obj)));
        return poll2 != CE;
    }

    public final int size()
    {
        int i = 0;
        for (CE ce = head.etNextExpirable(); ce != head; ce = ce.etNextExpirable())
        {
            i++;
        }

        return i;
    }

    _cls2.this._cls0()
    {
    }
}
