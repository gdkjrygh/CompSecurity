// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView

public class HybridWebChromeClient extends WebChromeClient
{

    protected final HybridWebView webView;

    public HybridWebChromeClient(HybridWebView hybridwebview)
    {
        webView = hybridwebview;
    }

    public final void onCloseWindow(WebView webview)
    {
        if (webView.uiClient != null)
        {
            webView.uiClient.closeWindow(webview);
        }
        super.onCloseWindow(webview);
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        return true;
    }

    public final boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
    {
        boolean flag2 = false;
        if (flag)
        {
            flag = super.onCreateWindow(webview, flag, flag1, message);
        } else
        {
            flag = flag2;
            if (webView.uiClient != null)
            {
                WLog.d("HybridWebChromeClient", "Creating a new window");
                webview = webView.uiClient.handleOpenNewWindow(webView);
                webview.setVisibility(0);
                webView.setVisibility(4);
                ((android.webkit.WebView.WebViewTransport)message.obj).setWebView(webview);
                message.sendToTarget();
                return true;
            }
        }
        return flag;
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        quotaupdater.updateQuota(l1 << 1);
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i >= 100)
        {
            webView.handleProgressDone();
        }
    }

    public void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        quotaupdater.updateQuota(l << 1);
    }
}
