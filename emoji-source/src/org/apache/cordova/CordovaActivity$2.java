// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            CordovaActivity, CordovaWebView

class val.errorUrl
    implements Runnable
{

    final CordovaActivity this$0;
    final String val$errorUrl;
    final CordovaActivity val$me;

    public void run()
    {
        val$me.spinnerStop();
        val$me.appView.showWebPage(val$errorUrl, false, true, null);
    }

    ()
    {
        this$0 = final_cordovaactivity;
        val$me = cordovaactivity1;
        val$errorUrl = String.this;
        super();
    }
}
