// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import de.greenrobot.event.EventBus;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package de.greenrobot.event.util:
//            AsyncExecutor, ThrowableFailureEvent

public static class <init>
{

    private EventBus eventBus;
    private Class failureEventType;
    private Executor threadPool;

    public AsyncExecutor build()
    {
        return buildForScope(null);
    }

    public AsyncExecutor buildForActivityScope(Activity activity)
    {
        return buildForScope(activity.getClass());
    }

    public AsyncExecutor buildForScope(Object obj)
    {
        if (eventBus == null)
        {
            eventBus = EventBus.getDefault();
        }
        if (threadPool == null)
        {
            threadPool = Executors.newCachedThreadPool();
        }
        if (failureEventType == null)
        {
            failureEventType = de/greenrobot/event/util/ThrowableFailureEvent;
        }
        return new AsyncExecutor(threadPool, eventBus, failureEventType, obj, null);
    }

    public failureEventType eventBus(EventBus eventbus)
    {
        eventBus = eventbus;
        return this;
    }

    public eventBus failureEventType(Class class1)
    {
        failureEventType = class1;
        return this;
    }

    public failureEventType threadPool(Executor executor)
    {
        threadPool = executor;
        return this;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
