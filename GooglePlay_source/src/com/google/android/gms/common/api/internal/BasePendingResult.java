// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class BasePendingResult extends PendingResult
{
    public static final class CallbackHandler extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("BasePendingResult", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
                return;

            case 1: // '\001'
                Object obj = (Pair)message.obj;
                message = (ResultCallback)((Pair) (obj)).first;
                obj = (Result)((Pair) (obj)).second;
                try
                {
                    message.onResult(((Result) (obj)));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    BasePendingResult.maybeReleaseResult(((Result) (obj)));
                }
                throw message;

            case 2: // '\002'
                ((BasePendingResult)message.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                return;
            }
        }

        public final void sendResultCallback(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        public CallbackHandler()
        {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper)
        {
            super(looper);
        }
    }


    private ResultCallback mCallback;
    private ICancelToken mCancelToken;
    private boolean mCanceled;
    private volatile boolean mConsumed;
    private boolean mForcedFailure;
    protected final CallbackHandler mHandler;
    private final CountDownLatch mLatch;
    private volatile Result mResult;
    private final ArrayList mStatusListeners;
    private final Object mSyncToken;

    protected BasePendingResult(Looper looper)
    {
        mSyncToken = new Object();
        mLatch = new CountDownLatch(1);
        mStatusListeners = new ArrayList();
        mHandler = new CallbackHandler(looper);
    }

    public BasePendingResult(GoogleApiClient googleapiclient)
    {
        mSyncToken = new Object();
        mLatch = new CountDownLatch(1);
        mStatusListeners = new ArrayList();
        if (googleapiclient != null)
        {
            googleapiclient = googleapiclient.getLooper();
        } else
        {
            googleapiclient = Looper.getMainLooper();
        }
        mHandler = new CallbackHandler(googleapiclient);
    }

    private Result get()
    {
        boolean flag = true;
        Object obj = mSyncToken;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        if (mConsumed)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Result has already been consumed.");
        Preconditions.checkState(isReady(), "Result is not ready.");
        result = mResult;
        mResult = null;
        mCallback = null;
        mConsumed = true;
        onResultConsumed();
        return result;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void maybeReleaseResult(Result result)
    {
        if (!(result instanceof Releasable))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((Releasable)result).release();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("BasePendingResult", (new StringBuilder("Unable to release ")).append(result).toString(), runtimeexception);
        return;
    }

    private void setResultAndNotifyListeners(Result result)
    {
        mResult = result;
        mCancelToken = null;
        mLatch.countDown();
        result = mResult.getStatus();
        if (mCallback != null)
        {
            mHandler.removeMessages(2);
            if (!mCanceled)
            {
                mHandler.sendResultCallback(mCallback, get());
            }
        }
        for (Iterator iterator = mStatusListeners.iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.PendingResult.StatusListener)iterator.next()).onComplete(result)) { }
        mStatusListeners.clear();
    }

    public final void addStatusListener(com.google.android.gms.common.api.PendingResult.StatusListener statuslistener)
    {
        Object obj;
        boolean flag;
        if (!mConsumed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Result has already been consumed.");
        Preconditions.checkArgument(true, "Callback cannot be null.");
        obj = mSyncToken;
        obj;
        JVM INSTR monitorenter ;
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        statuslistener.onComplete(mResult.getStatus());
_L2:
        return;
        mStatusListeners.add(statuslistener);
        if (true) goto _L2; else goto _L1
_L1:
        statuslistener;
        obj;
        JVM INSTR monitorexit ;
        throw statuslistener;
    }

    public final Result await()
    {
        boolean flag1 = false;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "await must not be called on the UI thread");
        flag = flag1;
        if (!mConsumed)
        {
            flag = true;
        }
        Preconditions.checkState(flag, "Result has already been consumed");
        Preconditions.checkState(true, "Cannot await if then() has been called.");
        try
        {
            mLatch.await();
        }
        catch (InterruptedException interruptedexception)
        {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    public final Result await(long l, TimeUnit timeunit)
    {
        boolean flag1 = false;
        boolean flag;
        if (l <= 0L || Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "await must not be called on the UI thread when time is greater than zero.");
        flag = flag1;
        if (!mConsumed)
        {
            flag = true;
        }
        Preconditions.checkState(flag, "Result has already been consumed.");
        Preconditions.checkState(true, "Cannot await if then() has been called.");
        try
        {
            if (!mLatch.await(l, timeunit))
            {
                forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(isReady(), "Result is not ready.");
        return get();
    }

    public void cancel()
    {
label0:
        {
            synchronized (mSyncToken)
            {
                if (!mCanceled && !mConsumed)
                {
                    break label0;
                }
            }
            return;
        }
        ICancelToken icanceltoken = mCancelToken;
        if (icanceltoken == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            mCancelToken.cancel();
        }
        catch (RemoteException remoteexception) { }
        maybeReleaseResult(mResult);
        mCallback = null;
        mCanceled = true;
        setResultAndNotifyListeners(createFailedResult(Status.RESULT_CANCELED));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract Result createFailedResult(Status status);

    public final void forceFailureUnlessReady(Status status)
    {
        synchronized (mSyncToken)
        {
            if (!isReady())
            {
                setResult(createFailedResult(status));
                mForcedFailure = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public final Integer getResultId()
    {
        return null;
    }

    public final boolean isCanceled()
    {
        boolean flag;
        synchronized (mSyncToken)
        {
            flag = mCanceled;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return mLatch.getCount() == 0L;
    }

    protected void onResultConsumed()
    {
    }

    public final void setCancelToken(ICancelToken icanceltoken)
    {
        synchronized (mSyncToken)
        {
            mCancelToken = icanceltoken;
        }
        return;
        icanceltoken;
        obj;
        JVM INSTR monitorexit ;
        throw icanceltoken;
    }

    public final void setResult(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (mSyncToken)
            {
                if (!mForcedFailure && !mCanceled)
                {
                    break label0;
                }
                maybeReleaseResult(result);
            }
            return;
        }
        boolean flag;
        if (!isReady())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Results have already been set");
        if (!mConsumed)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Result has already been consumed");
        setResultAndNotifyListeners(result);
        obj;
        JVM INSTR monitorexit ;
        return;
        result;
        obj;
        JVM INSTR monitorexit ;
        throw result;
    }

    public final void setResultCallback(ResultCallback resultcallback)
    {
label0:
        {
            boolean flag = true;
            if (mConsumed)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Result has already been consumed.");
            synchronized (mSyncToken)
            {
                Preconditions.checkState(true, "Cannot set callbacks if then() has been called.");
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        mHandler.sendResultCallback(resultcallback, get());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        mCallback = resultcallback;
          goto _L1
    }
}
