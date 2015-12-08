// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.common.WLUtils;
import com.worklight.wlclient.WLRequestListener;

// Referenced classes of package com.worklight.wlclient.api:
//            WLResponse, WLFailResponse

class LogActivityListener
    implements WLRequestListener
{

    LogActivityListener()
    {
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        WLUtils.error((new StringBuilder("logActivity failure. Response from server is ")).append(wlfailresponse).toString());
    }

    public void onSuccess(WLResponse wlresponse)
    {
        WLUtils.debug((new StringBuilder("logActivity success. Response from server is ")).append(wlresponse.toString()).toString());
    }
}
