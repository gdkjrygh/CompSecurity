// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class 
{

    protected Button mApplyCodeBtn;
    protected LinearLayout mBottomBarOne;
    protected LinearLayout mBottomBarTwo;
    protected LinearLayout mCodeBar;
    protected TextView mCouponCode;
    protected LinearLayout mCouponOfferSection;
    protected TextView mCouponType;
    protected TextView mCouponValidity;
    protected TextView mHeader;
    protected Button mShopNowBtn;
    protected TextView mViewDetails;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
