// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import java.util.Iterator;
import rx.internal.util.a.a;

// Referenced classes of package rx.internal.util.unsafe:
//            BaseLinkedQueueConsumerNodeRef

abstract class BaseLinkedQueue extends BaseLinkedQueueConsumerNodeRef
{

    long p00;
    long p01;
    long p02;
    long p03;
    long p04;
    long p05;
    long p06;
    long p07;
    long p30;
    long p31;
    long p32;
    long p33;
    long p34;
    long p35;
    long p36;
    long p37;

    BaseLinkedQueue()
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

    public final int size()
    {
        a a1 = lvConsumerNode();
        a a3 = lvProducerNode();
        a a2;
        int i;
        for (i = 0; a1 != a3 && i < 0x7fffffff; a1 = a2)
        {
            do
            {
                a2 = (a)a1.get();
            } while (a2 == null);
            i++;
        }

        return i;
    }
}
