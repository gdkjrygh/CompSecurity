// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cardinalblue.android.b.k;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HelpActivity

class a extends WebViewClient
{

    final HelpActivity a;

    public void onReceivedError(WebView webview, WebResourceRequest webresourcerequest, WebResourceError webresourceerror)
    {
        if (HelpActivity.a(a) < HelpActivity.a())
        {
            HelpActivity.b(a);
            HelpActivity.c(a).stopLoading();
            HelpActivity.c(a).reload();
            return;
        } else
        {
            HelpActivity.c(a).loadUrl("about:blank");
            k.a(a, 0x7f0700f8, 0);
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.equals("piccollage://close"))
        {
            webview.stopLoading();
            a.finish();
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }

    (HelpActivity helpactivity)
    {
        a = helpactivity;
        super();
    }
}
