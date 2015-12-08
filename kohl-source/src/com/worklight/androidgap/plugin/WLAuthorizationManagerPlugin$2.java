// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.wlclient.WLAuthorizationManagerInternal;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLAuthorizationManagerPlugin

class val.callbackContext
    implements WLResponseListener
{

    final WLAuthorizationManagerPlugin this$0;
    final CallbackContext val$callbackContext;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        val$callbackContext.error(WLAuthorizationManagerPlugin.access$000(WLAuthorizationManagerPlugin.this, wlfailresponse));
    }

    public void onSuccess(WLResponse wlresponse)
    {
        val$callbackContext.success(WLAuthorizationManagerInternal.getInstance().getCachedAuthorizationHeader());
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerplugin;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
