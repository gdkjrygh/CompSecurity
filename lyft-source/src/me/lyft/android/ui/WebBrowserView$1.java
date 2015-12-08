// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import me.lyft.android.common.Unit;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui:
//            WebBrowserView

class this._cls0 extends WebViewClient
{

    final WebBrowserView this$0;

    public void onPageFinished(WebView webview, String s)
    {
        loadProgressIndicator.setVisibility(8);
        webviewPageLoadComplete.onNext(Unit.create());
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        WebBrowserView.access$000(WebBrowserView.this);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("tel:"))
        {
            webview = new Intent("android.intent.action.DIAL", Uri.parse(s));
            getContext().startActivity(webview);
        } else
        {
            if (s.startsWith("mailto:"))
            {
                webview = new Intent("android.intent.action.SENDTO", Uri.parse(s));
                getContext().startActivity(webview);
                return true;
            }
            if (!onOverrideUrlLoading(s))
            {
                webView.loadUrl(s);
                return true;
            }
        }
        return true;
    }

    ()
    {
        this$0 = WebBrowserView.this;
        super();
    }
}
