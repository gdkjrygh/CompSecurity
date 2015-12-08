// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

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

public abstract class AsyncTask
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
    private static final InternalHandler sHandler = new InternalHandler(null);
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;
    private final AtomicBoolean mCancelled = new AtomicBoolean();
    private final FutureTask mFuture;
    private volatile Status mStatus;
    private final AtomicBoolean mTaskInvoked = new AtomicBoolean();
    private final WorkerRunnable mWorker = new _cls2();

    public AsyncTask()
    {
        mStatus = Status.PENDING;
        mFuture = new _cls3(mWorker);
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
        mStatus = Status.FINISHED;
    }

    public static void init()
    {
        sHandler.getLooper();
    }

    private Object postResult(Object obj)
    {
        sHandler.obtainMessage(1, new AsyncTaskResult(new Object[] {
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

    public final transient AsyncTask execute(Object aobj[])
    {
        return executeOnExecutor(sDefaultExecutor, aobj);
    }

    public final transient AsyncTask executeOnExecutor(Executor executor, Object aobj[])
    {
        if (mStatus == Status.PENDING) goto _L2; else goto _L1
_L1:
        _cls4..SwitchMap.com.facebook.AsyncTask.Status[mStatus.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 75
    //                   2 86;
           goto _L2 _L3 _L4
_L2:
        mStatus = Status.RUNNING;
        onPreExecute();
        mWorker.mParams = aobj;
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

    public final Object get(long l, TimeUnit timeunit)
    {
        return mFuture.get(l, timeunit);
    }

    public final Status getStatus()
    {
        return mStatus;
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
            sHandler.obtainMessage(2, new AsyncTaskResult(aobj)).sendToTarget();
        }
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = i;
        CORE_POOL_SIZE = i + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
        sThreadFactory = new _cls1();
        sPoolWorkQueue = new LinkedBlockingQueue(10);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, sPoolWorkQueue, sThreadFactory, new java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy());
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            obj = new SerialExecutor(null);
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





    private class Status extends Enum
    {

        private static final Status $VALUES[];
        public static final Status FINISHED;
        public static final Status PENDING;
        public static final Status RUNNING;

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/facebook/AsyncTask$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])$VALUES.clone();
        }

        static 
        {
            PENDING = new Status("PENDING", 0);
            RUNNING = new Status("RUNNING", 1);
            FINISHED = new Status("FINISHED", 2);
            $VALUES = (new Status[] {
                PENDING, RUNNING, FINISHED
            });
        }

        private Status(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls2 extends WorkerRunnable
    {
        private class WorkerRunnable
            implements Callable
        {

            Object mParams[];

            private WorkerRunnable()
            {
            }

            WorkerRunnable(_cls1 _pcls1)
            {
                this();
            }
        }


        final AsyncTask this$0;

        public Object call()
        {
            mTaskInvoked.set(true);
            Process.setThreadPriority(10);
            return postResult(doInBackground(mParams));
        }

        _cls2()
        {
            this$0 = AsyncTask.this;
            super(null);
        }
    }


    private class _cls3 extends FutureTask
    {

        final AsyncTask this$0;

        protected void done()
        {
            try
            {
                postResultIfNotInvoked(get());
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                Log.w("AsyncTask", interruptedexception);
                return;
            }
            catch (ExecutionException executionexception)
            {
                throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
            }
            catch (CancellationException cancellationexception)
            {
                postResultIfNotInvoked(null);
            }
        }

        _cls3(Callable callable)
        {
            this$0 = AsyncTask.this;
            super(callable);
        }
    }


    private class InternalHandler extends Handler
    {

        public void handleMessage(Message message)
        {
            AsyncTaskResult asynctaskresult = (AsyncTaskResult)message.obj;
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                asynctaskresult.mTask.finish(asynctaskresult.mData[0]);
                return;

            case 2: // '\002'
                asynctaskresult.mTask.onProgressUpdate(asynctaskresult.mData);
                break;
            }
        }

        private InternalHandler()
        {
        }

        InternalHandler(_cls1 _pcls1)
        {
            this();
        }
    }


    private class AsyncTaskResult
    {

        final Object mData[];
        final AsyncTask mTask;

        transient AsyncTaskResult(Object aobj[])
        {
            mTask = AsyncTask.this;
            mData = aobj;
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$facebook$AsyncTask$Status[];

        static 
        {
            $SwitchMap$com$facebook$AsyncTask$Status = new int[Status.values().length];
            try
            {
                $SwitchMap$com$facebook$AsyncTask$Status[Status.RUNNING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$facebook$AsyncTask$Status[Status.FINISHED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls1
        implements ThreadFactory
    {

        private final AtomicInteger mCount = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("AsyncTask #")).append(mCount.getAndIncrement()).toString());
        }

        _cls1()
        {
        }
    }


    private class SerialExecutor
        implements Executor
    {

        Runnable mActive;
        final ArrayDeque mTasks;

        public void execute(final Runnable r)
        {
            this;
            JVM INSTR monitorenter ;
            class _cls1
                implements Runnable
            {

                final SerialExecutor this$0;
                final Runnable val$r;

                public void run()
                {
                    r.run();
                    scheduleNext();
                    return;
                    Exception exception;
                    exception;
                    scheduleNext();
                    throw exception;
                }

                _cls1()
                {
                    this$0 = SerialExecutor.this;
                    r = runnable;
                    super();
                }
            }

            mTasks.offer(new _cls1());
            if (mActive == null)
            {
                scheduleNext();
            }
            this;
            JVM INSTR monitorexit ;
            return;
            r;
            throw r;
        }

        protected void scheduleNext()
        {
            this;
            JVM INSTR monitorenter ;
            Runnable runnable;
            runnable = (Runnable)mTasks.poll();
            mActive = runnable;
            if (runnable == null)
            {
                break MISSING_BLOCK_LABEL_34;
            }
            AsyncTask.THREAD_POOL_EXECUTOR.execute(mActive);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        private SerialExecutor()
        {
            mTasks = new ArrayDeque();
        }

        SerialExecutor(_cls1 _pcls1)
        {
            this();
        }
    }

}
