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
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.adobepass.accessenabler.utils.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerContext, AccessEnablerService

public class PassiveAuthnWebView
{

    private static PassiveAuthnWebView instance;
    private final String LOG_TAG = "PassiveAuthnService";
    private AccessEnablerContext aeContext;
    private Context appContext;
    private CountDownTimer timer;
    private WebView webView;
    private final WebViewClient webViewClient = new WebViewClient() {

        final PassiveAuthnWebView this$0;

        public void onPageFinished(WebView webview, String s)
        {
            Log.d("PassiveAuthnService", (new StringBuilder()).append("Page loaded: ").append(s).toString());
            super.onPageFinished(webview, s);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            Log.d("PassiveAuthnService", (new StringBuilder()).append("Page started: ").append(s).toString());
            if (s.contains("/completePassiveAuthentication") && !s.contains("/authenticate/saml") && aeContext.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
            {
                timer.cancel();
                webview = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
                s = new Bundle();
                s.putInt("op_code", 4);
                webview.putExtras(s);
                appContext.startService(webview);
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

            
            {
                this$0 = PassiveAuthnWebView.this;
                super();
            }
    };

    private PassiveAuthnWebView(Context context, AccessEnablerContext accessenablercontext)
    {
        appContext = context;
        aeContext = accessenablercontext;
        webView = new WebView(context);
        context = webView.getSettings();
        context.setJavaScriptEnabled(true);
        context.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient(webViewClient);
    }

    public static PassiveAuthnWebView getInstance(Context context, AccessEnablerContext accessenablercontext)
    {
        if (instance == null)
        {
            instance = new PassiveAuthnWebView(context, accessenablercontext);
        }
        instance.startHangupTimer();
        return instance;
    }

    private CountDownTimer newCountdownTimer()
    {
        return new CountDownTimer(0x1d4c0L, 0x1d4c0L) {

            final PassiveAuthnWebView this$0;

            public void onFinish()
            {
                Log.d("PassiveAuthnService", "Timer - Time has elapsed.");
                if (aeContext.passiveAuthnState == PassiveAuthnService.PassiveAuthnState.PASSIVE_IN_PROGRESS)
                {
                    Log.d("PassiveAuthnService", "Timer - Ending passive flow.");
                    webView.stopLoading();
                    Intent intent = new Intent(appContext, com/adobe/adobepass/accessenabler/api/AccessEnablerService);
                    Bundle bundle = new Bundle();
                    bundle.putInt("op_code", 12);
                    intent.putExtras(bundle);
                    appContext.startService(intent);
                }
            }

            public void onTick(long l)
            {
            }

            
            {
                this$0 = PassiveAuthnWebView.this;
                super(l, l1);
            }
        };
    }

    public void addCookies(Map map)
    {
        CookieSyncManager cookiesyncmanager = CookieSyncManager.createInstance(webView.getContext());
        CookieManager cookiemanager = CookieManager.getInstance();
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = ((List)map.get(s)).iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                Log.d("PassiveAuthnService", (new StringBuilder()).append("Injecting cookie: ").append(s1).append(" for domain: ").append(s).toString());
                cookiemanager.setCookie(s, s1);
            }
        }

        cookiesyncmanager.sync();
    }

    public void loadUrl(String s)
    {
        webView.loadUrl(s);
    }

    public void startHangupTimer()
    {
        timer = newCountdownTimer();
        timer.start();
    }




}
