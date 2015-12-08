// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.loyalty.History;
import com.dominos.fragments.LoyaltyWidgetFragment;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.LoyaltyHistoryRowView;
import com.dominos.views.LoyaltyHistoryRowView_;
import com.dominos.views.LoyaltyPointsExpireView;
import com.dominos.views.LoyaltyPointsExpireView_;
import com.dominos.views.ToolBarView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, LandingActivity_, LoyaltyHistoryActivity_

public class LoyaltyRewardDetailsActivity extends BaseActivity
    implements com.dominos.views.LoyaltyWidgetBaseLayout.LoyaltyWidgetListener
{

    boolean mHistoryCallFailed;
    LinearLayout mLoyaltyHistoryLayout;
    LinearLayout mLoyaltyHistoryListView;
    FrameLayout mLoyaltyPointsExpireHolder;
    private LoyaltyPointsExpireView mLoyaltyPointsExpireView;
    private LoyaltyWidgetFragment mLoyaltyWidgetFragment;
    TextView mNoHistoryTextView;
    ToolBarView mToolBar;

    public LoyaltyRewardDetailsActivity()
    {
    }

    private void addHistoryViews()
    {
        mLoyaltyHistoryLayout.setVisibility(8);
        mNoHistoryTextView.setVisibility(8);
        if (mHistoryCallFailed)
        {
            showNoHistory(0x7f0801a7);
        } else
        if (mLoyaltyManager.hasHistory())
        {
            mLoyaltyHistoryLayout.setVisibility(0);
            Iterator iterator = mLoyaltyManager.getShortHistory().iterator();
            boolean flag = true;
            while (iterator.hasNext()) 
            {
                History history = (History)iterator.next();
                LoyaltyHistoryRowView loyaltyhistoryrowview = LoyaltyHistoryRowView_.build(this);
                loyaltyhistoryrowview.bind(history, flag, true);
                mLoyaltyHistoryListView.addView(loyaltyhistoryrowview);
                flag = false;
            }
        } else
        {
            showNoHistory(0x7f0801ac);
            return;
        }
    }

    private void addPointsExpireView()
    {
        if (mLoyaltyPointsExpireView == null)
        {
            mLoyaltyPointsExpireView = LoyaltyPointsExpireView_.build(this);
        }
        mLoyaltyPointsExpireHolder.addView(mLoyaltyPointsExpireView);
    }

    private void buildWidget()
    {
        mLoyaltyWidgetFragment = (LoyaltyWidgetFragment)getSupportFragmentManager().a(LoyaltyWidgetFragment.TAG);
        if (mLoyaltyWidgetFragment == null)
        {
            mLoyaltyWidgetFragment = LoyaltyWidgetFragment.newInstance(com.dominos.fragments.LoyaltyWidgetFragment.LoyaltyWidgetType.CENTERED);
            getSupportFragmentManager().a().b(0x7f0f00c1, mLoyaltyWidgetFragment, LoyaltyWidgetFragment.TAG).a();
        }
    }

    private void redeemClick()
    {
        mLoyaltyManager.setLoyaltyCouponAdded();
        ((LandingActivity_.IntentBuilder_)((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).extra("com.dominos.intent.extra.NEW_ORDER", true)).start();
    }

    private void showNoHistory(int i)
    {
        mNoHistoryTextView.setVisibility(0);
        mNoHistoryTextView.setText(getString(i));
        mNoHistoryTextView.setTypeface(null, 2);
    }

    public void afterViews()
    {
        FontManager.applyDominosFont(this);
        mToolBar.setTitle(getString(0x7f08022b));
        buildWidget();
        addHistoryViews();
        addPointsExpireView();
    }

    public boolean handleHomeButtonClicked()
    {
        ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
        return true;
    }

    public void onMoreHistoryClick()
    {
        mAnalyticsUtil.postMoreRewardsHistoryClick();
        LoyaltyHistoryActivity_.intent(this).start();
    }

    public void onPieImageRedeemButtonClick()
    {
        mAnalyticsUtil.postRewardsDetailsPieImageViewRedeemClick();
        redeemClick();
    }

    public void onRedeemButtonClick()
    {
        mAnalyticsUtil.postRewardsDetailsRedeemClick();
        redeemClick();
    }

    public void onRetryButtonClick()
    {
    }
}
