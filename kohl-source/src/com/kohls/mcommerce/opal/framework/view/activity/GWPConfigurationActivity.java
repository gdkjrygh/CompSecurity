// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.component.views.iface.GWPOnBackPressedListener;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.wl.HybridScreen;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class GWPConfigurationActivity extends BaseActivityWithoutSlider
{

    GWPOnBackPressedListener mOnBackPressedListener;

    public GWPConfigurationActivity()
    {
    }

    private void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final GWPConfigurationActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(GWPConfigurationActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = GWPConfigurationActivity.this;
                super();
            }
        });
    }

    protected int getLayoutId()
    {
        return 0x7f030087;
    }

    protected void initializeViews(Bundle bundle)
    {
        if (UtilityMethods.isNetworkConnected(this))
        {
            FragmentFactory.attachGWPConfigurationFragment(this, getIntent().getExtras());
            attachActionItemListener();
            return;
        } else
        {
            UtilityMethods.showToast(this, getResources().getString(0x7f0803cd), 0);
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        if (mOnBackPressedListener != null)
        {
            mOnBackPressedListener.onBackButtonPressed();
        }
        super.onBackPressed();
    }

    public void setOnBackPressedListener(GWPOnBackPressedListener gwponbackpressedlistener)
    {
        mOnBackPressedListener = gwponbackpressedlistener;
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().ShowActionBarWithBackArrowForClosingAccountActivity("Back");
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }
}
