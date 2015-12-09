// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.topup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ScrollView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.transfer.api.FundsTransferInfoEvent;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.common.base.Throwables;
import com.google.wallet.wobl.exception.WoblException;

public class FeeInfoActivity extends WalletActivity
{

    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    EventBus eventBus;
    private int mode;
    WoblHolder woblHolder;
    private ScrollView woblScrollView;

    public FeeInfoActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public FeeInfoActivity(int i)
    {
        super(i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (getIntent().getBooleanExtra("mode_is_p2p", true))
        {
            mode = 1;
            setTitle(com.google.android.apps.walletnfcrel.R.string.fee_info_title_p2p);
        } else
        {
            mode = 2;
            setTitle(com.google.android.apps.walletnfcrel.R.string.fee_info_title_topup);
        }
        woblScrollView = new ScrollView(this);
    }

    public final void doOnResume()
    {
        int i;
        if (mode == 1)
        {
            i = 1;
            analyticsUtil.sendScreen("Fees For Sending Money", new AnalyticsCustomDimension[0]);
        } else
        {
            i = 2;
            analyticsUtil.sendScreen("Fees For Adding Money", new AnalyticsCustomDimension[0]);
        }
        eventBus.register(this, com/google/android/apps/wallet/transfer/api/FundsTransferInfoEvent, Integer.valueOf(i), new EventHandler() {

            final FeeInfoActivity this$0;

            private void handleEvent(FundsTransferInfoEvent fundstransferinfoevent)
            {
                handleTransferFeeEvent(fundstransferinfoevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((FundsTransferInfoEvent)obj);
            }

            
            {
                this$0 = FeeInfoActivity.this;
                super();
            }
        });
    }

    public final void handleTransferFeeEvent(FundsTransferInfoEvent fundstransferinfoevent)
    {
        woblHolder.setSource(fundstransferinfoevent.getFundingSourceOverview().layouts[0], null);
        try
        {
            woblScrollView.removeAllViews();
            woblScrollView.addView(woblHolder.getView());
            setContentView(woblScrollView);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FundsTransferInfoEvent fundstransferinfoevent)
        {
            throw Throwables.propagate(fundstransferinfoevent);
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onDestroy()
    {
        actionExecutor.cancelAll();
        super.onDestroy();
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        finish();
    }
}
