// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.dominos.adapters.LoyaltyHistoryAdapter;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import com.dominos.views.LoyaltyPointsExpireView;
import com.dominos.views.ToolBarView;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

public class LoyaltyHistoryActivity extends BaseActivity
{

    HistoryLoyalty mHistoryLoyalty;
    RecyclerView mLoyaltyHistoryListView;
    private LoyaltyPointsExpireView mLoyaltyPointsExpireView;
    ToolBarView mToolBar;

    public LoyaltyHistoryActivity()
    {
    }

    void afterViews()
    {
        mToolBar.setTitle(getString(0x7f0801b3));
        LoyaltyHistoryAdapter loyaltyhistoryadapter = new LoyaltyHistoryAdapter(this, mLoyaltyManager.getSortedHistory());
        LinearLayoutManager linearlayoutmanager = new LinearLayoutManager();
        mLoyaltyHistoryListView.a(linearlayoutmanager);
        mLoyaltyHistoryListView.a(loyaltyhistoryadapter);
    }

    public boolean handleHomeButtonClicked()
    {
        finish();
        return true;
    }
}
