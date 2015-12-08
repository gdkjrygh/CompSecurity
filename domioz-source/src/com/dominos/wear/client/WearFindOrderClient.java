// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.dom.tracker.TrackerOrderStatus;
import com.dominos.android.sdk.common.dom.tracker.TrackerResult;
import com.dominos.android.sdk.constant.ResponseStatus;
import com.dominos.remote.util.ResponseEvent;
import com.dominos.wear.manager.WearRequestManager;
import com.dominos.wear.manager.WearRequestManager_;
import com.dominos.wear.receiver.WearTrackerReceiver;
import com.google.a.b.ar;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

public class WearFindOrderClient extends WearBaseOrderClient
{

    private static final String TAG = com/dominos/wear/client/WearFindOrderClient.getSimpleName();

    public WearFindOrderClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        if (responseevent.getStatus() == ResponseStatus.SUCCESS)
        {
            Object obj = TrackerResult.from(responseevent.getData()).getOrderStatuses();
            if (obj != null && !((ar) (obj)).isEmpty())
            {
                LogUtil.d(TAG, "Order Found. Starting tracker service to track order", new Object[0]);
                obj = (TrackerOrderStatus)((ar) (obj)).get(0);
                WearRequestManager_ wearrequestmanager_ = WearRequestManager_.getInstance_(responseevent.getContext());
                Bundle bundle = new Bundle();
                bundle.putString("phone", ((TrackerOrderStatus) (obj)).getPhone());
                bundle.putBoolean("fromCheckout", false);
                wearrequestmanager_.track(bundle, new WearTrackerReceiver());
            }
        }
        WearBaseOrderClient.DataMapEvent datamapevent = createDataMapRequest(22, responseevent);
        LogUtil.d(TAG, "Sending Find order status to wear..", new Object[0]);
        sendResponse(responseevent.getContext(), datamapevent.toPutDataMapRequest());
    }

}
