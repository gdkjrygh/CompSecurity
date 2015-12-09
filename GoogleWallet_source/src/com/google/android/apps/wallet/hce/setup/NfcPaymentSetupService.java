// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.service.WalletContextParameter;
import com.google.android.apps.wallet.base.service.WalletIntentService;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.hce.database.HceLibraryDatabase;
import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.hce.rpc.GetHceFrontingInstrumentTask;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupManager;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState;
import com.google.android.apps.wallet.hce.tap.WalletHceContext;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.List;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            PaymentBundleRefresher

public class NfcPaymentSetupService extends WalletIntentService
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/NfcPaymentSetupService.getSimpleName();
    FeatureManager featureManager;
    Provider getHceFrontingInstrumentTaskProvider;
    WalletHceContext hceContext;
    HceLibraryDatabase hceLibraryDatabase;
    NfcPaymentSetupManager nfcSetupStateManager;
    Provider notificationManager;
    PackageManager packageManager;
    PaymentBundleRefresher paymentBundleRefresher;
    SharedPreferences sharedPreferences;
    UserEventLogger userEventLogger;

    public NfcPaymentSetupService()
    {
        super(TAG, EnumSet.of(WalletContextParameter.SETUP_COMPLETE));
    }

    private void disableHce()
    {
        SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.remove(sharedPreferences);
        paymentBundleRefresher.cancelAllScheduledBundleRefreshes();
        hceLibraryDatabase.delete();
        disableWalletHceService();
        nfcSetupStateManager.setNfcPaymentSetupState(NfcPaymentSetupState.NOT_STARTED);
    }

    private void disableWalletHceService()
    {
        if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            packageManager.setComponentEnabledSetting(new ComponentName(this, "com.google.android.apps.wallet.hce.WalletHceService"), 0, 1);
        }
    }

    private void enableNfcPayments(Intent intent)
    {
        if (!featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            nfcSetupStateManager.setNfcPaymentSetupState(NfcPaymentSetupState.NOT_STARTED);
            return;
        }
        WLog.dfmt(TAG, "Enabling NFC payments: %s", new Object[] {
            intent
        });
        userEventLogger.log(46, 241);
        if (initializeHce())
        {
            WLog.d(TAG, "Successfully setup NFC payments!");
            nfcSetupStateManager.setNfcPaymentSetupState(NfcPaymentSetupState.COMPLETE);
            userEventLogger.log(46, 242);
            return;
        } else
        {
            WLog.d(TAG, "Failed to setup NFC payments");
            userEventLogger.log(46, 259);
            nfcSetupStateManager.setNfcPaymentSetupState(NfcPaymentSetupState.FAILED);
            return;
        }
    }

    private void enableWalletHceService()
    {
        packageManager.setComponentEnabledSetting(new ComponentName(this, "com.google.android.apps.wallet.hce.WalletHceService"), 1, 1);
    }

    private boolean initializeHce()
    {
        if (nfcSetupStateManager.isNfcPaymentSetupComplete())
        {
            return true;
        }
        ((NotificationManager)notificationManager.get()).cancel(14);
        SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.remove(sharedPreferences);
        try
        {
            WLog.d(TAG, "getting payment bundle.");
            HcePaymentApplet hcepaymentapplet = ((GetHceFrontingInstrumentTask)getHceFrontingInstrumentTaskProvider.get()).call();
            paymentBundleRefresher.scheduleRefresh(hcepaymentapplet.getAtc());
        }
        catch (CallErrorException callerrorexception)
        {
            com.google.wallet.proto.NanoWalletError.CallError callerror = callerrorexception.getCallError();
            SharedPreference.GET_HCE_BUNDLE_CALL_ERROR.put(sharedPreferences, com.google.wallet.proto.NanoWalletError.CallError.toByteArray(callerror));
            return false;
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            WLog.e(TAG, "GeneralSecurityException. this should never happen");
            return false;
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            return false;
        }
        catch (RpcException rpcexception)
        {
            return false;
        }
        enableWalletHceService();
        return true;
    }

    private void maybeScheduleImmediateBundleRefresh()
    {
        List list = hceLibraryDatabase.getAllAtcs();
        WLog.d(TAG, "NFC backup refresh successfully ran");
        if (list.isEmpty() || ((RotatingAtc)list.get(0)).hasReachedLimit())
        {
            WLog.d(TAG, "NFC backup refresh found no fresh bundles. Refreshing...");
            paymentBundleRefresher.scheduleImmediateRefresh(5);
        }
    }

    public static void requestDisableHce(Context context)
    {
        context.startService(InternalIntents.forClass(context, com/google/android/apps/wallet/hce/setup/NfcPaymentSetupService).setAction("com.google.android.apps.wallet.hce.setup.DISABLE_HCE"));
    }

    public static void requestHceSetupOnBoot(Context context)
    {
        context.startService(InternalIntents.forClass(context, com/google/android/apps/wallet/hce/setup/NfcPaymentSetupService).setAction("com.google.android.apps.wallet.hce.setup.ACTION_SETUP_HCE_ON_BOOT"));
    }

    public static void requestNfcPaymentSetup(Context context)
    {
        context.startService(InternalIntents.forClass(context, com/google/android/apps/wallet/hce/setup/NfcPaymentSetupService).setAction("com.google.android.apps.wallet.hce.setup.ENABLE_NFC_PAYMENTS"));
    }

    private void setupHceOnBoot()
    {
        if (!nfcSetupStateManager.isNfcPaymentSetupComplete())
        {
            disableWalletHceService();
            return;
        }
        if (!featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            disableHce();
            return;
        } else
        {
            WLog.d(TAG, "setting up hce bundle refresh on boot");
            HcePaymentApplet hcepaymentapplet = hceLibraryDatabase.getSoleCard();
            paymentBundleRefresher.scheduleRefresh(hcepaymentapplet.getAtc());
            hceContext.initialize();
            enableWalletHceService();
            return;
        }
    }

    protected final void doOnHandleIntent(Intent intent)
    {
        String s = intent.getAction();
        WLog.dfmt(TAG, "onHandleIntent. action: %s", new Object[] {
            s
        });
        if ("com.google.android.apps.wallet.hce.setup.ENABLE_NFC_PAYMENTS".equals(s))
        {
            enableNfcPayments(intent);
            return;
        }
        if ("com.google.android.apps.wallet.hce.setup.ACTION_REFRESH_HCE_BUNDLE".equals(s))
        {
            int i = intent.getIntExtra("reason", -1);
            paymentBundleRefresher.scheduleImmediateRefresh(i);
            return;
        }
        if ("com.google.android.apps.wallet.hce.setup.DISABLE_HCE".equals(s))
        {
            disableHce();
            return;
        }
        if ("com.google.android.apps.wallet.hce.setup.ACTION_SETUP_HCE_ON_BOOT".equals(s))
        {
            setupHceOnBoot();
            return;
        }
        if ("com.google.android.apps.wallet.hce.setup.ACTION_BACKUP_BUNDLE_REFRESH".equals(s))
        {
            maybeScheduleImmediateBundleRefresh();
            return;
        } else
        {
            throw new IllegalStateException(String.format("unrecognized intent action: %s", new Object[] {
                s
            }));
        }
    }

}
