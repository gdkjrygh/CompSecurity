// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            WebViewActivity

class this._cls0 extends WebViewClient
{

    final WebViewActivity this$0;

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("mailto:"))
        {
            WebViewActivity.access$000(WebViewActivity.this, s);
        } else
        {
            webview.loadUrl(s);
        }
        return true;
    }

    ()
    {
        this$0 = WebViewActivity.this;
        super();
    }
}
