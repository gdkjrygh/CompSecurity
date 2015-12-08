// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

// Referenced classes of package com.google.zxing.client.android:
//            HelpActivity

private final class <init> extends WebViewClient
{

    final HelpActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        setTitle(webview.getTitle());
        HelpActivity.access$1(HelpActivity.this).setEnabled(webview.canGoBack());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("file"))
        {
            return false;
        } else
        {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
        }
    }

    private ()
    {
        this$0 = HelpActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
