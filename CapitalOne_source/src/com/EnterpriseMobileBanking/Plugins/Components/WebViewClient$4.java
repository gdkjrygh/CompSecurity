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
        val$view.loadUrl("javascript: if (typeof mobileAppBackButtonEnabled === 'undefined') { webview.backButtonActive(false) } else { webview.backButtonActive(mobileAppBackButtonEnabled)}; (function( elements ){ for( var i=0; i<elements.length; i++ ) { var ele = elements[i]; if( ele.target && ele.target == '_blank' ) { ele.href +='_0targetBlank0'; }} return; })(document.body.getElementsByTagName( 'a' ));");
    }

    ()
    {
        this$0 = final_webviewclient;
        val$view = WebView.this;
        super();
    }
}
