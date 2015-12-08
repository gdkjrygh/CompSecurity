// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask, AsyncTaskLoader

final class done extends ModernAsyncTask
    implements Runnable
{

    private CountDownLatch done;
    Object result;
    final AsyncTaskLoader this$0;
    boolean waiting;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Object doInBackground(Void avoid[])
    {
        result = onLoadInBackground();
        return result;
    }

    protected void onCancelled()
    {
        dispatchOnCancelled(this, result);
        done.countDown();
        return;
        Exception exception;
        exception;
        done.countDown();
        throw exception;
    }

    protected void onPostExecute(Object obj)
    {
        dispatchOnLoadComplete(this, obj);
        done.countDown();
        return;
        obj;
        done.countDown();
        throw obj;
    }

    public void run()
    {
        waiting = false;
        executePendingTask();
    }


    _cls9()
    {
        this$0 = AsyncTaskLoader.this;
        super();
        done = new CountDownLatch(1);
    }
}
