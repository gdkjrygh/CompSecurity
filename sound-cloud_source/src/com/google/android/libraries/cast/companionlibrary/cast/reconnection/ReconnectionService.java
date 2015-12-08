// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.reconnection;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.PreferenceAccessor;
import java.util.Timer;
import java.util.TimerTask;

public class ReconnectionService extends Service
{

    private static final long EPSILON_MS = 500L;
    private static final int RECONNECTION_ATTEMPT_PERIOD_S = 15;
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/reconnection/ReconnectionService);
    private VideoCastManager mCastManager;
    private Timer mEndTimer;
    private TimerTask mEndTimerTask;
    private BroadcastReceiver mScreenOnOffBroadcastReceiver;
    private BroadcastReceiver mWifiBroadcastReceiver;
    private boolean mWifiConnectivity;

    public ReconnectionService()
    {
        mWifiConnectivity = true;
    }

    private void clearEndTimer()
    {
        if (mEndTimerTask != null)
        {
            mEndTimerTask.cancel();
            mEndTimerTask = null;
        }
        if (mEndTimer != null)
        {
            mEndTimer.cancel();
            mEndTimer = null;
        }
    }

    private long getMediaRemainingTime()
    {
        return mCastManager.getPreferenceAccessor().getLongFromPreference("media-end", 0L) - SystemClock.elapsedRealtime();
    }

    private void handleTermination()
    {
        long l;
        l = 0L;
        if (!mCastManager.isConnected())
        {
            mCastManager.clearMediaSession();
            mCastManager.clearPersistedConnectionInfo(0);
            stopSelf();
            return;
        }
        boolean flag = mCastManager.isRemoteStreamLive();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj;
        long l1;
        if (l < 500L)
        {
            stopSelf();
            return;
        } else
        {
            mCastManager.getPreferenceAccessor().saveLongToPreference("media-end", Long.valueOf(l + SystemClock.elapsedRealtime()));
            LogUtils.LOGD(TAG, "handleTermination(): resetting the timer");
            setUpEndTimer();
            return;
        }
_L2:
        l1 = mCastManager.getMediaTimeRemaining();
        l = l1;
          goto _L1
        obj;
_L3:
        LogUtils.LOGE(TAG, "Failed to calculate the time left for media due to lack of connectivity", ((Throwable) (obj)));
          goto _L1
        obj;
          goto _L3
    }

    private void setUpEndTimer()
    {
        LogUtils.LOGD(TAG, "setUpEndTimer(): setting up a timer for the end of current media");
        long l = getMediaRemainingTime();
        if (l <= 0L)
        {
            stopSelf();
            return;
        } else
        {
            clearEndTimer();
            mEndTimer = new Timer();
            mEndTimerTask = new _cls3();
            mEndTimer.schedule(mEndTimerTask, l);
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        LogUtils.LOGD(TAG, "onCreate() is called");
        mCastManager = VideoCastManager.getInstance();
        if (!mCastManager.isConnected() && !mCastManager.isConnecting())
        {
            mCastManager.reconnectSessionIfPossible();
        }
        IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        mScreenOnOffBroadcastReceiver = new _cls1();
        registerReceiver(mScreenOnOffBroadcastReceiver, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.wifi.STATE_CHANGE");
        mWifiBroadcastReceiver = new _cls2();
        registerReceiver(mWifiBroadcastReceiver, intentfilter);
        super.onCreate();
    }

    public void onDestroy()
    {
        LogUtils.LOGD(TAG, "onDestroy()");
        if (mScreenOnOffBroadcastReceiver != null)
        {
            unregisterReceiver(mScreenOnOffBroadcastReceiver);
            mScreenOnOffBroadcastReceiver = null;
        }
        if (mWifiBroadcastReceiver != null)
        {
            unregisterReceiver(mWifiBroadcastReceiver);
            mWifiBroadcastReceiver = null;
        }
        clearEndTimer();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        LogUtils.LOGD(TAG, "onStartCommand() is called");
        setUpEndTimer();
        return 1;
    }

    public void onWifiConnectivityChanged(boolean flag, String s)
    {
        String s2 = TAG;
        StringBuilder stringbuilder = new StringBuilder("WIFI connectivity changed to ");
        String s1;
        if (flag)
        {
            s1 = "enabled";
        } else
        {
            s1 = "disabled";
        }
        LogUtils.LOGD(s2, stringbuilder.append(s1).toString());
        if (flag && !mWifiConnectivity)
        {
            mWifiConnectivity = true;
            if (mCastManager.isFeatureEnabled(8))
            {
                mCastManager.startCastDiscovery();
                mCastManager.reconnectSessionIfPossible(15, s);
            }
            return;
        } else
        {
            mWifiConnectivity = flag;
            return;
        }
    }





    private class _cls3 extends TimerTask
    {

        final ReconnectionService this$0;

        public void run()
        {
            LogUtils.LOGD(ReconnectionService.TAG, "setUpEndTimer(): stopping ReconnectionService since reached the end of allotted time");
            handleTermination();
        }

        _cls3()
        {
            this$0 = ReconnectionService.this;
            super();
        }
    }


    private class _cls1 extends BroadcastReceiver
    {

        final ReconnectionService this$0;

        public void onReceive(Context context, Intent intent)
        {
            LogUtils.LOGD(ReconnectionService.TAG, (new StringBuilder("ScreenOnOffBroadcastReceiver: onReceive(): ")).append(intent.getAction()).toString());
            if (getMediaRemainingTime() < 500L)
            {
                handleTermination();
            }
        }

        _cls1()
        {
            this$0 = ReconnectionService.this;
            super();
        }
    }


    private class _cls2 extends BroadcastReceiver
    {

        final ReconnectionService this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.net.wifi.STATE_CHANGE"))
            {
                boolean flag = ((NetworkInfo)intent.getParcelableExtra("networkInfo")).isConnected();
                if (flag)
                {
                    context = Utils.getWifiSsid(context);
                } else
                {
                    context = null;
                }
                onWifiConnectivityChanged(flag, context);
            }
        }

        _cls2()
        {
            this$0 = ReconnectionService.this;
            super();
        }
    }

}
