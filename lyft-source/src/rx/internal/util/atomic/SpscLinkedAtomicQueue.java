// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.atomic;


// Referenced classes of package rx.internal.util.atomic:
//            BaseLinkedAtomicQueue, LinkedQueueNode

public final class SpscLinkedAtomicQueue extends BaseLinkedAtomicQueue
{

    public SpscLinkedAtomicQueue()
    {
        LinkedQueueNode linkedqueuenode = new LinkedQueueNode();
        spProducerNode(linkedqueuenode);
        spConsumerNode(linkedqueuenode);
        linkedqueuenode.soNext(null);
    }

    public boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null elements not allowed");
        } else
        {
            obj = new LinkedQueueNode(obj);
            lpProducerNode().soNext(((LinkedQueueNode) (obj)));
            spProducerNode(((LinkedQueueNode) (obj)));
            return true;
        }
    }

    public Object peek()
    {
        LinkedQueueNode linkedqueuenode = lpConsumerNode().lvNext();
        if (linkedqueuenode != null)
        {
            return linkedqueuenode.lpValue();
        } else
        {
            return null;
        }
    }

    public Object poll()
    {
        LinkedQueueNode linkedqueuenode = lpConsumerNode().lvNext();
        if (linkedqueuenode != null)
        {
            Object obj = linkedqueuenode.getAndNullValue();
            spConsumerNode(linkedqueuenode);
            return obj;
        } else
        {
            return null;
        }
    }
}
