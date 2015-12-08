// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.wlclient.WLRequestListener;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLClient, WLFailResponse, WLRequestOptions, WLResponseListener, 
//            WLResponse

class this._cls0
    implements WLRequestListener
{

    final WLClient this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        try
        {
            String s = wlresponse.getResponseJSON().getString("access_token");
            String s1 = wlresponse.getResponseJSON().getString("scope");
            WLClient.access$200(WLClient.this).put(s1, s);
            WLClient.access$302(WLClient.this, s);
            wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
            return;
        }
        catch (JSONException jsonexception)
        {
            wlresponse.getOptions().getResponseListener().onFailure(new WLFailResponse(wlresponse));
        }
    }

    ()
    {
        this$0 = WLClient.this;
        super();
    }
}
