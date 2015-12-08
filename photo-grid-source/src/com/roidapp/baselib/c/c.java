// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.baselib.c:
//            d, n, j, i, 
//            l, e, f, h, 
//            g, m

public abstract class c
{

    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    public static final Executor DUAL_THREAD_EXECUTOR;
    public static final Executor EXECUTOR_SHAPE;
    private static final int KEEP_ALIVE = 1;
    private static final String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final Executor SERIAL_EXECUTOR;
    public static final Executor SINGLE_EXECUTOR;
    public static final Executor THREAD_POOL_EXECUTOR;
    private static volatile Executor sDefaultExecutor;
    private static final i sHandler = new i((byte)0);
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final AtomicBoolean mCancelled = new AtomicBoolean();
    private final FutureTask mFuture;
    private volatile int mStatus$3c38b363;
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final m mWorker = new e(this);

    public c()
    {
        mStatus$3c38b363 = l.a;
        mFuture = new f(this, mWorker);
    }

    public static void execute(Runnable runnable)
    {
        sDefaultExecutor.execute(runnable);
    }

    private void finish(Object obj)
    {
        if (isCancelled())
        {
            onCancelled(obj);
        } else
        {
            onPostExecute(obj);
        }
        mStatus$3c38b363 = l.c;
    }

    public static void init()
    {
        sHandler.getLooper();
    }

    private Object postResult(Object obj)
    {
        sHandler.obtainMessage(1, new h(this, new Object[] {
            obj
        })).sendToTarget();
        return obj;
    }

    private void postResultIfNotInvoked(Object obj)
    {
        if (!mTaskInvoked.get())
        {
            postResult(obj);
        }
    }

    public static void setDefaultExecutor(Executor executor)
    {
        sDefaultExecutor = executor;
    }

    public final boolean cancel(boolean flag)
    {
        mCancelled.set(true);
        return mFuture.cancel(flag);
    }

    protected transient abstract Object doInBackground(Object aobj[]);

    public final transient c execute(Object aobj[])
    {
        return executeOnExecutor(sDefaultExecutor, aobj);
    }

    public final transient c executeOnExecutor(Executor executor, Object aobj[])
    {
        if (mStatus$3c38b363 == l.a) goto _L2; else goto _L1
_L1:
        g.a[mStatus$3c38b363 - 1];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 86;
           goto _L2 _L3 _L4
_L2:
        mStatus$3c38b363 = l.b;
        onPreExecute();
        mWorker.b = aobj;
        executor.execute(mFuture);
        return this;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public final Object get()
    {
        return mFuture.get();
    }

    public final Object get(long l1, TimeUnit timeunit)
    {
        return mFuture.get(l1, timeunit);
    }

    public final int getStatus$2cfd0ac4()
    {
        return mStatus$3c38b363;
    }

    public final boolean isCancelled()
    {
        return mCancelled.get();
    }

    protected void onCancelled()
    {
    }

    protected void onCancelled(Object obj)
    {
        onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
    }

    protected void onPreExecute()
    {
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
    }

    protected final transient void publishProgress(Object aobj[])
    {
        if (!isCancelled())
        {
            sHandler.obtainMessage(2, new h(this, aobj)).sendToTarget();
        }
    }

    static 
    {
        int k = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = k;
        CORE_POOL_SIZE = k + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
        sThreadFactory = new d();
        sPoolWorkQueue = new LinkedBlockingQueue(10);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
        Object obj;
        if (n.d())
        {
            obj = new j((byte)0);
        } else
        {
            obj = Executors.newSingleThreadExecutor(sThreadFactory);
        }
        SERIAL_EXECUTOR = ((Executor) (obj));
        SINGLE_EXECUTOR = Executors.newSingleThreadExecutor(sThreadFactory);
        EXECUTOR_SHAPE = Executors.newFixedThreadPool(2, sThreadFactory);
        DUAL_THREAD_EXECUTOR = Executors.newFixedThreadPool(2, sThreadFactory);
        sDefaultExecutor = SERIAL_EXECUTOR;
    }




}
