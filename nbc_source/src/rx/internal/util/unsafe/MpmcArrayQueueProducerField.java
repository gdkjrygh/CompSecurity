// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            MpmcArrayQueueL1Pad, UnsafeAccess

abstract class MpmcArrayQueueProducerField extends MpmcArrayQueueL1Pad
{

    private static final long P_INDEX_OFFSET;
    private volatile long producerIndex;

    public MpmcArrayQueueProducerField(int i)
    {
        super(i);
    }

    protected final boolean casProducerIndex(long l, long l1)
    {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, l, l1);
    }

    protected final long lvProducerIndex()
    {
        return producerIndex;
    }

    static 
    {
        try
        {
            P_INDEX_OFFSET = UnsafeAccess.UNSAFE.objectFieldOffset(rx/internal/util/unsafe/MpmcArrayQueueProducerField.getDeclaredField("producerIndex"));
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
    }
}
