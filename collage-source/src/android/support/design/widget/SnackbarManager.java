// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class SnackbarManager
{
    static interface Callback
    {

        public abstract void dismiss(int i);

        public abstract void show();
    }

    private static class SnackbarRecord
    {

        private final WeakReference callback;
        private int duration;

        boolean isSnackbar(Callback callback1)
        {
            return callback1 != null && callback.get() == callback1;
        }



/*
        static int access$102(SnackbarRecord snackbarrecord, int i)
        {
            snackbarrecord.duration = i;
            return i;
        }

*/


        SnackbarRecord(int i, Callback callback1)
        {
            callback = new WeakReference(callback1);
            duration = i;
        }
    }


    private static final int LONG_DURATION_MS = 2750;
    private static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static SnackbarManager sSnackbarManager;
    private SnackbarRecord mCurrentSnackbar;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new android.os.Handler.Callback() {

        final SnackbarManager this$0;

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                handleTimeout((SnackbarRecord)message.obj);
                break;
            }
            return true;
        }

            
            {
                this$0 = SnackbarManager.this;
                super();
            }
    });
    private final Object mLock = new Object();
    private SnackbarRecord mNextSnackbar;

    private SnackbarManager()
    {
    }

    private boolean cancelSnackbarLocked(SnackbarRecord snackbarrecord, int i)
    {
        snackbarrecord = (Callback)snackbarrecord.callback.get();
        if (snackbarrecord != null)
        {
            snackbarrecord.dismiss(i);
            return true;
        } else
        {
            return false;
        }
    }

    static SnackbarManager getInstance()
    {
        if (sSnackbarManager == null)
        {
            sSnackbarManager = new SnackbarManager();
        }
        return sSnackbarManager;
    }

    private void handleTimeout(SnackbarRecord snackbarrecord)
    {
        synchronized (mLock)
        {
            if (mCurrentSnackbar == snackbarrecord || mNextSnackbar == snackbarrecord)
            {
                cancelSnackbarLocked(snackbarrecord, 2);
            }
        }
        return;
        snackbarrecord;
        obj;
        JVM INSTR monitorexit ;
        throw snackbarrecord;
    }

    private boolean isCurrentSnackbarLocked(Callback callback)
    {
        return mCurrentSnackbar != null && mCurrentSnackbar.isSnackbar(callback);
    }

    private boolean isNextSnackbarLocked(Callback callback)
    {
        return mNextSnackbar != null && mNextSnackbar.isSnackbar(callback);
    }

    private void scheduleTimeoutLocked(SnackbarRecord snackbarrecord)
    {
        int i;
        if (snackbarrecord.duration == -2)
        {
            return;
        }
        i = 2750;
        if (snackbarrecord.duration <= 0) goto _L2; else goto _L1
_L1:
        i = snackbarrecord.duration;
_L4:
        mHandler.removeCallbacksAndMessages(snackbarrecord);
        mHandler.sendMessageDelayed(Message.obtain(mHandler, 0, snackbarrecord), i);
        return;
_L2:
        if (snackbarrecord.duration == -1)
        {
            i = 1500;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showNextSnackbarLocked()
    {
label0:
        {
            if (mNextSnackbar != null)
            {
                mCurrentSnackbar = mNextSnackbar;
                mNextSnackbar = null;
                Callback callback = (Callback)mCurrentSnackbar.callback.get();
                if (callback == null)
                {
                    break label0;
                }
                callback.show();
            }
            return;
        }
        mCurrentSnackbar = null;
    }

    public void cancelTimeout(Callback callback)
    {
        synchronized (mLock)
        {
            if (isCurrentSnackbarLocked(callback))
            {
                mHandler.removeCallbacksAndMessages(mCurrentSnackbar);
            }
        }
        return;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public void dismiss(Callback callback, int i)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        if (!isCurrentSnackbarLocked(callback)) goto _L2; else goto _L1
_L1:
        cancelSnackbarLocked(mCurrentSnackbar, i);
_L4:
        return;
_L2:
        if (isNextSnackbarLocked(callback))
        {
            cancelSnackbarLocked(mNextSnackbar, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public boolean isCurrent(Callback callback)
    {
        boolean flag;
        synchronized (mLock)
        {
            flag = isCurrentSnackbarLocked(callback);
        }
        return flag;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public boolean isCurrentOrNext(Callback callback)
    {
        Object obj = mLock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (isCurrentSnackbarLocked(callback) || isNextSnackbarLocked(callback))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public void onDismissed(Callback callback)
    {
        synchronized (mLock)
        {
            if (isCurrentSnackbarLocked(callback))
            {
                mCurrentSnackbar = null;
                if (mNextSnackbar != null)
                {
                    showNextSnackbarLocked();
                }
            }
        }
        return;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public void onShown(Callback callback)
    {
        synchronized (mLock)
        {
            if (isCurrentSnackbarLocked(callback))
            {
                scheduleTimeoutLocked(mCurrentSnackbar);
            }
        }
        return;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public void restoreTimeout(Callback callback)
    {
        synchronized (mLock)
        {
            if (isCurrentSnackbarLocked(callback))
            {
                scheduleTimeoutLocked(mCurrentSnackbar);
            }
        }
        return;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
    }

    public void show(int i, Callback callback)
    {
label0:
        {
            synchronized (mLock)
            {
                if (!isCurrentSnackbarLocked(callback))
                {
                    break label0;
                }
                mCurrentSnackbar.duration = i;
                mHandler.removeCallbacksAndMessages(mCurrentSnackbar);
                scheduleTimeoutLocked(mCurrentSnackbar);
            }
            return;
        }
        if (!isNextSnackbarLocked(callback))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        mNextSnackbar.duration = i;
_L1:
        if (mCurrentSnackbar == null || !cancelSnackbarLocked(mCurrentSnackbar, 4))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        callback;
        obj;
        JVM INSTR monitorexit ;
        throw callback;
        mNextSnackbar = new SnackbarRecord(i, callback);
          goto _L1
        mCurrentSnackbar = null;
        showNextSnackbarLocked();
        obj;
        JVM INSTR monitorexit ;
    }

}
