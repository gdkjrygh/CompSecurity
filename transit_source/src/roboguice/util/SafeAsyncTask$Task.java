// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import android.os.Handler;
import android.os.Looper;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package roboguice.util:
//            SafeAsyncTask, Ln

public static class handler
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

    protected void doException(final Exception e)
        throws Exception
    {
        if (parent.launchLocation != null)
        {
            ArrayList arraylist = new ArrayList(Arrays.asList(e.getStackTrace()));
            arraylist.addAll(Arrays.asList(parent.launchLocation));
            e.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[arraylist.size()]));
        }
        postToUiThreadAndWait(new Callable() {

            final SafeAsyncTask.Task this$0;
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
                this$0 = SafeAsyncTask.Task.this;
                e = exception;
                super();
            }
        });
    }

    protected void doFinally()
        throws Exception
    {
        (new Callable() {

            final SafeAsyncTask.Task this$0;

            public Object call()
                throws Exception
            {
                parent.onFinally();
                return null;
            }

            
            {
                this$0 = SafeAsyncTask.Task.this;
                super();
            }
        });
    }

    protected void doPreExecute()
        throws Exception
    {
        postToUiThreadAndWait(new Callable() {

            final SafeAsyncTask.Task this$0;

            public Object call()
                throws Exception
            {
                parent.onPreExecute();
                return null;
            }

            
            {
                this$0 = SafeAsyncTask.Task.this;
                super();
            }
        });
    }

    protected void doSuccess(final Object r)
        throws Exception
    {
        postToUiThreadAndWait(new Callable() {

            final SafeAsyncTask.Task this$0;
            final Object val$r;

            public Object call()
                throws Exception
            {
                parent.onSuccess(r);
                return null;
            }

            
            {
                this$0 = SafeAsyncTask.Task.this;
                r = obj;
                super();
            }
        });
    }

    protected void doThrowable(final Throwable e)
        throws Exception
    {
        if (parent.launchLocation != null)
        {
            ArrayList arraylist = new ArrayList(Arrays.asList(e.getStackTrace()));
            arraylist.addAll(Arrays.asList(parent.launchLocation));
            e.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[arraylist.size()]));
        }
        postToUiThreadAndWait(new Callable() {

            final SafeAsyncTask.Task this$0;
            final Throwable val$e;

            public Object call()
                throws Exception
            {
                parent.onThrowable(e);
                return null;
            }

            
            {
                this$0 = SafeAsyncTask.Task.this;
                e = throwable;
                super();
            }
        });
    }

    protected void postToUiThreadAndWait(final Callable c)
        throws Exception
    {
        final CountDownLatch latch = new CountDownLatch(1);
        final Exception exceptions[] = new Exception[1];
        handler.post(new Runnable() {

            final SafeAsyncTask.Task this$0;
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
                this$0 = SafeAsyncTask.Task.this;
                c = callable;
                exceptions = aexception;
                latch = countdownlatch;
                super();
            }
        });
        latch.await();
        if (exceptions[0] != null)
        {
            throw exceptions[0];
        } else
        {
            return;
        }
    }

    public _cls6.val.latch(SafeAsyncTask safeasynctask)
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
