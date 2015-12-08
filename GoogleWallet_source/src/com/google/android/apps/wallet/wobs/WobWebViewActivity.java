// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.webview.HybridWebViewManager;
import com.google.android.apps.wallet.webview.ServiceAuthFactory;
import com.google.android.apps.wallet.webview.WalletWebViewFactory;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WebViewUrlValidator

public class WobWebViewActivity extends WalletActivity
{

    public static final ImmutableSet SUPPORTED_DOMAINS = ImmutableSet.of("gmail");
    private static final String TAG = com/google/android/apps/wallet/wobs/WobWebViewActivity.getSimpleName();
    Account gaiaAccount;
    ServiceAuthFactory serviceAuthFactory;
    UriRegistry uriRegistry;
    WebViewUrlValidator urlValidator;
    WalletWebViewFactory walletWebViewFactory;
    HybridWebViewManager webViewManager;

    public WobWebViewActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private View createWebView(String s, String s1)
    {
        webViewManager.clearAllCookies();
        if ("gmail".equals(s))
        {
            return walletWebViewFactory.createWebViewControl$2ee8f12b(s1, new com.google.android.apps.wallet.webview.HybridWebViewManager.PostCreateHandler(), serviceAuthFactory.getGmailServiceAuthInfo());
        } else
        {
            throw new IllegalArgumentException("unsupported domains");
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        bundle = getIntent().getData();
        String s = bundle.getQueryParameter("domain");
        String s1 = bundle.getQueryParameter("title");
        String s2 = bundle.getQueryParameter("url");
        if (Strings.isNullOrEmpty(s) || !SUPPORTED_DOMAINS.contains(s) || Strings.isNullOrEmpty(s1) || Strings.isNullOrEmpty(s2) || !urlValidator.isValidUrl(s, s2))
        {
            WLog.vfmt(TAG, "Invalid web view uri: %s", new Object[] {
                bundle
            });
            startActivity(uriRegistry.createIntent(2, new Object[0]));
            finish();
            return;
        } else
        {
            setTitle(s1);
            setContentView(createWebView(s, s2));
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    protected void onDestroy()
    {
        walletWebViewFactory.clearWebViews();
        super.onDestroy();
    }

    protected final void onUpPressed()
    {
        Uri uri = getIntent().getData();
        navigateUpWithIntent(UriIntents.create(this, (new android.net.Uri.Builder()).scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath().replace("web", "entry/g_expanded")).build()));
    }

}
