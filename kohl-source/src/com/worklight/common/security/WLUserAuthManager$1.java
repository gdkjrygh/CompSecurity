// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common.security;

import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;

// Referenced classes of package com.worklight.common.security:
//            WLUserAuthManager

class this._cls0
    implements WLRequestListener
{

    final WLUserAuthManager this$0;

    public void onFailure(WLFailResponse wlfailresponse)
    {
    }

    public void onSuccess(WLResponse wlresponse)
    {
    }

    ()
    {
        this$0 = WLUserAuthManager.this;
        super();
    }
}
