// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;

// Referenced classes of package com.worklight.wlclient:
//            WLRequestListener, WLAuthorizationManagerInternal

class val.responseListener
    implements WLRequestListener
{

    final WLAuthorizationManagerInternal this$0;
    final WLResponseListener val$responseListener;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        val$responseListener.onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        val$responseListener.onSuccess(wlresponse);
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerinternal;
        val$responseListener = WLResponseListener.this;
        super();
    }
}
