// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.tracker.OrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.core.tracker.TrackerManager;
import com.dominos.pebble.PebbleManager;
import com.dominos.remote.receiver.TrackerReceiver;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.notification:
//            TrackerServiceController

public class TrackerService extends Service
{

    private static final int INDEX_NOT_VALID = -1;
    private static final String IS_RESTARTED = "isRestarted";
    private static final int LONG_WAIT = 10000;
    private static final int RETRY_MAX_COUNT = 10;
    private static final int SHORT_WAIT = 5000;
    private static final String TAG = com/dominos/notification/TrackerService.getSimpleName();
    private OrderStatus lastKnownStatus;
    private TrackerServiceController mController;
    MobileSession mMobileSession;
    private int mOrderIndex;
    PebbleManager mPebbleManager;
    private int mRetryCount;
    private Handler mRetryHandler;
    private Runnable mRetryRunnable;
    private Intent mStartIntent;
    private Bundle mTrackerBundle;
    private TrackerManager mTrackerManager;
    private TrackerReceiver mTrackerReceiver;
    private TrackerResult mTrackerResult;

    public TrackerService()
    {
        mRetryHandler = new Handler();
        mRetryCount = 0;
        mOrderIndex = 0;
        mRetryRunnable = new _cls1();
    }

    private void broadcastResult(TrackerResult trackerresult, int i, String s)
    {
label0:
        {
            LogUtil.d(TAG, "OnOrderFound", new Object[0]);
            if (trackerresult != null && trackerresult.getOrderStatuses() != null && trackerresult.getOrderStatuses().get(i) != null)
            {
                OrderStatus orderstatus = ((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i)).getOrderStatus();
                Intent intent = new Intent("com.dominos.notifications.tracker");
                intent.putExtra("tracker-result", trackerresult);
                intent.putExtra("tracker-index", i);
                mTrackerBundle.putString("tracker-response", s);
                intent.putExtras(mTrackerBundle);
                intent.putExtra("tracker-status", "tracking-progress");
                intent.putExtra("storeProfile", mStartIntent.getParcelableExtra("storeProfile"));
                if (orderstatus == lastKnownStatus)
                {
                    break label0;
                }
                mTrackerManager.updateStatus((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i), "tracking-progress");
                sendBroadcast(intent);
                lastKnownStatus = orderstatus;
                LogUtil.d(TAG, "Tracker status changed, sending broadcast...", new Object[0]);
            }
            return;
        }
        LogUtil.d(TAG, "No change in tracker status", new Object[0]);
    }

    private void cleanup()
    {
        LogUtil.d(TAG, "Cleanup : release the handler and unregister the receiver", new Object[0]);
        if (mRetryHandler != null)
        {
            mRetryHandler.removeCallbacks(mRetryRunnable);
        }
        mRetryCount = 0;
        if (mTrackerReceiver != null)
        {
            LogUtil.d(TAG, "Tracker Receiver unregistered", new Object[0]);
            unregisterReceiver(mTrackerReceiver);
            mTrackerReceiver = null;
        }
    }

    private boolean isValidOrderStatus(TrackerOrderStatus trackerorderstatus)
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (lastKnownStatus == trackerorderstatus.getOrderStatus()) goto _L2; else goto _L1
_L1:
        flag = flag1;
        _cls2..SwitchMap.com.dominos.android.sdk.common.dom.tracker.OrderStatus[trackerorderstatus.getOrderStatus().ordinal()];
        JVM INSTR tableswitch 1 9: default 80
    //                   1 92
    //                   2 92
    //                   3 92
    //                   4 92
    //                   5 92
    //                   6 82
    //                   7 82
    //                   8 82
    //                   9 82;
           goto _L3 _L4 _L4 _L4 _L4 _L4 _L5 _L5 _L5 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
_L7:
        lastKnownStatus = trackerorderstatus.getOrderStatus();
_L2:
        return flag;
_L4:
        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void processResult(TrackerResult trackerresult, int i)
    {
        orderTrackerStatus((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i));
    }

    private void setup(Intent intent)
    {
        LogUtil.d(TAG, "Setup tracker service", new Object[0]);
        mController = new TrackerServiceController(this);
        LogUtil.d(TAG, "setOrderInfo", new Object[0]);
        mController.setOrderInfo(intent.getStringExtra("phone"), intent.getStringExtra("extension"), intent.getStringExtra("orderID"), intent.getStringExtra("storeID"));
        lastKnownStatus = null;
        if (intent.getBooleanExtra("isRestarted", false))
        {
            TrackerResult trackerresult = (TrackerResult)intent.getParcelableExtra("tracker-result");
            int i = intent.getIntExtra("tracker-index", 0);
            if (trackerresult != null && !trackerresult.getOrderStatuses().isEmpty() && i >= 0)
            {
                lastKnownStatus = ((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i)).getOrderStatus();
            }
        }
        mTrackerBundle = new Bundle();
        mTrackerBundle.putString("phone", intent.getStringExtra("phone"));
        mTrackerBundle.putString("extension", intent.getStringExtra("extension"));
        mTrackerBundle.putString("orderID", intent.getStringExtra("orderID"));
        mTrackerBundle.putString("storeID", intent.getStringExtra("storeID"));
        if (intent.getBooleanExtra("fromCheckout", false))
        {
            intent = new Intent();
            intent.setAction("com.dominos.notifications.tracker");
            intent.putExtra("tracker-status", "tracking-started");
            intent.putExtras(mTrackerBundle);
            sendBroadcast(intent);
        }
        LogUtil.d(TAG, "Executing runnable..", new Object[0]);
        mRetryHandler.post(mRetryRunnable);
    }

    public boolean isOrderStatusFatal(TrackerOrderStatus trackerorderstatus)
    {
        if (trackerorderstatus != null)
        {
            if ((trackerorderstatus = trackerorderstatus.getOrderStatus()) != OrderStatus.CANCELLED && trackerorderstatus != OrderStatus.COMPLETE && trackerorderstatus != OrderStatus.FUTURE && trackerorderstatus != OrderStatus.UNKNOWN)
            {
                return false;
            }
        }
        return true;
    }

    protected void onAfterInject()
    {
        mTrackerManager = (TrackerManager)mMobileSession.getManager("tracker-manager");
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        cleanup();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        mPebbleManager.setmLastStatus("");
        mStartIntent = intent;
        LogUtil.d(TAG, "onStartCommand", new Object[0]);
        if (intent != null && intent.getAction() != null)
        {
            if (StringHelper.equalsIgnoreCase(intent.getAction(), "OrderPlaced"))
            {
                cleanup();
                mTrackerReceiver = (TrackerReceiver)intent.getSerializableExtra("tracker-receiver");
                if (mTrackerReceiver != null)
                {
                    registerReceiver(mTrackerReceiver, new IntentFilter("com.dominos.notifications.tracker"));
                }
                if (intent.getBooleanExtra("isRestarted", false))
                {
                    TrackerResult trackerresult = (TrackerResult)intent.getParcelableExtra("tracker-result");
                    i = intent.getIntExtra("tracker-index", -1);
                    if (trackerresult != null && i != -1)
                    {
                        mTrackerManager.updateStatus((TrackerOrderStatus)trackerresult.getOrderStatuses().get(i), "tracking-progress");
                    }
                }
                setup(intent);
                return 1;
            }
            if (StringHelper.equalsIgnoreCase(intent.getAction(), "com.dominos.notifications.stop"))
            {
                LogUtil.d(TAG, "stop", new Object[0]);
                intent = new Intent();
                intent.setAction("com.dominos.notifications.tracker");
                intent.putExtra("tracker-status", "tracking-completed");
                getApplicationContext().sendBroadcast(intent);
                stopSelf();
            }
        }
        return 2;
    }

    public void onTaskRemoved(Intent intent)
    {
        LogUtil.d(TAG, "onTaskRemoved", new Object[0]);
        if (mStartIntent == null || mTrackerResult == null || mTrackerResult.getOrderStatuses() == null)
        {
            LogUtil.d(TAG, "Tracker start intent or Tracker result status is null. ", new Object[0]);
            return;
        }
        intent = mStartIntent;
        intent.setAction("OrderPlaced");
        if (mTrackerResult != null && !mTrackerResult.getOrderStatuses().isEmpty() && mOrderIndex >= 0)
        {
            intent.putExtra("tracker-result", mTrackerResult);
            intent.putExtra("tracker-index", mOrderIndex);
        }
        intent.putExtra("fromCheckout", false);
        intent.putExtra("isRestarted", true);
        intent = PendingIntent.getService(getApplicationContext(), 1, intent, 0x40000000);
        ((AlarmManager)getApplicationContext().getSystemService("alarm")).set(0, System.currentTimeMillis() + 1000L, intent);
    }

    public void orderTrackerFailure()
    {
        LogUtil.d(TAG, "Tracker status response failed", new Object[0]);
        if (mRetryCount < 10)
        {
            LogUtil.e(TAG, (new StringBuilder("Retrying to tracker : RetryCount: ")).append(mRetryCount).toString(), new Object[0]);
            mRetryCount = mRetryCount + 1;
            mRetryHandler.postDelayed(mRetryRunnable, 10000L);
            return;
        }
        LogUtil.d(TAG, "Stopping service : Fatality too many retries", new Object[0]);
        Intent intent = new Intent();
        intent.setAction("com.dominos.notifications.tracker");
        intent.putExtra("tracker-status", "tracking-timedout");
        intent.putExtras(mTrackerBundle);
        if (mOrderIndex != -1 && mTrackerResult != null)
        {
            mTrackerManager.updateStatus((TrackerOrderStatus)mTrackerResult.getOrderStatuses().get(mOrderIndex), "tracking-timedout");
        }
        sendBroadcast(intent);
        stopSelf();
    }

    public void orderTrackerStatus(TrackerOrderStatus trackerorderstatus)
    {
        LogUtil.d(TAG, "Received tracker status.", new Object[0]);
        break MISSING_BLOCK_LABEL_13;
        if (mController != null && trackerorderstatus != null)
        {
            mRetryCount = 0;
            if (isValidOrderStatus(trackerorderstatus))
            {
                LogUtil.d(TAG, "Valid order status change.", new Object[0]);
                if (!isOrderStatusFatal(trackerorderstatus))
                {
                    LogUtil.d(TAG, "Executing runnable again..", new Object[0]);
                    mRetryHandler.postDelayed(mRetryRunnable, 10000L);
                    return;
                }
            } else
            if (isOrderStatusFatal(trackerorderstatus))
            {
                LogUtil.d(TAG, "Order status was fatal", new Object[0]);
                stopSelf();
                return;
            } else
            {
                LogUtil.d(TAG, "Executing runnable again..", new Object[0]);
                mRetryHandler.postDelayed(mRetryRunnable, 5000L);
                return;
            }
        }
        return;
    }






/*
    static TrackerResult access$302(TrackerService trackerservice, TrackerResult trackerresult)
    {
        trackerservice.mTrackerResult = trackerresult;
        return trackerresult;
    }

*/


/*
    static int access$402(TrackerService trackerservice, int i)
    {
        trackerservice.mOrderIndex = i;
        return i;
    }

*/


    private class _cls1
        implements Runnable
    {

        final TrackerService this$0;

        public void run()
        {
            LogUtil.d(TrackerService.TAG, "Started to execute runnable", new Object[0]);
            class _cls1
                implements TrackerServiceController.TrackerServiceCallback
            {

                final _cls1 this$1;

                public void onFailure()
                {
                    orderTrackerFailure();
                }

                public void onSuccess(String s, int i)
                {
                    LogUtil.d(TrackerService.TAG, "Tracker status response success", new Object[0]);
                    TrackerResult trackerresult = TrackerResult.from(s);
                    if (i >= 0)
                    {
                        broadcastResult(trackerresult, i, s);
                        processResult(trackerresult, i);
                    } else
                    {
                        orderTrackerFailure();
                    }
                    mTrackerResult = trackerresult;
                    mOrderIndex = i;
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

            mController.getTrackerStatus(new _cls1());
        }

        _cls1()
        {
            this$0 = TrackerService.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
