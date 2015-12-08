// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.atomic.LinkedQueueNode;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueueConsumerNodeRef

abstract class BaseLinkedQueue extends BaseLinkedQueueConsumerNodeRef
{

    long p00;
    long p01;
    long p02;
    long p03;
    long p04;
    long p05;
    long p06;
    long p07;
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;

    BaseLinkedQueue()
    {
    }

    public final boolean isEmpty()
    {
        return lvConsumerNode() == lvProducerNode();
    }

    public final Iterator iterator()
    {
        throw new UnsupportedOperationException();
    }

    public final int size()
    {
        LinkedQueueNode linkedqueuenode = lvConsumerNode();
        LinkedQueueNode linkedqueuenode2 = lvProducerNode();
        LinkedQueueNode linkedqueuenode1;
        int i;
        for (i = 0; linkedqueuenode != linkedqueuenode2 && i < 0x7fffffff; linkedqueuenode = linkedqueuenode1)
        {
            do
            {
                linkedqueuenode1 = linkedqueuenode.lvNext();
            } while (linkedqueuenode1 == null);
            i++;
        }

        return i;
    }
}
