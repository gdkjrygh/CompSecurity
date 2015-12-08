// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

static final class 
    implements ThreadFactory
{

    private final AtomicInteger count = new AtomicInteger(1);

    public Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append("AsyncTask #").append(count.getAndIncrement()).toString());
    }

    ()
    {
    }
}
