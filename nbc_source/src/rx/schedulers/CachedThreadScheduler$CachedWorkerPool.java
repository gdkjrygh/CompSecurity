// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package rx.schedulers:
//            CachedThreadScheduler

private static final class keepAliveTime
{

    private static <init> INSTANCE;
    private final ScheduledExecutorService evictExpiredWorkerExecutor = Executors.newScheduledThreadPool(1, CachedThreadScheduler.access$000());
    private final ConcurrentLinkedQueue expiringWorkerQueue = new ConcurrentLinkedQueue();
    private final long keepAliveTime;

    void evictExpiredWorkers()
    {
        if (!expiringWorkerQueue.isEmpty())
        {
            long l = now();
            Iterator iterator = expiringWorkerQueue.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                keepAliveTime keepalivetime = (expiringWorkerQueue)iterator.next();
                if (keepalivetime.xpirationTime() > l)
                {
                    break;
                }
                if (expiringWorkerQueue.remove(keepalivetime))
                {
                    keepalivetime.bscribe();
                }
            } while (true);
        }
    }

    bscribe get()
    {
        while (!expiringWorkerQueue.isEmpty()) 
        {
            bscribe bscribe = (expiringWorkerQueue)expiringWorkerQueue.poll();
            if (bscribe != null)
            {
                return bscribe;
            }
        }
        return new t>(CachedThreadScheduler.access$100());
    }

    long now()
    {
        return System.nanoTime();
    }

    void release(t> t>)
    {
        t>.xpirationTime(now() + keepAliveTime);
        expiringWorkerQueue.offer(t>);
    }

    static 
    {
        INSTANCE = new <init>(60L, TimeUnit.SECONDS);
    }


    _cls1.this._cls0(long l, TimeUnit timeunit)
    {
        keepAliveTime = timeunit.toNanos(l);
        evictExpiredWorkerExecutor.scheduleWithFixedDelay(new Runnable() {

            final CachedThreadScheduler.CachedWorkerPool this$0;

            public void run()
            {
                evictExpiredWorkers();
            }

            
            {
                this$0 = CachedThreadScheduler.CachedWorkerPool.this;
                super();
            }
        }, keepAliveTime, keepAliveTime, TimeUnit.NANOSECONDS);
    }
}
