// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.ui:
//            WebViewActivity

private class <init> extends WebViewClient
{

    final WebViewActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        if (WebViewActivity.b(a) != null && !s.contains("#"))
        {
            webview.loadUrl((new StringBuilder()).append(webview.getUrl()).append("#").append(WebViewActivity.b(a)).toString());
            com.fitbit.ui.WebViewActivity.a(a, null);
        }
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (s.contains("#"))
        {
            int i = s.indexOf("#") + 1;
            com.fitbit.ui.WebViewActivity.a(a, s.substring(i));
            s = s.substring(0, i - 1);
            webview.stopLoading();
            webview.loadUrl(s);
            return;
        } else
        {
            super.onPageStarted(webview, s, bitmap);
            return;
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        com.fitbit.e.a.a("WebView", s, new Object[0]);
        a.f = true;
        a.runOnUiThread(a.e);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!a.a(webview, s))
        {
            webview.loadUrl(s);
        }
        return true;
    }

    private (WebViewActivity webviewactivity)
    {
        a = webviewactivity;
        super();
    }

    it>(WebViewActivity webviewactivity, it> it>)
    {
        this(webviewactivity);
    }
}
