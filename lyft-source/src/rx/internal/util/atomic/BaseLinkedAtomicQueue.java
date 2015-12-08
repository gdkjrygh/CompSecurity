// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.atomic;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package rx.internal.util.atomic:
//            LinkedQueueNode

abstract class BaseLinkedAtomicQueue extends AbstractQueue
{

    private final AtomicReference consumerNode = new AtomicReference();
    private final AtomicReference producerNode = new AtomicReference();

    public BaseLinkedAtomicQueue()
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

    protected final LinkedQueueNode lpConsumerNode()
    {
        return (LinkedQueueNode)consumerNode.get();
    }

    protected final LinkedQueueNode lpProducerNode()
    {
        return (LinkedQueueNode)producerNode.get();
    }

    protected final LinkedQueueNode lvConsumerNode()
    {
        return (LinkedQueueNode)consumerNode.get();
    }

    protected final LinkedQueueNode lvProducerNode()
    {
        return (LinkedQueueNode)producerNode.get();
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

    protected final void spConsumerNode(LinkedQueueNode linkedqueuenode)
    {
        consumerNode.lazySet(linkedqueuenode);
    }

    protected final void spProducerNode(LinkedQueueNode linkedqueuenode)
    {
        producerNode.lazySet(linkedqueuenode);
    }

    protected final LinkedQueueNode xchgProducerNode(LinkedQueueNode linkedqueuenode)
    {
        return (LinkedQueueNode)producerNode.getAndSet(linkedqueuenode);
    }
}
