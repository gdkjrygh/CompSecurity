// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.oneview;

import android.os.Bundle;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.apps.wallet.loyalty.discovery.FeaturedLoyaltyProgramListFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.actionbutton.ActionsContainer;
import com.google.android.apps.wallet.widgets.actionbutton.FloatingActionButton;
import com.google.android.apps.wallet.wobs.WobListActivity;
import com.google.android.apps.wallet.wobs.caching.WobCategory;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.oneview:
//            OneViewListFragment

public class OneViewListActivity extends WobListActivity
{

    ImageCapturePrerequisiteChecker imageCapturePrerequisiteChecker;

    public OneViewListActivity()
    {
    }

    public final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        bundle = (FloatingActionButton)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MultiActionButton);
        bundle.setContentDescription(getString(com.google.android.apps.walletnfcrel.R.string.one_view_floating_action_button_content_description));
        bundle.setVisibility(0);
        bundle = (ActionsContainer)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ActionsContainer);
        bundle.addAction(com.google.android.apps.walletnfcrel.R.string.one_view_add_gift_card_button_label, com.google.android.apps.walletnfcrel.R.drawable.ic_nav_giftcards_white_24dp, GiftCardApi.createStartNewGiftCardFlowIntent(this, imageCapturePrerequisiteChecker.check()));
        bundle.addAction(com.google.android.apps.walletnfcrel.R.string.one_view_add_loyalty_card_button_label, com.google.android.apps.walletnfcrel.R.drawable.ic_nav_loyalty_white_24dp, LoyaltyApi.createStartNewAdhocLoyaltyCardFlowIntent(this, imageCapturePrerequisiteChecker.check()));
        bundle = new com.google.android.apps.wallet.wobs.WobListActivity.TabSpec(1002L, getString(WobCategory.ACTIVE_ONE_VIEW.getTitleTextId().intValue()), com/google/android/apps/wallet/oneview/OneViewListFragment);
        com.google.android.apps.wallet.wobs.WobListActivity.TabSpec tabspec = new com.google.android.apps.wallet.wobs.WobListActivity.TabSpec(1003L, getString(WobCategory.EXPIRED_ONE_VIEW.getTitleTextId().intValue()), com/google/android/apps/wallet/oneview/OneViewListFragment);
        com.google.android.apps.wallet.wobs.WobListActivity.TabSpec tabspec1 = new com.google.android.apps.wallet.wobs.WobListActivity.TabSpec(1004L, getString(com.google.android.apps.walletnfcrel.R.string.one_view_featured_tab_title), com/google/android/apps/wallet/loyalty/discovery/FeaturedLoyaltyProgramListFragment);
        setTitle(com.google.android.apps.walletnfcrel.R.string.one_view_activity_title);
        setupTabs(ImmutableList.of(bundle, tabspec, tabspec1));
    }

    protected final void sendAnalyticsScreen(long l)
    {
        if (l == 1002L)
        {
            analyticsUtil.sendScreen("One View Active", new AnalyticsCustomDimension[0]);
        } else
        {
            if (l == 1003L)
            {
                analyticsUtil.sendScreen("One View Used", new AnalyticsCustomDimension[0]);
                return;
            }
            if (l == 1004L)
            {
                analyticsUtil.sendScreen("One View Featured", new AnalyticsCustomDimension[0]);
                return;
            }
        }
    }
}
