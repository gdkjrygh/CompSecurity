// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewControl, ServiceAuthInfo, HybridWebViewManager

public class WalletWebViewFactory
{

    private static final String TAG = com/google/android/apps/wallet/webview/WalletWebViewFactory.getSimpleName();
    private final Activity activity;
    private final HybridWebViewManager hybridWebViewManager;
    private final Map loadedWebViews = Maps.newHashMap();
    private final Account walletAccount;

    WalletWebViewFactory(Activity activity1, Account account, HybridWebViewManager hybridwebviewmanager)
    {
        activity = activity1;
        walletAccount = account;
        hybridWebViewManager = hybridwebviewmanager;
    }

    public final void clearWebViews()
    {
        for (Iterator iterator = loadedWebViews.values().iterator(); iterator.hasNext(); ((HybridWebViewControl)iterator.next()).destroy()) { }
        loadedWebViews.clear();
    }

    public final HybridWebViewControl createWebViewControl$2ee8f12b(String s, HybridWebViewManager.PostCreateHandler postcreatehandler, ServiceAuthInfo serviceauthinfo)
    {
        if (loadedWebViews.containsKey(s))
        {
            WLog.dfmt(TAG, "returning loaded webview for URL: %s", new Object[] {
                s
            });
            return (HybridWebViewControl)loadedWebViews.get(s);
        }
        if (serviceauthinfo != null)
        {
            WLog.dfmt(TAG, "URL: %s AuthInfo.service: %s AuthInfo.continueUrl: %s", new Object[] {
                s, serviceauthinfo.service, serviceauthinfo.continueUrl
            });
        } else
        {
            WLog.dfmt(TAG, "loading URL: %s", new Object[] {
                s
            });
        }
        postcreatehandler = new HybridWebViewControl(activity, walletAccount, hybridWebViewManager, postcreatehandler);
        postcreatehandler.loadUrlAuthenticated(s, serviceauthinfo, null);
        loadedWebViews.put(s, postcreatehandler);
        return postcreatehandler;
    }

}
