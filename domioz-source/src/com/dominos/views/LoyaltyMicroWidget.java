// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.store.StoreManager;
import java.util.Date;

// Referenced classes of package com.dominos.views:
//            LoyaltyWidgetBaseLayout

public class LoyaltyMicroWidget extends LoyaltyWidgetBaseLayout
{

    TextView mFreePizzas;
    TextView mFreePizzasTextView;
    ImageView mLoyaltyBanner;
    private LoyaltyManager mLoyaltyManager;
    TextView mLoyaltyPendingPointsBanner;
    TextView mLoyaltyRemainingPoints;
    MobileSession mMobileSession;
    LinearLayout mParentLayout;
    ImageView mPie;
    TextView mPointsExpire;
    Button mRedeemButton;
    LinearLayout mRedemptionAvailable;
    LinearLayout mRedemptionNotAvailable;
    Button mRetryButton;
    private StoreManager mStoreManager;
    RelativeLayout mWidgetBody;
    RelativeLayout mWidgetBodyErrorLayout;
    LinearLayout mWidgetBodyInfoLayout;

    public LoyaltyMicroWidget(Context context)
    {
        super(context);
    }

    public void afterInject()
    {
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
    }

    public void afterView()
    {
        FontManager.applyDominosFont(this);
        updateView();
    }

    public void disableRedemption()
    {
        mRedeemButton.setEnabled(false);
    }

    public void enableRedemption()
    {
        mRedeemButton.setEnabled(true);
    }

    public void onFullPieRedeemClick()
    {
        if (mListener != null)
        {
            mListener.onPieImageRedeemButtonClick();
        }
    }

    public void onLoyaltyRetryClick()
    {
        if (mListener != null)
        {
            mListener.onRetryButtonClick();
        }
    }

    public void onRedeemClick()
    {
        if (mListener != null)
        {
            mListener.onRedeemButtonClick();
        }
    }

    public void updateView()
    {
        mWidgetBodyErrorLayout.setVisibility(8);
        mWidgetBodyInfoLayout.setVisibility(8);
        mRetryButton.setVisibility(8);
        mRedemptionAvailable.setVisibility(8);
        mRedemptionNotAvailable.setVisibility(8);
        mLoyaltyPendingPointsBanner.setVisibility(8);
        if (!mLoyaltyManager.isLoyaltyAvailable()) goto _L2; else goto _L1
_L1:
        int i;
        mWidgetBodyInfoLayout.setVisibility(0);
        i = mLoyaltyManager.getNumberOfRemainingPoints();
        if (i < mLoyaltyManager.getNumberOfBaseCouponPoints()) goto _L4; else goto _L3
_L3:
        i = mLoyaltyManager.calculateNumberOfFreePizza();
        if (i > 1)
        {
            mFreePizzasTextView.setText(getResources().getString(0x7f080140));
        } else
        {
            mFreePizzasTextView.setText(getResources().getString(0x7f08013f));
        }
        mFreePizzas.setText(String.valueOf(i));
        mRedemptionAvailable.setVisibility(0);
        if (!mLoyaltyManager.isCustomerSuspended()) goto _L6; else goto _L5
_L5:
        disableRedemption();
_L10:
        i = mLoyaltyManager.getNumberOfPendingPoints();
        if (i > 0)
        {
            mLoyaltyPendingPointsBanner.setVisibility(0);
            mLoyaltyPendingPointsBanner.setText(getResources().getString(0x7f080227, new Object[] {
                Integer.valueOf(i)
            }));
        }
        if (LoyaltyUtil.isPointsAboutToExpire(mLoyaltyManager.getExpirationDate(), new Date(), 30))
        {
            mPointsExpire.setVisibility(0);
            mPointsExpire.setText(getResources().getString(0x7f08024a, new Object[] {
                mLoyaltyManager.getExpirationDate()
            }));
        }
_L8:
        return;
_L6:
        if (mStoreManager.isStoreALoyaltyStore())
        {
            enableRedemption();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        mRedemptionNotAvailable.setVisibility(0);
        mLoyaltyRemainingPoints.setText(String.valueOf(i));
        mPie.setImageDrawable(getDrawableForPie(i));
        continue; /* Loop/switch isn't completed */
_L2:
        mWidgetBodyErrorLayout.setVisibility(0);
        if (!mLoyaltyManager.isCustomerLoyaltyFailed()) goto _L8; else goto _L7
_L7:
        mRetryButton.setVisibility(0);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
