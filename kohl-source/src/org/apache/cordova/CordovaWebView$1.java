// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebSettings;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

class nit> extends BroadcastReceiver
{

    final CordovaWebView this$0;

    public void onReceive(Context context, Intent intent)
    {
        getSettings().getUserAgentString();
    }

    ()
    {
        this$0 = CordovaWebView.this;
        super();
    }
}
