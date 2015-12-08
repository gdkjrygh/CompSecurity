// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import rx.internal.util.a.a;
import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueue, UnsafeAccess

public final class MpscLinkedQueue extends BaseLinkedQueue
{

    public MpscLinkedQueue()
    {
        consumerNode = new a();
        xchgProducerNode(consumerNode);
    }

    public final boolean offer(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("null elements not allowed");
        } else
        {
            obj = new a(obj);
            xchgProducerNode(((a) (obj))).lazySet(obj);
            return true;
        }
    }

    public final Object peek()
    {
        a a1 = consumerNode;
        a a2 = (a)a1.get();
        if (a2 != null)
        {
            return a2.a;
        }
        if (a1 != lvProducerNode())
        {
            a a3;
            do
            {
                a3 = (a)a1.get();
            } while (a3 == null);
            return a3.a;
        } else
        {
            return null;
        }
    }

    public final Object poll()
    {
        Object obj = lpConsumerNode();
        a a1 = (a)((a) (obj)).get();
        if (a1 != null)
        {
            obj = a1.a();
            spConsumerNode(a1);
            return obj;
        }
        if (obj != lvProducerNode())
        {
            a a2;
            do
            {
                a2 = (a)((a) (obj)).get();
            } while (a2 == null);
            obj = a2.a();
            consumerNode = a2;
            return obj;
        } else
        {
            return null;
        }
    }

    protected final a xchgProducerNode(a a1)
    {
        a a2;
        do
        {
            a2 = producerNode;
        } while (!UnsafeAccess.UNSAFE.compareAndSwapObject(this, P_NODE_OFFSET, a2, a1));
        return (a)a2;
    }
}
