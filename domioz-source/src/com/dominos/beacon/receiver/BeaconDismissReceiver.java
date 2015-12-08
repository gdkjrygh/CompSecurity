// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.receiver;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.utils.AnalyticsUtil;

public class BeaconDismissReceiver extends BroadcastReceiver
{

    private static final String TAG = com/dominos/beacon/receiver/BeaconDismissReceiver.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;

    public BeaconDismissReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent != null && StringHelper.equals(intent.getAction(), "com.dominos.intent.action.NOTIFICATION_DISMISSED"))
            {
                LogUtil.d(TAG, "Customer dismissed the beacon welcome notification.", new Object[0]);
                if (!((KeyguardManager)context.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
                {
                    break label0;
                }
                mAnalyticsUtil.postOnEventRejectedNotificationLocked();
                LogUtil.d(TAG, "Dismissed welcome notification when device locked.", new Object[0]);
            }
            return;
        }
        mAnalyticsUtil.postOnEventRejectedNotificationUnlocked();
        LogUtil.d(TAG, "Dismissed welcome notification when device unlocked.", new Object[0]);
    }

}
