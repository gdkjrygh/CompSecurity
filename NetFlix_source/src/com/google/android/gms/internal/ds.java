// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

public final class ds
{

    public static void a(Context context, WebSettings websettings)
    {
        websettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
        websettings.setAppCacheMaxSize(0L);
        websettings.setAppCacheEnabled(true);
        websettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        websettings.setDatabaseEnabled(true);
        websettings.setDomStorageEnabled(true);
        websettings.setDisplayZoomControls(false);
        websettings.setBuiltInZoomControls(true);
        websettings.setSupportZoom(true);
    }

    public static void a(Window window)
    {
        window.setFlags(0x1000000, 0x1000000);
    }

    public static void a(WebView webview)
    {
        webview.onPause();
    }

    public static void b(WebView webview)
    {
        webview.onResume();
    }

    public static void d(View view)
    {
        view.setLayerType(1, null);
    }

    public static void e(View view)
    {
        view.setLayerType(0, null);
    }
}
