// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package me.grantland.twitter:
//            TwitterActivity, TwitterError

private class <init> extends WebViewClient
{

    final TwitterActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        TwitterActivity.access$3(TwitterActivity.this).dismiss();
        webview.setVisibility(0);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (webview.getVisibility() != 4 && !TwitterActivity.access$3(TwitterActivity.this).isShowing())
        {
            TwitterActivity.access$3(TwitterActivity.this).show();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        TwitterActivity.access$4(TwitterActivity.this, new TwitterError(s, i, s1));
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        if (webview != null && "gc".equals(webview.getScheme()))
        {
            if (webview.getQueryParameter("denied") != null)
            {
                TwitterActivity.access$1(TwitterActivity.this);
            } else
            {
                TwitterActivity.access$2(TwitterActivity.this, webview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = TwitterActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
