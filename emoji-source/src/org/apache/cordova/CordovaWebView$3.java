// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.concurrent.ExecutorService;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, CordovaInterface

class val.url
    implements Runnable
{

    final CordovaWebView this$0;
    final CordovaWebView val$me;
    final Runnable val$timeoutCheck;
    final String val$url;

    public void run()
    {
        CordovaWebView.access$000(CordovaWebView.this).getThreadPool().execute(val$timeoutCheck);
        val$me.loadUrlNow(val$url);
    }

    ()
    {
        this$0 = final_cordovawebview;
        val$timeoutCheck = runnable;
        val$me = cordovawebview1;
        val$url = String.this;
        super();
    }
}
