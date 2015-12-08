// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFutureTask, MoreExecutors, ListenableFuture

public abstract class ListeningExecutorService
    implements ExecutorService
{

    public ListeningExecutorService()
    {
    }

    public List invokeAll(Collection collection)
        throws InterruptedException
    {
        Object obj;
        if (collection == null)
        {
            throw new NullPointerException();
        }
        obj = new ArrayList(collection.size());
        ListenableFutureTask listenablefuturetask;
        for (collection = collection.iterator(); collection.hasNext(); execute(listenablefuturetask))
        {
            listenablefuturetask = ListenableFutureTask.create((Callable)collection.next());
            ((List) (obj)).add(listenablefuturetask);
        }

        collection = ((List) (obj)).iterator();
_L1:
        Future future;
        boolean flag;
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_164;
        }
        future = (Future)collection.next();
        flag = future.isDone();
        if (!flag)
        {
            try
            {
                future.get();
            }
            catch (CancellationException cancellationexception) { }
            catch (ExecutionException executionexception) { }
            finally
            {
                if (true)
                {
                    for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Future)((Iterator) (obj)).next()).cancel(true)) { }
                }
            }
        }
          goto _L1
        return ((List) (obj));
        throw collection;
    }

    public List invokeAll(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        long l1;
        if (collection == null || timeunit == null)
        {
            throw new NullPointerException();
        }
        l1 = timeunit.toNanos(l);
        timeunit = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); timeunit.add(ListenableFutureTask.create((Callable)collection.next()))) { }
        break MISSING_BLOCK_LABEL_123;
        collection;
          goto _L1
        l = System.nanoTime();
        collection = timeunit.iterator();
_L5:
        if (!collection.hasNext()) goto _L3; else goto _L2
_L2:
        execute((Runnable)collection.next());
        l3 = System.nanoTime();
        l2 = l1 - (l3 - l);
        l = l3;
        l1 = l2;
        if (l2 > 0L) goto _L5; else goto _L4
_L4:
        for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
          goto _L6
_L3:
        collection = timeunit.iterator();
_L9:
        if (!collection.hasNext()) goto _L6; else goto _L7
_L7:
        future = (Future)collection.next();
        flag = future.isDone();
        if (flag) goto _L9; else goto _L8
_L8:
        if (l1 > 0L) goto _L11; else goto _L10
_L10:
        for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
          goto _L6
_L11:
        future.get(l1, TimeUnit.NANOSECONDS);
_L12:
        l2 = System.nanoTime();
        l1 -= l2 - l;
        l = l2;
          goto _L9
        collection;
        for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
_L6:
        return timeunit;
_L1:
        Future future;
        long l2;
        long l3;
        boolean flag;
        if (true)
        {
            for (timeunit = timeunit.iterator(); timeunit.hasNext(); ((Future)timeunit.next()).cancel(true)) { }
        }
        throw collection;
        Object obj;
        obj;
          goto _L12
        obj;
          goto _L12
    }

    public Object invokeAny(Collection collection)
        throws InterruptedException, ExecutionException
    {
        try
        {
            collection = ((Collection) (MoreExecutors.invokeAnyImpl(this, collection, false, 0L)));
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw new AssertionError();
        }
        return collection;
    }

    public Object invokeAny(Collection collection, long l, TimeUnit timeunit)
        throws InterruptedException, ExecutionException, TimeoutException
    {
        return MoreExecutors.invokeAnyImpl(this, collection, true, timeunit.toNanos(l));
    }

    public ListenableFuture submit(Runnable runnable)
    {
        runnable = ListenableFutureTask.create(runnable, null);
        execute(runnable);
        return runnable;
    }

    public ListenableFuture submit(Runnable runnable, Object obj)
    {
        runnable = ListenableFutureTask.create(runnable, obj);
        execute(runnable);
        return runnable;
    }

    public ListenableFuture submit(Callable callable)
    {
        callable = ListenableFutureTask.create(callable);
        execute(callable);
        return callable;
    }

    public volatile Future submit(Runnable runnable)
    {
        return submit(runnable);
    }

    public volatile Future submit(Runnable runnable, Object obj)
    {
        return submit(runnable, obj);
    }

    public volatile Future submit(Callable callable)
    {
        return submit(callable);
    }
}
