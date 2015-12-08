// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import org.apache.cordova.CallbackContext;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLNativeXHRPlugin, WLNativeXHRSender

class val.callbackContext
    implements Runnable
{

    final WLNativeXHRPlugin this$0;
    final CallbackContext val$callbackContext;
    final JSONObject val$requestOptions;

    public void run()
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            String s = val$requestOptions.getString("url");
            flag1 = s.substring(s.lastIndexOf('/') + 1).equals("heartbeat");
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Failed to send request. JSONException :: ").append(jsonexception.getMessage()).toString());
        }
        if (flag1)
        {
            flag = true;
        }
        WLNativeXHRPlugin.access$000(WLNativeXHRPlugin.this).sendRequest(val$requestOptions, new tiveXHRPostListener(WLNativeXHRPlugin.this, val$callbackContext, flag));
    }

    tiveXHRPostListener()
    {
        this$0 = final_wlnativexhrplugin;
        val$requestOptions = jsonobject;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
