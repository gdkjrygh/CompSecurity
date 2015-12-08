// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.util.concurrent:
//            ListeningExecutorService, ListeningScheduledExecutorService, ListenableFuture, ThreadFactoryBuilder

public final class MoreExecutors
{

    private MoreExecutors()
    {
    }

    public static void addDelayedShutdownHook(ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        (new Application()).addDelayedShutdownHook(executorservice, l, timeunit);
    }

    public static Executor directExecutor()
    {
        return DirectExecutor.INSTANCE;
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadpoolexecutor)
    {
        return (new Application()).getExitingExecutorService(threadpoolexecutor);
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadpoolexecutor, long l, TimeUnit timeunit)
    {
        return (new Application()).getExitingExecutorService(threadpoolexecutor, l, timeunit);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledthreadpoolexecutor)
    {
        return (new Application()).getExitingScheduledExecutorService(scheduledthreadpoolexecutor);
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledthreadpoolexecutor, long l, TimeUnit timeunit)
    {
        return (new Application()).getExitingScheduledExecutorService(scheduledthreadpoolexecutor, l, timeunit);
    }

    static Object invokeAnyImpl(ListeningExecutorService listeningexecutorservice, Collection collection, boolean flag, long l)
    {
        Future future;
        java.util.ArrayList arraylist;
        java.util.concurrent.LinkedBlockingQueue linkedblockingqueue;
        int i;
        int j;
        long l2;
        Preconditions.checkNotNull(listeningexecutorservice);
        i = collection.size();
        Iterator iterator;
        int k;
        boolean flag1;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        arraylist = Lists.newArrayListWithCapacity(i);
        linkedblockingqueue = Queues.newLinkedBlockingQueue();
        future = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        l2 = System.nanoTime();
_L7:
        iterator = collection.iterator();
        arraylist.add(submitAndAddQueueListener(listeningexecutorservice, (Callable)iterator.next(), linkedblockingqueue));
        j = i - 1;
        i = 1;
        collection = future;
_L9:
        future = (Future)linkedblockingqueue.poll();
        if (future != null) goto _L4; else goto _L3
_L3:
        if (j <= 0) goto _L6; else goto _L5
_L5:
        arraylist.add(submitAndAddQueueListener(listeningexecutorservice, (Callable)iterator.next(), linkedblockingqueue));
        j--;
        k = i + 1;
        i = j;
        j = k;
_L8:
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_429;
        }
        j--;
        collection = ((Collection) (future.get()));
        break MISSING_BLOCK_LABEL_179;
_L2:
        l2 = 0L;
          goto _L7
_L6:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        future = (Future)linkedblockingqueue.poll(l, TimeUnit.NANOSECONDS);
        if (future != null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        throw new TimeoutException();
        listeningexecutorservice;
        for (collection = arraylist.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
        break MISSING_BLOCK_LABEL_391;
        l3 = System.nanoTime();
        int i1 = j;
        l -= l3 - l2;
        l2 = l3;
        j = i;
        i = i1;
          goto _L8
        future = (Future)linkedblockingqueue.take();
        int j1 = j;
        j = i;
        i = j1;
          goto _L8
        collection;
        collection = new ExecutionException(collection);
        break MISSING_BLOCK_LABEL_429;
        listeningexecutorservice = collection;
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        listeningexecutorservice = new ExecutionException(null);
        throw listeningexecutorservice;
        throw listeningexecutorservice;
        long l3;
        for (listeningexecutorservice = arraylist.iterator(); listeningexecutorservice.hasNext(); ((Future)listeningexecutorservice.next()).cancel(true)) { }
        return collection;
_L4:
        int k1 = j;
        j = i;
        i = k1;
          goto _L8
        collection;
        int l1 = j;
        j = i;
        i = l1;
          goto _L9
        int i2 = j;
        j = i;
        i = i2;
          goto _L9
    }

    private static boolean isAppEngine()
    {
        if (System.getProperty("com.google.appengine.runtime.environment") != null)
        {
            Object obj;
            try
            {
                obj = Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]);
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                return false;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                return false;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                return false;
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                return false;
            }
            if (obj != null)
            {
                return true;
            }
        }
        return false;
    }

    public static ListeningExecutorService listeningDecorator(ExecutorService executorservice)
    {
        if (executorservice instanceof ListeningExecutorService)
        {
            return (ListeningExecutorService)executorservice;
        }
        if (executorservice instanceof ScheduledExecutorService)
        {
            return new ScheduledListeningDecorator((ScheduledExecutorService)executorservice);
        } else
        {
            return new ListeningDecorator(executorservice);
        }
    }

    public static ListeningScheduledExecutorService listeningDecorator(ScheduledExecutorService scheduledexecutorservice)
    {
        if (scheduledexecutorservice instanceof ListeningScheduledExecutorService)
        {
            return (ListeningScheduledExecutorService)scheduledexecutorservice;
        } else
        {
            return new ScheduledListeningDecorator(scheduledexecutorservice);
        }
    }

    public static ListeningExecutorService newDirectExecutorService()
    {
        return new DirectExecutorService(null);
    }

    static Thread newThread(String s, Runnable runnable)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(runnable);
        runnable = platformThreadFactory().newThread(runnable);
        try
        {
            runnable.setName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return runnable;
        }
        return runnable;
    }

    public static ThreadFactory platformThreadFactory()
    {
        if (!isAppEngine())
        {
            return Executors.defaultThreadFactory();
        }
        ThreadFactory threadfactory;
        try
        {
            threadfactory = (ThreadFactory)Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", illegalaccessexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", classnotfoundexception);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", nosuchmethodexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw Throwables.propagate(invocationtargetexception.getCause());
        }
        return threadfactory;
    }

    static Executor renamingDecorator(Executor executor, Supplier supplier)
    {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        if (isAppEngine())
        {
            return executor;
        } else
        {
            return new _cls2(executor, supplier);
        }
    }

    static ExecutorService renamingDecorator(ExecutorService executorservice, Supplier supplier)
    {
        Preconditions.checkNotNull(executorservice);
        Preconditions.checkNotNull(supplier);
        if (isAppEngine())
        {
            return executorservice;
        } else
        {
            return new _cls3(executorservice, supplier);
        }
    }

    static ScheduledExecutorService renamingDecorator(ScheduledExecutorService scheduledexecutorservice, Supplier supplier)
    {
        Preconditions.checkNotNull(scheduledexecutorservice);
        Preconditions.checkNotNull(supplier);
        if (isAppEngine())
        {
            return scheduledexecutorservice;
        } else
        {
            return new _cls4(scheduledexecutorservice, supplier);
        }
    }

    public static ListeningExecutorService sameThreadExecutor()
    {
        return new DirectExecutorService(null);
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService executorservice, long l, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeunit);
        executorservice.shutdown();
        try
        {
            l = TimeUnit.NANOSECONDS.convert(l, timeunit) / 2L;
            if (!executorservice.awaitTermination(l, TimeUnit.NANOSECONDS))
            {
                executorservice.shutdownNow();
                executorservice.awaitTermination(l, TimeUnit.NANOSECONDS);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            Thread.currentThread().interrupt();
            executorservice.shutdownNow();
        }
        return executorservice.isTerminated();
    }

    private static ListenableFuture submitAndAddQueueListener(ListeningExecutorService listeningexecutorservice, Callable callable, BlockingQueue blockingqueue)
    {
        listeningexecutorservice = listeningexecutorservice.submit(callable);
        listeningexecutorservice.addListener(new _cls1(blockingqueue, listeningexecutorservice), directExecutor());
        return listeningexecutorservice;
    }

    private static void useDaemonThreadFactory(ThreadPoolExecutor threadpoolexecutor)
    {
        threadpoolexecutor.setThreadFactory((new ThreadFactoryBuilder()).setDaemon(true).setThreadFactory(threadpoolexecutor.getThreadFactory()).build());
    }


    /* member class not found */
    class Application {}


    /* member class not found */
    class DirectExecutor {}


    /* member class not found */
    class ScheduledListeningDecorator {}


    /* member class not found */
    class ListeningDecorator {}


    /* member class not found */
    class DirectExecutorService {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}

}
