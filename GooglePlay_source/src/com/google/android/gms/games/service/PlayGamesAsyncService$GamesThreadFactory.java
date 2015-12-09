// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesAsyncService

private static final class <init>
    implements ThreadFactory
{

    private static final AtomicInteger THREAD_COUNT = new AtomicInteger();

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("PlayGamesAsyncThread")).append(THREAD_COUNT.getAndIncrement()).toString());
    }


    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
