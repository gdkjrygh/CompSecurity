// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueue

public final class SpscLinkedQueue extends BaseLinkedQueue
{

    public SpscLinkedQueue()
    {
        spProducerNode(new LinkedQueueNode());
        spConsumerNode(producerNode);
        consumerNode.soNext(null);
    }

    public boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null elements not allowed");
        } else
        {
            obj = new LinkedQueueNode(obj);
            producerNode.soNext(((LinkedQueueNode) (obj)));
            producerNode = ((LinkedQueueNode) (obj));
            return true;
        }
    }

    public Object peek()
    {
        LinkedQueueNode linkedqueuenode = consumerNode.lvNext();
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
        LinkedQueueNode linkedqueuenode = consumerNode.lvNext();
        if (linkedqueuenode != null)
        {
            Object obj = linkedqueuenode.getAndNullValue();
            consumerNode = linkedqueuenode;
            return obj;
        } else
        {
            return null;
        }
    }
}
