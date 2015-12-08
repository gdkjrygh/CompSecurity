// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.service.OperationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.chimera:
//            AsyncOperation

public abstract class BaseAsyncOperationService extends Service
    implements android.os.Handler.Callback
{
    protected static final class AsyncOperationQueue extends LinkedBlockingDeque
    {

        public AsyncOperationQueue()
        {
        }
    }

    protected final class OperationTask
        implements Runnable
    {

        private final int mId;
        private final Intent mIntent;
        final AsyncOperation mOperation;
        final BaseAsyncOperationService this$0;

        public final void run()
        {
            Message message;
            Object obj;
            long l;
            try
            {
                mOperation.execute(BaseAsyncOperationService.this);
            }
            catch (OperationException operationexception)
            {
                Log.e(mName, operationexception.getMessage(), operationexception);
            }
            catch (RemoteException remoteexception) { }
            catch (RuntimeException runtimeexception)
            {
                handleRuntimeException(runtimeexception);
                new Status(8);
            }
            mLock.lock();
            l = TimeUnit.MILLISECONDS.toNanos(mKeepAliveMs);
_L3:
            if (mId != mLastOperationId) goto _L2; else goto _L1
_L1:
            if (l > 0L)
            {
                break MISSING_BLOCK_LABEL_133;
            }
            message = Message.obtain();
            message.arg1 = mId;
            mHandler.dispatchMessage(message);
_L2:
            mLock.unlock();
            return;
            l = mNotIdle.awaitNanos(l);
              goto _L3
            obj;
            Thread.currentThread().interrupt();
            mLock.unlock();
            return;
            obj;
            mLock.unlock();
            throw obj;
        }

        public OperationTask(AsyncOperation asyncoperation, Intent intent, int i)
        {
            this$0 = BaseAsyncOperationService.this;
            super();
            mOperation = asyncoperation;
            mIntent = intent;
            mId = i;
        }
    }


    protected final Handler mHandler = new Handler(Looper.getMainLooper(), this);
    protected final long mKeepAliveMs;
    private int mLastOperationId;
    private final ReentrantLock mLock = new ReentrantLock();
    protected final String mName;
    private final Condition mNotIdle;
    protected final AsyncOperationQueue mQueue;

    protected BaseAsyncOperationService(String s, AsyncOperationQueue asyncoperationqueue, long l)
    {
        mLastOperationId = 0;
        mNotIdle = mLock.newCondition();
        mName = s;
        mQueue = (AsyncOperationQueue)Preconditions.checkNotNull(asyncoperationqueue);
        mKeepAliveMs = l;
    }

    public boolean handleMessage(Message message)
    {
        mLock.lock();
        if (message.arg1 == mLastOperationId)
        {
            stopSelf();
        }
        mLock.unlock();
        return true;
        message;
        mLock.unlock();
        throw message;
    }

    public void handleRuntimeException(RuntimeException runtimeexception)
    {
        Log.e(mName, runtimeexception.getMessage(), runtimeexception);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
_L2:
        AsyncOperation asyncoperation;
        asyncoperation = (AsyncOperation)mQueue.poll();
        if (asyncoperation == null)
        {
            break; /* Loop/switch isn't completed */
        }
        mLock.lock();
        i = mLastOperationId + 1;
        mLastOperationId = i;
        scheduleOperationTask(new OperationTask(asyncoperation, intent, i));
        mNotIdle.signalAll();
        mLock.unlock();
        if (true) goto _L2; else goto _L1
        intent;
        mLock.unlock();
        throw intent;
_L1:
        return 2;
    }

    protected abstract void scheduleOperationTask(OperationTask operationtask);



}
