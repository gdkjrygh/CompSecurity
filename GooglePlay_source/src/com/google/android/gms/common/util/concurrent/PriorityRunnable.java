// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class PriorityRunnable
    implements Runnable
{

    private final int mPriority;
    private final Runnable mRunnable;

    public PriorityRunnable(Runnable runnable, int i)
    {
        mRunnable = runnable;
        mPriority = i;
    }

    public final void run()
    {
        Process.setThreadPriority(mPriority);
        mRunnable.run();
    }
}
