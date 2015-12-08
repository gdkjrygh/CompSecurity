// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

public class LoyaltyPointsConfirmationWidget extends LinearLayout
{

    private int mBonusPoints;
    private int mEarnedPoints;
    LinearLayout mLoyaltyNoPointsEarned;
    TextView mLoyaltyPointsBonusTextView;
    LinearLayout mLoyaltyPointsEarned;
    TextView mLoyaltyPointsEarnedTextView;

    public LoyaltyPointsConfirmationWidget(Context context, int i, int j)
    {
        super(context);
        mEarnedPoints = i;
        mBonusPoints = j;
    }

    public void afterViews()
    {
        FontManager.applyDominosFont(this);
        mLoyaltyNoPointsEarned.setVisibility(8);
        mLoyaltyPointsEarned.setVisibility(8);
        if (mEarnedPoints > 0 || mBonusPoints > 0)
        {
            mLoyaltyPointsEarned.setVisibility(0);
            mLoyaltyPointsEarnedTextView.setText(String.valueOf(mEarnedPoints));
            mLoyaltyPointsBonusTextView.setText(String.valueOf(mBonusPoints));
            return;
        } else
        {
            mLoyaltyNoPointsEarned.setVisibility(0);
            return;
        }
    }
}
