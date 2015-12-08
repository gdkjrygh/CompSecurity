// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Hashtable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaUriHelper, AuthenticationToken, LOG, CordovaWebView, 
//            CordovaBridge, PluginManager, CordovaInterface

public class CordovaWebViewClient extends WebViewClient
{

    private static final String TAG = "CordovaWebViewClient";
    CordovaWebView appView;
    private Hashtable authenticationTokens;
    CordovaInterface cordova;
    private boolean doClearHistory;
    CordovaUriHelper helper;
    boolean isCurrentlyLoading;

    public CordovaWebViewClient(CordovaInterface cordovainterface)
    {
        doClearHistory = false;
        authenticationTokens = new Hashtable();
        cordova = cordovainterface;
    }

    public CordovaWebViewClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        doClearHistory = false;
        authenticationTokens = new Hashtable();
        cordova = cordovainterface;
        appView = cordovawebview;
        helper = new CordovaUriHelper(cordovainterface, cordovawebview);
    }

    public void clearAuthenticationTokens()
    {
        authenticationTokens.clear();
    }

    public AuthenticationToken getAuthenticationToken(String s, String s1)
    {
        AuthenticationToken authenticationtoken = (AuthenticationToken)authenticationTokens.get(s.concat(s1));
        Object obj = authenticationtoken;
        if (authenticationtoken == null)
        {
            obj = (AuthenticationToken)authenticationTokens.get(s);
            s = ((String) (obj));
            if (obj == null)
            {
                s = (AuthenticationToken)authenticationTokens.get(s1);
            }
            obj = s;
            if (s == null)
            {
                obj = (AuthenticationToken)authenticationTokens.get("");
            }
        }
        return ((AuthenticationToken) (obj));
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        if (isCurrentlyLoading)
        {
            isCurrentlyLoading = false;
            LOG.d("CordovaWebViewClient", (new StringBuilder()).append("onPageFinished(").append(s).append(")").toString());
            if (doClearHistory)
            {
                webview.clearHistory();
                doClearHistory = false;
            }
            webview = appView;
            webview.loadUrlTimeout = ((CordovaWebView) (webview)).loadUrlTimeout + 1;
            appView.postMessage("onPageFinished", s);
            if (appView.getVisibility() == 4)
            {
                (new Thread(new Runnable() {

                    final CordovaWebViewClient this$0;

                    public void run()
                    {
                        try
                        {
                            Thread.sleep(2000L);
                            cordova.getActivity().runOnUiThread(new Runnable() {

                                final _cls1 this$1;

                                public void run()
                                {
                                    appView.postMessage("spinner", "stop");
                                }

            
            {
                this$1 = _cls1.this;
                super();
            }
                            });
                            return;
                        }
                        catch (InterruptedException interruptedexception)
                        {
                            return;
                        }
                    }

            
            {
                this$0 = CordovaWebViewClient.this;
                super();
            }
                })).start();
            }
            if (s.equals("about:blank"))
            {
                appView.postMessage("exit", null);
                return;
            }
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        isCurrentlyLoading = true;
        LOG.d("CordovaWebViewClient", (new StringBuilder()).append("onPageStarted(").append(s).append(")").toString());
        appView.bridge.reset(s);
        appView.postMessage("onPageStarted", s);
        if (appView.pluginManager != null)
        {
            appView.pluginManager.onReset();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (!isCurrentlyLoading)
        {
            return;
        }
        LOG.d("CordovaWebViewClient", "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", new Object[] {
            Integer.valueOf(i), s, s1
        });
        CordovaWebView cordovawebview = appView;
        cordovawebview.loadUrlTimeout = cordovawebview.loadUrlTimeout + 1;
        if (i == -10)
        {
            if (webview.canGoBack())
            {
                webview.goBack();
                return;
            }
            super.onReceivedError(webview, i, s, s1);
        }
        webview = new JSONObject();
        try
        {
            webview.put("errorCode", i);
            webview.put("description", s);
            webview.put("url", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        appView.postMessage("onReceivedError", webview);
    }

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        AuthenticationToken authenticationtoken = getAuthenticationToken(s, s1);
        if (authenticationtoken != null)
        {
            httpauthhandler.proceed(authenticationtoken.getUserName(), authenticationtoken.getPassword());
            return;
        } else
        {
            super.onReceivedHttpAuthRequest(webview, httpauthhandler, s, s1);
            return;
        }
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        String s;
        PackageManager packagemanager;
        s = cordova.getActivity().getPackageName();
        packagemanager = cordova.getActivity().getPackageManager();
        if ((packagemanager.getApplicationInfo(s, 128).flags & 2) != 0)
        {
            sslerrorhandler.proceed();
            return;
        }
        try
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        }
        return;
    }

    public AuthenticationToken removeAuthenticationToken(String s, String s1)
    {
        return (AuthenticationToken)authenticationTokens.remove(s.concat(s1));
    }

    public void setAuthenticationToken(AuthenticationToken authenticationtoken, String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = "";
        }
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        authenticationTokens.put(s2.concat(s), authenticationtoken);
    }

    public void setWebView(CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
        helper = new CordovaUriHelper(cordova, cordovawebview);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return helper.shouldOverrideUrlLoading(webview, s);
    }
}
