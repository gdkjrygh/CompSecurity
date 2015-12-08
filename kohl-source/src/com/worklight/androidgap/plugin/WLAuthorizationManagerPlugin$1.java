// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.wlclient.WLClientInstanceIdListener;
import com.worklight.wlclient.api.WLAuthorizationException;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLAuthorizationManagerPlugin

class val.callbackContext
    implements WLClientInstanceIdListener
{

    final WLAuthorizationManagerPlugin this$0;
    final CallbackContext val$callbackContext;

    public void onFailure(WLAuthorizationException wlauthorizationexception)
    {
        val$callbackContext.error(WLAuthorizationManagerPlugin.access$000(WLAuthorizationManagerPlugin.this, wlauthorizationexception.getWLFailResponse()));
    }

    public void onSuccess(String s)
    {
        val$callbackContext.success(s);
    }

    ()
    {
        this$0 = final_wlauthorizationmanagerplugin;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
