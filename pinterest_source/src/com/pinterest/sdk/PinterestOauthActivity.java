// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.MyUser;
import com.pinterest.kit.utils.AppUtils;
import com.pinterest.kit.utils.WebViewUtils;
import com.pinterest.ui.progress.LoadingView;
import java.util.UUID;

public class PinterestOauthActivity extends Activity
{

    WebView a;
    RelativeLayout b;
    private LoadingView c;
    private String d;
    private boolean e;

    public PinterestOauthActivity()
    {
        e = false;
    }

    static String a(PinterestOauthActivity pinterestoauthactivity)
    {
        return pinterestoauthactivity.d;
    }

    static LoadingView b(PinterestOauthActivity pinterestoauthactivity)
    {
        return pinterestoauthactivity.c;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030026);
        ButterKnife.a(this);
        a.getSettings().setJavaScriptEnabled(true);
        WebViewUtils.setupCookieManager(a);
        a.setWebViewClient(new _cls1());
        c = new LoadingView(this);
        c.setState(0);
        c.setLoadingBackground(null);
        c.setVisibility(0);
        bundle = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        bundle.addRule(13);
        b.addView(c, bundle);
    }

    protected void onResume()
    {
        super.onResume();
        if (MyUser.hasAccessTokenAndUser())
        {
            d = UUID.randomUUID().toString();
            String s = AppUtils.getPackageSignature(getCallingPackage());
            RequestParams requestparams = new RequestParams();
            requestparams.a("response_type", "token");
            requestparams.a("redirect_uri", "pdk://");
            if (getIntent().getStringExtra("PDKCLIENT_EXTRA_APPID") != null)
            {
                requestparams.a("client_id", getIntent().getStringExtra("PDKCLIENT_EXTRA_APPID"));
            }
            requestparams.a("state", d);
            if (s != null)
            {
                requestparams.a("android_keyhash", s);
            }
            requestparams.a("access_token", MyUser.getAccessToken());
            if (getIntent().getStringExtra("PDKCLIENT_EXTRA_PERMISSIONS") != null)
            {
                requestparams.a("scope", getIntent().getStringExtra("PDKCLIENT_EXTRA_PERMISSIONS"));
            }
            s = ApiHttpClient.getUrlWithQueryString("https://api.pinterest.com/oauth/", requestparams);
            a.loadUrl(s);
            return;
        }
        if (!e)
        {
            e = true;
            MyUser.setLoggedIn(false);
            ActivityHelper.goSplashLogin(this, "com.pinterest.EXTRA_SDK_MODE");
            return;
        } else
        {
            setResult(0, new Intent());
            finish();
            return;
        }
    }

    private class _cls1 extends WebViewClient
    {

        final PinterestOauthActivity a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (PinterestOauthActivity.b(a) != null)
            {
                PinterestOauthActivity.b(a).setVisibility(8);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s != null && s.startsWith("pdk://"))
            {
                webview = Uri.parse(s);
                Intent intent = new Intent();
                if (webview != null && PinterestOauthActivity.a(a).equalsIgnoreCase(webview.getQueryParameter("state")))
                {
                    intent.putExtra("PDKCLIENT_EXTRA_RESULT", s);
                }
                a.setResult(-1, intent);
                a.finish();
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            a = PinterestOauthActivity.this;
            super();
        }
    }

}
