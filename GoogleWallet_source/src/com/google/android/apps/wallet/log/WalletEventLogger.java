// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.log;

import android.os.Process;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.common.util.concurrent.Uninterruptibles;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.log:
//            EventLogDataStore, EventLogUploadService

public class WalletEventLogger
{

    private static final String TAG = com/google/android/apps/wallet/log/WalletEventLogger.getSimpleName();
    private final EventLogDataStore eventLogDataStore;
    private final Executor executor;
    private final Provider gcmNetworkManager;
    private final AtomicBoolean isUploadPending;
    private final BlockingQueue queue;
    private final System system;
    private final String versionName;

    WalletEventLogger(EventLogDataStore eventlogdatastore, System system1, Executor executor1, BlockingQueue blockingqueue, AtomicBoolean atomicboolean, Provider provider, String s)
    {
        eventLogDataStore = eventlogdatastore;
        system = system1;
        executor = executor1;
        queue = blockingqueue;
        isUploadPending = atomicboolean;
        gcmNetworkManager = provider;
        versionName = s;
        initialize();
    }

    private void initialize()
    {
        executor.execute(new Runnable() {

            final WalletEventLogger this$0;

            public final void run()
            {
                do
                {
                    pollForNewEvent();
                } while (true);
            }

            
            {
                this$0 = WalletEventLogger.this;
                super();
            }
        });
    }

    public final void logEvent(com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog)
    {
        com.google.wallet.proto.NanoWalletLogging.EventContext eventcontext = new com.google.wallet.proto.NanoWalletLogging.EventContext();
        System system1 = system;
        eventcontext.clientEventTimeMicros = Long.valueOf(System.currentTimeMillis() * 1000L);
        eventcontext.processId = Integer.valueOf(Process.myPid());
        eventcontext.clientVersion = versionName;
        walleteventlog.eventContext = eventcontext;
        if (!queue.offer(walleteventlog))
        {
            WLog.e(TAG, "Dropping new WalletEventLog because queue is at capacity");
        }
    }

    final void pollForNewEvent()
    {
        com.google.wallet.proto.NanoWalletLogging.WalletEventLog walleteventlog = (com.google.wallet.proto.NanoWalletLogging.WalletEventLog)Uninterruptibles.takeUninterruptibly(queue);
        eventLogDataStore.persistEvent(walleteventlog);
        if (isUploadPending.compareAndSet(false, true))
        {
            com.google.android.gms.gcm.OneoffTask oneofftask = (new com.google.android.gms.gcm.OneoffTask.Builder()).setTag("uploadEventLogs").setService(com/google/android/apps/wallet/log/EventLogUploadService).setExecutionWindow(0L, 120L).build();
            ((GcmNetworkManager)gcmNetworkManager.get()).schedule(oneofftask);
        }
    }

}
