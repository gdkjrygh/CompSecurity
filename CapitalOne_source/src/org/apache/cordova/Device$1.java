// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import org.apache.cordova.api.LOG;

// Referenced classes of package org.apache.cordova:
//            Device, CordovaWebView

class eiver extends BroadcastReceiver
{

    final Device this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state"))
        {
            context = intent.getStringExtra("state");
            if (context.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                LOG.i("Device", "Telephone RINGING");
                webView.postMessage("telephone", "ringing");
            } else
            {
                if (context.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
                {
                    LOG.i("Device", "Telephone OFFHOOK");
                    webView.postMessage("telephone", "offhook");
                    return;
                }
                if (context.equals(TelephonyManager.EXTRA_STATE_IDLE))
                {
                    LOG.i("Device", "Telephone IDLE");
                    webView.postMessage("telephone", "idle");
                    return;
                }
            }
        }
    }

    bView()
    {
        this$0 = Device.this;
        super();
    }
}
