// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.wlclient.WLRequestListener;
import java.util.HashMap;
import java.util.Iterator;
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
        WLClient wlclient = WLClient.getInstance();
        if (wlclient == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        wlclient.sendHeartBeat();
        JSONObject jsonobject = wlresponse.getResponseJSON().getJSONObject("userPrefs");
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Iterator iterator = jsonobject.keys();
_L1:
        boolean flag = iterator.hasNext();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        String s = (String)iterator.next();
        String s1 = (String)jsonobject.get(s);
        WLClient.access$000(WLClient.this).put(s, s1);
          goto _L1
        JSONException jsonexception;
        jsonexception;
        try
        {
            throw new RuntimeException(jsonexception.getMessage());
        }
        catch (JSONException jsonexception1)
        {
            jsonexception1.printStackTrace();
        }
        wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
        Logger.processAutomaticTrigger();
        return;
    }

    ()
    {
        this$0 = WLClient.this;
        super();
    }
}
