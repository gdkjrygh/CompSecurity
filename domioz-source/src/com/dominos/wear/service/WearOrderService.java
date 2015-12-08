// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.remote.client.RemoteOrderClient;
import com.dominos.remote.contoller.RemoteOrderManager;
import com.dominos.wear.WearSession;
import com.google.b.k;

public class WearOrderService extends Service
{

    public static final String CREATE_HISTORICAL_ORDER_REQUEST = "com.dominos.wear.create-historical-order";
    public static final String CUSTOMER_LOGIN_REQUEST = "com.dominos.wear.customer-login";
    public static final String FIND_ORDER_REQUEST = "com.dominos.wear.find-order";
    public static final String GET_EASY_ORDER_REQUEST = "com.dominos.wear.get-easy-order";
    public static final String GET_RECENT_ORDERS_REQUEST = "com.dominos.wear.get-recent-orders";
    public static final String GET_TRACK_ORDER_INFO_REQUEST = "com.dominos.wear.get-track-order-info";
    private static final long INACTIVE_TIME_LIMIT = 0x1b7740L;
    public static final String LOYALTY_REQUEST = "com.dominos.wear.loyalty-info";
    public static final String ORDER_CLIENT = "Order_Client";
    public static final String PLACE_ORDER_REQUEST = "com.dominos.wear.place-order";
    public static final String REQUEST_DATA = "Request_Data";
    private static final String TAG = com/dominos/wear/service/WearOrderService.getSimpleName();
    private Handler mInactiveHandler;
    private Runnable mInactiveRunnable;
    OrderUtil mOrderUtil;
    RemoteOrderManager mRemoteOrderManager;
    WearSession mWearSession;

    public WearOrderService()
    {
        mInactiveHandler = new Handler();
        mInactiveRunnable = new _cls1();
    }

    private void restartInactiveTimer()
    {
        LogUtil.d(TAG, "Restarting Inactive timer runnable..", new Object[0]);
        mInactiveHandler.removeCallbacks(mInactiveRunnable);
        mInactiveHandler.postDelayed(mInactiveRunnable, 0x1b7740L);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onDestroy()
    {
        mInactiveHandler.removeCallbacks(mInactiveRunnable);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null || StringHelper.isEmpty(intent.getAction()))
        {
            LogUtil.d(TAG, "Start Intent is null or action is empty", new Object[0]);
            return 1;
        }
        RemoteOrderClient remoteorderclient = (RemoteOrderClient)intent.getSerializableExtra("Order_Client");
        if (remoteorderclient == null)
        {
            LogUtil.d(TAG, "Remote order client instance is null", new Object[0]);
            return 1;
        }
        mRemoteOrderManager.setup(mWearSession);
        restartInactiveTimer();
        String s = intent.getAction();
        if (StringHelper.equals(s, "com.dominos.wear.customer-login"))
        {
            mRemoteOrderManager.login(remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.get-easy-order"))
        {
            mRemoteOrderManager.getEasyOrder(remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.get-recent-orders"))
        {
            mRemoteOrderManager.getRecentOrders(remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.get-track-order-info"))
        {
            mRemoteOrderManager.getTrackOrderInfo(remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.create-historical-order"))
        {
            intent = (LabsOrder)(new k()).a(intent.getStringExtra("Request_Data"), com/dominos/android/sdk/core/models/LabsOrder);
            mRemoteOrderManager.createOrderFromHistoricalOrder(intent, remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.find-order"))
        {
            mRemoteOrderManager.getOrdersByPhone(intent.getStringExtra("Request_Data"), null, remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.place-order"))
        {
            intent = intent.getStringExtra("Request_Data");
            mRemoteOrderManager.placeOrder(mOrderUtil.fromJson(intent), remoteorderclient);
            return 1;
        }
        if (StringHelper.equals(s, "com.dominos.wear.loyalty-info"))
        {
            mRemoteOrderManager.getLoyaltyInformation(remoteorderclient);
            return 1;
        } else
        {
            LogUtil.d(TAG, (new StringBuilder("Unsupported Intent Action : ")).append(s).toString(), new Object[0]);
            return 1;
        }
    }



    private class _cls1
        implements Runnable
    {

        final WearOrderService this$0;

        public void run()
        {
            LogUtil.d(WearOrderService.TAG, "Stopping remote service after inactive timeout!", new Object[0]);
            stopSelf();
        }

        _cls1()
        {
            this$0 = WearOrderService.this;
            super();
        }
    }

}
