// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.NrdProxy;

// Referenced classes of package com.netflix.mediaclient.service:
//            NrdController

private class this._cls0 extends BroadcastReceiver
{

    public static final String JS_BRIDGE_INTENT = "com.netflix.mediaclient.intent.action.JS_BRIDGE_CMD";
    final NrdController this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_nrdcontroller", 3))
        {
            Log.d("nf_nrdcontroller", (new StringBuilder()).append("Received an action: ").append(intent.getAction()).toString());
        }
        if (!"com.netflix.mediaclient.intent.action.JS_BRIDGE_CMD".equals(intent.getAction()))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        Object obj;
        try
        {
            obj = intent.getExtras();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_nrdcontroller", "Unintented Exception thrown ", context);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        context = ((Bundle) (obj)).getString("object");
        intent = ((Bundle) (obj)).getString("method");
        obj = ((Bundle) (obj)).getString("params");
        if (context == null || intent == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        NrdController.access$200(NrdController.this).invokeMethod(context, intent, ((String) (obj)));
        if (Log.isLoggable("nf_nrdcontroller", 3))
        {
            Log.d("nf_nrdcontroller", (new StringBuilder()).append("JS CMD: object: ").append(context).append(" method:  ").append(intent).append(" param: ").append(((String) (obj))).toString());
        }
    }

    private ()
    {
        this$0 = NrdController.this;
        super();
    }
}
