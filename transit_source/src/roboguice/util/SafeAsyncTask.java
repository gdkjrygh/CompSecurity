// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

// Referenced classes of package roboguice.util:
//            Ln

public abstract class SafeAsyncTask
    implements Callable
{
    public static class Task
        implements Callable
    {

        protected Handler handler;
        protected SafeAsyncTask parent;

        public volatile Object call()
            throws Exception
        {
            return call();
        }

        public Void call()
            throws Exception
        {
            doPreExecute();
            doSuccess(doCall());
            doFinally();
_L1:
            return null;
            Object obj;
            obj;
            doException(((Exception) (obj)));
_L2:
            doFinally();
              goto _L1
            obj;
            Ln.e(((Throwable) (obj)));
              goto _L2
            obj;
            doFinally();
            throw obj;
            obj;
            doThrowable(((Throwable) (obj)));
_L3:
            doFinally();
              goto _L1
            obj;
            Ln.e(((Throwable) (obj)));
              goto _L3
        }

        protected Object doCall()
            throws Exception
        {
            return parent.call();
        }

        protected void doException(Exception exception)
            throws Exception
        {
            if (parent.launchLocation != null)
            {
                ArrayList arraylist = new ArrayList(Arrays.asList(exception.getStackTrace()));
                arraylist.addAll(Arrays.asList(parent.launchLocation));
                exception.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[arraylist.size()]));
            }
            postToUiThreadAndWait(exception. new Callable() {

                final Task this$0;
                final Exception val$e;

                public Object call()
                    throws Exception
                {
                    if ((e instanceof InterruptedException) || (e instanceof InterruptedIOException))
                    {
                        parent.onInterrupted(e);
                    } else
                    {
                        parent.onException(e);
                    }
                    return null;
                }

            
            {
                this$0 = final_task;
                e = Exception.this;
                super();
            }
            });
        }

        protected void doFinally()
            throws Exception
        {
            postToUiThreadAndWait(new Callable() {

                final Task this$0;

                public Object call()
                    throws Exception
                {
                    parent.onFinally();
                    return null;
                }

            
            {
                this$0 = Task.this;
                super();
            }
            });
        }

        protected void doPreExecute()
            throws Exception
        {
            postToUiThreadAndWait(new Callable() {

                final Task this$0;

                public Object call()
                    throws Exception
                {
                    parent.onPreExecute();
                    return null;
                }

            
            {
                this$0 = Task.this;
                super();
            }
            });
        }

        protected void doSuccess(Object obj)
            throws Exception
        {
            postToUiThreadAndWait(((_cls2) (obj)). new Callable() {

                final Task this$0;
                final Object val$r;

                public Object call()
                    throws Exception
                {
                    parent.onSuccess(r);
                    return null;
                }

            
            {
                this$0 = final_task;
                r = Object.this;
                super();
            }
            });
        }

        protected void doThrowable(Throwable throwable)
            throws Exception
        {
            if (parent.launchLocation != null)
            {
                ArrayList arraylist = new ArrayList(Arrays.asList(throwable.getStackTrace()));
                arraylist.addAll(Arrays.asList(parent.launchLocation));
                throwable.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[arraylist.size()]));
            }
            postToUiThreadAndWait(throwable. new Callable() {

                final Task this$0;
                final Throwable val$e;

                public Object call()
                    throws Exception
                {
                    parent.onThrowable(e);
                    return null;
                }

            
            {
                this$0 = final_task;
                e = Throwable.this;
                super();
            }
            });
        }

        protected void postToUiThreadAndWait(final Callable c)
            throws Exception
        {
            CountDownLatch countdownlatch = new CountDownLatch(1);
            final Exception exceptions[] = new Exception[1];
            handler.post(countdownlatch. new Runnable() {

                final Task this$0;
                final Callable val$c;
                final Exception val$exceptions[];
                final CountDownLatch val$latch;

                public void run()
                {
                    c.call();
                    latch.countDown();
                    return;
                    Object obj;
                    obj;
                    exceptions[0] = ((Exception) (obj));
                    latch.countDown();
                    return;
                    obj;
                    latch.countDown();
                    throw obj;
                }

            
            {
                this$0 = final_task;
                c = callable;
                exceptions = aexception;
                latch = CountDownLatch.this;
                super();
            }
            });
            countdownlatch.await();
            if (exceptions[0] != null)
            {
                throw exceptions[0];
            } else
            {
                return;
            }
        }

        public Task(SafeAsyncTask safeasynctask)
        {
            parent = safeasynctask;
            if (safeasynctask.handler != null)
            {
                safeasynctask = safeasynctask.handler;
            } else
            {
                safeasynctask = new Handler(Looper.getMainLooper());
            }
            handler = safeasynctask;
        }
    }


    protected static final Executor DEFAULT_EXECUTOR = Executors.newFixedThreadPool(25);
    public static final int DEFAULT_POOL_SIZE = 25;
    protected Executor executor;
    protected FutureTask future;
    protected Handler handler;
    protected StackTraceElement launchLocation[];

    public SafeAsyncTask()
    {
        executor = DEFAULT_EXECUTOR;
    }

    public SafeAsyncTask(Handler handler1)
    {
        handler = handler1;
        executor = DEFAULT_EXECUTOR;
    }

    public SafeAsyncTask(Handler handler1, Executor executor1)
    {
        handler = handler1;
        executor = executor1;
    }

    public SafeAsyncTask(Executor executor1)
    {
        executor = executor1;
    }

    public boolean cancel(boolean flag)
    {
        if (future == null)
        {
            throw new UnsupportedOperationException("You cannot cancel this task before calling future()");
        } else
        {
            return future.cancel(flag);
        }
    }

    public void execute()
    {
        execute(Thread.currentThread().getStackTrace());
    }

    protected void execute(StackTraceElement astacktraceelement[])
    {
        launchLocation = astacktraceelement;
        executor.execute(future());
    }

    public Executor executor()
    {
        return executor;
    }

    public SafeAsyncTask executor(Executor executor1)
    {
        executor = executor1;
        return this;
    }

    public FutureTask future()
    {
        future = new FutureTask(newTask());
        return future;
    }

    public Handler handler()
    {
        return handler;
    }

    public SafeAsyncTask handler(Handler handler1)
    {
        handler = handler1;
        return this;
    }

    protected Task newTask()
    {
        return new Task(this);
    }

    protected void onException(Exception exception)
        throws RuntimeException
    {
        onThrowable(exception);
    }

    protected void onFinally()
        throws RuntimeException
    {
    }

    protected void onInterrupted(Exception exception)
    {
        onException(exception);
    }

    protected void onPreExecute()
        throws Exception
    {
    }

    protected void onSuccess(Object obj)
        throws Exception
    {
    }

    protected void onThrowable(Throwable throwable)
        throws RuntimeException
    {
        Log.e("roboguice", "Throwable caught during background processing", throwable);
    }

}
