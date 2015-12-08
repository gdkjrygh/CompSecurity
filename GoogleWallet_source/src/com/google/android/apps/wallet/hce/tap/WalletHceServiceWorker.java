// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceServiceWorkerOperation, TapListener, WalletHcePaymentEvent

class WalletHceServiceWorker
    implements Callable
{

    private static final String TAG = com/google/android/apps/wallet/hce/tap/WalletHceServiceWorker.getSimpleName();
    private final HceLibraryDatabase hceWalletDatabase;
    private final Deque operations = Lists.newLinkedList();
    private final TapListener tapListener;

    WalletHceServiceWorker(TapListener taplistener, HceLibraryDatabase hcelibrarydatabase)
    {
        tapListener = taplistener;
        hceWalletDatabase = hcelibrarydatabase;
    }

    private Void call()
        throws InterruptedException
    {
        do
        {
            processOperations();
        } while (true);
        Object obj;
        obj;
        WLog.dfmt(TAG, "interrupted exception", new Object[0]);
        throw obj;
        obj;
        WLog.d(TAG, "terminating");
        processOperations();
        throw obj;
        obj;
        WLog.dfmt(TAG, "terminating. RuntimeException: %s; stack trace: \n%s", new Object[] {
            obj, Joiner.on('\n').join(((RuntimeException) (obj)).getStackTrace())
        });
        throw obj;
    }

    private void processOperations()
        throws InterruptedException
    {
        Deque deque = operations;
        deque;
        JVM INSTR monitorenter ;
        for (; operations.isEmpty(); operations.wait()) { }
        break MISSING_BLOCK_LABEL_34;
        Exception exception;
        exception;
        deque;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj = Lists.newLinkedList(operations);
        operations.clear();
        deque;
        JVM INSTR monitorexit ;
        java.util.ArrayList arraylist = Lists.newArrayList();
        obj = ((Deque) (obj)).iterator();
        do
        {
            if (((Iterator) (obj)).hasNext())
            {
                Object obj1 = (WalletHceServiceWorkerOperation)((Iterator) (obj)).next();
                int i = ((WalletHceServiceWorkerOperation) (obj1)).getType();
                switch (i)
                {
                case 2: // '\002'
                default:
                    throw new IllegalStateException(String.format("Unexpected Operation type: %s", new Object[] {
                        Integer.valueOf(i)
                    }));

                case 1: // '\001'
                    arraylist.add(((WalletHceServiceWorkerOperation) (obj1)).getPpmsRowId());
                    break;

                case 3: // '\003'
                    WLog.d(TAG, "processing new payment event operation");
                    obj1 = ((WalletHceServiceWorkerOperation) (obj1)).getPaymentEvent();
                    tapListener.notifyOfTap(((WalletHcePaymentEvent) (obj1)));
                    break;
                }
                continue;
            }
            if (!arraylist.isEmpty())
            {
                hceWalletDatabase.moveToNextPaymentAppletAtcs(arraylist);
            }
            break;
        } while (true);
        return;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    final void incrementAtc(long l)
    {
        synchronized (operations)
        {
            operations.add(WalletHceServiceWorkerOperation.newIncrementAtcOperation(Long.valueOf(l)));
            operations.notify();
        }
        return;
        exception;
        deque;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final void newPaymentEvent(WalletHcePaymentEvent wallethcepaymentevent)
    {
        synchronized (operations)
        {
            operations.add(WalletHceServiceWorkerOperation.newPaymentEventOperation(wallethcepaymentevent));
            operations.notify();
        }
        return;
        wallethcepaymentevent;
        deque;
        JVM INSTR monitorexit ;
        throw wallethcepaymentevent;
    }

}
