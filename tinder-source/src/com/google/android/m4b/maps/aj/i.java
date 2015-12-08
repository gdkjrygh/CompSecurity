// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            h, f

public final class i
{
    static final class a extends h
    {

        private final Lock a;
        private final Condition b;
        private int c;
        private boolean d;

        private void a()
        {
            a.lock();
            c = c - 1;
            if (isTerminated())
            {
                b.signalAll();
            }
            a.unlock();
            return;
            Exception exception;
            exception;
            a.unlock();
            throw exception;
        }

        public final boolean awaitTermination(long l, TimeUnit timeunit)
        {
            l = timeunit.toNanos(l);
            a.lock();
_L1:
            boolean flag = isTerminated();
            if (flag)
            {
                a.unlock();
                return true;
            }
            if (l <= 0L)
            {
                a.unlock();
                return false;
            }
            l = b.awaitNanos(l);
              goto _L1
            timeunit;
            a.unlock();
            throw timeunit;
        }

        public final void execute(Runnable runnable)
        {
            a.lock();
            if (isShutdown())
            {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            break MISSING_BLOCK_LABEL_38;
            runnable;
            a.unlock();
            throw runnable;
            c = c + 1;
            a.unlock();
            runnable.run();
            a();
            return;
            runnable;
            a();
            throw runnable;
        }

        public final boolean isShutdown()
        {
            a.lock();
            boolean flag = d;
            a.unlock();
            return flag;
            Exception exception;
            exception;
            a.unlock();
            throw exception;
        }

        public final boolean isTerminated()
        {
            a.lock();
            if (!d) goto _L2; else goto _L1
_L1:
            int k = c;
            if (k != 0) goto _L2; else goto _L3
_L3:
            boolean flag = true;
_L5:
            a.unlock();
            return flag;
_L2:
            flag = false;
            if (true) goto _L5; else goto _L4
_L4:
            Exception exception;
            exception;
            a.unlock();
            throw exception;
        }

        public final void shutdown()
        {
            a.lock();
            d = true;
            a.unlock();
            return;
            Exception exception;
            exception;
            a.unlock();
            throw exception;
        }

        public final List shutdownNow()
        {
            shutdown();
            return Collections.emptyList();
        }

        private a()
        {
            a = new ReentrantLock();
            b = a.newCondition();
            c = 0;
            d = false;
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static com.google.android.m4b.maps.aj.f a(h h1, Callable callable, BlockingQueue blockingqueue)
    {
        h1 = h1.a(callable);
        h1.a(new Runnable(blockingqueue, h1) {

            private BlockingQueue a;
            private com.google.android.m4b.maps.aj.f b;

            public final void run()
            {
                a.add(b);
            }

            
            {
                a = blockingqueue;
                b = f1;
                super();
            }
        }, a());
        return h1;
    }

    public static h a()
    {
        return new a((byte)0);
    }

    static Object a(h h1, Collection collection, boolean flag, long l)
    {
        Future future;
        java.util.ArrayList arraylist;
        LinkedBlockingQueue linkedblockingqueue;
        int k;
        int i1;
        long l2;
        j.a(h1);
        k = collection.size();
        Iterator iterator;
        int j1;
        boolean flag1;
        if (k > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j.a(flag1);
        arraylist = f.b(k);
        linkedblockingqueue = new LinkedBlockingQueue();
        future = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        l2 = System.nanoTime();
_L7:
        iterator = collection.iterator();
        arraylist.add(a(h1, (Callable)iterator.next(), ((BlockingQueue) (linkedblockingqueue))));
        i1 = k - 1;
        k = 1;
        collection = future;
_L9:
        future = (Future)linkedblockingqueue.poll();
        if (future != null) goto _L4; else goto _L3
_L3:
        if (i1 <= 0) goto _L6; else goto _L5
_L5:
        arraylist.add(a(h1, (Callable)iterator.next(), ((BlockingQueue) (linkedblockingqueue))));
        i1--;
        j1 = k + 1;
        k = i1;
        i1 = j1;
_L8:
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_433;
        }
        i1--;
        collection = ((Collection) (future.get()));
        break MISSING_BLOCK_LABEL_183;
_L2:
        l2 = 0L;
          goto _L7
_L6:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        future = (Future)linkedblockingqueue.poll(l, TimeUnit.NANOSECONDS);
        if (future != null)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        throw new TimeoutException();
        h1;
        for (collection = arraylist.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
        break MISSING_BLOCK_LABEL_395;
        l3 = System.nanoTime();
        int k1 = i1;
        l -= l3 - l2;
        l2 = l3;
        i1 = k;
        k = k1;
          goto _L8
        future = (Future)linkedblockingqueue.take();
        int l1 = i1;
        i1 = k;
        k = l1;
          goto _L8
        collection;
        collection = new ExecutionException(collection);
        break MISSING_BLOCK_LABEL_433;
        h1 = collection;
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_393;
        }
        h1 = new ExecutionException(null);
        throw h1;
        throw h1;
        long l3;
        for (h1 = arraylist.iterator(); h1.hasNext(); ((Future)h1.next()).cancel(true)) { }
        return collection;
_L4:
        int i2 = i1;
        i1 = k;
        k = i2;
          goto _L8
        collection;
        int j2 = i1;
        i1 = k;
        k = j2;
          goto _L9
        int k2 = i1;
        i1 = k;
        k = k2;
          goto _L9
    }
}
