// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.supersonicads.sdk.b.f;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.supersonicads.sdk.controller:
//            OpenUrlActivity, SupersonicWebView

private class <init> extends WebViewClient
{

    final OpenUrlActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        OpenUrlActivity.a(a).setVisibility(4);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        OpenUrlActivity.a(a).setVisibility(0);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
label0:
        {
            Object obj = f.a().d();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!s.contains((String)((Iterator) (obj)).next()));
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            a.startActivity(webview);
            OpenUrlActivity.b(a).i();
            a.finish();
            return true;
        }
        return super.shouldOverrideUrlLoading(webview, s);
    }

    private (OpenUrlActivity openurlactivity)
    {
        a = openurlactivity;
        super();
    }

    a(OpenUrlActivity openurlactivity, a a1)
    {
        this(openurlactivity);
    }
}
