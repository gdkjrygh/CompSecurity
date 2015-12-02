// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.app.Activity;
import android.util.Log;
import de.greenrobot.event.EventBus;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package de.greenrobot.event.util:
//            ThrowableFailureEvent, HasExecutionScope

public class AsyncExecutor
{
    public static class Builder
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

        public Builder eventBus(EventBus eventbus)
        {
            eventBus = eventbus;
            return this;
        }

        public Builder failureEventType(Class class1)
        {
            failureEventType = class1;
            return this;
        }

        public Builder threadPool(Executor executor)
        {
            threadPool = executor;
            return this;
        }

        private Builder()
        {
        }

        Builder(Builder builder1)
        {
            this();
        }
    }

    public static interface RunnableEx
    {

        public abstract void run()
            throws Exception;
    }


    private final EventBus eventBus;
    private final Constructor failureEventConstructor;
    private final Object scope;
    private final Executor threadPool;

    private AsyncExecutor(Executor executor, EventBus eventbus, Class class1, Object obj)
    {
        threadPool = executor;
        eventBus = eventbus;
        scope = obj;
        try
        {
            failureEventConstructor = class1.getConstructor(new Class[] {
                java/lang/Throwable
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Executor executor)
        {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", executor);
        }
    }

    AsyncExecutor(Executor executor, EventBus eventbus, Class class1, Object obj, AsyncExecutor asyncexecutor)
    {
        this(executor, eventbus, class1, obj);
    }

    public static Builder builder()
    {
        return new Builder(null);
    }

    public static AsyncExecutor create()
    {
        return (new Builder(null)).build();
    }

    public void execute(final RunnableEx runnable)
    {
        threadPool.execute(new Runnable() {

            final AsyncExecutor this$0;
            private final RunnableEx val$runnable;

            public void run()
            {
                Object obj;
                try
                {
                    runnable.run();
                    return;
                }
                catch (Exception exception)
                {
                    try
                    {
                        obj = failureEventConstructor.newInstance(new Object[] {
                            exception
                        });
                    }
                    catch (Exception exception1)
                    {
                        Log.e(EventBus.TAG, "Original exception:", exception);
                        throw new RuntimeException("Could not create failure event", exception1);
                    }
                }
                if (obj instanceof HasExecutionScope)
                {
                    ((HasExecutionScope)obj).setExecutionScope(scope);
                }
                eventBus.post(obj);
            }

            
            {
                this$0 = AsyncExecutor.this;
                runnable = runnableex;
                super();
            }
        });
    }



}
