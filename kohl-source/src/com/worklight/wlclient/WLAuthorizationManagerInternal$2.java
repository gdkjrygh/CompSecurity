// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal, WLClientInstanceIdListener

class val.listener
    implements WLResponseListener
{

    final WLAuthorizationManagerInternal this$0;
    final WLClientInstanceIdListener val$listener;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        val$listener.onFailure(new WLAuthorizationException(wlfailresponse));
    }

    public void onSuccess(WLResponse wlresponse)
    {
        val$listener.onSuccess(getClientId());
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerinternal;
        val$listener = WLClientInstanceIdListener.this;
        super();
    }
}
