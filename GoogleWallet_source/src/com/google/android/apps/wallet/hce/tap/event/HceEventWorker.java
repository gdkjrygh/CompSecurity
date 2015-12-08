// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap.event;

import android.nfc.cardemulation.HostApduService;
import android.os.SystemClock;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.apps.wallet.hce.tap.event:
//            HceEventMessageProcessor, HceEventWorkerOperation

public class HceEventWorker
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/hce/tap/event/HceEventWorker.getSimpleName();
    private static final Void VOID = null;
    private final HceEventMessageProcessor mHceEventMessageProcessor;
    private final Deque mOperations = Lists.newLinkedList();
    private boolean mRunning;

    public HceEventWorker(HceEventMessageProcessor hceeventmessageprocessor)
    {
        mRunning = true;
        mHceEventMessageProcessor = hceeventmessageprocessor;
    }

    private void addOperation(HceEventWorkerOperation hceeventworkeroperation)
    {
        Deque deque = mOperations;
        deque;
        JVM INSTR monitorenter ;
        if (!mRunning)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        mOperations.addLast(hceeventworkeroperation);
        mOperations.notify();
_L2:
        return;
        WLog.w(TAG, "Received message, but no longer running!");
        if (true) goto _L2; else goto _L1
_L1:
        hceeventworkeroperation;
        deque;
        JVM INSTR monitorexit ;
        throw hceeventworkeroperation;
    }

    private Void call()
        throws Exception
    {
        Void void1;
        processOperations();
        void1 = VOID;
        WLog.d(TAG, "terminating");
        drainOperations();
        mHceEventMessageProcessor.reset();
        return void1;
        Object obj;
        obj;
        WLog.dfmt(TAG, "terminating. exception: %s; stack trace:\n%s", new Object[] {
            obj, Joiner.on('\n').join(((Exception) (obj)).getStackTrace())
        });
        throw obj;
        obj;
        WLog.d(TAG, "terminating");
        drainOperations();
        mHceEventMessageProcessor.reset();
        throw obj;
    }

    private void drainOperations()
    {
        java.util.ArrayList arraylist;
        synchronized (mOperations)
        {
            mRunning = false;
            arraylist = Lists.newArrayList(mOperations);
            mOperations.clear();
        }
        for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); processOperation((HceEventWorkerOperation)((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_69;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private HceEventWorkerOperation pollFirst()
    {
        Deque deque = mOperations;
        deque;
        JVM INSTR monitorenter ;
        HceEventWorkerOperation hceeventworkeroperation;
        Exception exception;
        boolean flag;
        if (!mOperations.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        hceeventworkeroperation = (HceEventWorkerOperation)mOperations.pollFirst();
        deque;
        JVM INSTR monitorexit ;
        return hceeventworkeroperation;
        exception;
        deque;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean processOperation(HceEventWorkerOperation hceeventworkeroperation)
    {
        try
        {
            mHceEventMessageProcessor.processOperation(hceeventworkeroperation);
        }
        // Misplaced declaration of an exception variable
        catch (HceEventWorkerOperation hceeventworkeroperation)
        {
            WLog.dfmt(TAG, "EOF: %s", new Object[] {
                hceeventworkeroperation
            });
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (HceEventWorkerOperation hceeventworkeroperation)
        {
            WLog.dfmt(TAG, hceeventworkeroperation, "handleMessage: %s", new Object[] {
                hceeventworkeroperation
            });
            return true;
        }
        return false;
    }

    private void processOperations()
        throws InterruptedException
    {
        boolean flag = true;
_L3:
        if (!flag) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag;
        HceEventWorkerOperation hceeventworkeroperation = takeFirst();
        flag = false;
_L4:
        flag1 = flag;
        flag = processOperation(hceeventworkeroperation);
        flag1 = flag;
        flag = flag1;
        if (flag1)
        {
            mHceEventMessageProcessor.reset();
            flag = flag1;
        }
          goto _L3
_L2:
        flag1 = flag;
        hceeventworkeroperation = waitPollFirst(2000L);
          goto _L4
        Object obj;
        obj;
        flag1 = flag;
        WLog.wfmt(TAG, "Timeout: %s", new Object[] {
            obj
        });
        flag = true;
        mHceEventMessageProcessor.reset();
          goto _L3
        obj;
        if (flag1)
        {
            mHceEventMessageProcessor.reset();
        }
        throw obj;
    }

    private HceEventWorkerOperation takeFirst()
        throws InterruptedException
    {
        Deque deque = mOperations;
        deque;
        JVM INSTR monitorenter ;
        for (; mOperations.isEmpty(); mOperations.wait()) { }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        deque;
        JVM INSTR monitorexit ;
        throw exception;
        HceEventWorkerOperation hceeventworkeroperation = pollFirst();
        deque;
        JVM INSTR monitorexit ;
        return hceeventworkeroperation;
    }

    private HceEventWorkerOperation waitPollFirst(long l)
        throws TimeoutException, InterruptedException
    {
        l = SystemClock.elapsedRealtime() + l;
        Deque deque = mOperations;
        deque;
        JVM INSTR monitorenter ;
_L1:
        long l1;
        if (!mOperations.isEmpty())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        l1 = SystemClock.elapsedRealtime();
        if (l1 >= l)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        mOperations.wait(l - l1);
          goto _L1
        Exception exception;
        exception;
        deque;
        JVM INSTR monitorexit ;
        throw exception;
        HceEventWorkerOperation hceeventworkeroperation;
        if (mOperations.isEmpty())
        {
            throw new TimeoutException("Timeout waiting for APDU");
        }
        hceeventworkeroperation = pollFirst();
        deque;
        JVM INSTR monitorexit ;
        return hceeventworkeroperation;
    }

    public final void addCommandApduMessage(byte abyte0[], HostApduService hostapduservice)
    {
        addOperation(HceEventWorkerOperation.newMessageOperation(abyte0, hostapduservice));
    }

    public final void addDeactivateMessage(HostApduService hostapduservice)
    {
        addOperation(HceEventWorkerOperation.newDeactivatedOperation(hostapduservice));
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

}
