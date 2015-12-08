// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.analytics.utils.enums.BazarvoiceAction;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentOnScreen;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.wl.HybridScreen;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider, AccountActivity

public class RatingAndReviewActivity extends BaseActivityWithoutSlider
{

    private Bundle mBundle;
    private FragmentOnScreen mFragmentOnScreen;
    private FrameLayout mFrameLayout;
    private String mProductOmniture;
    private String mProductWebID;
    private String mUserId;
    private boolean openWriteReview;
    private Object productDetailsObj;
    private Object ratingReviewObj;

    public RatingAndReviewActivity()
    {
    }

    private void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final RatingAndReviewActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(RatingAndReviewActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = RatingAndReviewActivity.this;
                super();
            }
        });
    }

    public void attachRatingReviewDetailFragment(Bundle bundle)
    {
        getActionBarHelper().showActionBarForRatingReviewScreens("Review Details");
        FragmentFactory.attachRatingReviewDetailsFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.RATING_REVIEW_DETAILS;
    }

    public void attachRatingReviewListFragment(Bundle bundle)
    {
        getActionBarHelper().showActionBarForRatingReviewScreens("Product Reviews");
        FragmentFactory.attachRatingReviewListFragment(this, bundle);
        mFragmentOnScreen = FragmentOnScreen.RATING_REVIEW_LIST;
    }

    public void attachRatingReviewWriteAReviewFragment(Bundle bundle)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            setUserId(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getSignedInUsernameFromPref());
            getActionBarHelper().showActionBarForRatingReviewScreens("Write a Review");
            FragmentFactory.attachRatingReviewWriteFragment(this, bundle);
            mFragmentOnScreen = FragmentOnScreen.WRITE_REVIEW;
            return;
        } else
        {
            mBundle = bundle;
            bundle = new Intent(this, com/kohls/mcommerce/opal/framework/view/activity/AccountActivity);
            bundle.putExtra("show_create_account", true);
            startActivityForResult(bundle, 0);
            return;
        }
    }

    protected int getLayoutId()
    {
        return 0x7f030059;
    }

    public Object getProductDetailsObj()
    {
        return productDetailsObj;
    }

    public Object getRatingReviewObj()
    {
        return ratingReviewObj;
    }

    public String getUserId()
    {
        return mUserId;
    }

    protected void initializeViews(Bundle bundle)
    {
        if (UtilityMethods.isNetworkConnected(this))
        {
            mBundle = bundle;
            if (mBundle != null)
            {
                mProductWebID = bundle.getString("key_category_id");
                openWriteReview = mBundle.getBoolean("open_write_review");
                mProductOmniture = bundle.getString("key_omniture_s_products");
            }
            if (openWriteReview)
            {
                attachRatingReviewWriteAReviewFragment(mBundle);
            } else
            {
                attachRatingReviewListFragment(bundle);
            }
            attachActionItemListener();
            return;
        } else
        {
            UtilityMethods.showToast(this, getString(0x7f0803cd), 0);
            finish();
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn() && j == -1)
        {
            attachRatingReviewWriteAReviewFragment(mBundle);
        }
        super.onActivityResult(i, j, intent);
    }

    public void onBackPressed()
    {
        performBackPress();
    }

    public void performBackPress()
    {
        if (openWriteReview)
        {
            setResult(0);
            finish();
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.RATING_REVIEW_DETAILS)
        {
            attachRatingReviewListFragment(mBundle);
            return;
        }
        if (mFragmentOnScreen == FragmentOnScreen.WRITE_REVIEW)
        {
            attachRatingReviewListFragment(mBundle);
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void sendAnalyticsForReview(String s, BazarvoiceAction bazarvoiceaction)
    {
        AnalyticsHelper.sendAnalyticsForReview(s, bazarvoiceaction, mProductOmniture, mProductWebID);
    }

    public void setProductDetailsObj(Object obj)
    {
        productDetailsObj = obj;
    }

    public void setRatingReviewObj(Object obj)
    {
        ratingReviewObj = obj;
    }

    public void setUserId(String s)
    {
        mUserId = s;
    }

    public void updateActionBarViews()
    {
        if (getActionBarHelper() != null && getActionBarHelper().getBackButtonView() != null)
        {
            getActionBarHelper().getBackButtonView().setOnClickListener(new android.view.View.OnClickListener() {

                final RatingAndReviewActivity this$0;

                public void onClick(View view)
                {
                    performBackPress();
                }

            
            {
                this$0 = RatingAndReviewActivity.this;
                super();
            }
            });
        }
    }

    protected void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }
}
