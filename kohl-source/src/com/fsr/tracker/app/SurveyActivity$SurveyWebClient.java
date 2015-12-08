// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fsr.tracker.domain.Configuration;
import fs.org.slf4j.Logger;

// Referenced classes of package com.fsr.tracker.app:
//            SurveyActivity, TrackingContext

private class <init> extends WebViewClient
{

    final SurveyActivity this$0;

    public void onPageFinished(WebView webview, String s)
    {
        SurveyActivity.access$200(SurveyActivity.this).debug("Finished loading URL: {}", s);
        super.onPageFinished(webview, s);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        switch (i)
        {
        default:
            return;

        case -14: 
        case -8: 
        case -6: 
        case -2: 
            onNetworkNotAvailable();
            break;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (TrackingContext.Instance().getConfiguration().isDomainWhiteListed(s))
        {
            SurveyActivity.access$100(SurveyActivity.this).loadUrl(s);
        } else
        {
            SurveyActivity.access$200(SurveyActivity.this).debug("Requested URL not white listed: {}", s);
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            webview.addFlags(0x10000000);
            startActivity(webview);
        }
        return true;
    }

    private ()
    {
        this$0 = SurveyActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
