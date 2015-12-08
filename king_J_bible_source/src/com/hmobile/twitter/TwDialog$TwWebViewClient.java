// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

// Referenced classes of package com.hmobile.twitter:
//            TwDialog, DialogError

private class <init> extends WebViewClient
{

    final TwDialog this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview = TwDialog.access$3(TwDialog.this).getTitle();
        if (webview != null && webview.length() > 0)
        {
            TwDialog.access$4(TwDialog.this).setText(webview);
        }
        TwDialog.access$2(TwDialog.this).dismiss();
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        Log.d("twitter", (new StringBuilder("WebView loading URL: ")).append(s).toString());
        super.onPageStarted(webview, s, bitmap);
        if (TwDialog.access$2(TwDialog.this).isShowing())
        {
            TwDialog.access$2(TwDialog.this).dismiss();
        }
        TwDialog.access$2(TwDialog.this).show();
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        TwDialog.access$1(TwDialog.this).Error(new DialogError(s, i, s1));
        dismiss();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Log.d("twitter", (new StringBuilder("Redirect URL: ")).append(s).toString());
        if (s.startsWith("gc://twitt"))
        {
            TwDialog.access$0(TwDialog.this, s);
            return true;
        }
        if (s.startsWith("twitter://cancel"))
        {
            TwDialog.access$1(TwDialog.this).Cancel();
            dismiss();
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = TwDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
