// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.remote.util.ResponseEvent;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

public class WearRecentOrdersClient extends WearBaseOrderClient
{

    private static final String TAG = com/dominos/wear/client/WearRecentOrdersClient.getSimpleName();

    public WearRecentOrdersClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        WearBaseOrderClient.DataMapEvent datamapevent = createDataMapRequest(18, responseevent);
        sendResponse(responseevent.getContext(), datamapevent.toPutDataMapRequest());
        LogUtil.d(TAG, "Sending recent orders to wear..", new Object[0]);
    }

}
