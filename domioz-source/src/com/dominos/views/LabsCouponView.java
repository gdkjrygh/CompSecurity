// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.core.models.coupon.Coupon;

public class LabsCouponView extends RelativeLayout
{

    TextView couponChoiceDescription;
    TextView couponChoiceLabel;
    TextView couponChoicePrice;
    TextView couponListNumberTextView;

    public LabsCouponView(Context context)
    {
        super(context);
    }

    public void bind(Coupon coupon, int i)
    {
        couponChoiceLabel.setText(coupon.getName());
        if (!coupon.getDescription().trim().equals(""))
        {
            couponChoiceDescription.setText(coupon.getDescription());
            couponChoiceDescription.setVisibility(0);
        } else
        {
            couponChoiceDescription.setText("");
            couponChoiceDescription.setVisibility(8);
        }
        if (!coupon.getPrice().trim().equals(""))
        {
            couponChoicePrice.setText(NumberUtil.formatPrice(Double.valueOf(Double.parseDouble(coupon.getPrice()))));
            couponChoicePrice.setVisibility(0);
            return;
        } else
        {
            couponChoicePrice.setText("");
            couponChoicePrice.setVisibility(8);
            return;
        }
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(couponListNumberTextView);
        FontManager.applyDominosFont(couponChoiceLabel);
        FontManager.applyDominosFont(couponChoiceDescription);
        FontManager.applyDominosFont(couponChoicePrice);
    }
}
