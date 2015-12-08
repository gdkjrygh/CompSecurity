// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

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

// Referenced classes of package com.google.android.m4b.maps.aj:
//            g, i, f

public abstract class h
    implements ExecutorService
{

    public h()
    {
    }

    public final f a(Callable callable)
    {
        callable = g.a(callable);
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
        g g1;
        for (collection = collection.iterator(); collection.hasNext(); execute(g1))
        {
            g1 = g.a((Callable)collection.next());
            ((List) (obj)).add(g1);
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
        for (collection = collection.iterator(); collection.hasNext(); timeunit.add(g.a((Callable)collection.next()))) { }
        break MISSING_BLOCK_LABEL_118;
        collection;
          goto _L1
        long l1;
        l1 = System.nanoTime();
        collection = timeunit.iterator();
_L2:
        if (!collection.hasNext())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        execute((Runnable)collection.next());
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
            break MISSING_BLOCK_LABEL_402;
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
            collection = ((Collection) (i.a(this, collection, false, 0L)));
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
        return i.a(this, collection, true, timeunit.toNanos(l));
    }

    public Future submit(Runnable runnable)
    {
        runnable = g.a(runnable, null);
        execute(runnable);
        return runnable;
    }

    public Future submit(Runnable runnable, Object obj)
    {
        runnable = g.a(runnable, obj);
        execute(runnable);
        return runnable;
    }

    public Future submit(Callable callable)
    {
        return a(callable);
    }
}
