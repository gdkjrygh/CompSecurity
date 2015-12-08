// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.receiver;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.beacon.manager.BeaconManager;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.util.BeaconNotificationUI;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;

public class BeaconReceiver extends BroadcastReceiver
{

    private static final String TAG = com/dominos/beacon/receiver/BeaconReceiver.getSimpleName();
    ActivityHelper mActivityHelper;
    AnalyticsUtil mAnalyticsUtil;
    private BeaconManager mBeaconManager;
    MobileSession mMobileSession;
    BeaconNotificationUI mNotificationUI;

    public BeaconReceiver()
    {
    }

    private void onCustomerInGeoFenceRegion(int i)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (BluetoothAdapter.getDefaultAdapter().getState() != 10) goto _L4; else goto _L3
_L3:
        mBeaconManager.stopBeaconService();
_L6:
        return;
_L4:
        if (BluetoothAdapter.getDefaultAdapter().getState() == 12)
        {
            mBeaconManager.startBeaconService();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i == 2)
        {
            mBeaconManager.stopBeaconService();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onAfterInject()
    {
        mBeaconManager = (BeaconManager)mMobileSession.getManager("beacon_manager");
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && !TextUtils.isEmpty(intent.getAction())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        byte byte0;
        s = intent.getAction();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 60
    //                   -1530327060: 152
    //                   -1044507092: 137
    //                   383596404: 122;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_152;
_L7:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            LogUtil.d(TAG, "ACTION - Geo Fence Found", new Object[0]);
            if (intent.getExtras() != null)
            {
                onCustomerInGeoFenceRegion(intent.getExtras().getInt("geofence.status"));
                return;
            }
            break;

        case 1: // '\001'
            LogUtil.d(TAG, "ACTION - Beacon welcome notification check-in", new Object[0]);
            mNotificationUI.cancel();
            mAnalyticsUtil.postOnEventAcceptedNotification();
            CarryoutOrder carryoutorder = (CarryoutOrder)intent.getParcelableExtra("beacon.order");
            boolean flag = intent.getBooleanExtra("beacon.profile.user", false);
            intent = (Beacon)intent.getParcelableExtra("beacon.device");
            mBeaconManager.checkInCustomer(context, carryoutorder, flag, intent);
            return;

        case 2: // '\002'
            LogUtil.d(TAG, "ACTION - Bluetooth settings changed", new Object[0]);
            mBeaconManager.stopBeaconService();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s.equals("geofence.FOUND"))
        {
            byte0 = 0;
        }
          goto _L7
_L5:
        if (s.equals("beacon.intent.action.CHECK_IN"))
        {
            byte0 = 1;
        }
          goto _L7
        if (s.equals("android.bluetooth.adapter.action.STATE_CHANGED"))
        {
            byte0 = 2;
        }
          goto _L7
        if (true) goto _L1; else goto _L8
_L8:
    }

}
