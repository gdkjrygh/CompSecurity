// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyBrowser, l, a, ADCVideo

class a extends WebViewClient
{

    final AdColonyBrowser a;

    public void onPageFinished(WebView webview, String s)
    {
        if (!AdColonyBrowser.C)
        {
            AdColonyBrowser.y = true;
            AdColonyBrowser.x = false;
            a.r.setVisibility(4);
            AdColonyBrowser.v = a.b.canGoBack();
            AdColonyBrowser.w = a.b.canGoForward();
        }
        a.t.invalidate();
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (!AdColonyBrowser.C)
        {
            AdColonyBrowser.x = true;
            AdColonyBrowser.y = false;
            a.r.setVisibility(0);
        }
        a.t.invalidate();
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        l.d.a("Error viewing URL: ").b(s);
        a.finish();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("market://") || s.startsWith("amzn://"))
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            if (a.K != null)
            {
                a.K.startActivity(webview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    (AdColonyBrowser adcolonybrowser)
    {
        a = adcolonybrowser;
        super();
    }
}
