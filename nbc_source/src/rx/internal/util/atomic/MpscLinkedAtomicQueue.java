// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.atomic;


// Referenced classes of package rx.internal.util.atomic:
//            BaseLinkedAtomicQueue, LinkedQueueNode

public final class MpscLinkedAtomicQueue extends BaseLinkedAtomicQueue
{

    public MpscLinkedAtomicQueue()
    {
        LinkedQueueNode linkedqueuenode = new LinkedQueueNode();
        spConsumerNode(linkedqueuenode);
        xchgProducerNode(linkedqueuenode);
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
        LinkedQueueNode linkedqueuenode = lpConsumerNode();
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
            spConsumerNode(linkedqueuenode1);
            return obj;
        } else
        {
            return null;
        }
    }
}
