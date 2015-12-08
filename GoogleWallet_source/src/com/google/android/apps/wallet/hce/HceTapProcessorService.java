// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.entitymanager.EntityId;
import com.google.android.apps.wallet.base.java.System;
import com.google.android.apps.wallet.device.DeviceInfoManager;
import com.google.android.apps.wallet.hce.tap.WalletHcePaymentEvent;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.tapandpay.ui.PaymentTryAgainActivity;
import com.google.android.apps.wallet.tapandpay.ui.TapActivity;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.common.base.Preconditions;

public class HceTapProcessorService extends IntentService
{

    private static final String TAG = com/google/android/apps/wallet/hce/HceTapProcessorService.getSimpleName();
    AnalyticsUtil analyticsUtil;
    DeviceInfoManager deviceInfoManager;
    System system;
    UserEventLogger userEventLogger;

    public HceTapProcessorService()
    {
        super(TAG);
        setIntentRedelivery(true);
    }

    private void handleTapFinished(Intent intent)
    {
        boolean flag2 = true;
        WLog.i(TAG, "Tap finished.");
        intent = (WalletHcePaymentEvent)intent.getParcelableExtra("paymentEvent");
        boolean flag = intent.isPositive();
        com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit = intent.getAtcLimit();
        boolean flag3 = intent.isPinExpired();
        WLog.ifmt(TAG, "Tap finished. isSuccessful: %s; atcError: %s; pinExpired: %s", new Object[] {
            Boolean.valueOf(flag), rotatingatclimit, Boolean.valueOf(flag3)
        });
        if (flag)
        {
            boolean flag1;
            if (rotatingatclimit == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1);
            if (!flag3)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1);
            showPaymentSuccess();
        } else
        {
            if (flag3)
            {
                userEventLogger.log(49, 335);
                startActivity(PinApi.createIntentForPaymentCloudPinEntry(this, com/google/android/apps/wallet/tapandpay/ui/PaymentTryAgainActivity.getCanonicalName()));
                return;
            }
            if (!showHcePaymentError(rotatingatclimit))
            {
                WLog.i(TAG, "Tap finished. Undiagnosed failure. Showing timeout screen.");
                TapActivity.notifyTapFinishedTimeout(this);
                return;
            }
        }
    }

    static void notifyTapCompleted(Context context, WalletHcePaymentEvent wallethcepaymentevent)
    {
        context.startService(InternalIntents.forClass(context, com/google/android/apps/wallet/hce/HceTapProcessorService).setAction("com.google.android.apps.wallet.hce.HCE_TAP_FINISHED").putExtra("paymentEvent", wallethcepaymentevent));
    }

    private boolean showHcePaymentError(com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit)
    {
        if (rotatingatclimit == null)
        {
            return false;
        }
        if (!rotatingatclimit.hasReachedCountLimit()) goto _L2; else goto _L1
_L1:
        userEventLogger.log(49, 286);
        TapActivity.notifyTapFinishedBundleUsedUp(this);
_L4:
        return true;
_L2:
        if (rotatingatclimit.hasReachedTimeLimit())
        {
            userEventLogger.log(49, 285);
            TapActivity.notifyTapFinishedBundleExpired(this, rotatingatclimit);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showPaymentSuccess()
    {
        Object obj = system;
        long l = System.currentTimeMillis();
        obj = new com.google.wallet.proto.NanoWalletEntities.NfcTapEvent();
        obj.id = deviceInfoManager.getNextEntityId().toEntityIdentifier();
        obj.purchaseTimeMillis = Long.valueOf(l);
        obj.partnerId = "TXVIA";
        WLog.i(TAG, "showDedupedPaymentSuccess: purchase records");
        TapActivity.notifyTapFinishedWaitingForResolution(this, ((com.google.wallet.proto.NanoWalletEntities.NfcTapEvent) (obj)));
    }

    protected void onHandleIntent(Intent intent)
    {
        UserInjector.inject(this, this);
        String s = intent.getAction();
        if ("com.google.android.apps.wallet.hce.HCE_TAP_FINISHED".equals(s))
        {
            handleTapFinished(intent);
            return;
        } else
        {
            WLog.wfmt(TAG, "Unknown intent action: %s", new Object[] {
                s
            });
            return;
        }
    }

}
