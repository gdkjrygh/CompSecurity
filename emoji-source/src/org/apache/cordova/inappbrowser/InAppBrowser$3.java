// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.webkit.WebView;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser

class val.finalScriptToInject
    implements Runnable
{

    final InAppBrowser this$0;
    final String val$finalScriptToInject;

    public void run()
    {
        if (android.os.DK_INT < 19)
        {
            InAppBrowser.access$100(InAppBrowser.this).loadUrl((new StringBuilder()).append("javascript:").append(val$finalScriptToInject).toString());
            return;
        } else
        {
            InAppBrowser.access$100(InAppBrowser.this).evaluateJavascript(val$finalScriptToInject, null);
            return;
        }
    }

    ()
    {
        this$0 = final_inappbrowser;
        val$finalScriptToInject = String.this;
        super();
    }
}
