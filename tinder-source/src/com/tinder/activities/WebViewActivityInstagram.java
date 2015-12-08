// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.appboy.Appboy;
import com.tinder.a.f;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.InstagramCodeError;
import com.tinder.utils.v;

public class WebViewActivityInstagram extends Activity
{
    public static interface a
    {

        public abstract void a(InstagramCodeError instagramcodeerror);

        public abstract void a(String s);
    }

    private final class b extends WebViewClient
    {

        final WebViewActivityInstagram a;
        private a b;

        public final void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            v.b(String.format("onReceivedError errorCode:[%s], description:[%s], failigUrl[%s]", new Object[] {
                Integer.valueOf(i), s, s1
            }));
            a.finish();
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            int i = 0;
            boolean flag = false;
            webview = Uri.parse(s);
            if (s.startsWith(WebViewActivityInstagram.b(a)))
            {
                s = webview.getQueryParameter("code");
                if (!TextUtils.isEmpty(s))
                {
                    b.a(s);
                } else
                {
                    s = webview.getQueryParameter("status");
                    if (!TextUtils.isEmpty(s))
                    {
                        i = Integer.parseInt(s);
                    }
                    s = webview.getQueryParameter("error");
                    String s1 = webview.getQueryParameter("errorReason");
                    webview = webview.getQueryParameter("errorDescription");
                    webview = (new com.tinder.model.InstagramCodeError.Builder(s)).ErrorReason(s1).ErrorDescription(webview).StatusCode(i).build();
                    b.a(webview);
                }
                flag = true;
            }
            return flag;
        }

        public b(a a1)
        {
            a = WebViewActivityInstagram.this;
            super();
            b = a1;
        }
    }


    f a;
    private WebView b;
    private String c;
    private String d;
    private ProgressBar e;

    public WebViewActivityInstagram()
    {
    }

    static ProgressBar a(WebViewActivityInstagram webviewactivityinstagram)
    {
        return webviewactivityinstagram.e;
    }

    static String b(WebViewActivityInstagram webviewactivityinstagram)
    {
        return webviewactivityinstagram.d;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030021);
        ManagerApp.h().a(this);
        if (getIntent().getExtras() != null)
        {
            c = getIntent().getExtras().getString("url");
            d = getIntent().getExtras().getString("url_redirect");
        }
        if (TextUtils.isEmpty(c))
        {
            finish();
        }
        e = (ProgressBar)findViewById(0x7f0e00a7);
        b = (WebView)findViewById(0x7f0e00a1);
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().removeAllCookie();
        b.setWebViewClient(new b(new a() {

            final WebViewActivityInstagram a;

            public final void a(InstagramCodeError instagramcodeerror)
            {
                (new StringBuilder("Instagram access code error: ")).append(instagramcodeerror);
                Intent intent = a.getIntent();
                intent.putExtra("access_code_error", instagramcodeerror);
                a.setResult(99, intent);
                a.finish();
            }

            public final void a(String s)
            {
                Intent intent = a.getIntent();
                intent.putExtra("access_code", s);
                a.setResult(-1, intent);
                a.finish();
            }

            
            {
                a = WebViewActivityInstagram.this;
                super();
            }
        }));
        b.setWebChromeClient(new WebChromeClient() {

            final WebViewActivityInstagram a;

            public final void onProgressChanged(WebView webview, int i)
            {
                if (i < 100 && WebViewActivityInstagram.a(a).getVisibility() == 8)
                {
                    WebViewActivityInstagram.a(a).setVisibility(0);
                }
                if (i == 100)
                {
                    WebViewActivityInstagram.a(a).setVisibility(8);
                }
            }

            
            {
                a = WebViewActivityInstagram.this;
                super();
            }
        });
        b.getSettings().setJavaScriptEnabled(true);
        b.getSettings().setSaveFormData(false);
        b.getSettings().setSavePassword(false);
        b.loadUrl(c);
    }

    protected void onStart()
    {
        super.onStart();
        Appboy.getInstance(this).openSession(this);
    }

    protected void onStop()
    {
        super.onStop();
        Appboy.getInstance(this).closeSession(this);
    }
}
