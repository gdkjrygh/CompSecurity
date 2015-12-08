// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            RequestCreator

static final class val.latch
    implements Runnable
{

    final AtomicInteger val$id;
    final CountDownLatch val$latch;

    public void run()
    {
        val$id.set(RequestCreator.access$000());
        val$latch.countDown();
    }

    ger(AtomicInteger atomicinteger, CountDownLatch countdownlatch)
    {
        val$id = atomicinteger;
        val$latch = countdownlatch;
        super();
    }
}
