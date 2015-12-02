// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.d.a:
//            u, t, s

abstract class c
    implements u
{

    c()
    {
    }

    private Object a(Collection collection, boolean flag, long l)
    {
        Object obj;
        ArrayList arraylist;
        ExecutorCompletionService executorcompletionservice;
        int i;
        int j;
        int k;
        long l1;
        long l2;
        i = collection.size();
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
        arraylist = new ArrayList(i);
        executorcompletionservice = new ExecutorCompletionService(this);
        obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        l2 = System.nanoTime();
_L7:
        iterator = collection.iterator();
        arraylist.add(executorcompletionservice.submit((Callable)iterator.next()));
        i--;
        j = 1;
        l1 = l;
        l = l2;
        collection = ((Collection) (obj));
_L10:
        obj = executorcompletionservice.poll();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        if (i <= 0) goto _L4; else goto _L3
_L3:
        arraylist.add(executorcompletionservice.submit((Callable)iterator.next()));
        k = j + 1;
        j = i - 1;
        i = k;
_L9:
        k = i;
        if (obj == null) goto _L6; else goto _L5
_L5:
        k = i - 1;
        collection = ((Collection) (((Future) (obj)).get()));
        break MISSING_BLOCK_LABEL_182;
_L2:
        l2 = 0L;
          goto _L7
_L4:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj = collection;
        if (collection != null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        obj = new ExecutionException(null);
        throw obj;
        collection;
          goto _L8
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        obj = executorcompletionservice.poll(l1, TimeUnit.NANOSECONDS);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        throw new TimeoutException();
        l3 = System.nanoTime();
        l1 -= l3 - l;
        k = i;
        l = l3;
        i = j;
        j = k;
          goto _L9
        obj = executorcompletionservice.take();
        k = i;
        i = j;
        j = k;
          goto _L9
        collection;
        collection = new ExecutionException(collection);
_L6:
        i = j;
        j = k;
          goto _L10
_L8:
        long l3;
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((Future)((Iterator) (obj)).next()).cancel(true)) { }
        throw collection;
        collection;
          goto _L6
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); ((Future)((Iterator) (obj)).next()).cancel(true)) { }
        return collection;
        int i1 = i;
        i = j;
        j = i1;
          goto _L9
    }

    public s a(Runnable runnable, Object obj)
    {
        runnable = t.a(runnable, obj);
        execute(runnable);
        return runnable;
    }

    public s b(Runnable runnable)
    {
        runnable = t.a(runnable, null);
        execute(runnable);
        return runnable;
    }

    public s c(Callable callable)
    {
        callable = t.a(callable);
        execute(callable);
        return callable;
    }

    public List invokeAll(Collection collection)
    {
        Object obj;
        if (collection == null)
        {
            throw new NullPointerException();
        }
        obj = new ArrayList(collection.size());
        t t1;
        for (collection = collection.iterator(); collection.hasNext(); execute(t1))
        {
            t1 = t.a((Callable)collection.next());
            ((List) (obj)).add(t1);
        }

        collection = ((List) (obj)).iterator();
_L1:
        Future future;
        boolean flag;
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_166;
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
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((Future)((Iterator) (obj)).next()).cancel(true)) { }
            }
        }
          goto _L1
        throw collection;
        return ((List) (obj));
    }

    public List invokeAll(Collection collection, long l, TimeUnit timeunit)
    {
        if (collection == null || timeunit == null)
        {
            throw new NullPointerException();
        }
        l = timeunit.toNanos(l);
        timeunit = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); timeunit.add(t.a((Callable)collection.next()))) { }
        break MISSING_BLOCK_LABEL_118;
        collection;
          goto _L1
        long l1;
        l1 = System.nanoTime();
        collection = timeunit.iterator();
_L2:
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_221;
        }
        execute((Runnable)(Runnable)collection.next());
        l2 = System.nanoTime();
        l -= l2 - l1;
        if (l <= 0L)
        {
            for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
            return timeunit;
        }
        l1 = l2;
          goto _L2
        collection = timeunit.iterator();
_L5:
        if (!collection.hasNext()) goto _L4; else goto _L3
_L3:
        future = (Future)collection.next();
        flag = future.isDone();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        if (l <= 0L)
        {
            for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
            return timeunit;
        }
        try
        {
            future.get(l, TimeUnit.NANOSECONDS);
        }
        catch (CancellationException cancellationexception) { }
        catch (ExecutionException executionexception) { }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            for (collection = timeunit.iterator(); collection.hasNext(); ((Future)collection.next()).cancel(true)) { }
            return timeunit;
        }
        l2 = System.nanoTime();
        l1 = l - (l2 - l1);
        l = l2;
_L6:
        long l3 = l1;
        l1 = l;
        l = l3;
          goto _L5
_L4:
        return timeunit;
_L1:
        Future future;
        long l2;
        boolean flag;
        for (timeunit = timeunit.iterator(); timeunit.hasNext(); ((Future)timeunit.next()).cancel(true)) { }
        throw collection;
        long l4 = l;
        l = l1;
        l1 = l4;
          goto _L6
    }

    public Object invokeAny(Collection collection)
    {
        try
        {
            collection = ((Collection) (a(collection, false, 0L)));
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            throw new AssertionError();
        }
        return collection;
    }

    public Object invokeAny(Collection collection, long l, TimeUnit timeunit)
    {
        return a(collection, true, timeunit.toNanos(l));
    }

    public Future submit(Runnable runnable)
    {
        return b(runnable);
    }

    public Future submit(Runnable runnable, Object obj)
    {
        return a(runnable, obj);
    }

    public Future submit(Callable callable)
    {
        return c(callable);
    }
}
