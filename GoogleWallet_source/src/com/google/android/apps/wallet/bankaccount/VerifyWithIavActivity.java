// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelPublisher;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.webview.ServiceAuthFactory;
import com.google.android.apps.wallet.webview.WalletWebView;

public class VerifyWithIavActivity extends WalletActivity
{

    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    BankAccountsModelPublisher bankAccountsModelPublisher;
    ServiceAuthFactory serviceAuthFactory;
    WalletWebView webView;

    public VerifyWithIavActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public VerifyWithIavActivity(int i)
    {
        super(i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        bundle = getIntent();
        if (!bundle.hasExtra("account_id"))
        {
            throw new IllegalArgumentException("VerifyWithIavActivity.doOnCreate() missing extras");
        } else
        {
            setTitle(com.google.android.apps.walletnfcrel.R.string.verify_with_iav_activity_title);
            webView.setOnSuccessActionListener(new OnActionListener() {

                final VerifyWithIavActivity this$0;

                private void onAction(Void void1)
                {
                    bankAccountsModelPublisher.generateAndPostEventDontPreserveCache();
                    Toasts.show(VerifyWithIavActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.bank_account_added));
                    analyticsUtil.sendSuccess("VerifyBankAccount", new AnalyticsCustomDimension[0]);
                    finish();
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = VerifyWithIavActivity.this;
                super();
            }
            });
            webView.setOnFailureActionListener(new OnActionListener() {

                final VerifyWithIavActivity this$0;

                private void onAction(Void void1)
                {
                    analyticsUtil.sendError("VerifyBankAccount", new AnalyticsCustomDimension[0]);
                    bankAccountsModelPublisher.generateAndPostEventDontPreserveCache();
                    finish();
                }

                public final volatile void onAction(Object obj)
                {
                    onAction((Void)obj);
                }

            
            {
                this$0 = VerifyWithIavActivity.this;
                super();
            }
            });
            bundle = appControl.getString(AppControlKey.BANK_ACCOUNT_IAV_URL) + "?source=android&bankAccountSubId=" + bundle.getStringExtra("account_id");
            setContentView(webView.createContentView(bundle, serviceAuthFactory.getWhiskyServiceAuthInfo("FSS")));
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public void onBackPressed()
    {
        if (!webView.onBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onDestroy()
    {
        webView.clear();
        super.onDestroy();
    }

    protected final void onUpPressed()
    {
        finish();
    }
}
