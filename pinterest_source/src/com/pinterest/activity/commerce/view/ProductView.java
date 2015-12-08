// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.Image;
import com.pinterest.model.commerce.Item;
import com.pinterest.model.commerce.ProductPin;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class ProductView extends LinearLayout
{

    PTextView _orderDate;
    PTextView _orderStatus;
    TextView _productDetails;
    WebImageView _productImage;
    TextView _productMerchantName;
    TextView _productPrice;
    TextView _productTitle;
    int _variations;

    public ProductView(Context context)
    {
        super(context);
        init(context);
    }

    public ProductView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f03018f, this);
        ButterKnife.a(this);
        setOrientation(0);
    }

    public void bind(BuyableProduct buyableproduct)
    {
        _variations = buyableproduct.getVariations().size();
        _productImage.loadUrl(BuyableProductHelper.getDefaultImage(buyableproduct));
        _productMerchantName.setText(buyableproduct.getMerchantName());
        _productPrice.setText(BuyableProductHelper.getPriceDisplay(buyableproduct));
        _productTitle.setText(buyableproduct.getTitle());
    }

    public void bind(Cart cart, boolean flag)
    {
        Object obj = (String)cart.getItemMap().keySet().toArray()[0];
        obj = (Item)cart.getItemMap().get(obj);
        if (flag)
        {
            _orderDate.setVisibility(0);
            _orderStatus.setVisibility(0);
            _orderDate.setText(DateFormat.format("MM/dd/yyyy", BuyableProductHelper.getOrderTimeStampMs(cart)));
            _orderStatus.setText(cart.getDisplayStatus());
            _productDetails.setVisibility(8);
        } else
        {
            com.pinterest.model.commerce.ItemVariant itemvariant = ((Item) (obj)).getItemVariant();
            _productDetails.setText(BuyableProductHelper.getVariantOptionsForDisplay(itemvariant));
        }
        _productMerchantName.setText(((Item) (obj)).getSiteName());
        _productPrice.setText(cart.getDisplayTotalPrice());
        _productTitle.setText(((Item) (obj)).getTitle());
        if (cart.getProductPins() != null && !cart.getProductPins().isEmpty())
        {
            _productImage.loadUrl(((ProductPin)cart.getProductPins().get(0)).getImageMediumUrl());
            return;
        } else
        {
            _productImage.loadUrl(((Item) (obj)).getImage().getLink());
            return;
        }
    }

    public void updateProductDetailsAndImage(String s, String s1)
    {
        String s2 = s;
        if (_variations > 1)
        {
            s2 = s;
            if (StringUtils.countMatches(s, "\n") != _variations - 1)
            {
                s2 = (new StringBuilder()).append(s).append(StringUtils.repeat("\n", _variations - 1)).toString();
            }
        }
        _productDetails.setText(s2);
        if ((!StringUtils.isEmpty(s2) || _variations > 0) && _productDetails.getVisibility() != 0)
        {
            _productDetails.setVisibility(0);
        }
        _productImage.loadUrl(s1);
    }
}
