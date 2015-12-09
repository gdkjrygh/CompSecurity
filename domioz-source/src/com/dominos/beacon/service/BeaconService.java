// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.beacon.api.BeaconAPI;
import com.dominos.beacon.manager.BeaconManager;
import com.dominos.beacon.model.Beacon;
import com.dominos.beacon.scanner.BeaconScanner;
import com.dominos.beacon.util.BeaconUtil;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.beacon.service:
//            BeaconService_

public class BeaconService extends Service
    implements com.dominos.beacon.scanner.BeaconScanner.OnBeaconListener
{

    private static final int ALARM_SCHEDULE_TIME = 0x36ee80;
    private static final int SCAN_DELAY_IN_MS = 5000;
    private static final int SCAN_TIME_IN_MS = 10000;
    private static final String TAG = com/dominos/beacon/service/BeaconService.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;
    BeaconAPI mBeaconAPI;
    private BeaconManager mBeaconManager;
    private BeaconScanner mBeaconScanner;
    private int mDelayMillis;
    private Handler mHandler;
    MobileSession mMobileSession;
    private int mScanTime;
    private Runnable mScannerRunnable;

    public BeaconService()
    {
        mHandler = new Handler();
        mScannerRunnable = new _cls1();
    }

    private void cancelScheduledAlarm()
    {
        ((AlarmManager)getSystemService("alarm")).cancel(createAlarmPendingIntent());
    }

    private PendingIntent createAlarmPendingIntent()
    {
        Intent intent = new Intent(this, com/dominos/beacon/service/BeaconService_);
        intent.setAction("beacon.intent.action.BEACON_STOP");
        return PendingIntent.getService(this, 0, intent, 0);
    }

    private void release()
    {
        if (mBeaconScanner != null)
        {
            mBeaconScanner.stop();
        }
        mHandler.removeCallbacks(mScannerRunnable);
    }

    private boolean scanForBeacon()
    {
        if (BluetoothAdapter.getDefaultAdapter().getState() == 12)
        {
            if (mBeaconScanner == null)
            {
                mBeaconScanner = BeaconScanner.newInstance(this, this, mScanTime);
            }
            if (mBeaconScanner != null)
            {
                mBeaconScanner.start();
                return true;
            }
        }
        return false;
    }

    private void scheduleAlarmToStopService()
    {
        ((AlarmManager)getSystemService("alarm")).set(0, System.currentTimeMillis() + 0x36ee80L, createAlarmPendingIntent());
    }

    private void stopAndSchedule()
    {
        release();
        mHandler.postDelayed(mScannerRunnable, mDelayMillis);
    }

    public void onBeaconFound(Beacon beacon)
    {
        if (BeaconUtil.isRegisteredBeacon(beacon.getUuid()))
        {
            release();
            mBeaconManager.onBeaconFound(beacon);
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        release();
        cancelScheduledAlarm();
        mBeaconManager.onBeaconServiceStopped();
        super.onDestroy();
    }

    public void onScanFinished()
    {
        release();
        stopAndSchedule();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        byte byte0;
        byte0 = 2;
        if (!mBeaconAPI.hasDeviceSupportBeacon())
        {
            LogUtil.d(TAG, "BLE Feature not supported by this device.", new Object[0]);
            stopSelf();
            return 2;
        }
        if (intent == null || !StringHelper.isNotEmpty(intent.getAction())) goto _L2; else goto _L1
_L1:
        String s;
        mDelayMillis = 5000;
        mScanTime = 10000;
        s = intent.getAction();
        s.hashCode();
        JVM INSTR lookupswitch 3: default 104
    //                   -1780702505: 156
    //                   -57441587: 188
    //                   1136570180: 172;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0 = -1;
_L9:
        byte0;
        JVM INSTR tableswitch 0 1: default 132
    //                   0 201
    //                   1 201;
           goto _L7 _L8 _L8
_L7:
        stopSelf();
        LogUtil.d(TAG, "Unknown beacon service action", new Object[0]);
_L2:
        return super.onStartCommand(intent, i, j);
_L4:
        if (!s.equals("beacon.intent.action.BEACON_START"))
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = 0;
          goto _L9
_L6:
        if (!s.equals("beacon.intent.action.BEACON_RESTART"))
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = 1;
          goto _L9
_L5:
        if (!s.equals("beacon.intent.action.BEACON_STOP")) goto _L3; else goto _L9
_L8:
        LogUtil.d(TAG, "Beacon service starting..", new Object[0]);
        if (intent.getExtras() != null)
        {
            mDelayMillis = intent.getExtras().getInt("beacon.delay");
            mScanTime = intent.getExtras().getInt("beacon.scan.time");
        }
        if (scanForBeacon())
        {
            scheduleAlarmToStopService();
        } else
        {
            stopSelf();
        }
          goto _L2
    }

    public void onTaskRemoved(Intent intent)
    {
        release();
    }

    protected void setup()
    {
        mBeaconManager = (BeaconManager)mMobileSession.getManager("beacon_manager");
    }

    public boolean stopService(Intent intent)
    {
        release();
        cancelScheduledAlarm();
        return super.stopService(intent);
    }



    private class _cls1
        implements Runnable
    {

        final BeaconService this$0;

        public void run()
        {
            scanForBeacon();
        }

        _cls1()
        {
            this$0 = BeaconService.this;
            super();
        }
    }

}
