// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.ui.activities.AppboyBaseActivity;

// Referenced classes of package com.appboy.ui:
//            t, s, n, o

public class AppboyWebViewActivity extends AppboyBaseActivity
{

    public AppboyWebViewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        requestWindowFeature(5);
        setContentView(t.o);
        setProgressBarVisibility(true);
        bundle = (WebView)findViewById(s.ab);
        Object obj = bundle.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setAllowFileAccess(false);
        ((WebSettings) (obj)).setPluginState(android.webkit.WebSettings.PluginState.OFF);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            ((WebSettings) (obj)).setDisplayZoomControls(false);
        }
        ((WebSettings) (obj)).setBuiltInZoomControls(true);
        ((WebSettings) (obj)).setUseWideViewPort(true);
        ((WebSettings) (obj)).setLoadWithOverviewMode(true);
        bundle.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        bundle.setWebChromeClient(new n(this));
        bundle.setDownloadListener(new o(this));
        bundle.getSettings().setCacheMode(2);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bundle.setLayerType(1, null);
        }
        bundle.setWebViewClient(new WebViewClient());
        obj = getIntent().getExtras();
        if (obj != null && ((Bundle) (obj)).containsKey("url"))
        {
            bundle.loadUrl(((Bundle) (obj)).getString("url"));
        }
    }
}
