// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.Logger;
import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush, WLOnReadyToSubscribeListener, WLFailResponse, WLResponse

class this._cls0
    implements WLRequestListener
{

    final WLPush this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLPush.access$1302(WLPush.this, false);
        WLPush.access$200().error("Failed to update token on server");
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLPush.access$1302(WLPush.this, true);
        if (WLPush.access$1400(WLPush.this) != null)
        {
            WLPush.access$1400(WLPush.this).onReadyToSubscribe();
        } else
        {
            WLPush.access$200().debug("onReadyToSubscribeListener is NULL");
        }
        if (WLPush.access$700(WLPush.this))
        {
            WLPush.access$800(WLPush.this);
        }
    }

    public r()
    {
        this$0 = WLPush.this;
        super();
    }
}
