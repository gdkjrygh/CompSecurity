// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

// Referenced classes of package org.apache.cordova:
//            App, LOG, CordovaWebView

class Receiver extends BroadcastReceiver
{

    final App this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && intent.getAction().equals("android.intent.action.PHONE_STATE") && intent.hasExtra("state"))
        {
            context = intent.getStringExtra("state");
            if (context.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                LOG.i("CordovaApp", "Telephone RINGING");
                webView.postMessage("telephone", "ringing");
            } else
            {
                if (context.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
                {
                    LOG.i("CordovaApp", "Telephone OFFHOOK");
                    webView.postMessage("telephone", "offhook");
                    return;
                }
                if (context.equals(TelephonyManager.EXTRA_STATE_IDLE))
                {
                    LOG.i("CordovaApp", "Telephone IDLE");
                    webView.postMessage("telephone", "idle");
                    return;
                }
            }
        }
    }

    aWebView()
    {
        this$0 = App.this;
        super();
    }
}
