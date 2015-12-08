// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.apps.wallet.base.auth.WalletGoogleAuthUtil;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            ServiceAuthInfo, AuthState, HybridWebChromeClient, HybridWebViewClient, 
//            AuthUrls, HybridWebViewManager, ServiceAuthState

public class HybridWebView extends WebView
    implements AuthState.Client
{
    public static interface UiClient
    {

        public abstract void closeWindow(WebView webview);

        public abstract WebView handleOpenNewWindow(HybridWebView hybridwebview);

        public abstract void onPageFinished(HybridWebView hybridwebview, String s);

        public abstract void onPageStarted(HybridWebView hybridwebview, String s);

        public abstract boolean shouldOverrideUrlLoading(HybridWebView hybridwebview, String s);

        public abstract void showError(HybridWebView hybridwebview, int i, String s, int j);

        public abstract void updateWebViewLoadingState(HybridWebView hybridwebview, boolean flag, int i, String s);
    }


    private AuthState authState;
    volatile WalletGoogleAuthUtil authUtil;
    private String desiredUrl;
    Executor executor;
    private Handler handler;
    private boolean isPreloading;
    private Hashtable javascriptInterfaces;
    private String lastNonAuthUrlLoading;
    private int lastStateIndex;
    private String logTag;
    private boolean progressDoneSkipped;
    private ServiceAuthInfo serviceCurrentlyBeingAuthenticated;
    private ServiceAuthInfo serviceForDesiredUrl;
    private final int stateHistory[] = new int[20];
    UiClient uiClient;
    private HybridWebViewManager webViewManager;

    HybridWebView(Context context)
    {
        super(context);
        logTag = "HybridWebView";
        lastStateIndex = 0;
        javascriptInterfaces = new Hashtable();
        init(context, false);
    }

    private void authenticate(final ServiceAuthInfo authInfo)
    {
        final Handler handlerForUiThread = logTag;
        final Object account = String.valueOf(authInfo.getServiceKey());
        if (((String) (account)).length() != 0)
        {
            account = "Starting authentication for: ".concat(((String) (account)));
        } else
        {
            account = new String("Starting authentication for: ");
        }
        WLog.d(handlerForUiThread, ((String) (account)));
        setState(1);
        account = serviceCurrentlyBeingAuthenticated;
        serviceCurrentlyBeingAuthenticated = authInfo;
        authState.startAuthForService(authInfo, ((ServiceAuthInfo) (account)));
        account = authState.getAccount();
        handlerForUiThread = handler;
        executor.execute(new Runnable() {

            final HybridWebView this$0;
            final Account val$account;
            final ServiceAuthInfo val$authInfo;
            final Handler val$handlerForUiThread;

            public final void run()
            {
                String s;
                try
                {
                    s = authUtil.getToken(account.name, authInfo.getAccountManagerServiceString());
                }
                catch (Exception exception)
                {
                    String s1 = logTag;
                    exception = String.valueOf(authInfo.getAccountManagerServiceString());
                    if (exception.length() != 0)
                    {
                        exception = "Could not get token for: ".concat(exception);
                    } else
                    {
                        exception = new String("Could not get token for: ");
                    }
                    WLog.w(s1, exception);
                    exception = null;
                }
                WLog.d(logTag, "Got token from acct mgr");
                handlerForUiThread.post(s. new Runnable() {

                    final _cls1 this$1;
                    final String val$tokenToPass;

                    public final void run()
                    {
                        WLog.d(logTag, "Processing token form acct mgr");
                        processAuthTokenResult(authInfo, tokenToPass);
                    }

            
            {
                this$1 = final__pcls1;
                tokenToPass = String.this;
                super();
            }
                });
                try
                {
                    authUtil.clearToken(s);
                    return;
                }
                catch (GooglePlayServicesAvailabilityException googleplayservicesavailabilityexception)
                {
                    WLog.e(logTag, "Unexpected error clearing token", googleplayservicesavailabilityexception);
                    return;
                }
                catch (GoogleAuthException googleauthexception)
                {
                    WLog.e(logTag, "Unexpected error clearing token", googleauthexception);
                    return;
                }
                catch (IOException ioexception)
                {
                    WLog.e(logTag, "Unexpected error clearing token", ioexception);
                }
            }

            
            {
                this$0 = HybridWebView.this;
                account = account1;
                authInfo = serviceauthinfo;
                handlerForUiThread = handler1;
                super();
            }
        });
    }

    private void clearJavascriptInterfaces()
    {
        for (Iterator iterator = javascriptInterfaces.keySet().iterator(); iterator.hasNext(); removeJavascriptInterface((String)iterator.next())) { }
        javascriptInterfaces.clear();
        javascriptInterfaces = null;
    }

    private WebChromeClient createWebChromeClient()
    {
        return new HybridWebChromeClient(this);
    }

    private WebViewClient createWebClient()
    {
        return new HybridWebViewClient(this);
    }

    private boolean detectAndHandleAuthCompletion(String s, boolean flag)
    {
        if (isIn(6))
        {
            return false;
        }
        if (isIn(3))
        {
            boolean flag1;
            boolean flag2;
            if (serviceCurrentlyBeingAuthenticated.matchesContinueUrl(s) && (!serviceCurrentlyBeingAuthenticated.mustLoadContinueUrl || flag))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag && AuthUrls.isAuthSpeedbumpUrl(Uri.parse(s)))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                String s3 = logTag;
                String s1 = String.valueOf(s);
                if (s1.length() != 0)
                {
                    s1 = "Auth speeedbump detected ".concat(s1);
                } else
                {
                    s1 = new String("Auth speeedbump detected ");
                }
                WLog.w(s3, s1);
            }
            if (flag1 || flag2)
            {
                s1 = logTag;
                s3 = serviceCurrentlyBeingAuthenticated.getServiceKey();
                WLog.d(s1, (new StringBuilder(String.valueOf(s3).length() + 34 + String.valueOf(s).length())).append("Detected auth completion for ").append(s3).append(" in: ").append(s).toString());
                handler.post(new Runnable() {

                    final HybridWebView this$0;

                    public final void run()
                    {
                        maybeProcessAuthCompleted(true);
                    }

            
            {
                this$0 = HybridWebView.this;
                super();
            }
                });
                return true;
            }
        }
        String s2 = logTag;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Not an auth completion: ".concat(s);
        } else
        {
            s = new String("Not an auth completion: ");
        }
        WLog.v(s2, s);
        return false;
    }

    private boolean detectAndHandleAuthRedirect(String s)
    {
        if (authState == null)
        {
            String s1 = logTag;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "No account so can't do auth redirects ".concat(s);
            } else
            {
                s = new String("No account so can't do auth redirects ");
            }
            WLog.d(s1, s);
            return false;
        }
        Uri uri = Uri.parse(s);
        if (!AuthUrls.isAuthRedirectUrl(uri))
        {
            String s2 = logTag;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Not an auth redirect: ".concat(s);
            } else
            {
                s = new String("Not an auth redirect: ");
            }
            WLog.v(s2, s);
            return false;
        }
        String s5 = logTag;
        String s3 = String.valueOf(s);
        if (s3.length() != 0)
        {
            s3 = "Potential auth redirect: ".concat(s3);
        } else
        {
            s3 = new String("Potential auth redirect: ");
        }
        WLog.d(s5, s3);
        if (isIn(3))
        {
            WLog.d(logTag, "We are in the middle of auth - let redirects happen");
            return false;
        }
        boolean flag = true;
        s3 = uri.getQueryParameter("passive");
        if (s3 == null || s3.length() == 0 || s3.compareToIgnoreCase("false") == 0)
        {
            flag = false;
        }
        if (flag && authState != null && authState.isAuthenticatedForAtLeastOneService())
        {
            WLog.d(logTag, "Passive ServiceLogin likely to succeed - letting it proceed");
            return false;
        }
        s3 = logTag;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Trying to process auth redirect: ".concat(s);
        } else
        {
            s = new String("Trying to process auth redirect: ");
        }
        WLog.d(s3, s);
        s3 = uri.getQueryParameter("service");
        if (serviceForDesiredUrl == null)
        {
            String s4 = logTag;
            s = String.valueOf(s3);
            if (s.length() != 0)
            {
                s = "No service specified - picking one based on param ".concat(s);
            } else
            {
                s = new String("No service specified - picking one based on param ");
            }
            WLog.d(s4, s);
            serviceForDesiredUrl = authState.getAuthInfo(s3);
        }
        if (serviceForDesiredUrl == null)
        {
            WLog.d(logTag, "No service found for auth - letting redirect happen...");
            return false;
        }
        s3 = logTag;
        s = String.valueOf(serviceForDesiredUrl.getServiceKey());
        if (s.length() != 0)
        {
            s = "Will do auth for ".concat(s);
        } else
        {
            s = new String("Will do auth for ");
        }
        WLog.d(s3, s);
        if (desiredUrl == null)
        {
            desiredUrl = lastNonAuthUrlLoading;
        }
        s3 = logTag;
        s = String.valueOf(desiredUrl);
        if (s.length() != 0)
        {
            s = "After auth will load ".concat(s);
        } else
        {
            s = new String("After auth will load ");
        }
        WLog.d(s3, s);
        authenticate(serviceForDesiredUrl);
        return true;
    }

    private int getState()
    {
        return stateHistory[lastStateIndex];
    }

    private String getStateHistoryAsString()
    {
        StringBuilder stringbuilder = new StringBuilder(30);
        for (int i = 0; i <= lastStateIndex; i++)
        {
            if (i > 0)
            {
                stringbuilder.append("->");
            }
            stringbuilder.append(stateHistory[i]);
        }

        return stringbuilder.toString();
    }

    private void init(Context context, boolean flag)
    {
        UserInjector.inject(this, context);
        if (context.getApplicationContext() == context)
        {
            logTag = String.valueOf(logTag).concat("-preloading ");
        }
        context = String.valueOf(logTag);
        String s = String.valueOf(String.valueOf(hashCode()));
        logTag = (new StringBuilder(String.valueOf(context).length() + 2 + String.valueOf(s).length())).append(context).append("(").append(s).append(")").toString();
        stateHistory[0] = 0;
        handler = new Handler(Looper.getMainLooper());
        setPreloading(false);
        setScrollBarStyle(0);
        context = getSettings();
        context.setJavaScriptEnabled(true);
        context.setSupportZoom(false);
        context.setSupportMultipleWindows(true);
        context.setDatabaseEnabled(true);
        context.setDomStorageEnabled(true);
        context.setAppCacheMaxSize(0x800000L);
        context.setAppCachePath(getContext().getApplicationContext().getDir("appcache", 0).getAbsolutePath());
        context.setAppCacheEnabled(true);
        context.setAllowFileAccess(true);
        if (!flag)
        {
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        }
        setWebViewClient(createWebClient());
        setWebChromeClient(createWebChromeClient());
    }

    private boolean isIdle()
    {
        int i = stateHistory[lastStateIndex];
        return i == 0 || i >= 100;
    }

    private boolean isIn(int i)
    {
        return getState() == i;
    }

    private void maybeLoadDesiredUrl(ServiceAuthInfo serviceauthinfo)
    {
        serviceauthinfo = serviceauthinfo.getServiceKey();
        if (desiredUrl != null)
        {
            String s = logTag;
            String s1 = desiredUrl;
            WLog.d(s, (new StringBuilder(String.valueOf(serviceauthinfo).length() + 26 + String.valueOf(s1).length())).append("auth ok for ").append(serviceauthinfo).append(". Now loading ").append(s1).toString());
            setState(4);
            loadUrl(desiredUrl);
            return;
        } else
        {
            WLog.d(logTag, (new StringBuilder(String.valueOf(serviceauthinfo).length() + 38)).append("auth ok for ").append(serviceauthinfo).append(". No url to load, so done.").toString());
            setStateAfterLoadDoneOrAbandoned(0);
            updateWebViewLoadingState(true, -1, null);
            return;
        }
    }

    private void maybeProcessAuthCompleted(boolean flag)
    {
        if ((isIn(1) || isIn(3)) && serviceCurrentlyBeingAuthenticated != null)
        {
            ServiceAuthInfo serviceauthinfo = serviceCurrentlyBeingAuthenticated;
            serviceCurrentlyBeingAuthenticated = null;
            authState.handleAuthCompletion(serviceauthinfo, flag);
        }
    }

    private void processAuthTokenResult(ServiceAuthInfo serviceauthinfo, String s)
    {
        if (authState == null || isIn(6))
        {
            return;
        }
        String s1 = logTag;
        String s2 = serviceauthinfo.getServiceKey();
        WLog.d(s1, (new StringBuilder(String.valueOf(s2).length() + 23 + String.valueOf(s).length())).append("Processing token for: ").append(s2).append(" ").append(s).toString());
        if (s == null)
        {
            setState(100);
            authState.handleAuthCompletion(serviceauthinfo, false);
            showError(2, "", 0);
            return;
        }
        if (serviceCurrentlyBeingAuthenticated == serviceauthinfo)
        {
            authState.prepareCookiesBeforeTokenUrlLoad(serviceauthinfo);
            WLog.d(logTag, "Loading token into web view");
            setState(3);
            loadUrl(s);
            return;
        }
        s = logTag;
        if (serviceCurrentlyBeingAuthenticated != null)
        {
            serviceauthinfo = serviceCurrentlyBeingAuthenticated.getServiceKey();
        } else
        {
            serviceauthinfo = "null";
        }
        serviceauthinfo = String.valueOf(serviceauthinfo);
        if (serviceauthinfo.length() != 0)
        {
            serviceauthinfo = "Not loading token since pending service is ".concat(serviceauthinfo);
        } else
        {
            serviceauthinfo = new String("Not loading token since pending service is ");
        }
        WLog.w(s, serviceauthinfo);
    }

    private void setState(int i)
    {
        while (stateHistory[lastStateIndex] == 6 || stateHistory[lastStateIndex] == i) 
        {
            return;
        }
        if (isIdle())
        {
            stateHistory[0] = stateHistory[lastStateIndex];
            lastStateIndex = 0;
        }
        if (lastStateIndex >= stateHistory.length - 1)
        {
            WLog.w(logTag, "State history too long");
            lastStateIndex = -1;
        }
        int ai[] = stateHistory;
        int j = lastStateIndex + 1;
        lastStateIndex = j;
        ai[j] = i;
        String s1 = logTag;
        String s = String.valueOf(getStateHistoryAsString());
        if (s.length() != 0)
        {
            s = "State transition ".concat(s);
        } else
        {
            s = new String("State transition ");
        }
        WLog.v(s1, s);
    }

    private void setStateAfterLoadDoneOrAbandoned(int i)
    {
        WLog.d(logTag, "Cleanup pending state");
        maybeProcessAuthCompleted(false);
        setState(i);
        serviceCurrentlyBeingAuthenticated = null;
        serviceForDesiredUrl = null;
        desiredUrl = null;
    }

    private void showError(int i, String s, int j)
    {
        while (isPreloading || uiClient == null) 
        {
            return;
        }
        uiClient.showError(this, i, s, j);
    }

    private void updateWebViewLoadingState(boolean flag, int i, String s)
    {
        while (isPreloading || isIn(6) || uiClient == null) 
        {
            return;
        }
        uiClient.updateWebViewLoadingState(this, flag, i, s);
    }

    public void addJavascriptInterface(Object obj, String s)
    {
        javascriptInterfaces.put(s, obj);
        super.addJavascriptInterface(obj, s);
    }

    public void destroy()
    {
        if (isIn(6))
        {
            return;
        }
        WLog.d(logTag, "Destroying...");
        stopLoading();
        clearJavascriptInterfaces();
        setStateAfterLoadDoneOrAbandoned(6);
        freeMemory();
        destroyDrawingCache();
        uiClient = null;
        if (authState != null)
        {
            authState.removeClient(this);
        }
        handler = null;
        super.destroy();
        WLog.d(logTag, "Destroyed");
    }

    final void handleOnPageStarted(String s)
    {
        if (!isIn(6))
        {
            String s2 = logTag;
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "onPageStarted ".concat(s1);
            } else
            {
                s1 = new String("onPageStarted ");
            }
            WLog.v(s2, s1);
            if (isIn(0))
            {
                lastNonAuthUrlLoading = s;
                setState(5);
            }
            progressDoneSkipped = false;
            updateWebViewLoadingState(false, -1, s);
            if (uiClient != null)
            {
                uiClient.onPageStarted(this, s);
                return;
            }
        }
    }

    final void handlePageFinished(String s)
    {
        String s5 = logTag;
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "onPageFinished: ".concat(s1);
        } else
        {
            s1 = new String("onPageFinished: ");
        }
        WLog.d(s5, s1);
        if (!isIn(6)) goto _L2; else goto _L1
_L1:
        WLog.d(logTag, "Is in state destroyed. Do nothing.");
_L4:
        return;
_L2:
        if (!detectAndHandleAuthCompletion(s, true))
        {
            break; /* Loop/switch isn't completed */
        }
        String s6 = logTag;
        String s2 = String.valueOf(s);
        if (s2.length() != 0)
        {
            s2 = "onPageFinished - detected auth completion: ".concat(s2);
        } else
        {
            s2 = new String("onPageFinished - detected auth completion: ");
        }
        WLog.d(s6, s2);
_L5:
        if (uiClient != null)
        {
            uiClient.onPageFinished(this, s);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (isIn(4) && desiredUrl != null && ServiceAuthInfo.urlMatchesIgnoreHash(s, desiredUrl))
        {
            String s7 = logTag;
            String s3 = String.valueOf(desiredUrl);
            if (s3.length() != 0)
            {
                s3 = "Clearing pending load for : ".concat(s3);
            } else
            {
                s3 = new String("Clearing pending load for : ");
            }
            WLog.d(s7, s3);
            desiredUrl = null;
        } else
        {
            String s4 = logTag;
            String s8 = desiredUrl;
            WLog.v(s4, (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s8).length())).append("NOT clearing pending load for : ").append(s).append(", desired = ").append(s8).toString());
        }
        if (desiredUrl == null && serviceCurrentlyBeingAuthenticated == null)
        {
            setStateAfterLoadDoneOrAbandoned(0);
            if (progressDoneSkipped)
            {
                handleProgressDone();
            }
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    final void handleProgressDone()
    {
        if (isIn(6))
        {
            return;
        }
        if (isIn(0))
        {
            WLog.d(logTag, "Load finished - showing WebView");
            progressDoneSkipped = false;
            if (wasIn(3))
            {
                clearHistory();
            }
            final String url = getUrl();
            handler.post(new Runnable() {

                final HybridWebView this$0;
                final String val$url;

                public final void run()
                {
                    updateWebViewLoadingState(true, -1, url);
                }

            
            {
                this$0 = HybridWebView.this;
                url = s;
                super();
            }
            });
            return;
        }
        progressDoneSkipped = true;
        String s1 = logTag;
        String s2 = desiredUrl;
        String s;
        if (serviceCurrentlyBeingAuthenticated != null)
        {
            s = serviceCurrentlyBeingAuthenticated.getServiceKey();
        } else
        {
            s = " no service";
        }
        WLog.d(s1, (new StringBuilder(String.valueOf(s2).length() + 24 + String.valueOf(s).length())).append("Ignoring progress done ").append(s2).append(" ").append(s).toString());
    }

    final void handleReceivedError(int i, String s, String s1)
    {
        byte byte0;
        if (isIn(6))
        {
            return;
        }
        WLog.d(logTag, (new StringBuilder(String.valueOf(s1).length() + 19 + String.valueOf(s).length())).append("onReceivedError: ").append(s1).append(": ").append(s).toString());
        byte0 = 3;
        i;
        JVM INSTR tableswitch -14 -1: default 140
    //                   -14 155
    //                   -13 167
    //                   -12 167
    //                   -11 155
    //                   -10 167
    //                   -9 155
    //                   -8 155
    //                   -7 155
    //                   -6 155
    //                   -5 155
    //                   -4 161
    //                   -3 167
    //                   -2 155
    //                   -1 155;
           goto _L1 _L2 _L3 _L3 _L2 _L3 _L2 _L2 _L2 _L2 _L2 _L4 _L3 _L2 _L2
_L1:
        setStateAfterLoadDoneOrAbandoned(101);
        showError(byte0, s, i);
        return;
_L2:
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        byte0 = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 3;
        if (true) goto _L1; else goto _L5
_L5:
    }

    final boolean handleShouldOverrideUrlLoading(String s)
    {
        String s4 = logTag;
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "ShouldOverride?: ".concat(s1);
        } else
        {
            s1 = new String("ShouldOverride?: ");
        }
        WLog.v(s4, s1);
        if (uiClient != null && uiClient.shouldOverrideUrlLoading(this, s))
        {
            return true;
        }
        if (detectAndHandleAuthCompletion(s, false) || detectAndHandleAuthRedirect(s))
        {
            String s2 = logTag;
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Overriding loading of: ".concat(s);
            } else
            {
                s = new String("Overriding loading of: ");
            }
            WLog.d(s2, s);
            return true;
        }
        if (isIn(5) && authState != null)
        {
            ServiceAuthInfo serviceauthinfo = webViewManager.checkForAuthTrigger(s);
            if (serviceauthinfo != null)
            {
                String s5 = logTag;
                String s7 = serviceauthinfo.getServiceKey();
                WLog.d(s5, (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s7).length())).append("Overrideing load of : ").append(s).append(" will do auth load for ").append(s7).toString());
                loadUrlAuthenticated(s, serviceauthinfo);
                return true;
            }
        }
        if (isIn(4))
        {
            String s6 = logTag;
            String s3 = String.valueOf(s);
            if (s3.length() != 0)
            {
                s3 = "Detected non auth redirect, setting desiredUrl to ".concat(s3);
            } else
            {
                s3 = new String("Detected non auth redirect, setting desiredUrl to ");
            }
            WLog.d(s6, s3);
            desiredUrl = s;
        }
        s3 = logTag;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "ProceedingToLoad: ".concat(s);
        } else
        {
            s = new String("ProceedingToLoad: ");
        }
        WLog.d(s3, s);
        return false;
    }

    final void initAuth(HybridWebViewManager hybridwebviewmanager, Account account)
    {
        webViewManager = hybridwebviewmanager;
        authState = hybridwebviewmanager.getAuthState(account);
        authState.addClient(this);
    }

    public final boolean isPreloading()
    {
        return isPreloading;
    }

    public final void loadUrlAuthenticated(String s, ServiceAuthInfo serviceauthinfo)
    {
        if (authState == null || serviceauthinfo == null)
        {
            loadUrl(s);
            return;
        }
        Object obj = logTag;
        String s1 = serviceauthinfo.getServiceKey();
        WLog.d(((String) (obj)), (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(s1).length())).append("loadUrlAuthenticated: ").append(s).append(", ").append(s1).toString());
        setStateAfterLoadDoneOrAbandoned(0);
        desiredUrl = s;
        serviceForDesiredUrl = serviceauthinfo;
        obj = authState.checkAndGetServiceState(serviceauthinfo);
        static final class _cls5
        {

            static final int $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State = new int[ServiceAuthState.State.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[ServiceAuthState.State.NotAuthenticated.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[ServiceAuthState.State.InProgress.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[ServiceAuthState.State.Authenticated.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.google.android.apps.wallet.webview.ServiceAuthState.State[((ServiceAuthState) (obj)).getAuthState().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            if (authState.shouldDoAuth(serviceauthinfo, s))
            {
                obj = logTag;
                s = String.valueOf(serviceauthinfo.getServiceKey());
                if (s.length() != 0)
                {
                    s = "will do auth for: ".concat(s);
                } else
                {
                    s = new String("will do auth for: ");
                }
                WLog.d(((String) (obj)), s);
                authenticate(serviceauthinfo);
                return;
            } else
            {
                s = logTag;
                obj = serviceauthinfo.getServiceKey();
                String s2 = String.valueOf(serviceauthinfo.preloadPolicy.toString());
                WLog.d(s, (new StringBuilder(String.valueOf(obj).length() + 41 + String.valueOf(s2).length())).append("decided not to do auth for: ").append(((String) (obj))).append(", policy was ").append(s2).toString());
                maybeLoadDesiredUrl(serviceauthinfo);
                return;
            }

        case 2: // '\002'
            setState(2);
            updateWebViewLoadingState(false, -1, s);
            obj = logTag;
            s = String.valueOf(serviceauthinfo.getServiceKey());
            if (s.length() != 0)
            {
                s = "auth in progress for: ".concat(s);
            } else
            {
                s = new String("auth in progress for: ");
            }
            WLog.d(((String) (obj)), s);
            return;

        case 3: // '\003'
            obj = logTag;
            s = String.valueOf(serviceauthinfo.getServiceKey());
            break;
        }
        if (s.length() != 0)
        {
            s = "already authenticated for: ".concat(s);
        } else
        {
            s = new String("already authenticated for: ");
        }
        WLog.d(((String) (obj)), s);
        maybeLoadDesiredUrl(serviceauthinfo);
    }

    public final boolean onAuthCompleted(final ServiceAuthInfo authInfo, boolean flag, boolean flag1)
    {
        while (isIn(6) || !isIn(3) && !isIn(2) || !serviceForDesiredUrl.getServiceKey().equals(authInfo.getServiceKey())) 
        {
            return false;
        }
        if (isPreloading() && flag1)
        {
            WLog.d(logTag, "Preloading view is abandoning load");
            setStateAfterLoadDoneOrAbandoned(0);
            return false;
        }
        if (flag)
        {
            String s2 = logTag;
            String s = String.valueOf(desiredUrl);
            if (s.length() != 0)
            {
                s = "Got auth, will now load ".concat(s);
            } else
            {
                s = new String("Got auth, will now load ");
            }
            WLog.d(s2, s);
            handler.post(new Runnable() {

                final HybridWebView this$0;
                final ServiceAuthInfo val$authInfo;

                public final void run()
                {
                    maybeLoadDesiredUrl(authInfo);
                }

            
            {
                this$0 = HybridWebView.this;
                authInfo = serviceauthinfo;
                super();
            }
            });
            return true;
        }
        if (isIn(2))
        {
            String s3 = logTag;
            String s1 = String.valueOf(desiredUrl);
            if (s1.length() != 0)
            {
                s1 = "Auth failed or cancelled, will re-load ".concat(s1);
            } else
            {
                s1 = new String("Auth failed or cancelled, will re-load ");
            }
            WLog.d(s3, s1);
            loadUrlAuthenticated(desiredUrl, authInfo);
            return true;
        } else
        {
            WLog.d(logTag, "Auth failed or cancelled in this web view - exiting");
            return false;
        }
    }

    public void setHybridWebViewUiClient(UiClient uiclient)
    {
        uiClient = uiclient;
    }

    public void setPreloading(boolean flag)
    {
        isPreloading = flag;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setVisibility(byte0);
    }

    public final boolean shouldBeVisible()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (!isIn(0) && !isIn(5))
            {
                flag = flag1;
                if (!isIn(4))
                {
                    break label0;
                }
                flag = flag1;
                if (wasIn(3))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final boolean wasIn(int i)
    {
        for (int j = 0; j <= lastStateIndex; j++)
        {
            if (stateHistory[j] == i)
            {
                return true;
            }
        }

        return false;
    }





}
