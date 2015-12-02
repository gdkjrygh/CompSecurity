// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.qihoo.security.lite:
//            LicenseActivity

class a extends WebViewClient
{

    final LicenseActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        LicenseActivity.a(a).setVisibility(8);
        LicenseActivity.b(a).setVisibility(0);
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        LicenseActivity.a(a).setVisibility(0);
        LicenseActivity.b(a).setVisibility(8);
        super.onPageStarted(webview, s, bitmap);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview.loadUrl(s);
        return true;
    }

    (LicenseActivity licenseactivity)
    {
        a = licenseactivity;
        super();
    }
}
