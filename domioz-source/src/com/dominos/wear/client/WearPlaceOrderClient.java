// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.OrderUtil_;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.remote.util.ResponseEvent;
import com.dominos.wear.manager.WearRequestManager;
import com.dominos.wear.manager.WearRequestManager_;
import com.dominos.wear.receiver.WearTrackerReceiver;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

public class WearPlaceOrderClient extends WearBaseOrderClient
{

    private static final String TAG = com/dominos/wear/client/WearPlaceOrderClient.getSimpleName();

    public WearPlaceOrderClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        WearBaseOrderClient.DataMapEvent datamapevent = createDataMapRequest(21, responseevent);
        sendResponse(responseevent.getContext(), datamapevent.toPutDataMapRequest());
        LogUtil.d(TAG, "Sending Price order to wear..", new Object[0]);
        if (StringHelper.isNotEmpty(responseevent.getData()))
        {
            WearRequestManager_ wearrequestmanager_ = WearRequestManager_.getInstance_(responseevent.getContext());
            responseevent = OrderUtil_.getInstance_(responseevent.getContext()).fromJson(responseevent.getData());
            if (responseevent != null && responseevent.getStatus() >= 0)
            {
                Bundle bundle = new Bundle();
                bundle.putString("phone", responseevent.getPhone());
                bundle.putString("extension", responseevent.getPhoneExtension());
                bundle.putString("orderID", responseevent.getStoreOrderId());
                bundle.putString("storeID", responseevent.getStoreId());
                bundle.putBoolean("fromCheckout", true);
                wearrequestmanager_.track(bundle, new WearTrackerReceiver());
            }
        }
    }

}
