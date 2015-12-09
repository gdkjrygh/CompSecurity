// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLFailResponse, WLRequestOptions, WLResponseListener, WLClient, 
//            WLResponse

class InitRequestListener
    implements WLRequestListener
{

    private WLClient wlClient;

    public InitRequestListener(WLClient wlclient)
    {
        wlClient = wlclient;
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        wlClient.setInitialized(true);
        wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
    }
}
