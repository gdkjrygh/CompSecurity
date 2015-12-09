// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Config;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.BusyJSI;
import com.EnterpriseMobileBanking.Plugins.NativeCache;
import com.EnterpriseMobileBanking.Plugins.NotificationPlugin;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import com.EnterpriseMobileBanking.Utils.Log;
import com.EnterpriseMobileBanking.Utils.WebViewHelper;
import com.capitalone.mobile.banking.app.Application;
import com.capitalone.mobile.banking.session.SessionManager;
import java.util.Map;
import org.apache.cordova.api.LegacyContext;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            TransiteWebView

public class WebViewClient extends android.webkit.WebViewClient
{

    private static final String TAG = "WebViewClient";
    private WebViewLinker appLink;
    private BusyJSI busyInd;
    private boolean redirectWithinApp;

    public WebViewClient(WebViewLinker webviewlinker)
    {
        appLink = null;
        busyInd = new BusyJSI();
        appLink = webviewlinker;
    }

    public static int findUrlIndexFromTopOfStack(WebView webview, String s)
    {
        if (webview != null && s != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        webview = webview.copyBackForwardList();
        for (int i = 0; i < webview.getSize(); i++)
        {
            Log.v("WebViewClient", (new StringBuilder()).append("checking webBackForwardList(").append(i).append("): ").append(webview.getItemAtIndex(i).getUrl()).toString());
        }

        int k = webview.getCurrentIndex();
        String s1 = webview.getItemAtIndex(k).getUrl();
        if (s1.contains("migration") && s1.contains("stateId=username"))
        {
            return -2;
        }
        if (webview != null)
        {
            Log.v("WebViewClient", (new StringBuilder()).append("currentIndex: ").append(k).toString());
            Log.v("WebViewClient", (new StringBuilder()).append("currentUrl: ").append(s1).toString());
            int j = k - 1;
            while (j >= 0) 
            {
                Log.v("WebViewClient", (new StringBuilder()).append("currentIndex / 0: ").append(k).append(" / 0").toString());
                String s2 = webview.getItemAtIndex(j).getUrl();
                Log.v("WebViewClient", (new StringBuilder()).append("currentUrl: ").append(s2).toString());
                if (s.equals(s2))
                {
                    return k - j;
                }
                j--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String getTrimedUrl(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (s.endsWith("/"))
            {
                return s.substring(0, s.length() - 1);
            }
        }
        return s1;
    }

    private void launchIntent(Intent intent)
    {
        intent = Intent.createChooser(intent, "");
        if (appLink.ctx == null)
        {
            AppHelper.getAppContext().startActivity(intent);
            return;
        }
        try
        {
            appLink.ctx.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Log.e("WebViewClient", intent.toString());
        }
        return;
    }

    public void onFormResubmission(WebView webview, Message message, Message message1)
    {
        message1.sendToTarget();
    }

    public void onLoadResource(WebView webview, String s)
    {
        if (s != null && s.contains(AppHelper.getAppString(0x7f09010d)) || s.contains(AppHelper.getAppString(0x7f09010e)))
        {
            appLink.sendJavascript("INGDirectApp.goToErrorPage();");
            webview.stopLoading();
            Log.d("WebViewClient", (new StringBuilder()).append("Bad Url: ").append(s).toString());
            return;
        }
        if (s.indexOf("/tuning") >= 0)
        {
            appLink.sendJavascript("Ext.dispatch({controller: 'LogoutController',action: 'signout',params: 'TransiteDown'});");
            webview.stopLoading();
            return;
        } else
        {
            super.onLoadResource(webview, s);
            return;
        }
    }

    public void onPageFinished(final WebView view, String s)
    {
        Log.d("WebViewClient", (new StringBuilder()).append("onPageFinished: url: ").append(s).append(" -- view.getUrl(): ").append(view.getUrl()).toString());
        if (s.indexOf(AppHelper.getAppString(0x7f09014b)) < 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        WebViewHelper webviewhelper;
        String s1;
        boolean flag2;
        if (view.getUrl() != null && view.getUrl().contains("migration") && view.getUrl().contains("stateId=confirmation"))
        {
            AppHelper.sendJavascript("window.plugins.nativeCache.remove(CacheKeys.cif, Ext.emptyFn, Ext.emptyFn);");
            AppHelper.sendJavascript("window.plugins.nativeCache.remove(CacheKeys.maskedCif, Ext.emptyFn, Ext.emptyFn);");
        }
        flag2 = AppHelper.isAuthenticated();
        if (view.getProgress() == 100 && busyInd.isVisible())
        {
            busyInd.hide();
        }
        EnterpriseMobileBanking.setThirdPartyTimer(false);
        webviewhelper = AppHelper.getURLAttributes(getTrimedUrl(s));
        if (webviewhelper == null)
        {
            break; /* Loop/switch isn't completed */
        }
label0:
        {
            s1 = webviewhelper.getMode();
            if (!s1.equals("quiet"))
            {
                break label0;
            }
            Log.d("WebViewClient", "onPageFinished: quiet mode returning...");
            if (view.getProgress() == 100 && busyInd.isVisible())
            {
                busyInd.hide();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (false) goto _L5; else goto _L4
_L5:
        if (!s1.equals("rewards")) goto _L7; else goto _L6
_L6:
        ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().removeTimeout();
        EnterpriseMobileBanking.setThirdPartyTimer(true);
        Log.d("WebViewClient", (new StringBuilder()).append("onPageFinished: loaded rewards: ").append(s).toString());
        webviewhelper;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (s == null) goto _L9; else goto _L8
_L8:
        if (s.endsWith("LogOut.aspx")) goto _L11; else goto _L10
_L10:
        flag = flag1;
        if (!s.endsWith("timeout.html")) goto _L9; else goto _L11
_L9:
        if (webviewhelper.isTimeout() || flag)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        webviewhelper.setTimedOut(true);
        webviewhelper.cancelTimer();
        view.post(new Runnable() {

            final WebViewClient this$0;
            final WebView val$view;

            public void run()
            {
                appLink.sendJavascript("app.pageLoaded();");
                view.setVisibility(0);
            }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
        });
        webviewhelper;
        JVM INSTR monitorexit ;
        return;
        view;
        webviewhelper;
        JVM INSTR monitorexit ;
        throw view;
_L7:
        if (s1.equals("products_360"))
        {
            AppHelper.showBackButton();
            return;
        }
          goto _L12
_L4:
        if (s.endsWith("timeout.html"))
        {
            AppHelper.sendJavascript("app.returnToLogin('', 'timeout');");
        }
_L12:
        if (!AppHelper.getAppString(0x7f0900a2).equals(s) && !AppHelper.getAppString(0x7f0900a2).equals(view.getUrl()))
        {
            if (s.contains(AppHelper.getAppString(0x7f09010f)))
            {
                Log.e("WebViewClient", "loading login.vm javascript");
                view.post(new Runnable() {

                    final WebViewClient this$0;
                    final WebView val$view;

                    public void run()
                    {
                        view.loadUrl("javascript:function getAlerts(className) {var alerts = '';var allElements = document.body.getElementsByTagName('div');var length = allElements.length;for (var i=0; i<length; i++) {var currentElement = allElements[i];var classes = currentElement.className;if (classes.indexOf(className) != -1) {var spanAlerts = '';var allSpans = currentElement.getElementsByTagName('span');var spans = allSpans.length;for (var j=0; j<spans; j++) {var currentSpan = allSpans[j];spanAlerts += currentSpan.innerHTML + '|';}alerts += spanAlerts;}} webview.handleAlerts(alerts);}getAlerts('alert');");
                    }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
                });
                Log.e("WebViewClient", "finished loading login.vm javascript");
            } else
            if (AppHelper.getIsFreezeCardFlow())
            {
                if (view.getUrl().contains("freezeCard=true"))
                {
                    view.setVisibility(4);
                }
            } else
            {
                view.post(new Runnable() {

                    final WebViewClient this$0;
                    final WebView val$view;

                    public void run()
                    {
                        view.setVisibility(0);
                        view.loadUrl("javascript:webview.handleErrorCodes(document.body.innerHTML)");
                    }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
                });
            }
            if (view.getTag() != null && ((Boolean)view.getTag()).booleanValue())
            {
                Log.v("WebViewClient", "%%%%%%% main clearing history");
                view.clearHistory();
                view.setTag(Boolean.valueOf(false));
            }
            if ((s.contains("/cardActivation") || s.contains("banking/activateCheckbook?execution=") || s.contains("/openAccountFastAppMobileWeb3000Stash") || s.contains("coafAccountManagement") || s.contains("coafTransacHistory")) && !s.contains("account_summary.vm"))
            {
                Log.v("WebViewClient", "Back button shown for activate card or checkbook");
                view.clearHistory();
                AppHelper.showBackButton();
            } else
            if (s.contains("account_summary.vm") || s.contains("coafPaymentConfirmation") || s.contains("openAccountFastAppMobileWeb3000") && s.contains("stateId=fundAccount") || s.contains("eoFastappA") && (s.contains("stateId=validateCustomerInfo") || s.contains("stateId=ineligible")))
            {
                Log.v("WebViewClient", "Hide back button/show menu button for account summary, coaf payment confirmation, fast apps, always.");
                AppHelper.hideBackButton();
            } else
            if (AppHelper.getIsFreezeCardFlow())
            {
                if (s.contains("stateId=transactions"))
                {
                    view.setVisibility(4);
                    Log.v("WebViewClient", "Doing programmatic click on accountDetailDebitCard!");
                    view.loadUrl("javascript:window.location=accountDetailDebitCard");
                } else
                if (view.getUrl().contains("/accountDetailDebitCard") && view.getUrl().contains("stateId=debitTabRender"))
                {
                    view.loadUrl("javascript:document.getElementById('inPage_navigation_point').remove();");
                    if (s.contains("stateId=activateStart") || s.contains("stateId=deactivateStart"))
                    {
                        AppHelper.showBackButton();
                    }
                    view.setVisibility(0);
                }
            } else
            if (s.contains(AppHelper.getAppString(0x7f090112)) || s.contains("coafPayment") || s.contains("/migration"))
            {
                AppHelper.showBackButton();
            } else
            if (s.contains(AppHelper.getAppString(0x7f09011f)) && AppHelper.getLastLob() != 0)
            {
                AppHelper.hideBackButton();
            } else
            if (!s.contains(AppHelper.getAppString(0x7f090111)))
            {
                view.getHandler().post(new Runnable() {

                    final WebViewClient this$0;
                    final WebView val$view;

                    public void run()
                    {
                        view.loadUrl("javascript: if (typeof mobileAppBackButtonEnabled === 'undefined') { webview.backButtonActive(false) } else { webview.backButtonActive(mobileAppBackButtonEnabled)}; (function( elements ){ for( var i=0; i<elements.length; i++ ) { var ele = elements[i]; if( ele.target && ele.target == '_blank' ) { ele.href +='_0targetBlank0'; }} return; })(document.body.getElementsByTagName( 'a' ));");
                    }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
                });
            }
            if (s.indexOf("myaccount/banking/eoFastappA") >= 0)
            {
                appLink.sendJavascript("Ext.dispatch({controller: 'MenuController', action: 'updateMenu'});");
            }
            if (!view.hasFocus() && view.getVisibility() == 0)
            {
                view.requestFocus();
                view.requestLayout();
            }
            appLink.sendJavascript("COFBridge.updateLastAccessed();");
            if (!redirectWithinApp)
            {
                appLink.sendJavascript("INGDirectApp.hideBusyIndicator();");
            }
        } else
        {
            Log.v("WebViewClient", "%%%%%%% else clearing history");
            view.clearHistory();
            view.setTag(Boolean.valueOf(true));
        }
        if (s.indexOf("lp-deposits") >= 0)
        {
            appLink.sendJavascript("gotoMenuPage('RDCController|index');");
            view.stopLoading();
            view.loadUrl("about:blank");
        }
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L14; else goto _L13
_L13:
        webviewhelper = AppHelper.getURLAttributes(getTrimedUrl("rewards"));
        if (webviewhelper == null || s == null) goto _L14; else goto _L15
_L15:
        webviewhelper;
        JVM INSTR monitorenter ;
        if (s.endsWith("ApplicationError.aspx"))
        {
            webviewhelper.cancelTimer();
            Log.d("WebViewClient", "Cancel rewards timer");
            view.post(new Runnable() {

                final WebViewClient this$0;
                final WebView val$view;

                public void run()
                {
                    appLink.sendJavascript("app.pageLoaded();");
                    view.setVisibility(0);
                }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
            });
        }
        webviewhelper;
        JVM INSTR monitorexit ;
_L14:
        if (flag2)
        {
            ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().resetTimeout();
            return;
        } else
        {
            ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().removeTimeout();
            return;
        }
        view;
        webviewhelper;
        JVM INSTR monitorexit ;
        throw view;
_L11:
        flag = true;
        if (true) goto _L9; else goto _L16
_L16:
    }

    public void onPageStarted(final WebView view, String s, Bitmap bitmap)
    {
        if (s.endsWith("#") && !s.contains("execution") && !s.contains("stateId"))
        {
            view.post(new Runnable() {

                final WebViewClient this$0;
                final WebView val$view;

                public void run()
                {
                    view.goBack();
                }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
            });
            return;
        }
        bitmap = Uri.parse(s);
        redirectWithinApp = false;
        Log.d("WebViewClient", (new StringBuilder()).append("onPageStarted: ").append(s).toString());
        if (s.contains("freezeCard=true"))
        {
            AppHelper.setIsFreezeCardFlow(true);
            view.setVisibility(4);
        }
        if (view.getUrl() == null || !view.getUrl().endsWith(AppHelper.getAppString(0x7f090113)) && !view.getUrl().endsWith(AppHelper.getAppString(0x7f090114)) && !view.getUrl().contains(AppHelper.getAppString(0x7f090112))) goto _L2; else goto _L1
_L1:
        view.setTag(Boolean.valueOf(true));
_L4:
        if (s != null && !s.equals(AppHelper.getAppString(0x7f0900a2)))
        {
            appLink.sendJavascript("INGDirectApp.showBusyIndicator();");
            if (bitmap.getQueryParameter(AppHelper.getAppString(0x7f090115)) != null && (findUrlIndexFromTopOfStack(view, AppHelper.getProductsUri()) == -1 || AppHelper.getLastLob() == 0x7f080081))
            {
                String s1 = bitmap.getQueryParameter(AppHelper.getAppString(0x7f090115));
                appLink.sendJavascript((new StringBuilder()).append("Ext.dispatch({controller: 'LoginController',action: 'index', params: {landingPage: '").append(s1).append("'}});").toString());
                view.loadUrl(AppHelper.getAppString(0x7f0900a2));
            }
            if (bitmap.getLastPathSegment() != null && bitmap.getLastPathSegment().equalsIgnoreCase("account_summary.vm"))
            {
                AppHelper.getTransiteView().setVisibility(8);
                appLink.sendJavascript("Ext.dispatch({controller: 'MenuController',action: 'updateMenu'});");
                appLink.sendJavascript("mobileAppBackButtonEnabled=false; lastFlow=null; Ext.dispatch({controller: 'AccountSummaryController',action: 'index'});");
                redirectWithinApp = true;
                view.stopLoading();
                AppHelper.hideBackButton();
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (view.getUrl() == null || "products".contains(view.getUrl()))
        {
            view.setTag(Boolean.valueOf(false));
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            if (s.indexOf("lp-deposits") >= 0)
            {
                appLink.sendJavascript("gotoMenuPage('RDCController|index');");
                view.stopLoading();
                view.loadUrl("about:blank");
            }
            if (s.endsWith(AppHelper.getAppString(0x7f090116)))
            {
                Log.d("WebViewClient", (new StringBuilder()).append("TRIGGER REWARDS LOGOUT...").append(s).toString());
                appLink.sendJavascript("javascript:(function(){var e = document.createEvent('Events');e.initEvent('logout', false, false);document.dispatchEvent(e);})()");
                view.stopLoading();
            }
            if (s.indexOf("_0targetBlank0") < 0 && !WebViewLinker.allowedtoOpenOutOfApp(s))
            {
                bitmap = s;
                if (s.indexOf(AppHelper.getAppString(0x7f09014b)) < 0)
                {
                    break label0;
                }
            }
            view.setVisibility(8);
            view.stopLoading();
            appLink.sendJavascript("INGDirectApp.hideBusyIndicator();");
            bitmap = s.replace("_0targetBlank0", "");
            s = new Intent("android.intent.action.VIEW", Uri.parse(bitmap));
            if (appLink.ctx == null)
            {
                AppHelper.getAppContext().startActivity(Intent.createChooser(s, ""));
            } else
            {
                appLink.ctx.startActivity(Intent.createChooser(s, ""));
            }
            Log.i("webview", (new StringBuilder()).append("_0targetBlank0: ").append(bitmap.indexOf("_0targetBlank0")).append("allowedtoOpenOutOfApp ").append(WebViewLinker.allowedtoOpenOutOfApp(bitmap)).toString());
        }
        if (bitmap.contains("migration?stateId=done"))
        {
            view.stopLoading();
            AppHelper.getTransiteView().setVisibility(8);
            appLink.sendJavascript("postLoginSuccess();");
        }
        Log.d("WebViewClient", (new StringBuilder()).append("onPageStarted DONE: ").append(bitmap).toString());
        return;
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        Object obj;
        Log.e("WebViewClient", (new StringBuilder()).append("ERROR: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
        if (webview == null)
        {
            return;
        }
        webview.stopLoading();
        String s2 = webview.getOriginalUrl();
        obj = s2;
        if (s2 == null)
        {
            obj = s1;
        }
        obj = AppHelper.getURLAttributes(getTrimedUrl(((String) (obj))));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        Log.d("WebViewClient", (new StringBuilder()).append("************** attr.getMode() ").append(((WebViewHelper) (obj)).getMode()).append(" *********************").toString());
        if (((WebViewHelper) (obj)).getMode().equals("quiet"))
        {
            Log.d("WebViewClient", (new StringBuilder()).append("QUIET MODE DETECTED - NO REPORTING: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
            return;
        }
        if (!((WebViewHelper) (obj)).getMode().equals("rewards"))
        {
            break MISSING_BLOCK_LABEL_238;
        }
        obj;
        JVM INSTR monitorenter ;
        ((WebViewHelper) (obj)).setTimedOut(true);
        ((WebViewHelper) (obj)).cancelTimer();
        obj;
        JVM INSTR monitorexit ;
        ((WebViewHelper) (obj)).handleError();
        return;
        webview;
        obj;
        JVM INSTR monitorexit ;
        throw webview;
        if (((WebViewHelper) (obj)).getMode().equals("products_360"))
        {
            webview.goBack();
            webview = AppHelper.getAppContext();
            NotificationPlugin.alertOK("", webview.getResources().getString(0x7f090126), webview);
            return;
        }
        break MISSING_BLOCK_LABEL_392;
        boolean flag = false;
        boolean flag1 = false;
        if (webview != null)
        {
            if (s1 != null)
            {
                flag1 = s1.endsWith("preload.aspx");
            }
            flag = flag1;
            if (!flag1)
            {
                flag = flag1;
                if (webview.getUrl() != null)
                {
                    flag = webview.getOriginalUrl().endsWith("preload.aspx");
                }
            }
        }
        if (flag)
        {
            Log.d("WebViewClient", (new StringBuilder()).append("ERROR: Rewards preload detected: ").append(i).append(": ").append(s).append("(").append(s1).append(")").toString());
            return;
        }
        webview.setVisibility(8);
        webview.loadUrl(AppHelper.getAppString(0x7f0900a2));
        appLink.sendJavascript("try {INGDirectApp.goToErrorPage();catch(err){}");
        return;
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        Log.d("WebViewClient", (new StringBuilder()).append("Received SSL error: ").append(sslerror.toString()).toString());
        if (Config.MOBILE_CONFIG_BYPASS_SSL_ERRORS.booleanValue())
        {
            sslerrorhandler.proceed();
        }
    }

    public boolean shouldOverrideUrlLoading(final WebView view, String s)
    {
        Uri uri;
        boolean flag;
        flag = false;
        Log.d("WebViewClient", (new StringBuilder()).append("shouldOverrideUrlLoading() : ").append(s).toString());
        if (s.indexOf("stateId=confirmAccount") >= 0 && s.indexOf("stateId=confirmAccountNx") == -1)
        {
            AppHelper.hideBackButton();
        }
        if (s.indexOf("lp-deposits") >= 0)
        {
            appLink.sendJavascript("gotoMenuPage('RDCController|index');");
            view.stopLoading();
            view.loadUrl("about:blank");
            flag = true;
        }
        Log.i("WebViewClient", (new StringBuilder()).append("shouldOverrideUrlLoading-view.getUrl(): ").append(view.getUrl()).toString());
        AppHelper.fixupUserAgentString(view);
        uri = Uri.parse(s);
        if (!AppHelper.getAppString(0x7f090118).equalsIgnoreCase(uri.getLastPathSegment())) goto _L2; else goto _L1
_L1:
        Log.d("WebViewClient", "Redirecting due to account summary VM");
        if (android.os.Build.VERSION.SDK_INT > 18)
        {
            return true;
        }
        appLink.sendJavascript("mobileAppBackButtonEnabled=false; lastFlow=null; Ext.dispatch({controller: 'AccountSummaryController',action: 'index'});");
        view.stopLoading();
        flag = true;
        view = s;
_L4:
        boolean flag1 = flag;
        if (view.contains("stateId=done"))
        {
            flag1 = flag;
            if (android.os.Build.VERSION.SDK_INT > 18)
            {
                flag1 = true;
            }
        }
        Log.i("WebViewClient", (new StringBuilder()).append("shouldOverrideUrlLoading: ").append(flag1).toString());
        return flag1;
_L2:
label0:
        {
label1:
            {
                if (s.startsWith("bankapp://"))
                {
                    Log.d("WebViewClient", "Bankapp:// detected");
                    view = s.replace("bankapp://", "").split("_");
                    Log.d("WebViewClient", (new StringBuilder()).append("Controller:").append(view[0]).toString());
                    Log.d("WebViewClient", (new StringBuilder()).append("Action:").append(view[1]).toString());
                    appLink.sendJavascript((new StringBuilder()).append("Ext.dispatch({controller: '").append(view[0]).append("',action: '").append(view[1]).append("'});").toString());
                    flag = true;
                    view = s;
                    continue; /* Loop/switch isn't completed */
                }
                if (s.indexOf(AppHelper.getAppString(0x7f090119)) >= 0)
                {
                    view = new Intent("android.intent.action.VIEW", Uri.parse(s.replace("browser_preference_redirect", "login")));
                    appLink.ctx.startActivity(Intent.createChooser(view, ""));
                    Log.i("WebViewClient", "browser_preference_redirect: ");
                    flag = true;
                    view = s;
                    continue; /* Loop/switch isn't completed */
                }
                if (s.contains(AppHelper.getAppString(0x7f090115)) && s.indexOf(AppHelper.getAppString(0x7f090110)) >= 0 && AppHelper.getLastLob() != 0x7f080081)
                {
                    BusyJSI.forceShow();
                    Object obj = Uri.parse(s);
                    view = null;
                    obj = ((Uri) (obj)).getQueryParameter(AppHelper.getAppString(0x7f08009c));
                    if (obj != null)
                    {
                        view = new StringBuilder();
                        view.append((String)AppHelper.LOB_START_PAGES.get(AppHelper.getAppString(0x7f09008f)));
                        view.append("?redCarpetDest=");
                        view.append(((String) (obj)));
                        view = view.toString();
                    }
                    AppHelper.switchLobFinish(AppHelper.getAppString(0x7f09008f), view);
                    flag = true;
                    view = s;
                    continue; /* Loop/switch isn't completed */
                }
                if (s.indexOf(AppHelper.getAppString(0x7f09011a)) >= 0)
                {
                    view.loadUrl(s);
                    view = s;
                    continue; /* Loop/switch isn't completed */
                }
                if (s.indexOf(AppHelper.getAppString(0x7f09011b)) < 0)
                {
                    break label0;
                }
                WebViewHelper webviewhelper = new WebViewHelper(null);
                webviewhelper.setMode("products_360");
                String s1;
                String s2;
                if (AppHelper.getLastLob() == 0x7f080081 && AppHelper.isAuthenticated())
                {
                    Log.v("WebViewClient", "loading auth url");
                    s1 = NativeCache.staticRead("SP_PRODUCTS_360_PRODUCTS_AUTH_URL");
                } else
                {
                    Log.v("WebViewClient", "loading unauth url");
                    s1 = NativeCache.staticRead("SP_PRODUCTS_360_PRODUCTS_URL");
                }
                if (s1 != null)
                {
                    s2 = s1;
                    if (s1.length() != 0)
                    {
                        break label1;
                    }
                }
                s2 = AppHelper.getAppString(0x7f09011e);
            }
            AppHelper.addURLAttributes(getTrimedUrl(s2), webviewhelper);
            view.loadUrl(s2);
            busyInd.show();
            busyInd.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final WebViewClient this$0;
                final WebView val$view;

                public void onCancel(DialogInterface dialoginterface)
                {
                    if (view != null)
                    {
                        view.stopLoading();
                    }
                }

            
            {
                this$0 = WebViewClient.this;
                view = webview;
                super();
            }
            });
            view = s;
            continue; /* Loop/switch isn't completed */
        }
        if (s.indexOf("www/atm") >= 0)
        {
            flag = true;
            int i = AppHelper.getLastLob();
            if (i == 0)
            {
                AppHelper.switchATM(null, true, true, null);
            } else
            if (i == 0x7f080081)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(NativeCache.staticRead("SP_PRODUCTS_BRANCH_URL")));
                if (appLink.ctx == null)
                {
                    AppHelper.getAppContext().startActivity(Intent.createChooser(view, ""));
                } else
                {
                    appLink.ctx.startActivity(Intent.createChooser(view, ""));
                }
            } else
            {
                AppHelper.switchATM(AppHelper.findAppViewById(0x7f08009e), false, false, "www/atm");
            }
            AppHelper.setSelectedMenuItem(0x7f090122);
            view = s;
        } else
        if (s.indexOf("_0targetBlank0") >= 0 || WebViewLinker.allowedtoOpenOutOfApp(s))
        {
            appLink.sendJavascript("INGDirectApp.hideBusyIndicator();");
            view = s.replace("_0targetBlank0", "");
            s = new Intent("android.intent.action.VIEW", Uri.parse(view));
            if (appLink.ctx == null)
            {
                AppHelper.getAppContext().startActivity(Intent.createChooser(s, ""));
            } else
            {
                appLink.ctx.startActivity(Intent.createChooser(s, ""));
            }
            Log.i("WebViewClient", (new StringBuilder()).append("_0targetBlank0: ").append(view.indexOf("_0targetBlank0")).append("allowedtoOpenOutOfApp ").append(WebViewLinker.allowedtoOpenOutOfApp(view)).toString());
            flag = true;
        } else
        if (s.startsWith("tel:"))
        {
            launchIntent(new Intent("android.intent.action.DIAL", Uri.parse(s)));
            flag = true;
            view = s;
        } else
        {
            view = s;
            if (s.startsWith("mailto:"))
            {
                view = s.replaceFirst("mailto:", "").trim();
                s = new Intent("android.intent.action.SEND");
                s.setType(AppHelper.getAppString(0x7f090104)).putExtra("android.intent.extra.EMAIL", new String[] {
                    view
                });
                launchIntent(s);
                flag = true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
