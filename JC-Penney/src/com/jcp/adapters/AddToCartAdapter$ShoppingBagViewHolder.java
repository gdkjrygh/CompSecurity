// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.views.HtmlTypefaceTextView;

class 
{

    protected TextView editItem;
    protected RelativeLayout mCartItemRelativeLayout;
    protected TextView mChangeStore;
    protected TextView mCouponCalculation;
    protected TextView mCouponCalculationAmount;
    protected LinearLayout mCutOffMessageView;
    protected RelativeLayout mEstimateLayoutHasPickUp;
    protected RelativeLayout mEstimateLayoutNoPickUp;
    protected RelativeLayout mItemAmountLayout;
    protected TextView mItemCode;
    protected TextView mItemEstimatedDelivery;
    protected TextView mItemEstimatedDeliveryDescription;
    protected ImageView mItemEstimatedDeliveryQuestionImageView;
    protected ImageView mItemImageView;
    protected HtmlTypefaceTextView mItemInseam;
    protected RelativeLayout mItemInvoiceInfoLayout;
    protected TextView mItemItemPrice;
    protected TextView mItemOriginalPrice;
    protected RelativeLayout mItemPlusMinusLayout;
    protected TextView mItemRemove;
    protected TextView mItemSavePrice;
    protected TextView mItemSavedPriceLabelView;
    protected LinearLayout mItemSeparator;
    protected TextView mItemShipDate;
    protected View mItemShipDateDividerLine;
    protected ImageView mItemShipDateHint;
    protected RelativeLayout mItemShipDateLayout;
    protected TextView mItemTitle;
    protected TextView mItemTotalPrice;
    protected TextView mItemTotalText;
    protected TextView mItemTypeDescription;
    protected TextView mItemTypePrice;
    protected View mItemValueSeparatorView;
    protected RelativeLayout mMattressLayout;
    protected RelativeLayout mMattressRecyleFeeLayout;
    protected TextView mMattressRecyleFeeTotalValue;
    protected TextView mMattressRecyleFeeUnitValue;
    protected View mMattressSeparator;
    protected TextView mMattressViewMore;
    protected View mQuantityDividerLine;
    protected TextView mQuantityItem;
    protected TextView mQuantityValue;
    protected Button mRadiBtnPickUpStore;
    protected Button mRadioBtnShipIt;
    protected TextView mRewardCalculation;
    protected TextView mRewardCalculationAmount;
    protected TextView mSalePriceHeader;
    protected TextView mSameDayPickUpDescription;
    protected TextView mSameDayPickUpStoreName;
    protected TextView mSameDayPickUpTitle;
    protected View mSameDayPickupDividerLine;
    protected ImageView mSameDayPickupIconView;
    protected RelativeLayout mSameDayPickupLayout;
    protected RelativeLayout mSameDayPickupViewGroup;
    protected TextView mSaveForLater;
    protected ImageView mSaveForLaterImageView;
    protected RelativeLayout mSaveForLaterLayout;
    protected View mSeparatorView;
    protected View mSeparatorViewBelowEstimateLayout;
    protected TextView marketingLabel;
    protected RelativeLayout recoverItemRelativeLayout;
    protected TextView recoverOriginalPriceDescription;

    public (View view)
    {
        ButterKnife.inject(this, view);
    }
}
