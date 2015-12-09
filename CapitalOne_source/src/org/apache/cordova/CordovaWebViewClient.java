// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Hashtable;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.LOG;
import org.apache.cordova.api.PluginManager;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, AuthenticationToken, NativeToJsMessageQueue

public class CordovaWebViewClient extends WebViewClient
{

    private static final String CORDOVA_EXEC_URL_PREFIX = "http://cdv_exec/";
    private static final String TAG = "Cordova";
    CordovaWebView appView;
    private Hashtable authenticationTokens;
    CordovaInterface cordova;
    private boolean doClearHistory;

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
    }

    private void handleExecUrl(String s)
    {
        int i = "http://cdv_exec/".length();
        int j = s.indexOf('#', i + 1);
        int k = s.indexOf('#', j + 1);
        int l = s.indexOf('#', k + 1);
        if (i == -1 || j == -1 || k == -1 || l == -1)
        {
            Log.e("Cordova", (new StringBuilder()).append("Could not decode URL command: ").append(s).toString());
            return;
        } else
        {
            String s1 = s.substring(i, j);
            String s2 = s.substring(j + 1, k);
            String s3 = s.substring(k + 1, l);
            s = s.substring(l + 1);
            appView.pluginManager.exec(s1, s2, s3, s);
            return;
        }
    }

    public void clearAuthenticationTokens()
    {
        authenticationTokens.clear();
    }

    public void doUpdateVisitedHistory(WebView webview, String s, boolean flag)
    {
        if (!appView.peekAtUrlStack().equals(s))
        {
            appView.pushUrl(s);
        }
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
        LOG.d("Cordova", (new StringBuilder()).append("onPageFinished(").append(s).append(")").toString());
        if (doClearHistory)
        {
            webview.clearHistory();
            doClearHistory = false;
        }
        webview = appView;
        webview.loadUrlTimeout = ((CordovaWebView) (webview)).loadUrlTimeout + 1;
        if (!s.equals("about:blank"))
        {
            appView.loadUrl("javascript:try{ cordova.require('cordova/channel').onNativeReady.fire();}catch(e){_nativeReady = true;}");
            appView.postMessage("onNativeReady", null);
        }
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
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (!appView.useBrowserHistory)
        {
            webview.clearHistory();
            doClearHistory = true;
        }
        appView.jsMessageQueue.reset();
        appView.postMessage("onPageStarted", s);
        if (appView.pluginManager != null)
        {
            appView.pluginManager.onReset();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        LOG.d("Cordova", "CordovaWebViewClient.onReceivedError: Error code=%s Description=%s URL=%s", new Object[] {
            Integer.valueOf(i), s, s1
        });
        webview = appView;
        webview.loadUrlTimeout = ((CordovaWebView) (webview)).loadUrlTimeout + 1;
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
        webview = getAuthenticationToken(s, s1);
        if (webview != null)
        {
            httpauthhandler.proceed(webview.getUserName(), webview.getPassword());
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
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (appView.pluginManager == null || !appView.pluginManager.onOverrideUrlLoading(s)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (s.startsWith("tel:"))
        {
            try
            {
                webview = new Intent("android.intent.action.DIAL");
                webview.setData(Uri.parse(s));
                cordova.getActivity().startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                LOG.e("Cordova", (new StringBuilder()).append("Error dialing ").append(s).append(": ").append(webview.toString()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        if (s.startsWith("geo:"))
        {
            try
            {
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                cordova.getActivity().startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                LOG.e("Cordova", (new StringBuilder()).append("Error showing map ").append(s).append(": ").append(webview.toString()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        if (s.startsWith("mailto:"))
        {
            try
            {
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                cordova.getActivity().startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                LOG.e("Cordova", (new StringBuilder()).append("Error sending email ").append(s).append(": ").append(webview.toString()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!s.startsWith("sms:")) goto _L4; else goto _L3
_L3:
        Intent intent;
        int i;
        try
        {
            intent = new Intent("android.intent.action.VIEW");
            i = s.indexOf('?');
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            LOG.e("Cordova", (new StringBuilder()).append("Error sending sms ").append(s).append(":").append(webview.toString()).toString());
            continue; /* Loop/switch isn't completed */
        }
        if (i != -1) goto _L6; else goto _L5
_L5:
        webview = s.substring(4);
_L7:
        intent.setData(Uri.parse((new StringBuilder()).append("sms:").append(webview).toString()));
        intent.putExtra("address", webview);
        intent.setType("vnd.android-dir/mms-sms");
        cordova.getActivity().startActivity(intent);
        continue; /* Loop/switch isn't completed */
_L6:
        String s1;
        String s2;
        s1 = s.substring(4, i);
        s2 = Uri.parse(s).getQuery();
        webview = s1;
        if (s2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        webview = s1;
        if (!s2.startsWith("body="))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent.putExtra("sms_body", s2.substring(5));
        webview = s1;
        if (true) goto _L7; else goto _L4
_L4:
        if (s.startsWith("file://") || s.startsWith("data:") || s.indexOf(appView.baseUrl) == 0 || appView.isUrlWhiteListed(s))
        {
            if (appView.useBrowserHistory || s.startsWith("data:"))
            {
                return false;
            }
            appView.loadUrl(s);
        } else
        {
            try
            {
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                cordova.getActivity().startActivity(webview);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                LOG.e("Cordova", (new StringBuilder()).append("Error loading url ").append(s).toString(), webview);
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}
