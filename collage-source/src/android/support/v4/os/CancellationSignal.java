// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;


// Referenced classes of package android.support.v4.os:
//            CancellationSignalCompatJellybean, OperationCanceledException

public final class CancellationSignal
{
    public static interface OnCancelListener
    {

        public abstract void onCancel();
    }


    private boolean mCancelInProgress;
    private Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private OnCancelListener mOnCancelListener;

    public CancellationSignal()
    {
    }

    private void waitForCancelFinishedLocked()
    {
        while (mCancelInProgress) 
        {
            try
            {
                wait();
            }
            catch (InterruptedException interruptedexception) { }
        }
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        if (!mIsCanceled)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        OnCancelListener oncancellistener;
        Object obj;
        mIsCanceled = true;
        mCancelInProgress = true;
        oncancellistener = mOnCancelListener;
        obj = mCancellationSignalObj;
        this;
        JVM INSTR monitorexit ;
        if (oncancellistener == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        oncancellistener.onCancel();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        CancellationSignalCompatJellybean.cancel(obj);
        this;
        JVM INSTR monitorenter ;
        mCancelInProgress = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorenter ;
        mCancelInProgress = false;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object getCancellationSignalObject()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return null;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (mCancellationSignalObj == null)
        {
            mCancellationSignalObj = CancellationSignalCompatJellybean.create();
            if (mIsCanceled)
            {
                CancellationSignalCompatJellybean.cancel(mCancellationSignalObj);
            }
        }
        obj = mCancellationSignalObj;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isCanceled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mIsCanceled;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setOnCancelListener(OnCancelListener oncancellistener)
    {
        this;
        JVM INSTR monitorenter ;
        waitForCancelFinishedLocked();
        if (mOnCancelListener != oncancellistener)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        mOnCancelListener = oncancellistener;
        if (mIsCanceled && oncancellistener != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        oncancellistener;
        this;
        JVM INSTR monitorexit ;
        throw oncancellistener;
        this;
        JVM INSTR monitorexit ;
        oncancellistener.onCancel();
        return;
    }

    public void throwIfCanceled()
    {
        if (isCanceled())
        {
            throw new OperationCanceledException();
        } else
        {
            return;
        }
    }
}
