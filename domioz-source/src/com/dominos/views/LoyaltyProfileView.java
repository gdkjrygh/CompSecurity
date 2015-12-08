// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;

public class LoyaltyProfileView extends RelativeLayout
{

    private LoyaltyProfileViewListener mListener;
    LinearLayout mLoyaltyEnrollActivateLayout;
    LinearLayout mLoyaltyEnrollLayout;
    TextView mLoyaltyInstructionLabel;
    RelativeLayout mLoyaltyLayout;
    private LoyaltyManager mLoyaltyManager;
    LinearLayout mLoyaltyUnavailableLayout;
    MobileSession mMobileSession;
    LinearLayout mNowAMemberLayout;

    public LoyaltyProfileView(Context context)
    {
        super(context);
    }

    public LoyaltyProfileView(Context context, LoyaltyProfileViewListener loyaltyprofileviewlistener)
    {
        super(context);
        mListener = loyaltyprofileviewlistener;
    }

    public void afterInject()
    {
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        updateView();
    }

    void onLoyaltyActivateClicked()
    {
        if (mListener != null)
        {
            mListener.onLoyaltyActivateClick();
        }
    }

    void onLoyaltyLearnMoreClicked()
    {
        if (mListener != null)
        {
            mListener.onLoyaltyLearnMoreClick();
        }
    }

    public void updateView()
    {
        mNowAMemberLayout.setVisibility(8);
        mLoyaltyEnrollLayout.setVisibility(8);
        mLoyaltyEnrollActivateLayout.setVisibility(8);
        mLoyaltyUnavailableLayout.setVisibility(8);
        if (!mLoyaltyManager.isLoyaltyAvailable())
        {
            mLoyaltyUnavailableLayout.setVisibility(0);
        } else
        if (mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            mLoyaltyLayout.setBackgroundResource(0x7f02013a);
            if (mLoyaltyManager.isNewLoyaltyMember())
            {
                mNowAMemberLayout.setVisibility(0);
                return;
            }
        } else
        {
            mLoyaltyEnrollLayout.setVisibility(0);
            mLoyaltyEnrollActivateLayout.setVisibility(0);
            return;
        }
    }

    private class LoyaltyProfileViewListener
    {

        public abstract void onLoyaltyActivateClick();

        public abstract void onLoyaltyLearnMoreClick();
    }

}
