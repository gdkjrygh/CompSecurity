// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.plugins;

import rx.Scheduler;
import rx.functions.Action0;

public class RxJavaSchedulersHook
{

    private static final RxJavaSchedulersHook DEFAULT_INSTANCE = new RxJavaSchedulersHook();

    protected RxJavaSchedulersHook()
    {
    }

    public static RxJavaSchedulersHook getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    public Scheduler getComputationScheduler()
    {
        return null;
    }

    public Scheduler getIOScheduler()
    {
        return null;
    }

    public Scheduler getNewThreadScheduler()
    {
        return null;
    }

    public Action0 onSchedule(Action0 action0)
    {
        return action0;
    }

}
