// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.a.a;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueuePad0, UnsafeAccess

abstract class BaseLinkedQueueProducerNodeRef extends BaseLinkedQueuePad0
{

    protected static final long P_NODE_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/BaseLinkedQueueProducerNodeRef, "producerNode");
    protected a producerNode;

    BaseLinkedQueueProducerNodeRef()
    {
    }

    protected final a lpProducerNode()
    {
        return producerNode;
    }

    protected final a lvProducerNode()
    {
        return (a)UnsafeAccess.UNSAFE.getObjectVolatile(this, P_NODE_OFFSET);
    }

    protected final void spProducerNode(a a1)
    {
        producerNode = a1;
    }

}
