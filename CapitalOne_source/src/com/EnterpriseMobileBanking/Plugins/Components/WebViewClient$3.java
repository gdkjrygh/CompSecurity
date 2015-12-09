// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.webkit.WebView;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            WebViewClient

class val.view
    implements Runnable
{

    final WebViewClient this$0;
    final WebView val$view;

    public void run()
    {
        val$view.setVisibility(0);
        val$view.loadUrl("javascript:webview.handleErrorCodes(document.body.innerHTML)");
    }

    ()
    {
        this$0 = final_webviewclient;
        val$view = WebView.this;
        super();
    }
}
