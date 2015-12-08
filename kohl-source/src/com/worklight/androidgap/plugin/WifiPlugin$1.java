// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import com.worklight.common.Logger;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;
import org.apache.cordova.CallbackContext;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WifiPlugin

class val.callbackContext extends BroadcastReceiver
{

    final WifiPlugin this$0;
    final CallbackContext val$callbackContext;

    public void onReceive(Context context, Intent intent)
    {
        WifiPlugin.access$000(WifiPlugin.this).unregisterReceiver(this);
        if (!WifiPlugin.access$100()) goto _L2; else goto _L1
_L1:
        intent = new LinkedList();
        int i = 0;
_L4:
        context = intent;
        if (i >= 6)
        {
            break; /* Loop/switch isn't completed */
        }
        String s;
        int j;
        try
        {
            j = WifiPlugin.access$200().nextInt(3);
            context = WifiPlugin.access$300()[j];
            j = WifiPlugin.access$200().nextInt(3);
            s = WifiPlugin.access$400()[j];
            j = WifiPlugin.access$200().nextInt(3);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WifiPlugin.access$700().error((new StringBuilder()).append("WifiPlugin : Error getting scan results : ").append(context.getMessage()).toString());
            val$callbackContext.error(0);
            return;
        }
        if (j != 0)
        {
            j *= 10;
        } else
        {
            j = 30;
        }
        intent.add(WifiPlugin.access$500(context, s, j));
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        context = wifiManager.getScanResults();
_L3:
        context = WifiPlugin.access$600(WifiPlugin.this, context);
        val$callbackContext.success(context);
        return;
    }

    ()
    {
        this$0 = final_wifiplugin;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
