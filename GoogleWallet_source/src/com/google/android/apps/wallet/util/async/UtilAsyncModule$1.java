// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            UtilAsyncModule

final class A
    implements ThreadFactory
{

    private final AtomicInteger threadId = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable)
    {
        int i = threadId.getAndIncrement();
        return new Thread(runnable, (new StringBuilder(30)).append("Wallet pool thread ").append(i).toString());
    }

    A()
    {
    }
}
