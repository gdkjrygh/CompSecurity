// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;

import sun.misc.Unsafe;

// Referenced classes of package rx.internal.util.unsafe:
//            SpscArrayQueueL2Pad, UnsafeAccess

abstract class SpscArrayQueueConsumerField extends SpscArrayQueueL2Pad
{

    protected static final long C_INDEX_OFFSET;
    protected long consumerIndex;

    public SpscArrayQueueConsumerField(int i)
    {
        super(i);
    }

    static 
    {
        try
        {
            C_INDEX_OFFSET = UnsafeAccess.UNSAFE.objectFieldOffset(rx/internal/util/unsafe/SpscArrayQueueConsumerField.getDeclaredField("consumerIndex"));
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
    }
}
