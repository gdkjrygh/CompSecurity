// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.WalletUserScopedBroadcastReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            C2dmDispatchService

public class C2dmRegistrationReceiver extends WalletUserScopedBroadcastReceiver
{

    private static final String TAG = com/google/android/apps/wallet/notifications/C2dmRegistrationReceiver.getSimpleName();
    FeatureManager featureManager;
    GoogleCloudMessaging gcm;

    public C2dmRegistrationReceiver()
    {
    }

    private void handleC2dm(Context context, Intent intent)
    {
        String s = intent.getExtras().getString("from");
        if ("walletc2dm@gmail.com".equals(s))
        {
            WLog.v(TAG, "Forwarding C2DM intent");
            sendReceiveIntentToWallet(context, intent);
            return;
        } else
        {
            WLog.ifmt(TAG, "Unknown sender %s for intent %s - ignoring", new Object[] {
                s, intent.toString()
            });
            return;
        }
    }

    private boolean handleGcm(Context context, Intent intent)
    {
        if (!featureManager.isFeatureEnabled(Feature.USE_ANDROID_GCM))
        {
            return false;
        }
        Object obj = gcm;
        obj = GoogleCloudMessaging.getMessageType(intent);
        if (!"gcm".equals(obj))
        {
            WLog.ifmt(TAG, "Unhandled GCM message type: %s", new Object[] {
                obj
            });
            return false;
        } else
        {
            WLog.v(TAG, "Forwarding GCM intent");
            sendReceiveIntentToWallet(context, intent);
            return true;
        }
    }

    private void handleReceive(Context context, Intent intent)
    {
        if (handleGcm(context, intent))
        {
            return;
        } else
        {
            handleC2dm(context, intent);
            return;
        }
    }

    private static void sendReceiveIntentToWallet(Context context, Intent intent)
    {
        context.startService(InternalIntents.forClass(context, com/google/android/apps/wallet/notifications/C2dmDispatchService).setAction("com.google.android.apps.wallet.services.c2dm.C2DM_RECEIVE").putExtras(intent));
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        String s1 = TAG;
        String s = String.valueOf(intent.getAction());
        if (s.length() != 0)
        {
            s = "Received intent with action: ".concat(s);
        } else
        {
            s = new String("Received intent with action: ");
        }
        WLog.v(s1, s);
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            handleReceive(context, intent);
        }
    }

}
