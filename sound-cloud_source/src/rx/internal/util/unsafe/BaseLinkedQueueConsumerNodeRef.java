// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.a.a;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueuePad1, UnsafeAccess

abstract class BaseLinkedQueueConsumerNodeRef extends BaseLinkedQueuePad1
{

    protected static final long C_NODE_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/BaseLinkedQueueConsumerNodeRef, "consumerNode");
    protected a consumerNode;

    BaseLinkedQueueConsumerNodeRef()
    {
    }

    protected final a lpConsumerNode()
    {
        return consumerNode;
    }

    protected final a lvConsumerNode()
    {
        return (a)UnsafeAccess.UNSAFE.getObjectVolatile(this, C_NODE_OFFSET);
    }

    protected final void spConsumerNode(a a1)
    {
        consumerNode = a1;
    }

}
