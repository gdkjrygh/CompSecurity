// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.ui.activities.AppboyBaseActivity;

public class AppboyWebViewActivity extends AppboyBaseActivity
{

    public static final String URL_EXTRA = "url";

    public AppboyWebViewActivity()
    {
    }

    private void setWebLayerTypeSafe(WebView webview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            webview.setLayerType(1, null);
        }
    }

    private void setZoomSafe(WebSettings websettings)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            websettings.setDisplayZoomControls(false);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        requestWindowFeature(5);
        setContentView(R.layout.com_appboy_webview_activity);
        setProgressBarVisibility(true);
        bundle = (WebView)findViewById(R.id.com_appboy_webview_activity_webview);
        Object obj = bundle.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setAllowFileAccess(false);
        ((WebSettings) (obj)).setPluginState(android.webkit.WebSettings.PluginState.OFF);
        setZoomSafe(((WebSettings) (obj)));
        ((WebSettings) (obj)).setBuiltInZoomControls(true);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        ((WebSettings) (obj)).setLoadWithOverviewMode(true);
        bundle.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        bundle.setWebChromeClient(new WebChromeClient() {

            final AppboyWebViewActivity this$0;

            public void onProgressChanged(WebView webview, int i)
            {
                if (i < 100)
                {
                    setProgressBarVisibility(true);
                    return;
                } else
                {
                    setProgressBarVisibility(false);
                    return;
                }
            }

            
            {
                this$0 = AppboyWebViewActivity.this;
                super();
            }
        });
        bundle.setDownloadListener(new DownloadListener() {

            final AppboyWebViewActivity this$0;

            public void onDownloadStart(String s, String s1, String s2, String s3, long l)
            {
                s1 = new Intent("android.intent.action.VIEW");
                s1.setData(Uri.parse(s));
                startActivity(s1);
            }

            
            {
                this$0 = AppboyWebViewActivity.this;
                super();
            }
        });
        bundle.getSettings().setCacheMode(2);
        setWebLayerTypeSafe(bundle);
        bundle.setWebViewClient(new WebViewClient());
        obj = getIntent().getExtras();
        if (obj != null && ((Bundle) (obj)).containsKey("url"))
        {
            bundle.loadUrl(((Bundle) (obj)).getString("url"));
        }
    }
}
