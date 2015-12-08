// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;


// Referenced classes of package rx.internal.util.unsafe:
//            SpmcArrayQueueL3Pad

public final class SpmcArrayQueue extends SpmcArrayQueueL3Pad
{

    public SpmcArrayQueue(int i)
    {
        super(i);
    }

    public final boolean isEmpty()
    {
        return lvConsumerIndex() == lvProducerIndex();
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Null is not a valid element");
        }
        Object aobj[] = buffer;
        long l = mask;
        long l1 = lvProducerIndex();
        long l2 = calcElementOffset(l1);
        if (lvElement(aobj, l2) != null)
        {
            if (l1 - lvConsumerIndex() > l)
            {
                return false;
            }
            while (lvElement(aobj, l2) != null) ;
        }
        spElement(aobj, l2, obj);
        soTail(1L + l1);
        return true;
    }

    public final Object peek()
    {
        long l = lvProducerIndexCache();
        Object obj;
        do
        {
            long l1 = lvConsumerIndex();
            if (l1 >= l)
            {
                long l2 = lvProducerIndex();
                if (l1 >= l2)
                {
                    return null;
                }
                svProducerIndexCache(l2);
            }
            obj = lvElement(calcElementOffset(l1));
        } while (obj == null);
        return obj;
    }

    public final Object poll()
    {
        long l = lvProducerIndexCache();
        long l1;
        do
        {
            l1 = lvConsumerIndex();
            if (l1 >= l)
            {
                long l2 = lvProducerIndex();
                if (l1 >= l2)
                {
                    return null;
                }
                svProducerIndexCache(l2);
            }
        } while (!casHead(l1, 1L + l1));
        l = calcElementOffset(l1);
        Object aobj[] = buffer;
        Object obj = lpElement(aobj, l);
        soElement(aobj, l, null);
        return obj;
    }

    public final int size()
    {
        long l = lvConsumerIndex();
        do
        {
            long l2 = lvProducerIndex();
            long l1 = lvConsumerIndex();
            if (l == l1)
            {
                return (int)(l2 - l1);
            }
            l = l1;
        } while (true);
    }
}
