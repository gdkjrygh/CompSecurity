// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import com.dominos.android.sdk.common.LogUtil;
import com.dominos.remote.util.ResponseEvent;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

public class WearPriceOrderClient extends WearBaseOrderClient
{

    private static final String TAG = com/dominos/wear/client/WearPriceOrderClient.getSimpleName();

    public WearPriceOrderClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        WearBaseOrderClient.DataMapEvent datamapevent = createDataMapRequest(20, responseevent);
        sendResponse(responseevent.getContext(), datamapevent.toPutDataMapRequest());
        LogUtil.d(TAG, "Sending Price order to wear..", new Object[0]);
    }

}
