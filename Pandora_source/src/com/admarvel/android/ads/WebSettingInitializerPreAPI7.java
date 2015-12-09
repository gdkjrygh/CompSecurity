// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

class WebSettingInitializerPreAPI7
{

    WebSettingInitializerPreAPI7()
    {
    }

    static void init(WebView webview, Context context, AtomicBoolean atomicboolean)
    {
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setPluginsEnabled(false);
        webview.setInitialScale(100);
        if (atomicboolean.get())
        {
            webview.getSettings().setBuiltInZoomControls(true);
            webview.getSettings().setSupportZoom(true);
        }
    }
}
