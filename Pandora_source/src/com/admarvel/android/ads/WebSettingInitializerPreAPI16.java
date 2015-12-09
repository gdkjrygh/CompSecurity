// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.admarvel.android.ads:
//            Utils

class WebSettingInitializerPreAPI16
{

    WebSettingInitializerPreAPI16()
    {
    }

    static void init(WebView webview, Context context, AtomicBoolean atomicboolean, boolean flag)
    {
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setPluginState(android.webkit.WebSettings.PluginState.OFF);
        webview.getSettings().setUseWideViewPort(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setAppCacheEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setAllowContentAccess(true);
        webview.getSettings().setAllowFileAccess(true);
        if (Utils.detectDeviceForWebViewCrash() && flag)
        {
            webview.setLayerType(1, null);
        }
        if (atomicboolean.get())
        {
            webview.getSettings().setBuiltInZoomControls(true);
            webview.getSettings().setSupportZoom(true);
        }
    }
}
