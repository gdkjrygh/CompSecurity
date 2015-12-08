// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.util.concurrent:
//            ListeningExecutorService, ListenableFuture

public final class MoreExecutors
{
    static final class SameThreadExecutorService extends ListeningExecutorService
    {

        private final Lock lock;
        private int runningTasks;
        private boolean shutdown;
        private final Condition termination;

        private void endTask()
        {
            lock.lock();
            runningTasks = runningTasks - 1;
            if (isTerminated())
            {
                termination.signalAll();
            }
            lock.unlock();
            return;
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
        }

        private void startTask()
        {
            lock.lock();
            if (isShutdown())
            {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            break MISSING_BLOCK_LABEL_38;
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
            runningTasks = runningTasks + 1;
            lock.unlock();
            return;
        }

        public final boolean awaitTermination(long l, TimeUnit timeunit)
            throws InterruptedException
        {
            l = timeunit.toNanos(l);
            lock.lock();
_L1:
            boolean flag = isTerminated();
            if (flag)
            {
                lock.unlock();
                return true;
            }
            if (l <= 0L)
            {
                lock.unlock();
                return false;
            }
            l = termination.awaitNanos(l);
              goto _L1
            timeunit;
            lock.unlock();
            throw timeunit;
        }

        public final void execute(Runnable runnable)
        {
            startTask();
            runnable.run();
            endTask();
            return;
            runnable;
            endTask();
            throw runnable;
        }

        public final boolean isShutdown()
        {
            lock.lock();
            boolean flag = shutdown;
            lock.unlock();
            return flag;
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
        }

        public final boolean isTerminated()
        {
            lock.lock();
            if (!shutdown) goto _L2; else goto _L1
_L1:
            int i = runningTasks;
            if (i != 0) goto _L2; else goto _L3
_L3:
            boolean flag = true;
_L5:
            lock.unlock();
            return flag;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
        }

        public final void shutdown()
        {
            lock.lock();
            shutdown = true;
            lock.unlock();
            return;
            Exception exception;
            exception;
            lock.unlock();
            throw exception;
        }

        public final List shutdownNow()
        {
            shutdown();
            return Collections.emptyList();
        }

        private SameThreadExecutorService()
        {
            lock = new ReentrantLock();
            termination = lock.newCondition();
            runningTasks = 0;
            shutdown = false;
        }

    }


    static Object invokeAnyImpl(ListeningExecutorService listeningexecutorservice, Collection collection, boolean flag, long l)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        Future future;
        java.util.ArrayList arraylist;
        java.util.concurrent.LinkedBlockingQueue linkedblockingqueue;
        int i;
        int j;
        int k;
        int i1;
        long l1;
        long l2;
        long l3;
        Preconditions.checkNotNull(listeningexecutorservice);
        i = collection.size();
        Future future1;
        Iterator iterator;
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
        if (!flag) goto _L2; else goto _L1
_L1:
        l1 = System.nanoTime();
_L9:
        iterator = collection.iterator();
        arraylist.add(submitAndAddQueueListener(listeningexecutorservice, (Callable)iterator.next(), linkedblockingqueue));
        i1 = i - 1;
        i = 1;
        collection = null;
_L18:
        future1 = (Future)linkedblockingqueue.poll();
        j = i;
        future = future1;
        k = i1;
        l2 = l1;
        l3 = l;
        if (future1 != null) goto _L4; else goto _L3
_L3:
        if (i1 <= 0) goto _L6; else goto _L5
_L5:
        k = i1 - 1;
        arraylist.add(submitAndAddQueueListener(listeningexecutorservice, (Callable)iterator.next(), linkedblockingqueue));
        j = i + 1;
        l3 = l;
        l2 = l1;
        future = future1;
_L4:
        if (future == null) goto _L8; else goto _L7
_L7:
        i = j - 1;
        collection = ((Collection) (future.get()));
        break MISSING_BLOCK_LABEL_197;
_L2:
        l1 = 0L;
          goto _L9
_L6:
        if (i == 0) goto _L11; else goto _L10
_L10:
        if (!flag) goto _L13; else goto _L12
_L12:
        future = (Future)linkedblockingqueue.poll(l, TimeUnit.NANOSECONDS);
        if (future != null) goto _L15; else goto _L14
_L14:
        throw new TimeoutException();
        listeningexecutorservice;
          goto _L16
_L15:
        l2 = System.nanoTime();
        l3 = l - (l2 - l1);
        j = i;
        k = i1;
          goto _L4
_L13:
        future = (Future)linkedblockingqueue.take();
        j = i;
        k = i1;
        l2 = l1;
        l3 = l;
          goto _L4
        collection;
        collection = new ExecutionException(collection);
        break MISSING_BLOCK_LABEL_438;
_L11:
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        listeningexecutorservice = new ExecutionException(null);
_L17:
        throw listeningexecutorservice;
        listeningexecutorservice;
_L16:
        for (collection = arraylist.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
        throw listeningexecutorservice;
        for (listeningexecutorservice = arraylist.iterator(); listeningexecutorservice.hasNext(); ((Future)listeningexecutorservice.next()).cancel(true)) { }
        return collection;
        listeningexecutorservice = collection;
          goto _L17
_L8:
        i = j;
        break MISSING_BLOCK_LABEL_438;
        collection;
        i1 = k;
        l1 = l2;
        l = l3;
          goto _L18
        i1 = k;
        l1 = l2;
        l = l3;
          goto _L18
    }

    public static ListeningExecutorService sameThreadExecutor()
    {
        return new SameThreadExecutorService();
    }

    private static ListenableFuture submitAndAddQueueListener(ListeningExecutorService listeningexecutorservice, Callable callable, BlockingQueue blockingqueue)
    {
        listeningexecutorservice = listeningexecutorservice.submit(callable);
        listeningexecutorservice.addListener(new Runnable(blockingqueue, listeningexecutorservice) {

            final ListenableFuture val$future;
            final BlockingQueue val$queue;

            public final void run()
            {
                queue.add(future);
            }

            
            {
                queue = blockingqueue;
                future = listenablefuture;
                super();
            }
        }, sameThreadExecutor());
        return listeningexecutorservice;
    }
}
