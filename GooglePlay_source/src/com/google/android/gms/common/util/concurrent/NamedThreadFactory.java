// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.common.util.concurrent:
//            PriorityRunnable

public final class NamedThreadFactory
    implements ThreadFactory
{

    private final ThreadFactory defaultFactory;
    private final String mName;
    private final int mPriority;

    public NamedThreadFactory(String s)
    {
        this(s, (byte)0);
    }

    private NamedThreadFactory(String s, byte byte0)
    {
        defaultFactory = Executors.defaultThreadFactory();
        mName = (String)Preconditions.checkNotNull(s, "Name must not be null");
        mPriority = 0;
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = defaultFactory.newThread(new PriorityRunnable(runnable, 0));
        runnable.setName(mName);
        return runnable;
    }
}
