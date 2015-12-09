// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Result, Releasable, Status, 
//            ResultCallback

public abstract class AbstractPendingResult
    implements PendingResult
{
    public static class CallbackHandler extends Handler
    {

        public static final int CALLBACK_ON_COMPLETE = 1;
        public static final int CALLBACK_ON_TIMEOUT = 2;

        protected void deliverResultCallback(ResultCallback resultcallback, Result result)
        {
            try
            {
                resultcallback.onResult(result);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ResultCallback resultcallback)
            {
                AbstractPendingResult.zzb(result);
            }
            throw resultcallback;
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                deliverResultCallback((ResultCallback)((Pair) (message)).first, (Result)((Pair) (message)).second);
                return;

            case 2: // '\002'
                ((AbstractPendingResult)message.obj).forceFailureUnlessReady(Status.zzQX);
                break;
            }
        }

        public void removeTimeoutMessages()
        {
            removeMessages(2);
        }

        public void sendResultCallback(ResultCallback resultcallback, Result result)
        {
            sendMessage(obtainMessage(1, new Pair(resultcallback, result)));
        }

        public void sendTimeoutResultCallback(AbstractPendingResult abstractpendingresult, long l)
        {
            sendMessageDelayed(obtainMessage(2, abstractpendingresult), l);
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


    protected final CallbackHandler mHandler;
    private final Object zzPd;
    private final ArrayList zzPe;
    private ResultCallback zzPf;
    private volatile Result zzPg;
    private volatile boolean zzPh;
    private boolean zzPi;
    private boolean zzPj;
    private ICancelToken zzPk;
    private final CountDownLatch zzns;

    protected AbstractPendingResult(Looper looper)
    {
        zzPd = new Object();
        zzns = new CountDownLatch(1);
        zzPe = new ArrayList();
        mHandler = new CallbackHandler(looper);
    }

    protected AbstractPendingResult(CallbackHandler callbackhandler)
    {
        zzPd = new Object();
        zzns = new CountDownLatch(1);
        zzPe = new ArrayList();
        mHandler = callbackhandler;
    }

    private void zza(Result result)
    {
        zzPg = result;
        zzPk = null;
        zzns.countDown();
        result = zzPg.getStatus();
        if (zzPf != null)
        {
            mHandler.removeTimeoutMessages();
            if (!zzPi)
            {
                mHandler.sendResultCallback(zzPf, zzkB());
            }
        }
        for (Iterator iterator = zzPe.iterator(); iterator.hasNext(); ((PendingResult.BatchCallback)iterator.next()).zzl(result)) { }
        zzPe.clear();
    }

    static void zzb(Result result)
    {
        if (!(result instanceof Releasable))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((Releasable)result).release();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("AbstractPendingResult", (new StringBuilder()).append("Unable to release ").append(result).toString(), runtimeexception);
        return;
    }

    private Result zzkB()
    {
        boolean flag = true;
        Object obj = zzPd;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        if (zzPh)
        {
            flag = false;
        }
        zzv.zza(flag, "Result has already been consumed.");
        zzv.zza(isReady(), "Result is not ready.");
        result = zzPg;
        zzPg = null;
        zzPf = null;
        zzPh = true;
        onResultConsumed();
        return result;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void addBatchCallback(PendingResult.BatchCallback batchcallback)
    {
        Object obj;
        boolean flag;
        if (!zzPh)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Result has already been consumed.");
        obj = zzPd;
        obj;
        JVM INSTR monitorenter ;
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        batchcallback.zzl(zzPg.getStatus());
_L2:
        return;
        zzPe.add(batchcallback);
        if (true) goto _L2; else goto _L1
_L1:
        batchcallback;
        obj;
        JVM INSTR monitorexit ;
        throw batchcallback;
    }

    public final Result await()
    {
        boolean flag1 = true;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "await must not be called on the UI thread");
        if (!zzPh)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Result has already been consumed");
        try
        {
            zzns.await();
        }
        catch (InterruptedException interruptedexception)
        {
            forceFailureUnlessReady(Status.zzQV);
        }
        zzv.zza(isReady(), "Result is not ready.");
        return zzkB();
    }

    public final Result await(long l, TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (l <= 0L || Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "await must not be called on the UI thread when time is greater than zero.");
        if (!zzPh)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Result has already been consumed.");
        try
        {
            if (!zzns.await(l, timeunit))
            {
                forceFailureUnlessReady(Status.zzQX);
            }
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            forceFailureUnlessReady(Status.zzQV);
        }
        zzv.zza(isReady(), "Result is not ready.");
        return zzkB();
    }

    public void cancel()
    {
label0:
        {
            synchronized (zzPd)
            {
                if (!zzPi && !zzPh)
                {
                    break label0;
                }
            }
            return;
        }
        ICancelToken icanceltoken = zzPk;
        if (icanceltoken == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        try
        {
            zzPk.cancel();
        }
        catch (RemoteException remoteexception) { }
        zzb(zzPg);
        zzPf = null;
        zzPi = true;
        zza(createFailedResult(Status.zzQY));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract Result createFailedResult(Status status);

    public final void forceFailureUnlessReady(Status status)
    {
        synchronized (zzPd)
        {
            if (!isReady())
            {
                setResult(createFailedResult(status));
                zzPj = true;
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    public boolean isCanceled()
    {
        boolean flag;
        synchronized (zzPd)
        {
            flag = zzPi;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return zzns.getCount() == 0L;
    }

    protected void onResultConsumed()
    {
    }

    protected final void setCancelToken(ICancelToken icanceltoken)
    {
        synchronized (zzPd)
        {
            zzPk = icanceltoken;
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
            synchronized (zzPd)
            {
                if (!zzPj && !zzPi)
                {
                    break label0;
                }
                zzb(result);
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
        zzv.zza(flag, "Results have already been set");
        if (!zzPh)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Result has already been consumed");
        zza(result);
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
            boolean flag;
            if (!zzPh)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "Result has already been consumed.");
            synchronized (zzPd)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        mHandler.sendResultCallback(resultcallback, zzkB());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        zzPf = resultcallback;
          goto _L1
    }

    public final void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
label0:
        {
            boolean flag1 = true;
            boolean flag;
            if (!zzPh)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "Result has already been consumed.");
            if (mHandler != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "CallbackHandler has not been set before calling setResultCallback.");
            synchronized (zzPd)
            {
                if (!isCanceled())
                {
                    break label0;
                }
            }
            return;
        }
        if (!isReady())
        {
            break MISSING_BLOCK_LABEL_87;
        }
        mHandler.sendResultCallback(resultcallback, zzkB());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        zzPf = resultcallback;
        mHandler.sendTimeoutResultCallback(this, timeunit.toMillis(l));
          goto _L1
    }
}
