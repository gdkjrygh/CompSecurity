// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.api.WL;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLApp

class this._cls0
    implements Runnable
{

    final WLApp this$0;

    public void run()
    {
        webView.loadUrl(WL.getInstance().getMainHtmlFilePath());
    }

    ()
    {
        this$0 = WLApp.this;
        super();
    }
}
