// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser, InAppBrowserDialog

class val.childView
    implements Runnable
{

    final InAppBrowser this$0;
    final WebView val$childView;

    public void run()
    {
        val$childView.setWebViewClient(new WebViewClient() {

            final InAppBrowser._cls4 this$1;

            public void onPageFinished(WebView webview, String s)
            {
                if (InAppBrowser.access$000(this$0) != null)
                {
                    InAppBrowser.access$000(this$0).dismiss();
                }
            }

            
            {
                this$1 = InAppBrowser._cls4.this;
                super();
            }
        });
        val$childView.loadUrl("about:blank");
    }

    _cls1.this._cls1()
    {
        this$0 = final_inappbrowser;
        val$childView = WebView.this;
        super();
    }
}
