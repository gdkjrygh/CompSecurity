// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.rpc.GetHceFrontingInstrumentTask;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.common.math.LongMath;
import com.google.protobuf.nano.MessageNano;
import java.math.RoundingMode;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcPaymentSetupService, PaymentBundleRefreshService

public class PaymentBundleRefresher
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/PaymentBundleRefresher.getSimpleName();
    private final AlarmManager alarmManager;
    private final Application application;
    private final Provider gcmNetworkManager;
    private final Provider getHceFrontingInstrumentTask;
    private final HceLibraryDatabase hceDb;
    private final NfcPaymentSetupManager nfcPaymentSetupManager;
    private final System system;
    private final UserEventLogger userEventLogger;
    private final SharedPreferences userPrefs;

    PaymentBundleRefresher(Application application1, UserEventLogger usereventlogger, NfcPaymentSetupManager nfcpaymentsetupmanager, Provider provider, SharedPreferences sharedpreferences, HceLibraryDatabase hcelibrarydatabase, Provider provider1, 
            System system1, AlarmManager alarmmanager)
    {
        application = application1;
        userEventLogger = usereventlogger;
        nfcPaymentSetupManager = nfcpaymentsetupmanager;
        getHceFrontingInstrumentTask = provider;
        userPrefs = sharedpreferences;
        hceDb = hcelibrarydatabase;
        gcmNetworkManager = provider1;
        system = system1;
        alarmManager = alarmmanager;
    }

    public static PendingIntent backupBundleRefreshIntent(Context context)
    {
        return PendingIntent.getService(context, 0, InternalIntents.forClass(context, com/google/android/apps/wallet/hce/setup/NfcPaymentSetupService).setAction("com.google.android.apps.wallet.hce.setup.ACTION_BACKUP_BUNDLE_REFRESH"), 0x8000000);
    }

    private void logRefreshReason(int i)
    {
        WLog.dfmt(TAG, "refresh reason: (%d) %s", new Object[] {
            Integer.valueOf(i), NfcSetupApi.getDescription(i)
        });
        switch (i)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        default:
            return;

        case 1: // '\001'
            userEventLogger.log(49, 283);
            return;

        case 0: // '\0'
            userEventLogger.log(49, 284);
            return;

        case 5: // '\005'
            userEventLogger.log(49, 336);
            break;
        }
    }

    private void scheduleBackupRefresher()
    {
        WLog.d(TAG, "Setting up NFC backup refresher");
        alarmManager.cancel(backupBundleRefreshIntent(application));
        AlarmManager alarmmanager = alarmManager;
        System system1 = system;
        alarmmanager.setInexactRepeating(1, System.currentTimeMillis() + 0x5265c00L, 0x1499700L, backupBundleRefreshIntent(application));
    }

    public final void cancelAllScheduledBundleRefreshes()
    {
        WLog.d(TAG, "Cancelling all bundle refreshes");
        ((GcmNetworkManager)gcmNetworkManager.get()).cancelAllTasks(com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService);
        alarmManager.cancel(backupBundleRefreshIntent(application));
    }

    public final boolean refreshBundle(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (nfcPaymentSetupManager.isNfcPaymentSetupComplete()) goto _L2; else goto _L1
_L1:
        WLog.d(TAG, "HCE Bundle refresh requested when HCE payments not enabled");
        boolean flag = true;
_L7:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Object obj = hceDb.getSoleCard().getAtc();
        if (((RotatingAtc) (obj)).hasReachedThreshold() || i == 3)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        WLog.dfmt(TAG, "HCE Bundle refresh skipped b/c not at threshhold, reason: (%d) %s", new Object[] {
            Integer.valueOf(i), NfcSetupApi.getDescription(i)
        });
        scheduleRefresh(((RotatingAtc) (obj)));
        flag = true;
        continue; /* Loop/switch isn't completed */
        logRefreshReason(i);
        SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.remove(userPrefs);
        WLog.d(TAG, "Trying to refresh payment bundle.");
        obj = ((GetHceFrontingInstrumentTask)getHceFrontingInstrumentTask.get()).call();
        WLog.d(TAG, "bundle refresh successful");
        scheduleRefresh(((HcePaymentApplet) (obj)).getAtc());
        nfcPaymentSetupManager.generateNewEventAndPost();
        flag = true;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        WLog.d(TAG, "bundle refresh failed due to CallErrorException", ((Throwable) (obj1)));
        obj1 = ((CallErrorException) (obj1)).getCallError();
        ((com.google.wallet.proto.NanoWalletError.CallError) (obj1)).errorCode.intValue();
        JVM INSTR tableswitch 2 3: default 300
    //                   2 226
    //                   3 246;
           goto _L3 _L4 _L5
_L3:
        SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.put(userPrefs, MessageNano.toByteArray(((MessageNano) (obj1))));
        nfcPaymentSetupManager.generateNewEventAndPost();
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        WLog.d(TAG, "received hce_registration_required. this should never happen.");
        NfcPaymentSetupService.requestDisableHce(application);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L5:
        SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.put(userPrefs, MessageNano.toByteArray(((MessageNano) (obj1))));
        nfcPaymentSetupManager.generateNewEventAndPost();
        flag = true;
        continue; /* Loop/switch isn't completed */
        obj1;
        WLog.e(TAG, "bundle refresh failed due to exception", ((Throwable) (obj1)));
        nfcPaymentSetupManager.generateNewEventAndPost();
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        throw obj1;
    }

    public final void scheduleImmediateRefresh(int i)
    {
        WLog.d(TAG, "Scheduling immediate payment bundle refresh");
        com.google.android.gms.gcm.OneoffTask oneofftask = (new com.google.android.gms.gcm.OneoffTask.Builder()).setTag(String.valueOf(i)).setService(com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService).setExecutionWindow(0L, 1L).setUpdateCurrent(true).build();
        ((GcmNetworkManager)gcmNetworkManager.get()).schedule(oneofftask);
    }

    public final void scheduleRefresh(RotatingAtc rotatingatc)
    {
        scheduleBackupRefresher();
        System system1 = system;
        long l1 = System.currentTimeMillis();
        rotatingatc = rotatingatc.getLimits();
        long l = LongMath.divide(Math.max(0L, rotatingatc.getExpirationThresholdTimeClientEpoch() - l1), 1000L, RoundingMode.UP);
        long l2 = Math.max(0L, rotatingatc.getExpirationTimeClientEpoch() - rotatingatc.getExpirationThresholdTimeClientEpoch());
        l1 = Math.max(1L + l, LongMath.divide(Math.max(0L, (rotatingatc.getExpirationThresholdTimeClientEpoch() - l1) + LongMath.divide(l2, 2L, RoundingMode.DOWN)), 1000L, RoundingMode.DOWN));
        WLog.dfmt(TAG, "Scheduling bundle refresh, start/end window (secs): %d / %d", new Object[] {
            Long.valueOf(l), Long.valueOf(l1)
        });
        rotatingatc = (new com.google.android.gms.gcm.OneoffTask.Builder()).setTag("1").setService(com/google/android/apps/wallet/hce/setup/PaymentBundleRefreshService).setExecutionWindow(l, l1).setUpdateCurrent(true).build();
        ((GcmNetworkManager)gcmNetworkManager.get()).schedule(rotatingatc);
    }

}
