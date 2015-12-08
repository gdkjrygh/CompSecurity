// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.urbanairship:
//            Cancelable

abstract class CancelableOperation
    implements Cancelable, Runnable
{

    private Handler handler;
    private final Runnable internalRunnable = new Runnable() {

        final CancelableOperation this$0;

        public void run()
        {
label0:
            {
                synchronized (CancelableOperation.this)
                {
                    if (!isDone())
                    {
                        break label0;
                    }
                }
                return;
            }
            onRun();
            isFinished = true;
            cancelableoperation;
            JVM INSTR monitorexit ;
            return;
            exception;
            cancelableoperation;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = CancelableOperation.this;
                super();
            }
    };
    private boolean isCanceled;
    private boolean isFinished;
    private boolean isRunning;

    CancelableOperation(Looper looper)
    {
        isFinished = false;
        isRunning = false;
        isCanceled = false;
        if (looper != null)
        {
            handler = new Handler(looper);
        } else
        {
            if (Looper.myLooper() != null)
            {
                looper = new Handler(Looper.myLooper());
            } else
            {
                looper = new Handler(Looper.getMainLooper());
            }
            handler = looper;
        }
    }

    public final void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isDone())
        {
            isCanceled = true;
            handler.removeCallbacks(internalRunnable);
            handler.post(new Runnable() {

                final CancelableOperation this$0;

                public void run()
                {
                    onCancel();
                }

            
            {
                this$0 = CancelableOperation.this;
                super();
            }
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isCanceled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isCanceled;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isDone()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (isFinished || isCanceled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onCancel()
    {
    }

    protected abstract void onRun();

    public final void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isDone() && !isRunning)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        isRunning = true;
        handler.post(internalRunnable);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }


/*
    static boolean access$002(CancelableOperation cancelableoperation, boolean flag)
    {
        cancelableoperation.isFinished = flag;
        return flag;
    }

*/
}
