// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.Utils.Log;
import com.capitalone.mobile.banking.app.Application;
import com.capitalone.mobile.banking.security.ExpressSignInIntroActivity;
import com.capitalone.mobile.banking.session.SessionManager;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewClient;
import org.apache.cordova.DroidGap;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper, Config, EnterpriseMobileBanking

public class AppViewClient extends CordovaWebViewClient
{

    private static String TAG = "AppViewClient";
    private DroidGap dgLink;

    public AppViewClient(DroidGap droidgap, CordovaWebView cordovawebview)
    {
        super(droidgap, cordovawebview);
        dgLink = null;
        dgLink = droidgap;
    }

    public void onPageFinished(WebView webview, String s)
    {
        String s1;
        if (AppHelper.getAppString(0x7f0900a2).equals(s))
        {
            s1 = "";
        } else
        if (s.contains("www/atm") && AppHelper.getLastLob() != 0)
        {
            AppHelper.hideBackButton();
            AppHelper.setSelectedMenuItem(0x7f090122);
            s1 = s;
        } else
        {
            s1 = s;
            if (webview.getProgress() >= 100)
            {
                s1 = s;
                if (s.contains(AppHelper.getAppString(0x7f0900a1)))
                {
                    webview.loadUrl(AppHelper.getAppString(0x7f0900a2));
                    s1 = s;
                }
            }
        }
        if (AppHelper.isAuthenticated())
        {
            ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().resetTimeout();
        } else
        {
            ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().removeTimeout();
        }
        super.onPageFinished(webview, s1);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Log.e(TAG, (new StringBuilder()).append("ERROR: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
        AppHelper.genericError(i);
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        Log.d(TAG, (new StringBuilder()).append("Received SSL error: ").append(sslerror.toString()).toString());
        if (Config.MOBILE_CONFIG_BYPASS_SSL_ERRORS.booleanValue())
        {
            sslerrorhandler.proceed();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        boolean flag;
        boolean flag1 = false;
        s = s.toLowerCase();
        Intent intent;
        if (s.startsWith("http://") || s.startsWith("https://"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        AppHelper.sendJavascript("INGDirectApp.hideBusyIndicator();");
        intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
        dgLink.startActivity(Intent.createChooser(intent, ""));
_L4:
        if (flag || super.shouldOverrideUrlLoading(webview, s))
        {
            flag1 = true;
        }
        return flag1;
_L2:
        if (s.contains("expresssigninenrollment://"))
        {
            flag = true;
            EnterpriseMobileBanking enterprisemobilebanking = AppHelper.getApplicationLink();
            enterprisemobilebanking.startActivityForResult(new Intent(AppHelper.getAppContext(), com/capitalone/mobile/banking/security/ExpressSignInIntroActivity), 1234);
            enterprisemobilebanking.overridePendingTransition(0x7f040007, 0x7f040000);
        } else
        if (s.contains("expresslogin://"))
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
