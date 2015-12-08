// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import org.apache.cordova.api.LOG;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, CordovaWebViewClient

class val.url
    implements Runnable
{

    final CordovaWebView this$0;
    final CordovaWebView val$me;
    final String val$url;

    public void run()
    {
        val$me.stopLoading();
        LOG.e("CordovaWebView", "CordovaWebView: TIMEOUT ERROR!");
        if (viewClient != null)
        {
            viewClient.onReceivedError(val$me, -6, "The connection to the server was unsuccessful.", val$url);
        }
    }

    ent()
    {
        this$0 = final_cordovawebview;
        val$me = cordovawebview1;
        val$url = String.this;
        super();
    }
}
