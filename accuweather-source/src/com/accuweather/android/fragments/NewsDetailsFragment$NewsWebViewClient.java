// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.accuweather.android.fragments:
//            NewsDetailsFragment

private class <init> extends WebViewClient
{

    final NewsDetailsFragment this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        try
        {
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview) { }
        return true;
    }

    private ()
    {
        this$0 = NewsDetailsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
