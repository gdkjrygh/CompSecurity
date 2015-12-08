// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueue, UnsafeAccess

public final class MpscLinkedQueue extends BaseLinkedQueue
{

    public MpscLinkedQueue()
    {
        consumerNode = new LinkedQueueNode();
        xchgProducerNode(consumerNode);
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null elements not allowed");
        } else
        {
            obj = new LinkedQueueNode(obj);
            xchgProducerNode(((LinkedQueueNode) (obj))).soNext(((LinkedQueueNode) (obj)));
            return true;
        }
    }

    public final Object peek()
    {
        LinkedQueueNode linkedqueuenode = consumerNode;
        LinkedQueueNode linkedqueuenode1 = linkedqueuenode.lvNext();
        if (linkedqueuenode1 != null)
        {
            return linkedqueuenode1.lpValue();
        }
        if (linkedqueuenode != lvProducerNode())
        {
            LinkedQueueNode linkedqueuenode2;
            do
            {
                linkedqueuenode2 = linkedqueuenode.lvNext();
            } while (linkedqueuenode2 == null);
            return linkedqueuenode2.lpValue();
        } else
        {
            return null;
        }
    }

    public final Object poll()
    {
        Object obj = lpConsumerNode();
        LinkedQueueNode linkedqueuenode = ((LinkedQueueNode) (obj)).lvNext();
        if (linkedqueuenode != null)
        {
            obj = linkedqueuenode.getAndNullValue();
            spConsumerNode(linkedqueuenode);
            return obj;
        }
        if (obj != lvProducerNode())
        {
            LinkedQueueNode linkedqueuenode1;
            do
            {
                linkedqueuenode1 = ((LinkedQueueNode) (obj)).lvNext();
            } while (linkedqueuenode1 == null);
            obj = linkedqueuenode1.getAndNullValue();
            consumerNode = linkedqueuenode1;
            return obj;
        } else
        {
            return null;
        }
    }

    protected final LinkedQueueNode xchgProducerNode(LinkedQueueNode linkedqueuenode)
    {
        LinkedQueueNode linkedqueuenode1;
        do
        {
            linkedqueuenode1 = producerNode;
        } while (!UnsafeAccess.UNSAFE.compareAndSwapObject(this, P_NODE_OFFSET, linkedqueuenode1, linkedqueuenode));
        return (LinkedQueueNode)linkedqueuenode1;
    }
}
