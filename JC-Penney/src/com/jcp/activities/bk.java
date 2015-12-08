// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.jcp.activities:
//            SameDayPickUpCustomerServiceWebView, bj

class bk extends WebViewClient
{

    final SameDayPickUpCustomerServiceWebView a;

    private bk(SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview)
    {
        a = samedaypickupcustomerservicewebview;
        super();
    }

    bk(SameDayPickUpCustomerServiceWebView samedaypickupcustomerservicewebview, bj bj)
    {
        this(samedaypickupcustomerservicewebview);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (SameDayPickUpCustomerServiceWebView.a(a).isShowing())
        {
            a.mWebView.setVisibility(0);
            SameDayPickUpCustomerServiceWebView.a(a).dismiss();
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        SameDayPickUpCustomerServiceWebView.a(a, ProgressDialog.show(a, null, a.getResources().getString(0x7f070276)));
        SameDayPickUpCustomerServiceWebView.a(a).setCancelable(true);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        if (SameDayPickUpCustomerServiceWebView.a(a) != null)
        {
            SameDayPickUpCustomerServiceWebView.a(a).dismiss();
        }
    }
}
