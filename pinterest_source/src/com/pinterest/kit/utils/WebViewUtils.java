// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pinterest.api.HttpClientCookieStore;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import java.net.CookieHandler;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

public class WebViewUtils
{

    private static final String PINTEREST_BASE_URL = "https://api.pinterest.com";
    private static String sExternUrls[] = {
        "soundcloud.com", "youtube.com", "play.google.com", "vimeo.com"
    };

    public WebViewUtils()
    {
    }

    public static final void clearCookies(WebView webview)
    {
        if (webview != null)
        {
            CookieSyncManager.createInstance(webview.getContext());
            CookieManager.getInstance().removeAllCookie();
        }
    }

    public static void safeDestroyWebView(final WebView webVw)
    {
        if (webVw == null)
        {
            return;
        }
        try
        {
            long l = ViewConfiguration.getZoomControlsTimeout();
            (new Handler(Looper.getMainLooper())).postDelayed(new _cls1(), l + 1000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final WebView webVw)
        {
            return;
        }
    }

    public static final void setupCookieManager(WebView webview)
    {
        CookieSyncManager.createInstance(webview.getContext());
        CookieManager cookiemanager = CookieManager.getInstance();
        cookiemanager.setAcceptCookie(true);
        if (Device.GTE_LP)
        {
            cookiemanager.setAcceptThirdPartyCookies(webview, true);
        }
        cookiemanager.removeSessionCookie();
        webview = (HttpClientCookieStore)((java.net.CookieManager)CookieHandler.getDefault()).getCookieStore();
        try
        {
            HttpCookie httpcookie;
            for (webview = webview.get(new URI("https://api.pinterest.com")).iterator(); webview.hasNext(); cookiemanager.setCookie("https://api.pinterest.com", (new StringBuilder(httpcookie.toString())).append("; domain=").append(httpcookie.getDomain()).append("; path=").append(httpcookie.getPath()).toString()))
            {
                httpcookie = (HttpCookie)webview.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            PLog.error(webview, "exception occurred", new Object[0]);
        }
        CookieSyncManager.getInstance().sync();
    }

    public static final void setupWebView(WebView webview, boolean flag)
    {
        if (flag)
        {
            webview.clearCache(true);
            webview.clearHistory();
        }
        webview = webview.getSettings();
        webview.setJavaScriptEnabled(true);
        webview.setLoadWithOverviewMode(true);
        webview.setUseWideViewPort(true);
        webview.setBuiltInZoomControls(true);
        webview.setDisplayZoomControls(false);
        webview.setSaveFormData(false);
        webview.setSavePassword(false);
        webview.setDomStorageEnabled(true);
        webview.setUserAgentString((new StringBuilder()).append(webview.getUserAgentString()).append(" [Pinterest/Android]").toString());
    }

    public static boolean shouldUseExternalBrowser(String s)
    {
        Experiments.a("android_clickthrough_to_device_browser");
        if (!Experiments.b()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        String as[] = sExternUrls;
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if (s.contains(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }


    private class _cls1
        implements Runnable
    {

        final WebView val$webVw;

        public final void run()
        {
            webVw.destroy();
        }

        _cls1()
        {
            webVw = webview;
            super();
        }
    }

}
