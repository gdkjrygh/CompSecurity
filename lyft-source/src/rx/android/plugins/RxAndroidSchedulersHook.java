// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.android.plugins;

import rx.Scheduler;
import rx.functions.Action0;

public class RxAndroidSchedulersHook
{

    private static final RxAndroidSchedulersHook DEFAULT_INSTANCE = new RxAndroidSchedulersHook();

    public RxAndroidSchedulersHook()
    {
    }

    public static RxAndroidSchedulersHook getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    public Scheduler getMainThreadScheduler()
    {
        return null;
    }

    public Action0 onSchedule(Action0 action0)
    {
        return action0;
    }

}
