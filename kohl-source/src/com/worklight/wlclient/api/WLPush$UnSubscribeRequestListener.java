// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLFailResponse, WLRequestOptions, WLResponseListener, 
//            WLResponse

class this._cls0
    implements WLRequestListener
{

    final WLPush this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
    }

    public void onSuccess(WLResponse wlresponse)
    {
        wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
    }

    ()
    {
        this$0 = WLPush.this;
        super();
    }
}
