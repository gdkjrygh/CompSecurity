// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.product;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

public class OfferSummary
{

    private final String _bullet;
    private Boolean _inStock;
    private String _maxPrice;
    private String _minPrice;
    private String _offerDisplay;
    private String _oldPrice;
    private String _price;

    public OfferSummary()
    {
        this(null);
    }

    public OfferSummary(PinterestJsonObject pinterestjsonobject)
    {
        this(pinterestjsonobject, null);
    }

    public OfferSummary(PinterestJsonObject pinterestjsonobject, String s)
    {
        _bullet = " &#8226; ";
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _inStock = pinterestjsonobject.a("in_stock", null);
            _price = pinterestjsonobject.a("price", "");
            _maxPrice = pinterestjsonobject.a("max_price", "");
            _minPrice = pinterestjsonobject.a("min_price", "");
            _oldPrice = s;
            makeOfferDisplay();
            return;
        }
    }

    private boolean isNewPriceLower(String s, String s1)
    {
        boolean flag = false;
        float f;
        float f1;
        try
        {
            f1 = Float.parseFloat(s.replaceAll("[^0-9.]", ""));
            f = Float.valueOf(Float.parseFloat(s1.replaceAll("[^0-9.]", ""))).floatValue();
            f1 = Float.valueOf(f1).floatValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
            return false;
        }
        if (f < f1)
        {
            flag = true;
        }
        return flag;
    }

    public boolean getInStock()
    {
        return Boolean.TRUE.equals(_inStock);
    }

    public String getMaxPrice()
    {
        return _maxPrice;
    }

    public String getMinPrice()
    {
        return _minPrice;
    }

    public String getOfferDisplay()
    {
        return _offerDisplay;
    }

    public String getOldPrice()
    {
        return _oldPrice;
    }

    public String getPrice()
    {
        return _price;
    }

    public void makeOfferDisplay()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (Boolean.TRUE.equals(_inStock))
        {
            stringbuilder.append(Resources.string(0x7f070466));
        } else
        if (Boolean.FALSE.equals(_inStock))
        {
            stringbuilder.append(Resources.string(0x7f070467));
        }
        if (ModelHelper.isValid(_price) && ModelHelper.isValid(_oldPrice) && isNewPriceLower(_oldPrice, _price))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" &#8226; ");
            }
            stringbuilder.append(Resources.string(0x7f070468, new Object[] {
                _price, _oldPrice
            }));
        } else
        if (ModelHelper.isValid(_maxPrice) && ModelHelper.isValid(_minPrice))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" &#8226; ");
            }
            stringbuilder.append(_minPrice).append("-").append(_maxPrice);
        } else
        if (ModelHelper.isValid(_price))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" &#8226; ");
            }
            stringbuilder.append(_price);
        }
        _offerDisplay = stringbuilder.toString();
    }

    public void setInStock(Boolean boolean1)
    {
        _inStock = boolean1;
    }

    public void setMaxPrice(String s)
    {
        _maxPrice = s;
    }

    public void setMinPrice(String s)
    {
        _minPrice = s;
    }

    public void setOldPrice(String s)
    {
        _oldPrice = s;
    }

    public void setPrice(String s)
    {
        _price = s;
    }
}
