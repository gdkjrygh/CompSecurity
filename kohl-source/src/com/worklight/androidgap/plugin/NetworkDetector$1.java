// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            NetworkDetector

class val.callbackContext
    implements Runnable
{

    final NetworkDetector this$0;
    final CallbackContext val$callbackContext;
    final Context val$ctx;

    public void run()
    {
        org.json.JSONObject jsonobject = getNetworkData(val$ctx);
        val$callbackContext.success(jsonobject);
    }

    ()
    {
        this$0 = final_networkdetector;
        val$ctx = context;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
