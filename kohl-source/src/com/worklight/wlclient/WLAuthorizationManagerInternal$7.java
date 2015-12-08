// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import org.json.JSONException;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal

class val.responseListener
    implements WLResponseListener
{

    final WLAuthorizationManagerInternal this$0;
    final WLResponseListener val$responseListener;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        val$responseListener.onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        try
        {
            WLAuthorizationManagerInternal.access$1000(WLAuthorizationManagerInternal.this, wlresponse.getResponseJSON());
            val$responseListener.onSuccess(wlresponse);
            return;
        }
        catch (JSONException jsonexception)
        {
            onFailure(new WLFailResponse(wlresponse));
        }
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerinternal;
        val$responseListener = WLResponseListener.this;
        super();
    }
}
