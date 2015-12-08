// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.database.HcePaymentAppletWithRowKey;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.Ppse;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.CloudPinManager;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.security.GeneralSecurityException;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            NfcSessionLog, WalletHcePaymentEvent, WalletHceServiceWorker, TapListener

class WalletHceEventListener
{

    private static final String TAG = com/google/android/apps/wallet/hce/tap/WalletHceEventListener.getSimpleName();
    private boolean apduSessionInProgress;
    private final CloudPinManager cloudPinManager;
    private HcePaymentApplet currentPaymentApplet;
    private long currentPaymentAppletRowId;
    private Ppse currentPpse;
    private final FeatureManager featureManager;
    private final HceLibraryDatabase hceDatabase;
    private final HceEventMessageProcessor hceEventMessageProcessor;
    private final com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor.Listener hceEventMessageProcessorListener = new com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor.Listener() {

        final WalletHceEventListener this$0;

        public final void onCommandApdu()
            throws GeneralSecurityException
        {
            if (!apduSessionInProgress)
            {
                apduSessionInProgress = true;
                initializePaymentObjectsFromDatabase();
            }
        }

        public final void onHceReset()
        {
            WLog.dfmt(WalletHceEventListener.TAG, "HCE reset; paymentSessionInProgress=%s", new Object[] {
                Boolean.valueOf(paymentSessionInProgress)
            });
            if (paymentSessionInProgress)
            {
                onTapComplete(false, null);
            }
            if (apduSessionInProgress)
            {
                apduSessionInProgress = false;
                clearPaymentObjects();
                return;
            } else
            {
                WLog.e(WalletHceEventListener.TAG, "received hce reset message, but mApduSessionInProgress is false");
                return;
            }
        }

            
            {
                this$0 = WalletHceEventListener.this;
                super();
            }
    };
    private final WalletHceServiceWorker hceWalletServiceWorker;
    private boolean paymentSessionInProgress;
    private boolean pinExpired;
    private final com.google.android.apps.wallet.hce.emv.HcePaymentApplet.Listener ppmsListener = new com.google.android.apps.wallet.hce.emv.HcePaymentApplet.Listener() {

        final WalletHceEventListener this$0;

        public final void onAtcReachedLimit(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onAtcReachedLimit()");
            onTapComplete(false, hcepaymentapplet.getAtc().getLimitDescription());
        }

        public final void onComputeCryptographicChecksum(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onComputeCryptographicChecksum()");
            if (pinExpired)
            {
                onTapComplete(false, null);
            }
        }

        public final void onComputeCryptographicChecksumData(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onComputeCryptographicChecksumData()");
            onTapComplete(true, null);
        }

        public final void onGetProcessingOptions(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onGetProcessingOptions()");
        }

        public final void onGetProcessingOptionsResponse(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onGetProcessingOptionsResponse()");
            hceWalletServiceWorker.incrementAtc(currentPaymentAppletRowId);
        }

        public final void onReadRecord(HcePaymentApplet hcepaymentapplet)
        {
            WLog.d(WalletHceEventListener.TAG, "onReadRecord()");
        }

        public final void onSelect(HcePaymentApplet hcepaymentapplet)
        {
            WLog.dfmt(WalletHceEventListener.TAG, "%s selected", new Object[] {
                hcepaymentapplet.getApplicationLabel()
            });
            onTapStarted();
        }

            
            {
                this$0 = WalletHceEventListener.this;
                super();
            }
    };
    private final com.google.android.apps.wallet.hce.emv.Ppse.Listener ppseListener = new com.google.android.apps.wallet.hce.emv.Ppse.Listener() {

        final WalletHceEventListener this$0;

        public final void onPpseSelect(Ppse ppse)
        {
            WLog.d(WalletHceEventListener.TAG, "PPSE selected");
            onTapStarted();
            ppse = WalletHceEventListener.this;
            System _tmp = system;
            ppse.addTapLogEntry(System.currentTimeMillis(), 3);
        }

            
            {
                this$0 = WalletHceEventListener.this;
                super();
            }
    };
    private final System system;
    private final TapListener tapListener;
    private List tapLog;
    private long tapStartTime;

    WalletHceEventListener(HceLibraryDatabase hcelibrarydatabase, HceEventMessageProcessor hceeventmessageprocessor, WalletHceServiceWorker wallethceserviceworker, System system1, CloudPinManager cloudpinmanager, FeatureManager featuremanager, TapListener taplistener)
    {
        currentPaymentAppletRowId = -1L;
        tapLog = Lists.newArrayListWithCapacity(4);
        hceDatabase = hcelibrarydatabase;
        hceEventMessageProcessor = hceeventmessageprocessor;
        hceWalletServiceWorker = wallethceserviceworker;
        system = system1;
        cloudPinManager = cloudpinmanager;
        featureManager = featuremanager;
        tapListener = taplistener;
    }

    private void addTapLogEntry(long l, int i)
    {
        com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog.PhysicalTapLogEvent physicaltaplogevent = new com.google.wallet.proto.NanoWalletLogging.PhysicalTapLog.PhysicalTapLogEvent();
        physicaltaplogevent.clientEventTimeMillis = Long.valueOf(l);
        physicaltaplogevent.type = Integer.valueOf(i);
        tapLog.add(physicaltaplogevent);
    }

    private void clearPaymentObjects()
    {
        currentPaymentAppletRowId = -1L;
        currentPaymentApplet = null;
        currentPpse = null;
    }

    private void initializePaymentObjectsFromDatabase()
        throws GeneralSecurityException
    {
        boolean flag = true;
        Object obj = hceDatabase.getAllPaymentApplets();
        if (((List) (obj)).size() == 0)
        {
            WLog.w(TAG, "tap before anything has been inserted into the database.");
            clearPaymentObjects();
            return;
        }
        WLog.dfmt(TAG, "%s found in the database. Choosing the first...", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        currentPpse = new Ppse();
        currentPpse.setListener(ppseListener);
        if (cloudPinManager.isCloudPinActive())
        {
            flag = false;
        }
        pinExpired = flag;
        hceEventMessageProcessor.setPpseApplet(currentPpse);
        obj = (HcePaymentAppletWithRowKey)((List) (obj)).get(0);
        currentPaymentApplet = ((HcePaymentAppletWithRowKey) (obj)).getPaymentApplet();
        currentPaymentApplet.setPinExpired(pinExpired);
        currentPaymentAppletRowId = ((HcePaymentAppletWithRowKey) (obj)).getKey();
        currentPaymentApplet.activate();
        currentPaymentApplet.setListener(ppmsListener);
        hceEventMessageProcessor.setPaymentApplet(currentPaymentApplet);
    }

    private void onTapComplete(boolean flag, com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit)
    {
        WLog.dfmt(TAG, "tap complete. success: %s; atcError: %s", new Object[] {
            Boolean.valueOf(flag), rotatingatclimit
        });
        Object obj = system;
        long l = System.currentTimeMillis();
        if (flag)
        {
            addTapLogEntry(l, 31);
        } else
        {
            addTapLogEntry(l, 32);
        }
        addTapLogEntry(l, 36);
        obj = new NfcSessionLog(tapLog, false, tapStartTime, l);
        rotatingatclimit = new WalletHcePaymentEvent(currentPaymentAppletRowId, flag, rotatingatclimit, ((NfcSessionLog) (obj)), pinExpired);
        hceWalletServiceWorker.newPaymentEvent(rotatingatclimit);
        paymentSessionInProgress = false;
        resetTapLog();
        tapStartTime = -1L;
    }

    private void onTapStarted()
    {
        if (!paymentSessionInProgress)
        {
            WLog.d(TAG, "tap started");
            tapListener.notifyTapStarted();
            Preconditions.checkState(apduSessionInProgress);
            paymentSessionInProgress = true;
            System system1 = system;
            tapStartTime = System.currentTimeMillis();
            addTapLogEntry(tapStartTime, 26);
        }
    }

    private void resetTapLog()
    {
        if (!tapLog.isEmpty())
        {
            tapLog = Lists.newArrayListWithCapacity(4);
        }
    }

    final com.google.android.apps.wallet.hce.tap.event.HceEventMessageProcessor.Listener asHceEventMessageProcessorListener()
    {
        return hceEventMessageProcessorListener;
    }














/*
    static boolean access$802(WalletHceEventListener wallethceeventlistener, boolean flag)
    {
        wallethceeventlistener.apduSessionInProgress = flag;
        return flag;
    }

*/

}
