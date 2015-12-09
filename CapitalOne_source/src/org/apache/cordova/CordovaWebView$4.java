// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            CordovaWebView

class val.url
    implements Runnable
{

    final CordovaWebView this$0;
    final CordovaWebView val$me;
    final Runnable val$timeoutCheck;
    final String val$url;

    public void run()
    {
        (new Thread(val$timeoutCheck)).start();
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
