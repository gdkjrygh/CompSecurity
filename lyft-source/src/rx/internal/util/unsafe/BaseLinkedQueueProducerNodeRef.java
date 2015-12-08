// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueuePad0, UnsafeAccess

abstract class BaseLinkedQueueProducerNodeRef extends BaseLinkedQueuePad0
{

    protected static final long P_NODE_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/BaseLinkedQueueProducerNodeRef, "producerNode");
    protected LinkedQueueNode producerNode;

    BaseLinkedQueueProducerNodeRef()
    {
    }

    protected final LinkedQueueNode lpProducerNode()
    {
        return producerNode;
    }

    protected final LinkedQueueNode lvProducerNode()
    {
        return (LinkedQueueNode)UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    protected final void spProducerNode(LinkedQueueNode linkedqueuenode)
    {
        producerNode = linkedqueuenode;
    }

}
