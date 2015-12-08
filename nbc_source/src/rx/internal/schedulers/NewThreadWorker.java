// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.schedulers;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;
import rx.plugins.RxJavaSchedulersHook;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

// Referenced classes of package rx.internal.schedulers:
//            ScheduledAction

public class NewThreadWorker extends rx.Scheduler.Worker
    implements Subscription
{

    private static final ConcurrentHashMap EXECUTORS = new ConcurrentHashMap();
    private static final String FREQUENCY_KEY = "rx.scheduler.jdk6.purge-frequency-millis";
    private static final AtomicReference PURGE = new AtomicReference();
    private static final boolean PURGE_FORCE = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
    private static final String PURGE_FORCE_KEY = "rx.scheduler.jdk6.purge-force";
    public static final int PURGE_FREQUENCY = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final String PURGE_THREAD_PREFIX = "RxSchedulerPurge-";
    private final ScheduledExecutorService executor;
    volatile boolean isUnsubscribed;
    private final RxJavaSchedulersHook schedulersHook = RxJavaPlugins.getInstance().getSchedulersHook();

    public NewThreadWorker(ThreadFactory threadfactory)
    {
        threadfactory = Executors.newScheduledThreadPool(1, threadfactory);
        if (!tryEnableCancelPolicy(threadfactory) && (threadfactory instanceof ScheduledThreadPoolExecutor))
        {
            registerExecutor((ScheduledThreadPoolExecutor)threadfactory);
        }
        executor = threadfactory;
    }

    public static void deregisterExecutor(ScheduledExecutorService scheduledexecutorservice)
    {
        EXECUTORS.remove(scheduledexecutorservice);
    }

    static void purgeExecutors()
    {
_L1:
        Object obj;
label0:
        {
            try
            {
                ScheduledThreadPoolExecutor scheduledthreadpoolexecutor;
                for (obj = EXECUTORS.keySet().iterator(); ((Iterator) (obj)).hasNext(); scheduledthreadpoolexecutor.purge())
                {
                    scheduledthreadpoolexecutor = (ScheduledThreadPoolExecutor)((Iterator) (obj)).next();
                    if (scheduledthreadpoolexecutor.isShutdown())
                    {
                        break label0;
                    }
                }

            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Exceptions.throwIfFatal(((Throwable) (obj)));
                RxJavaPlugins.getInstance().getErrorHandler().handleError(((Throwable) (obj)));
            }
            return;
        }
        ((Iterator) (obj)).remove();
          goto _L1
    }

    public static void registerExecutor(ScheduledThreadPoolExecutor scheduledthreadpoolexecutor)
    {
_L2:
        if ((ScheduledExecutorService)PURGE.get() == null)
        {
            ScheduledExecutorService scheduledexecutorservice = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (!PURGE.compareAndSet(null, scheduledexecutorservice))
            {
                continue; /* Loop/switch isn't completed */
            }
            scheduledexecutorservice.scheduleAtFixedRate(new Runnable() {

                public void run()
                {
                    NewThreadWorker.purgeExecutors();
                }

            }, PURGE_FREQUENCY, PURGE_FREQUENCY, TimeUnit.MILLISECONDS);
        }
        EXECUTORS.putIfAbsent(scheduledthreadpoolexecutor, scheduledthreadpoolexecutor);
        return;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean tryEnableCancelPolicy(ScheduledExecutorService scheduledexecutorservice)
    {
        Method amethod[];
        int i;
        int j;
        if (PURGE_FORCE)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        amethod = scheduledexecutorservice.getClass().getMethods();
        j = amethod.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Method method;
        method = amethod[i];
        if (!method.getName().equals("setRemoveOnCancelPolicy") || method.getParameterTypes().length != 1 || method.getParameterTypes()[0] != Boolean.TYPE)
        {
            continue; /* Loop/switch isn't completed */
        }
        method.invoke(scheduledexecutorservice, new Object[] {
            Boolean.valueOf(true)
        });
        return true;
        Exception exception;
        exception;
        RxJavaPlugins.getInstance().getErrorHandler().handleError(exception);
        i++;
          goto _L3
_L2:
        return false;
    }

    public boolean isUnsubscribed()
    {
        return isUnsubscribed;
    }

    public Subscription schedule(Action0 action0)
    {
        return schedule(action0, 0L, null);
    }

    public Subscription schedule(Action0 action0, long l, TimeUnit timeunit)
    {
        if (isUnsubscribed)
        {
            return Subscriptions.unsubscribed();
        } else
        {
            return scheduleActual(action0, l, timeunit);
        }
    }

    public ScheduledAction scheduleActual(Action0 action0, long l, TimeUnit timeunit)
    {
        ScheduledAction scheduledaction = new ScheduledAction(schedulersHook.onSchedule(action0));
        if (l <= 0L)
        {
            action0 = executor.submit(scheduledaction);
        } else
        {
            action0 = executor.schedule(scheduledaction, l, timeunit);
        }
        scheduledaction.add(action0);
        return scheduledaction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long l, TimeUnit timeunit, SubscriptionList subscriptionlist)
    {
        ScheduledAction scheduledaction = new ScheduledAction(schedulersHook.onSchedule(action0), subscriptionlist);
        subscriptionlist.add(scheduledaction);
        if (l <= 0L)
        {
            action0 = executor.submit(scheduledaction);
        } else
        {
            action0 = executor.schedule(scheduledaction, l, timeunit);
        }
        scheduledaction.add(action0);
        return scheduledaction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long l, TimeUnit timeunit, CompositeSubscription compositesubscription)
    {
        ScheduledAction scheduledaction = new ScheduledAction(schedulersHook.onSchedule(action0), compositesubscription);
        compositesubscription.add(scheduledaction);
        if (l <= 0L)
        {
            action0 = executor.submit(scheduledaction);
        } else
        {
            action0 = executor.schedule(scheduledaction, l, timeunit);
        }
        scheduledaction.add(action0);
        return scheduledaction;
    }

    public void unsubscribe()
    {
        isUnsubscribed = true;
        executor.shutdownNow();
        deregisterExecutor(executor);
    }

}
