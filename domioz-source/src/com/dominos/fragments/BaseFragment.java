// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.dominos.MobileSession;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil;

public class BaseFragment extends Fragment
{

    protected ActivityHelper mActivityHelper;
    protected AnalyticsService mAnalyticsService;
    protected AnalyticsUtil mAnalyticsUtil;
    protected CartManager mCartManager;
    protected ConfigurationManager mConfigurationManager;
    protected LoyaltyManager mLoyaltyManger;
    protected MenuManager mMenuManager;
    protected MobileSession mMobileSession;
    protected DomProductManager mNinaHelper;
    protected OrderManager mOrderManager;
    protected UserProfileManager mProfileManager;
    private ProgressDialog mProgressDialog;
    protected StoreManager mStoreManager;

    public BaseFragment()
    {
    }

    public void blockOrientation()
    {
        if (getResources().getConfiguration().orientation == 2)
        {
            getActivity().setRequestedOrientation(6);
            return;
        } else
        {
            getActivity().setRequestedOrientation(7);
            return;
        }
    }

    protected void hideLoading()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.hide();
        }
        unblockOrientation();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mActivityHelper = ActivityHelper_.getInstance_(activity);
    }

    public void onBaseAfterInject()
    {
        mConfigurationManager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        mNinaHelper = (DomProductManager)mMobileSession.getManager("dom_product_manager");
        mAnalyticsService = (AnalyticsService)mMobileSession.getManager("analytics_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
        mCartManager = (CartManager)mMobileSession.getManager("cart_manager");
        mLoyaltyManger = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
    }

    public void onDetach()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.dismiss();
        }
        super.onDetach();
    }

    protected void showLoading()
    {
        blockOrientation();
        if (mProgressDialog == null)
        {
            mProgressDialog = new ProgressDialog(getActivity());
            mProgressDialog.setCancelable(false);
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
        mProgressDialog.setContentView(0x7f030032);
    }

    protected void showLongToast(String s)
    {
        mActivityHelper.showToast(s, 1);
    }

    protected void showShortToast(String s)
    {
        mActivityHelper.showToast(s, 0);
    }

    public void unblockOrientation()
    {
        getActivity().setRequestedOrientation(4);
    }
}
