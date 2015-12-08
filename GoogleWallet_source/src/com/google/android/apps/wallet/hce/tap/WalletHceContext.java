// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import android.nfc.cardemulation.HostApduService;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager;
import com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor;
import com.google.android.apps.wallet.hce.tap.event.HceEventWorker;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.CloudPinManager;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceServiceWorker, WalletHceEventListener, TapListener

public class WalletHceContext
{

    private static final String TAG = com/google/android/apps/wallet/hce/tap/WalletHceContext.getSimpleName();
    private final CloudPinManager cloudPinManager;
    private volatile ExecutorService executorService;
    private final FeatureManager featureManager;
    private final Collection futures = Lists.newArrayList();
    private final HceEventMessageProcessor hceEventMessageProcessor;
    private volatile HceEventWorker hceEventWorker;
    private volatile boolean isActive;
    private final HceLibraryDatabase libraryDatabase;
    private final NfcPaymentSetupManager nfcSetupStateManager;
    private final System system;
    private final TapListener tapListener;

    WalletHceContext(TapListener taplistener, HceLibraryDatabase hcelibrarydatabase, HceEventMessageProcessor hceeventmessageprocessor, System system1, CloudPinManager cloudpinmanager, NfcPaymentSetupManager nfcpaymentsetupmanager, FeatureManager featuremanager)
    {
        isActive = false;
        tapListener = taplistener;
        libraryDatabase = hcelibrarydatabase;
        hceEventMessageProcessor = hceeventmessageprocessor;
        system = system1;
        cloudPinManager = cloudpinmanager;
        nfcSetupStateManager = nfcpaymentsetupmanager;
        featureManager = featuremanager;
    }

    public final void initialize()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isActive;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        WalletHceServiceWorker wallethceserviceworker = new WalletHceServiceWorker(tapListener, libraryDatabase);
        WalletHceEventListener wallethceeventlistener = new WalletHceEventListener(libraryDatabase, hceEventMessageProcessor, wallethceserviceworker, system, cloudPinManager, featureManager, tapListener);
        hceEventWorker = new HceEventWorker(hceEventMessageProcessor);
        executorService = Executors.newCachedThreadPool();
        hceEventMessageProcessor.setListener(wallethceeventlistener.asHceEventMessageProcessorListener());
        futures.add(executorService.submit(hceEventWorker));
        futures.add(executorService.submit(wallethceserviceworker));
        isActive = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void onDeactivated(HostApduService hostapduservice)
    {
        while (!isActive || !nfcSetupStateManager.isNfcPaymentSetupComplete()) 
        {
            return;
        }
        hceEventWorker.addDeactivateMessage(hostapduservice);
    }

    public final void processCommandApdu(byte abyte0[], HostApduService hostapduservice)
    {
        if (!isActive)
        {
            WLog.w(TAG, "Skipping processCommandApdu() due to inactive context");
        } else
        if (nfcSetupStateManager.isNfcPaymentSetupComplete())
        {
            hceEventWorker.addCommandApduMessage(abyte0, hostapduservice);
            return;
        }
    }

    public final void quiesce()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isActive;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = futures.iterator();
_L3:
        Future future;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        future = (Future)iterator.next();
        flag = future.isDone();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        future.get();
          goto _L3
        Object obj;
        obj;
        throw Throwables.propagate(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        future.cancel(true);
          goto _L3
        executorService.shutdownNow();
        futures.clear();
        isActive = false;
          goto _L1
    }

}
