// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;

public class LabsCouponLineView extends RelativeLayout
{

    TextView couponLabelText;
    TextView couponPriceText;
    LinearLayout couponViewContainer;
    TextView header;
    private Context mContext;

    public LabsCouponLineView(Context context)
    {
        super(context);
        mContext = context;
    }

    public void bind(LabsCouponLine labscouponline)
    {
        couponViewContainer.setSelected(labscouponline.isFulfilled());
        couponLabelText.setText(labscouponline.getCoupon().getName());
        FontManager.applyDominosFont(couponLabelText);
        FontManager.applyDominosFont(couponPriceText);
        FontManager.applyDominosFont(header);
        if (LoyaltyUtil.isLoyaltyCouponLine(labscouponline))
        {
            header.setText(mContext.getString(0x7f08034b));
        }
        if (StringHelper.isNotEmpty(labscouponline.getCoupon().getPrice()))
        {
            double d = Double.parseDouble(labscouponline.getCoupon().getPrice());
            couponPriceText.setText(String.format("$%.2f", new Object[] {
                Double.valueOf(d)
            }));
            couponPriceText.setVisibility(0);
            return;
        } else
        {
            couponPriceText.setText("");
            couponPriceText.setVisibility(8);
            return;
        }
    }

    public void bindCouponWiz(LabsCouponLine labscouponline)
    {
        couponLabelText.setText(labscouponline.getLabel());
        FontManager.applyDominosFont(couponLabelText);
        FontManager.applyDominosFont(header);
    }
}
