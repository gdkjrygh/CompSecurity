// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;


// Referenced classes of package rx.internal.util.unsafe:
//            MpmcArrayQueueConsumerField

public class MpmcArrayQueue extends MpmcArrayQueueConsumerField
{

    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;
    long p40;
    long p41;
    long p42;
    long p43;
    long p44;
    long p45;
    long p46;

    public MpmcArrayQueue(int i)
    {
        super(Math.max(2, i));
    }

    public boolean isEmpty()
    {
        return lvConsumerIndex() == lvProducerIndex();
    }

    public boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Null is not a valid element");
        }
        long l2 = mask + 1L;
        long al[] = sequenceBuffer;
        long l1 = 0x7fffffffffffffffL;
        do
        {
            long l3 = lvProducerIndex();
            long l4 = calcSequenceOffset(l3);
            long l5 = lvSequence(al, l4) - l3;
            long l;
            if (l5 == 0L)
            {
                l = l1;
                if (casProducerIndex(l3, 1L + l3))
                {
                    spElement(calcElementOffset(l3), obj);
                    soSequence(al, l4, 1L + l3);
                    return true;
                }
            } else
            {
                l = l1;
                if (l5 < 0L)
                {
                    l = l1;
                    if (l3 - l2 <= l1)
                    {
                        l1 = lvConsumerIndex();
                        l = l1;
                        if (l3 - l2 <= l1)
                        {
                            return false;
                        }
                    }
                }
            }
            l1 = l;
        } while (true);
    }

    public Object peek()
    {
        Object obj;
        long l;
        do
        {
            l = lvConsumerIndex();
            obj = lpElement(calcElementOffset(l));
        } while (obj == null && l != lvProducerIndex());
        return obj;
    }

    public Object poll()
    {
        long al[] = sequenceBuffer;
        long l1 = -1L;
        do
        {
            long l2 = lvConsumerIndex();
            long l3 = calcSequenceOffset(l2);
            long l4 = lvSequence(al, l3) - (1L + l2);
            long l;
            if (l4 == 0L)
            {
                l = l1;
                if (casConsumerIndex(l2, 1L + l2))
                {
                    l = calcElementOffset(l2);
                    Object obj = lpElement(l);
                    spElement(l, null);
                    soSequence(al, l3, mask + l2 + 1L);
                    return obj;
                }
            } else
            {
                l = l1;
                if (l4 < 0L)
                {
                    l = l1;
                    if (l2 >= l1)
                    {
                        l1 = lvProducerIndex();
                        l = l1;
                        if (l2 == l1)
                        {
                            return null;
                        }
                    }
                }
            }
            l1 = l;
        } while (true);
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
