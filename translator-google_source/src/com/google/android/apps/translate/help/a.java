// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.google.android.apps.translate.help:
//            HelpActivity

final class a extends WebViewClient
{

    final HelpActivity a;

    a(HelpActivity helpactivity)
    {
        a = helpactivity;
        super();
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        HelpActivity.a(a).setVisibility(8);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        HelpActivity.a(a).setVisibility(0);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (Uri.parse(s).getHost().equals("support.google.com"))
        {
            return false;
        } else
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            a.startActivity(webview);
            return true;
        }
    }
}
