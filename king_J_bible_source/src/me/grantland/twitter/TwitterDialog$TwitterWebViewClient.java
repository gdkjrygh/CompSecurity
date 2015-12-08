// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

// Referenced classes of package me.grantland.twitter:
//            TwitterDialog, TwitterError

private class <init> extends WebViewClient
{

    final TwitterDialog this$0;

    public void onPageFinished(WebView webview, String s)
    {
        TwitterDialog.access$4(TwitterDialog.this).dismiss();
        TwitterDialog.access$5(TwitterDialog.this).setVisibility(0);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        if (!TwitterDialog.access$4(TwitterDialog.this).isShowing())
        {
            TwitterDialog.access$4(TwitterDialog.this).show();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        TwitterDialog.access$6(TwitterDialog.this)._mth0(new TwitterError(s, i, s1));
        dismiss();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview = Uri.parse(s);
        if (webview != null && "gc".equals(webview.getScheme()))
        {
            if (webview.getQueryParameter("denied") != null)
            {
                cancel();
            } else
            {
                TwitterDialog.access$3(TwitterDialog.this, webview);
            }
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = TwitterDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
