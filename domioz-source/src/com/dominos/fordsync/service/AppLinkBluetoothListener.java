// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync.service;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;

// Referenced classes of package com.dominos.fordsync.service:
//            AppLinkManager

public class AppLinkBluetoothListener extends BroadcastReceiver
{

    private static final String LOG_TAG = "FORDSYNC_AppLinkManager";
    AppLinkManager mAppLinkManager;

    public AppLinkBluetoothListener()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.v("FORDSYNC_AppLinkManager", "onReceive[%s]", new Object[] {
            intent
        });
        context = intent.getAction();
        intent = (BluetoothDevice)intent.getExtras().getParcelable("android.bluetooth.device.extra.DEVICE");
        if (StringHelper.equalsIgnoreCase(context, "android.bluetooth.device.action.ACL_CONNECTED") && intent != null)
        {
            (new BluetoothDeviceBondStateHandler(intent)).start();
        } else
        if (StringHelper.equalsIgnoreCase(context, "android.bluetooth.device.action.ACL_DISCONNECTED"))
        {
            LogUtil.v("FORDSYNC_AppLinkManager", "AppLinkManager stop", new Object[0]);
            mAppLinkManager.stop();
            return;
        }
    }

    private class BluetoothDeviceBondStateHandler extends Thread
    {

        private static final int BT_ATTEMPT_LIMIT = 50;
        private static final int BT_WAIT_SECONDS = 2;
        private BluetoothDevice mBluetoothDevice;
        private boolean mShouldWait;
        final AppLinkBluetoothListener this$0;

        public void run()
        {
            int i;
            super.run();
            i = 0;
_L8:
            int j = i;
            if (mBluetoothDevice == null) goto _L2; else goto _L1
_L1:
            mBluetoothDevice.getBondState();
            JVM INSTR tableswitch 10 12: default 48
        //                       10 66
        //                       11 87
        //                       12 120;
               goto _L3 _L4 _L5 _L6
_L6:
            break MISSING_BLOCK_LABEL_120;
_L3:
            j = i;
_L2:
            if (!mShouldWait)
            {
                break; /* Loop/switch isn't completed */
            }
            i = j;
            if (j < 50) goto _L8; else goto _L7
_L7:
            return;
_L4:
            LogUtil.v("FORDSYNC_AppLinkManager", "BT Device not bonded.", new Object[0]);
            mShouldWait = false;
            j = i;
              goto _L2
_L5:
            LogUtil.v("FORDSYNC_AppLinkManager", "BT Device bonding...", new Object[0]);
            mShouldWait = true;
            j = i + 1;
            try
            {
                Thread.sleep(2000L);
            }
            catch (InterruptedException interruptedexception) { }
              goto _L2
            LogUtil.v("FORDSYNC_AppLinkManager", "BT Device bonded.", new Object[0]);
            mShouldWait = false;
            mAppLinkManager.start();
            j = i;
              goto _L2
        }

        public BluetoothDeviceBondStateHandler(BluetoothDevice bluetoothdevice)
        {
            this$0 = AppLinkBluetoothListener.this;
            super();
            mShouldWait = false;
            mBluetoothDevice = bluetoothdevice;
        }
    }

}
