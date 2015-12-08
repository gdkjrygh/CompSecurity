// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.functions.Action0;
import rx.internal.util.unsafe.MpmcArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.schedulers.Schedulers;

public abstract class ObjectPool
{

    private final int maxSize;
    private Queue pool;
    private rx.Scheduler.Worker schedulerWorker;

    public ObjectPool()
    {
        this(0, 0, 67L);
    }

    private ObjectPool(final int min, final int max, long l)
    {
        maxSize = max;
        initialize(min);
        schedulerWorker = Schedulers.computation().createWorker();
        schedulerWorker.schedulePeriodically(new Action0() {

            final ObjectPool this$0;
            final int val$max;
            final int val$min;

            public void call()
            {
                int k = 0;
                int i = 0;
                int i1 = pool.size();
                if (i1 < min)
                {
                    for (k = max; i < k - i1; i++)
                    {
                        pool.add(createObject());
                    }

                } else
                if (i1 > max)
                {
                    int j1 = max;
                    for (int j = k; j < i1 - j1; j++)
                    {
                        pool.poll();
                    }

                }
            }

            
            {
                this$0 = ObjectPool.this;
                min = i;
                max = j;
                super();
            }
        }, l, l, TimeUnit.SECONDS);
    }

    private void initialize(int i)
    {
        int j;
        if (UnsafeAccess.isUnsafeAvailable())
        {
            pool = new MpmcArrayQueue(Math.max(maxSize, 1024));
        } else
        {
            pool = new ConcurrentLinkedQueue();
        }
        for (j = 0; j < i; j++)
        {
            pool.add(createObject());
        }

    }

    public Object borrowObject()
    {
        Object obj1 = pool.poll();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = createObject();
        }
        return obj;
    }

    protected abstract Object createObject();

    public void returnObject(Object obj)
    {
        if (obj == null)
        {
            return;
        } else
        {
            pool.offer(obj);
            return;
        }
    }

    public void shutdown()
    {
        schedulerWorker.unsubscribe();
    }

}
