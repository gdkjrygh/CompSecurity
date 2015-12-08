// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal

class val.listener
    implements WLResponseListener
{

    final WLAuthorizationManagerInternal this$0;
    final WLResponseListener val$listener;
    final String val$scope;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        val$listener.onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLAuthorizationManagerInternal.access$000(WLAuthorizationManagerInternal.this, val$scope, val$listener);
        WLAuthorizationManagerInternal.access$100(WLAuthorizationManagerInternal.this, val$scope);
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerinternal;
        val$scope = s;
        val$listener = WLResponseListener.this;
        super();
    }
}
