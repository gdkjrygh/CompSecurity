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
        val$view.loadUrl("javascript:function getAlerts(className) {var alerts = '';var allElements = document.body.getElementsByTagName('div');var length = allElements.length;for (var i=0; i<length; i++) {var currentElement = allElements[i];var classes = currentElement.className;if (classes.indexOf(className) != -1) {var spanAlerts = '';var allSpans = currentElement.getElementsByTagName('span');var spans = allSpans.length;for (var j=0; j<spans; j++) {var currentSpan = allSpans[j];spanAlerts += currentSpan.innerHTML + '|';}alerts += spanAlerts;}} webview.handleAlerts(alerts);}getAlerts('alert');");
    }

    ()
    {
        this$0 = final_webviewclient;
        val$view = WebView.this;
        super();
    }
}
