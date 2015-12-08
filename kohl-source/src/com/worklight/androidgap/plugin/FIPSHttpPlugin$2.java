// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import com.worklight.androidgap.fips.FipsHandler;
import com.worklight.common.Logger;
import org.apache.cordova.CallbackContext;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            FIPSHttpPlugin

class val.data
    implements Runnable
{

    final FIPSHttpPlugin this$0;
    final CallbackContext val$callbackContext;
    final Context val$ctx;
    final String val$data;
    final JSONObject val$headersFinal;
    final String val$httpMethod;
    final String val$url;

    public void run()
    {
        try
        {
            val$callbackContext.success(FipsHandler.getInstance(val$ctx).VPNWLSend(val$url, val$httpMethod, val$headersFinal, val$data));
            return;
        }
        catch (Throwable throwable)
        {
            FIPSHttpPlugin.access$000().error("An unrecoverable error has occurred: ", throwable);
            val$callbackContext.error(FIPSHttpPlugin.access$100(FIPSHttpPlugin.this, (new StringBuilder()).append("An unrecoverable error has occurred: ").append(throwable.getLocalizedMessage()).toString()));
            return;
        }
    }

    ()
    {
        this$0 = final_fipshttpplugin;
        val$callbackContext = callbackcontext;
        val$ctx = context;
        val$url = s;
        val$httpMethod = s1;
        val$headersFinal = jsonobject;
        val$data = String.this;
        super();
    }
}
