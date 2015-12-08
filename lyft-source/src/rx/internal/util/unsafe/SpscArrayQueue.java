// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            SpscArrayQueueL3Pad, UnsafeAccess

public final class SpscArrayQueue extends SpscArrayQueueL3Pad
{

    public SpscArrayQueue(int i)
    {
        super(i);
    }

    private long lvConsumerIndex()
    {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, C_INDEX_OFFSET);
    }

    private long lvProducerIndex()
    {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, P_INDEX_OFFSET);
    }

    private void soConsumerIndex(long l)
    {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, l);
    }

    private void soProducerIndex(long l)
    {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, l);
    }

    public boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null elements not allowed");
        }
        Object aobj[] = buffer;
        long l = producerIndex;
        long l1 = calcElementOffset(l);
        if (lvElement(aobj, l1) != null)
        {
            return false;
        } else
        {
            soProducerIndex(l + 1L);
            soElement(aobj, l1, obj);
            return true;
        }
    }

    public Object peek()
    {
        return lvElement(calcElementOffset(consumerIndex));
    }

    public Object poll()
    {
        long l = consumerIndex;
        long l1 = calcElementOffset(l);
        Object aobj[] = buffer;
        Object obj = lvElement(aobj, l1);
        if (obj == null)
        {
            return null;
        } else
        {
            soConsumerIndex(l + 1L);
            soElement(aobj, l1, null);
            return obj;
        }
    }

    public int size()
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
