// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            SpmcArrayQueueL1Pad, UnsafeAccess

abstract class SpmcArrayQueueProducerField extends SpmcArrayQueueL1Pad
{

    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/SpmcArrayQueueProducerField, "producerIndex");
    private volatile long producerIndex;

    public SpmcArrayQueueProducerField(int i)
    {
        super(i);
    }

    protected final long lvProducerIndex()
    {
        return producerIndex;
    }

    protected final void soTail(long l)
    {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, l);
    }

}
