// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import com.dominos.remote.util.ResponseEvent;

// Referenced classes of package com.dominos.wear.client:
//            WearBaseOrderClient

public class WearTrackerClient extends WearBaseOrderClient
{

    public WearTrackerClient()
    {
    }

    public void onResponseReceived(ResponseEvent responseevent)
    {
        WearBaseOrderClient.DataMapEvent datamapevent = createDataMapRequest(23, responseevent);
        sendResponse(responseevent.getContext(), datamapevent.toPutDataMapRequest());
    }
}
