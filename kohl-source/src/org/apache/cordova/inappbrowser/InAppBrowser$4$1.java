// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser, InAppBrowserDialog

class this._cls1 extends WebViewClient
{

    final g.dismiss this$1;

    public void onPageFinished(WebView webview, String s)
    {
        if (InAppBrowser.access$000(_fld0) != null)
        {
            InAppBrowser.access$000(_fld0).dismiss();
        }
    }

    l.childView()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/apache/cordova/inappbrowser/InAppBrowser$4

/* anonymous class */
    class InAppBrowser._cls4
        implements Runnable
    {

        final InAppBrowser this$0;
        final WebView val$childView;

        public void run()
        {
            childView.setWebViewClient(new InAppBrowser._cls4._cls1());
            childView.loadUrl("about:blank");
        }

            
            {
                this$0 = final_inappbrowser;
                childView = WebView.this;
                super();
            }
    }

}
