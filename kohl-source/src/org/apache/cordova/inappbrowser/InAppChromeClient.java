// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class InAppChromeClient extends WebChromeClient
{

    private String LOG_TAG;
    private long MAX_QUOTA;
    private CordovaWebView webView;

    public InAppChromeClient(CordovaWebView cordovawebview)
    {
        LOG_TAG = "InAppChromeClient";
        MAX_QUOTA = 0x6400000L;
        webView = cordovawebview;
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        LOG.d(LOG_TAG, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", new Object[] {
            Long.valueOf(l1), Long.valueOf(l), Long.valueOf(l2)
        });
        quotaupdater.updateQuota(MAX_QUOTA);
    }

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        super.onGeolocationPermissionsShowPrompt(s, callback);
        callback.invoke(s, true, false);
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        if (s2 != null && s2.startsWith("gap"))
        {
            if (s2.startsWith("gap-iab://"))
            {
                s = s2.substring(10);
                if (s.startsWith("InAppBrowser"))
                {
                    if (s1 == null || s1.length() == 0)
                    {
                        webview = new PluginResult(org.apache.cordova.PluginResult.Status.OK, new JSONArray());
                    } else
                    {
                        try
                        {
                            webview = new PluginResult(org.apache.cordova.PluginResult.Status.OK, new JSONArray(s1));
                        }
                        // Misplaced declaration of an exception variable
                        catch (WebView webview)
                        {
                            webview = new PluginResult(org.apache.cordova.PluginResult.Status.JSON_EXCEPTION, webview.getMessage());
                        }
                    }
                    webView.sendPluginResult(webview, s);
                    jspromptresult.confirm("");
                    return true;
                }
            } else
            {
                LOG.w(LOG_TAG, (new StringBuilder()).append("InAppBrowser does not support Cordova API calls: ").append(s).append(" ").append(s2).toString());
                jspromptresult.cancel();
                return true;
            }
        }
        return false;
    }
}
