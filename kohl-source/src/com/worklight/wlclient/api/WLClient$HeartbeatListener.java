// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient, WLFailResponse, WLResponse

class this._cls0
    implements WLRequestListener
{

    final WLClient this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLClient.access$100().debug((new StringBuilder()).append("Failed to send heartbeat. Response:  ").append(wlfailresponse.toString()).toString());
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLClient.access$100().debug("Heartbeat sent successfully");
    }

    ()
    {
        this$0 = WLClient.this;
        super();
    }
}
