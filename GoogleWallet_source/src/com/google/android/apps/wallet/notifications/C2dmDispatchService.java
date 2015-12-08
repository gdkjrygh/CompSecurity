// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.wallet.base.service.WalletContextParameter;
import com.google.android.apps.wallet.base.service.WalletIntentService;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.reset.api.ResetApi;
import com.google.android.apps.wallet.user.UserInfoManager;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.EnumSet;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            C2dmNotificationIntentProcessor

public class C2dmDispatchService extends WalletIntentService
{

    private static final String TAG = com/google/android/apps/wallet/notifications/C2dmDispatchService.getSimpleName();
    String accountName;
    C2dmNotificationIntentProcessor c2dmNotificationIntentProcessor;
    EventBus eventBus;
    FeatureManager featureManager;
    UserInfoManager userInfoManager;

    public C2dmDispatchService()
    {
        super(TAG, EnumSet.of(WalletContextParameter.RESTRICTIONS_SATISFIED, WalletContextParameter.SETUP_COMPLETE));
    }

    private void dispatchC2dmMessages(Intent intent)
    {
        String s5 = intent.getStringExtra("data.action");
        String s = intent.getStringExtra("data.obfuscated_gaia_id");
        String s4 = userInfoManager.getAccountName(s);
        if (!Strings.isNullOrEmpty(s5))
        {
            String s6 = TAG;
            String s1 = String.valueOf(s5);
            if (s1.length() != 0)
            {
                s1 = "Processing action: ".concat(s1);
            } else
            {
                s1 = new String("Processing action: ");
            }
            WLog.d(s6, s1);
            if (s4 != null && "RESET".equals(s5))
            {
                startService(ResetApi.createResetIntent(this, s4));
            } else
            {
                if ("NOTIFICATION_MESSAGE".equals(s5))
                {
                    if (accountName.equals(s4))
                    {
                        c2dmNotificationIntentProcessor.process(intent);
                        WLog.v(TAG, "NOTIFICATION_MESSAGE processed!");
                        return;
                    }
                    String s2 = TAG;
                    intent = String.valueOf(s4);
                    if (intent.length() != 0)
                    {
                        intent = "NOTIFICATION_MESSAGE for different account: ".concat(intent);
                    } else
                    {
                        intent = new String("NOTIFICATION_MESSAGE for different account: ");
                    }
                    WLog.v(s2, intent);
                    return;
                }
                if ("SYSTEM_NOTIFICATION".equals(s5))
                {
                    if (accountName.equals(s4))
                    {
                        handleSystemNotification(intent);
                        WLog.v(TAG, "SYSTEM_NOTIFICATION handled!");
                        return;
                    }
                    String s3 = TAG;
                    intent = String.valueOf(s4);
                    if (intent.length() != 0)
                    {
                        intent = "SYSTEM_NOTIFICATION for different account: ".concat(intent);
                    } else
                    {
                        intent = new String("SYSTEM_NOTIFICATION for different account: ");
                    }
                    WLog.v(s3, intent);
                    return;
                }
            }
        }
    }

    private void handleSystemNotification(Intent intent)
    {
        int i;
        i = 0;
        intent = intent.getExtras().getString("data.msg");
        if (!Strings.isNullOrEmpty(intent)) goto _L2; else goto _L1
_L1:
        WLog.e(TAG, "empty SystemNotification message");
_L6:
        return;
_L2:
        Object obj;
        int j;
        try
        {
            intent = ((com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle(), Base64.decode(intent, 0))).notification;
            j = intent.length;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            WLog.e(TAG, "error parsing SystemNotification", intent);
            return;
        }
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = intent[i];
        if (Protos.valuesEqual(((com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification) (obj)).type, 8))
        {
            startService(NfcSetupApi.getRefreshIntent(this, 3));
            break MISSING_BLOCK_LABEL_111;
        }
        eventBus.post(obj);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void doOnHandleIntent(Intent intent)
    {
        String s1 = intent.getAction();
        String s2 = TAG;
        String s = String.valueOf(intent.getAction());
        if (s.length() != 0)
        {
            s = "Received intent ".concat(s);
        } else
        {
            s = new String("Received intent ");
        }
        WLog.d(s2, s);
        if (s1.equals("com.google.android.apps.wallet.services.c2dm.C2DM_RECEIVE"))
        {
            dispatchC2dmMessages(intent);
            return;
        }
        s = TAG;
        intent = String.valueOf(intent.getAction());
        if (intent.length() != 0)
        {
            intent = "Received an unhandled intent ".concat(intent);
        } else
        {
            intent = new String("Received an unhandled intent ");
        }
        WLog.d(s, intent);
    }

}
