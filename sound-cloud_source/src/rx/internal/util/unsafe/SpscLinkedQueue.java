// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.a.a;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueue

public final class SpscLinkedQueue extends BaseLinkedQueue
{

    public SpscLinkedQueue()
    {
        spProducerNode(new a());
        spConsumerNode(producerNode);
        consumerNode.lazySet(null);
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null elements not allowed");
        } else
        {
            obj = new a(obj);
            producerNode.lazySet(obj);
            producerNode = ((a) (obj));
            return true;
        }
    }

    public final Object peek()
    {
        a a1 = (a)consumerNode.get();
        if (a1 != null)
        {
            return a1.a;
        } else
        {
            return null;
        }
    }

    public final Object poll()
    {
        a a1 = (a)consumerNode.get();
        if (a1 != null)
        {
            Object obj = a1.a();
            consumerNode = a1;
            return obj;
        } else
        {
            return null;
        }
    }
}
