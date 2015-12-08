// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Handler;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fitbit.data.domain.device.GuideInfo;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.device.ui:
//            GuideActivity

class a extends WebViewClient
{

    final GuideActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        com.fitbit.e.a.a("GuideActivity", "on page finished", new Object[0]);
        GuideActivity.b(a).removeCallbacks(com.fitbit.device.ui.GuideActivity.a(a));
        GuideActivity.c(a);
        super.onPageFinished(webview, s);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        com.fitbit.e.a.a("GuideActivity", s, new Object[0]);
        GuideActivity.b(a).removeCallbacks(com.fitbit.device.ui.GuideActivity.a(a));
        GuideActivity.c(a);
    }

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        com.fitbit.e.a.a("GuideActivity", "on received Http Auth Request", new Object[0]);
        httpauthhandler.proceed(a.a.b(), a.a.c());
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        webview.loadUrl(s);
        return true;
    }

    fo(GuideActivity guideactivity)
    {
        a = guideactivity;
        super();
    }
}
