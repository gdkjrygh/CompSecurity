// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            WebViewClient

class val.view
    implements Runnable
{

    final WebViewClient this$0;
    final WebView val$view;

    public void run()
    {
        WebViewClient.access$000(WebViewClient.this).sendJavascript("app.pageLoaded();");
        val$view.setVisibility(0);
    }

    ()
    {
        this$0 = final_webviewclient;
        val$view = WebView.this;
        super();
    }
}
