// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.wallet.logging.WLog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView, AuthState, ServiceAuthInfo, HybridWebViewCookieManager, 
//            HybridWebViewControl

public class HybridWebViewManager
{
    public static class PostCreateHandler
    {

        public void onWebViewCreated(HybridWebView hybridwebview)
        {
        }

        public void setWaitUiVisibility(HybridWebViewControl hybridwebviewcontrol, boolean flag)
        {
            hybridwebviewcontrol.setWaitUiVisibility(flag);
        }

        public void setWebViewVisibility(HybridWebViewControl hybridwebviewcontrol, boolean flag)
        {
            hybridwebviewcontrol.setWebViewVisibility(flag);
        }

        public boolean shouldOverrideUrlLoading(HybridWebViewControl hybridwebviewcontrol, HybridWebView hybridwebview, String s)
        {
            return false;
        }

        public void showError(HybridWebViewControl hybridwebviewcontrol, int i, String s, int j, String s1)
        {
            hybridwebviewcontrol.showErrorToast(s);
        }

        public PostCreateHandler()
        {
        }
    }


    private final Map authStates = new HashMap();
    private final HybridWebViewCookieManager cookieManager;
    private final Map preloadingWebViews = new HashMap();
    private final Map urlsTriggeringAuthCheck = new HashMap();

    public HybridWebViewManager(HybridWebViewCookieManager hybridwebviewcookiemanager)
    {
        cookieManager = hybridwebviewcookiemanager;
    }

    private void freeAllPreloadingWebViews()
    {
        for (Iterator iterator = preloadingWebViews.values().iterator(); iterator.hasNext(); ((HybridWebView)iterator.next()).destroy()) { }
        preloadingWebViews.clear();
    }

    private static String makeWebViewKey(Account account)
    {
        if (account != null)
        {
            return account.name;
        } else
        {
            return "<no account>";
        }
    }

    private void reset()
    {
        freeAllPreloadingWebViews();
        for (Iterator iterator = authStates.values().iterator(); iterator.hasNext(); ((AuthState)iterator.next()).reset()) { }
    }

    public final ServiceAuthInfo checkForAuthTrigger(String s)
    {
        for (Iterator iterator = urlsTriggeringAuthCheck.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (s.startsWith((String)entry.getKey()))
            {
                return (ServiceAuthInfo)entry.getValue();
            }
        }

        return null;
    }

    public final void clearAllCookies()
    {
        reset();
        cookieManager.clearAllCookies();
    }

    public final HybridWebView createWebView(Context context, Account account)
    {
        String s = String.valueOf(makeWebViewKey(account));
        if (s.length() != 0)
        {
            s = "Creating WebView for ".concat(s);
        } else
        {
            s = new String("Creating WebView for ");
        }
        WLog.d("HybridWebViewManager", s);
        context = new HybridWebView(context);
        if (account != null)
        {
            context.initAuth(this, account);
        }
        return context;
    }

    public final AuthState getAuthState(Account account)
    {
        this;
        JVM INSTR monitorenter ;
        AuthState authstate1 = (AuthState)authStates.get(account.name);
        AuthState authstate;
        authstate = authstate1;
        if (authstate1 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        authstate = new AuthState(account, this);
        authStates.put(account.name, authstate);
        this;
        JVM INSTR monitorexit ;
        return authstate;
        account;
        throw account;
    }

    final HybridWebViewCookieManager getCookieManager()
    {
        return cookieManager;
    }
}
