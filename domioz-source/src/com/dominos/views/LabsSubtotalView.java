// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;

public class LabsSubtotalView extends RelativeLayout
{

    TextView grandTotalViewAmount;
    MobileSession mMobileSession;
    OrderUtil mOrderUtil;
    ImageView mSrLogo;
    TableRow subTotalDeliveryRow;
    TableRow subTotalDepositRow;
    TableRow subTotalPromotionRow;
    TextView subTotalViewDeliveryAmountText;
    TextView subTotalViewDepositAmount;
    TextView subTotalViewNetAmount;
    TextView subTotalViewPromotionAmount;
    TextView subTotalViewTaxAmount;

    public LabsSubtotalView(Context context)
    {
        super(context);
    }

    public LabsSubtotalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(LabsOrder labsorder)
    {
        ShoprunnerManager shoprunnermanager = (ShoprunnerManager)mMobileSession.getManager("shoprunner_manager");
        if (labsorder.getServiceMethod().equalsIgnoreCase("Carryout"))
        {
            subTotalDeliveryRow.setVisibility(8);
        } else
        {
            subTotalDeliveryRow.setVisibility(0);
            ImageView imageview = mSrLogo;
            int i;
            if (shoprunnermanager.isShopRunnerSession())
            {
                i = 0;
            } else
            {
                i = 4;
            }
            imageview.setVisibility(i);
        }
        subTotalViewNetAmount.setText(NumberUtil.formatPrice(Double.valueOf(labsorder.getNetAmount())));
        subTotalViewTaxAmount.setText(NumberUtil.formatPrice(Double.valueOf(labsorder.getTaxAmount())));
        if (labsorder.getDepositAmount() <= 0.0D)
        {
            subTotalDepositRow.setVisibility(8);
        } else
        {
            subTotalViewDepositAmount.setText(NumberUtil.formatPrice(Double.valueOf(labsorder.getDepositAmount())));
            subTotalDepositRow.setVisibility(0);
        }
        if (shoprunnermanager.isShopRunnerSession())
        {
            subTotalViewDeliveryAmountText.setText(getResources().getString(0x7f08025c));
        } else
        {
            subTotalViewDeliveryAmountText.setText(NumberUtil.formatPrice(Double.valueOf(labsorder.getDeliveryAmount())));
        }
        grandTotalViewAmount.setText(NumberUtil.formatPrice(Double.valueOf(labsorder.getPrice())));
    }
}
