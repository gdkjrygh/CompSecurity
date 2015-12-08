// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.nielsen.app.sdk.AppSdk;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import dwg;
import fou;
import fox;

public class NielsenOcrSettingsActivity extends fou
{

    public NielsenOcrSettingsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030027);
        dwg dwg1 = (dwg)dmz.a(dwg);
        WebView webview = (WebView)findViewById(0x7f1102bc);
        bundle = "";
        if (dwg1.b())
        {
            if (dwg1.c)
            {
                bundle = dwg1.b.userOptOutURLString();
            } else
            {
                Logger.c("SDK not ready yet", new Object[0]);
            }
        } else
        {
            Logger.a("Called when integration not enabled", new Object[0]);
        }
        if (bundle.isEmpty())
        {
            Logger.c("Unable to get an opt in/out url from the SDK", new Object[0]);
            return;
        } else
        {
            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setBuiltInZoomControls(true);
            webview.getSettings().setDisplayZoomControls(false);
            webview.getSettings().setLoadWithOverviewMode(true);
            webview.getSettings().setUseWideViewPort(true);
            webview.getSettings().setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
            webview.setWebViewClient(new fox(this, dwg1));
            webview.setWebChromeClient(new WebChromeClient());
            webview.loadUrl(bundle);
            return;
        }
    }

    static 
    {
        com/spotify/mobile/android/ui/activity/NielsenOcrSettingsActivity.getSimpleName();
    }
}
