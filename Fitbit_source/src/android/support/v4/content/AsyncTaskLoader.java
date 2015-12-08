// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package android.support.v4.content:
//            Loader, ModernAsyncTask

public abstract class AsyncTaskLoader extends Loader
{
    final class LoadTask extends ModernAsyncTask
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


        LoadTask()
        {
            this$0 = AsyncTaskLoader.this;
            super();
            done = new CountDownLatch(1);
        }
    }


    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile LoadTask mCancellingTask;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile LoadTask mTask;
    long mUpdateThrottle;

    public AsyncTaskLoader(Context context)
    {
        super(context);
        mLastLoadCompleteTime = -10000L;
    }

    public boolean cancelLoad()
    {
label0:
        {
            if (mTask != null)
            {
                if (mCancellingTask == null)
                {
                    break label0;
                }
                if (mTask.waiting)
                {
                    mTask.waiting = false;
                    mHandler.removeCallbacks(mTask);
                }
                mTask = null;
            }
            return false;
        }
        if (mTask.waiting)
        {
            mTask.waiting = false;
            mHandler.removeCallbacks(mTask);
            mTask = null;
            return false;
        }
        boolean flag = mTask.cancel(false);
        if (flag)
        {
            mCancellingTask = mTask;
        }
        mTask = null;
        return flag;
    }

    void dispatchOnCancelled(LoadTask loadtask, Object obj)
    {
        onCanceled(obj);
        if (mCancellingTask == loadtask)
        {
            rollbackContentChanged();
            mLastLoadCompleteTime = SystemClock.uptimeMillis();
            mCancellingTask = null;
            executePendingTask();
        }
    }

    void dispatchOnLoadComplete(LoadTask loadtask, Object obj)
    {
        if (mTask != loadtask)
        {
            dispatchOnCancelled(loadtask, obj);
            return;
        }
        if (isAbandoned())
        {
            onCanceled(obj);
            return;
        } else
        {
            commitContentChanged();
            mLastLoadCompleteTime = SystemClock.uptimeMillis();
            mTask = null;
            deliverResult(obj);
            return;
        }
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.dump(s, filedescriptor, printwriter, as);
        if (mTask != null)
        {
            printwriter.print(s);
            printwriter.print("mTask=");
            printwriter.print(mTask);
            printwriter.print(" waiting=");
            printwriter.println(mTask.waiting);
        }
        if (mCancellingTask != null)
        {
            printwriter.print(s);
            printwriter.print("mCancellingTask=");
            printwriter.print(mCancellingTask);
            printwriter.print(" waiting=");
            printwriter.println(mCancellingTask.waiting);
        }
        if (mUpdateThrottle != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            TimeUtils.formatDuration(mUpdateThrottle, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            TimeUtils.formatDuration(mLastLoadCompleteTime, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    void executePendingTask()
    {
label0:
        {
            if (mCancellingTask == null && mTask != null)
            {
                if (mTask.waiting)
                {
                    mTask.waiting = false;
                    mHandler.removeCallbacks(mTask);
                }
                if (mUpdateThrottle <= 0L || SystemClock.uptimeMillis() >= mLastLoadCompleteTime + mUpdateThrottle)
                {
                    break label0;
                }
                mTask.waiting = true;
                mHandler.postAtTime(mTask, mLastLoadCompleteTime + mUpdateThrottle);
            }
            return;
        }
        mTask.executeOnExecutor(ModernAsyncTask.THREAD_POOL_EXECUTOR, (Void[])null);
    }

    public abstract Object loadInBackground();

    public void onCanceled(Object obj)
    {
    }

    protected void onForceLoad()
    {
        super.onForceLoad();
        cancelLoad();
        mTask = new LoadTask();
        executePendingTask();
    }

    protected Object onLoadInBackground()
    {
        return loadInBackground();
    }

    public void setUpdateThrottle(long l)
    {
        mUpdateThrottle = l;
        if (l != 0L)
        {
            mHandler = new Handler();
        }
    }

    public void waitForLoader()
    {
        LoadTask loadtask;
        loadtask = mTask;
        if (loadtask == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        loadtask.done.await();
        return;
        InterruptedException interruptedexception;
        interruptedexception;
    }
}
