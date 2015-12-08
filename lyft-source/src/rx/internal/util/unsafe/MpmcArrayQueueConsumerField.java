// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            MpmcArrayQueueL2Pad, UnsafeAccess

abstract class MpmcArrayQueueConsumerField extends MpmcArrayQueueL2Pad
{

    private static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/MpmcArrayQueueConsumerField, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcArrayQueueConsumerField(int i)
    {
        super(i);
    }

    protected final boolean casConsumerIndex(long l, long l1)
    {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, l, l1);
    }

    protected final long lvConsumerIndex()
    {
        return consumerIndex;
    }

}
