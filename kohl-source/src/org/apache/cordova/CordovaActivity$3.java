// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            CordovaActivity, CordovaWebView

class val.failingUrl
    implements Runnable
{

    final CordovaActivity this$0;
    final String val$description;
    final boolean val$exit;
    final String val$failingUrl;
    final CordovaActivity val$me;

    public void run()
    {
        if (val$exit)
        {
            val$me.appView.setVisibility(8);
            val$me.displayError("Application Error", (new StringBuilder()).append(val$description).append(" (").append(val$failingUrl).append(")").toString(), "OK", val$exit);
        }
    }

    ()
    {
        this$0 = final_cordovaactivity;
        val$exit = flag;
        val$me = cordovaactivity1;
        val$description = s;
        val$failingUrl = String.this;
        super();
    }
}
