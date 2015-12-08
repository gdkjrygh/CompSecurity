// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.wlclient.api.WLRequestOptions;
import org.apache.http.HttpRequest;

// Referenced classes of package com.worklight.wlclient:
//            WLRequest, WLClientInstanceIdListener, WLRequestListener

public class WLClientInstanceRegistrationRequest extends WLRequest
{

    public WLClientInstanceRegistrationRequest(WLRequestListener wlrequestlistener, WLRequestOptions wlrequestoptions, WLConfig wlconfig, Context context)
    {
        super(wlrequestlistener, wlrequestoptions, wlconfig, context);
    }

    protected void addClientInstanceHeader(HttpRequest httprequest, WLClientInstanceIdListener wlclientinstanceidlistener)
    {
        wlclientinstanceidlistener.onSuccess(null);
    }
}
