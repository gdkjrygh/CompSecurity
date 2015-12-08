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
import rx.internal.util.PlatformDependent;
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
    private static final String PURGE_FORCE_KEY = "rx.scheduler.jdk6.purge-force";
    public static final int PURGE_FREQUENCY = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    private static final String PURGE_THREAD_PREFIX = "RxSchedulerPurge-";
    private static final Object SET_REMOVE_ON_CANCEL_POLICY_METHOD_NOT_SUPPORTED = new Object();
    private static final boolean SHOULD_TRY_ENABLE_CANCEL_POLICY;
    private static volatile Object cachedSetRemoveOnCancelPolicyMethod;
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

    static Method findSetRemoveOnCancelPolicyMethod(ScheduledExecutorService scheduledexecutorservice)
    {
        scheduledexecutorservice = scheduledexecutorservice.getClass().getMethods();
        int j = scheduledexecutorservice.length;
        for (int i = 0; i < j; i++)
        {
            Method method = scheduledexecutorservice[i];
            if (!method.getName().equals("setRemoveOnCancelPolicy"))
            {
                continue;
            }
            Class aclass[] = method.getParameterTypes();
            if (aclass.length == 1 && aclass[0] == Boolean.TYPE)
            {
                return method;
            }
        }

        return null;
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
        if (!SHOULD_TRY_ENABLE_CANCEL_POLICY)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Object obj;
        if (scheduledexecutorservice instanceof ScheduledThreadPoolExecutor)
        {
            obj = cachedSetRemoveOnCancelPolicyMethod;
            if (obj == SET_REMOVE_ON_CANCEL_POLICY_METHOD_NOT_SUPPORTED)
            {
                return false;
            }
            if (obj == null)
            {
                obj = findSetRemoveOnCancelPolicyMethod(scheduledexecutorservice);
                Object obj1;
                if (obj != null)
                {
                    obj1 = obj;
                } else
                {
                    obj1 = SET_REMOVE_ON_CANCEL_POLICY_METHOD_NOT_SUPPORTED;
                }
                cachedSetRemoveOnCancelPolicyMethod = obj1;
            } else
            {
                obj = (Method)obj;
            }
        } else
        {
            obj = findSetRemoveOnCancelPolicyMethod(scheduledexecutorservice);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        ((Method) (obj)).invoke(scheduledexecutorservice, new Object[] {
            Boolean.valueOf(true)
        });
        return true;
        scheduledexecutorservice;
        RxJavaPlugins.getInstance().getErrorHandler().handleError(scheduledexecutorservice);
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

    static 
    {
        boolean flag = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int i = PlatformDependent.getAndroidApiVersion();
        if (!flag && (i == 0 || i >= 21))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SHOULD_TRY_ENABLE_CANCEL_POLICY = flag;
    }
}
