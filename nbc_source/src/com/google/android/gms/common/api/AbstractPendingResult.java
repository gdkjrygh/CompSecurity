// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.common.api:
//            PendingResult, Result, Releasable, ResultCallback, 
//            Status

public abstract class AbstractPendingResult
    implements PendingResult
{
    public static class CallbackHandler extends Handler
    {

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
                ((AbstractPendingResult)message.obj).forceFailureUnlessReady(Status.zzXS);
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
    private boolean zzL;
    private final Object zzWb = new Object();
    private final ArrayList zzWc = new ArrayList();
    private ResultCallback zzWd;
    private volatile Result zzWe;
    private volatile boolean zzWf;
    private boolean zzWg;
    private ICancelToken zzWh;
    private final CountDownLatch zzoD = new CountDownLatch(1);

    protected AbstractPendingResult(Looper looper)
    {
        mHandler = new CallbackHandler(looper);
    }

    private void zza(Result result)
    {
        zzWe = result;
        zzWh = null;
        zzoD.countDown();
        result = zzWe.getStatus();
        if (zzWd != null)
        {
            mHandler.removeTimeoutMessages();
            if (!zzL)
            {
                mHandler.sendResultCallback(zzWd, zzmo());
            }
        }
        for (Iterator iterator = zzWc.iterator(); iterator.hasNext(); ((PendingResult.BatchCallback)iterator.next()).zzs(result)) { }
        zzWc.clear();
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

    private Result zzmo()
    {
        boolean flag = true;
        Object obj = zzWb;
        obj;
        JVM INSTR monitorenter ;
        Result result;
        if (zzWf)
        {
            flag = false;
        }
        zzu.zza(flag, "Result has already been consumed.");
        zzu.zza(isReady(), "Result is not ready.");
        result = zzWe;
        zzWe = null;
        zzWd = null;
        zzWf = true;
        onResultConsumed();
        return result;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract Result createFailedResult(Status status);

    public final void forceFailureUnlessReady(Status status)
    {
        synchronized (zzWb)
        {
            if (!isReady())
            {
                setResult(createFailedResult(status));
                zzWg = true;
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
        synchronized (zzWb)
        {
            flag = zzL;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isReady()
    {
        return zzoD.getCount() == 0L;
    }

    protected void onResultConsumed()
    {
    }

    public final void setResult(Result result)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (zzWb)
            {
                if (!zzWg && !zzL)
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
        zzu.zza(flag, "Results have already been set");
        if (!zzWf)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Result has already been consumed");
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
            if (!zzWf)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Result has already been consumed.");
            synchronized (zzWb)
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
        mHandler.sendResultCallback(resultcallback, zzmo());
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        resultcallback;
        obj;
        JVM INSTR monitorexit ;
        throw resultcallback;
        zzWd = resultcallback;
          goto _L1
    }
}
