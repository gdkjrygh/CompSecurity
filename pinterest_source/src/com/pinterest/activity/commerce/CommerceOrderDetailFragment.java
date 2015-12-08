// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.ProductView;
import com.pinterest.activity.commerce.view.TwoColumnTextView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.Item;
import com.pinterest.model.commerce.Merchant;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import java.util.Map;
import java.util.Set;

public class CommerceOrderDetailFragment extends BaseFragment
{

    public static final String EXTRA_CART = "cart";
    TwoColumnTextView _billAddress;
    private Cart _cart;
    TwoColumnTextView _costShipping;
    TwoColumnTextView _costSubtotal;
    TwoColumnTextView _costTax;
    TwoColumnTextView _costTotal;
    TwoColumnTextView _deliveryDate;
    PTextView _merchantContactInfo;
    WebImageView _merchantLogo;
    PTextView _merchantQuestion;
    TwoColumnTextView _orderDate;
    TwoColumnTextView _orderId;
    TwoColumnTextView _payment;
    ProductView _productView;
    TwoColumnTextView _quantity;
    TwoColumnTextView _shipAddress;
    TwoColumnTextView _shipMethod;
    TwoColumnTextView _status;

    public CommerceOrderDetailFragment()
    {
        _layoutId = 0x7f0300b1;
        _menuId = 0x7f100002;
    }

    public void handleContactSellerClicked()
    {
        String s = Resources.string(0x7f070137, new Object[] {
            _cart.getOrderId()
        });
        String s2 = _cart.getMerchant().getCustomerServiceEmail();
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            s2
        });
        intent.putExtra("android.intent.extra.SUBJECT", s);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null)
        {
            startActivity(intent);
            return;
        } else
        {
            String s1 = Resources.string(0x7f070138);
            Toast.makeText(getActivity(), s1, 0).show();
            return;
        }
    }

    public void onHandleReturnPolicyClicked()
    {
        Object obj = _cart.getMerchant();
        if (TextUtils.isEmpty(((Merchant) (obj)).getReturnPolicyUrl()))
        {
            obj = ((Merchant) (obj)).getMerchantUrl();
        } else
        {
            obj = ((Merchant) (obj)).getReturnPolicyUrl();
        }
        Events.post(new Navigation(Location.BROWSER, ((String) (obj))));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070141);
        _productView.bind(_cart, false);
        view = (String)_cart.getItemMap().keySet().toArray()[0];
        _status.setValue(_cart.getDisplayStatus());
        _deliveryDate.setValue("- - -");
        _orderDate.setValue(DateFormat.format("MM/dd/yyyy", BuyableProductHelper.getOrderTimeStampMs(_cart)));
        _orderId.setValue(_cart.getOrderId());
        _quantity.setValue(String.valueOf(((Item)_cart.getItemMap().get(view)).getQuantity()));
        _shipAddress.setValue(BuyableProductHelper.getFormattedAddress(_cart.getDetailedShipping(), true));
        _shipMethod.setValue(BuyableProductHelper.getFormattedShippingMethod(_cart.getSelectedShippingRate()));
        _payment.setValue(BuyableProductHelper.getFormattedUserCard(_cart.getUserCard()));
        _billAddress.setValue(BuyableProductHelper.getFormattedAddress(_cart.getBillingDetail(), true));
        _costSubtotal.setValue(_cart.getDisplayBasePrice());
        _costTax.setValue(_cart.getDisplayTaxes());
        _costShipping.setValue(_cart.getDisplayShippingCost());
        _costTotal.setValue(_cart.getDisplayTotalPrice());
        view = _cart.getMerchant();
        _merchantLogo.loadUrl(view.getLogoUrl());
        _merchantQuestion.setText(Resources.string(0x7f070139, new Object[] {
            view.getDisplayName()
        }));
        bundle = new StringBuilder();
        if (ModelHelper.isValid(view.getCustomerServiceEmail()))
        {
            bundle.append(view.getCustomerServiceEmail());
        }
        if (ModelHelper.isValid(view.getCustomerServicePhone()))
        {
            if (bundle.length() > 0)
            {
                bundle.append(" | ");
            }
            bundle.append(view.getCustomerServicePhone());
        }
        _merchantContactInfo.setText(bundle.toString());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _cart = (Cart)navigation.getExtra("cart");
    }
}
