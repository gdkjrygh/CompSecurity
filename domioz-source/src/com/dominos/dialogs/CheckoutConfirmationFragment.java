// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.fragments.ContractDialogFragment;
import com.dominos.utils.AnalyticsUtil;

public class CheckoutConfirmationFragment extends ContractDialogFragment
{

    TextView addedToCart;
    TextView addressHolder;
    TextView checkoutTotal;
    AnalyticsUtil mAnalyticsUtil;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    private StoreManager mStoreManager;
    private String newLine;
    private String title;
    String upsellProductName;

    public CheckoutConfirmationFragment()
    {
        newLine = "\n";
        title = "";
    }

    private void buildAddressText()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(title).append("<br>");
        if (!mOrderManager.getOrder().isCarryout()) goto _L2; else goto _L1
_L1:
        stringbuilder.append((new StringBuilder("<center>")).append(mStoreManager.getStoreProfile().getAddressDescription()).toString().replace("\n", (new StringBuilder("</center>")).append("<br>").append("<center>").toString())).append("</center>").append("<br>");
_L4:
        addressHolder.setText(Html.fromHtml(stringbuilder.toString()));
        return;
_L2:
        LabsAddress labsaddress = mOrderManager.getOrder().getAddress();
        stringbuilder.append("<center>").append(labsaddress.getStreetLine()).append("</center>").append("<br>").append("<center>").append(labsaddress.getCityRegionLine()).append("</center>");
        if (labsaddress.getDeliveryInstructions().trim().length() > 0)
        {
            stringbuilder.append("<br>").append("<br>").append(getString(0x7f08003d)).append("<br>").append(labsaddress.getDeliveryInstructions());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void determineTitle()
    {
        if (mOrderManager.getOrder().isCarryout())
        {
            title = getString(0x7f08003f);
            mAnalyticsUtil.postOrderDetailsCarryoutConfirmation();
            return;
        } else
        {
            title = getString(0x7f080040);
            mAnalyticsUtil.postOrderDetailsDeliveryConfirmation();
            return;
        }
    }

    private void setAddedToCartText()
    {
        addedToCart.setText((new StringBuilder()).append(upsellProductName).append(" ").append(getString(0x7f080334)).append(newLine).toString());
    }

    private void setCheckoutTotalText()
    {
        String s = NumberUtil.formatPrice(Double.valueOf(mOrderManager.getOrder().getPrice()));
        s = (new StringBuilder()).append(getString(0x7f0801d5)).append(" ").append(s).append(newLine).toString();
        checkoutTotal.setText(s);
    }

    private void setDialogFeatures()
    {
        getDialog().getWindow().setBackgroundDrawableResource(0x7f0e009e);
        getDialog().getWindow().setFeatureInt(7, 0x7f0300b9);
        setCancelable(true);
    }

    public void confirmationCancelClick()
    {
        dismiss();
    }

    public void confirmationCheckoutClick()
    {
        ((CheckoutConfirmationListener)getContract()).onConfirmationCheckoutClicked(this);
    }

    public void onAfterInject()
    {
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
        mStoreManager = (StoreManager)mMobileSession.getManager("store_manager");
    }

    public void onAfterViews()
    {
        setDialogFeatures();
        determineTitle();
        setAddedToCartText();
        setCheckoutTotalText();
        buildAddressText();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    private class CheckoutConfirmationListener
    {

        public abstract void onConfirmationCheckoutClicked(CheckoutConfirmationFragment checkoutconfirmationfragment);
    }

}
