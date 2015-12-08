// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;


// Referenced classes of package rx.internal.util.unsafe:
//            SpscArrayQueueL1Pad, UnsafeAccess

abstract class SpscArrayQueueProducerFields extends SpscArrayQueueL1Pad
{

    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(rx/internal/util/unsafe/SpscArrayQueueProducerFields, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public SpscArrayQueueProducerFields(int i)
    {
        super(i);
    }

}
