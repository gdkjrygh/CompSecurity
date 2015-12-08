// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.util.concurrent:
//            PriorityRunnable

public final class NumberedThreadFactory
    implements ThreadFactory
{

    private final ThreadFactory defaultFactory;
    private final String mBaseName;
    private final AtomicInteger mCount;
    private final int mPriority;

    public NumberedThreadFactory(String s)
    {
        this(s, (byte)0);
    }

    private NumberedThreadFactory(String s, byte byte0)
    {
        mCount = new AtomicInteger();
        defaultFactory = Executors.defaultThreadFactory();
        mBaseName = (String)Preconditions.checkNotNull(s, "Name must not be null");
        mPriority = 0;
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = defaultFactory.newThread(new PriorityRunnable(runnable, 0));
        runnable.setName((new StringBuilder()).append(mBaseName).append("[").append(mCount.getAndIncrement()).append("]").toString());
        return runnable;
    }
}
