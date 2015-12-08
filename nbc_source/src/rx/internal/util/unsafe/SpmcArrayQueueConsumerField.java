// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            SpmcArrayQueueL2Pad, UnsafeAccess

abstract class SpmcArrayQueueConsumerField extends SpmcArrayQueueL2Pad
{

    protected static final long C_INDEX_OFFSET;
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerField(int i)
    {
        super(i);
    }

    protected final boolean casHead(long l, long l1)
    {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, l, l1);
    }

    protected final long lvConsumerIndex()
    {
        return consumerIndex;
    }

    static 
    {
        try
        {
            C_INDEX_OFFSET = UnsafeAccess.UNSAFE.objectFieldOffset(rx/internal/util/unsafe/SpmcArrayQueueConsumerField.getDeclaredField("consumerIndex"));
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
    }
}
