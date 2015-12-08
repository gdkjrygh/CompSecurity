// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.adobepass.accessenabler.utils.Log;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            PassiveAuthnWebView, AccessEnablerContext, AccessEnablerService

class this._cls0 extends WebViewClient
{

    final PassiveAuthnWebView this$0;

    public void onPageFinished(WebView webview, String s)
    {
        Log.d("PassiveAuthnService", (new StringBuilder()).append("Page loaded: ").append(s).toString());
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        Log.d("PassiveAuthnService", (new StringBuilder()).append("Page started: ").append(s).toString());
        if (s.contains("/completePassiveAuthentication") && !s.contains("/authenticate/saml") && PassiveAuthnWebView.access$000(PassiveAuthnWebView.this).passiveAuthnState == ssiveAuthnState.PASSIVE_IN_PROGRESS)
        {
            PassiveAuthnWebView.access$100(PassiveAuthnWebView.this).cancel();
            webview = new Intent(PassiveAuthnWebView.access$200(PassiveAuthnWebView.this), com/adobe/adobepass/accessenabler/api/AccessEnablerService);
            s = new Bundle();
            s.putInt("op_code", 4);
            webview.putExtras(s);
            PassiveAuthnWebView.access$200(PassiveAuthnWebView.this).startService(webview);
            return;
        } else
        {
            super.onPageStarted(webview, s, bitmap);
            return;
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.d("PassiveAuthnService", s);
        Log.d("PassiveAuthnService", s1);
        super.onReceivedError(webview, i, s, s1);
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        Log.d("PassiveAuthnService", "Ignoring SSL certificate error.");
        sslerrorhandler.proceed();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Log.d("PassiveAuthnService", (new StringBuilder()).append("Loading URL: ").append(s).toString());
        return false;
    }

    ssiveAuthnState()
    {
        this$0 = PassiveAuthnWebView.this;
        super();
    }
}
