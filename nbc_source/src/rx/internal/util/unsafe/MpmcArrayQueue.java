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
        long l3 = mask + 1L;
        long al[] = sequenceBuffer;
        long l = 0x7fffffffffffffffL;
        long l2;
        long l4;
        do
        {
            long l5;
label0:
            do
            {
                long l1;
                do
                {
                    l4 = lvProducerIndex();
                    l1 = calcSequenceOffset(l4);
                    l5 = lvSequence(al, l1) - l4;
                    if (l5 != 0L)
                    {
                        continue label0;
                    }
                } while (!casProducerIndex(l4, 1L + l4));
                spElement(calcElementOffset(l4), obj);
                soSequence(al, l1, 1L + l4);
                return true;
            } while (l5 >= 0L || l4 - l3 > l);
            l2 = lvConsumerIndex();
            l = l2;
        } while (l4 - l3 > l2);
        return false;
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
        long l = -1L;
        long l2;
        long l3;
        do
        {
            long l4;
label0:
            do
            {
                long l1;
                do
                {
                    l3 = lvConsumerIndex();
                    l1 = calcSequenceOffset(l3);
                    l4 = lvSequence(al, l1) - (1L + l3);
                    if (l4 != 0L)
                    {
                        continue label0;
                    }
                } while (!casConsumerIndex(l3, 1L + l3));
                l = calcElementOffset(l3);
                Object obj = lpElement(l);
                spElement(l, null);
                soSequence(al, l1, mask + l3 + 1L);
                return obj;
            } while (l4 >= 0L || l3 < l);
            l2 = lvProducerIndex();
            l = l2;
        } while (l3 != l2);
        return null;
    }

    public int size()
    {
        long l = lvConsumerIndex();
        long l1;
        long l2;
        long l3;
        do
        {
            l1 = l;
            l3 = lvProducerIndex();
            l2 = lvConsumerIndex();
            l = l2;
        } while (l1 != l2);
        return (int)(l3 - l2);
    }
}
