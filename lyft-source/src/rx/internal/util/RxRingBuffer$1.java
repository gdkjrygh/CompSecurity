// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.internal.util.unsafe.SpscArrayQueue;

// Referenced classes of package rx.internal.util:
//            ObjectPool, RxRingBuffer

final class yQueue extends ObjectPool
{

    protected volatile Object createObject()
    {
        return createObject();
    }

    protected SpscArrayQueue createObject()
    {
        return new SpscArrayQueue(RxRingBuffer.SIZE);
    }

    yQueue()
    {
    }
}
