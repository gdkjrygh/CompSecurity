// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.product;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

public class Offer
{

    private String _description;
    private String _id;
    private boolean _inStock;
    private String _name;
    private String _priceCurrency;
    private String _priceValue;
    private String _sku;
    private String _type;

    public Offer(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _description = pinterestjsonobject.a("description", "");
            _id = pinterestjsonobject.a("id", "");
            _inStock = pinterestjsonobject.a("in_stock").booleanValue();
            _priceCurrency = pinterestjsonobject.a("price_currency", "");
            _priceValue = pinterestjsonobject.a("price_value", "");
            _sku = pinterestjsonobject.a("sku", "");
            _type = pinterestjsonobject.a("type", "");
            return;
        }
    }

    public static List getOffers(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray != null)
        {
            int i = 0;
            int j = pinterestjsonarray.a();
            while (i < j) 
            {
                arraylist.add(new Offer(pinterestjsonarray.c(i)));
                i++;
            }
        }
        return arraylist;
    }

    public String getDescription()
    {
        return _description;
    }

    public String getId()
    {
        return _id;
    }

    public boolean getInStock()
    {
        return _inStock;
    }

    public String getName()
    {
        return _name;
    }

    public String getPriceCurrency()
    {
        return _priceCurrency;
    }

    public String getPriceValue()
    {
        return _priceValue;
    }

    public String getSku()
    {
        return _sku;
    }

    public String getType()
    {
        return _type;
    }

    public void setDescription(String s)
    {
        _description = s;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setInStock(boolean flag)
    {
        _inStock = flag;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setPriceCurrency(String s)
    {
        _priceCurrency = s;
    }

    public void setPriceValue(String s)
    {
        _priceValue = s;
    }

    public void setSku(String s)
    {
        _sku = s;
    }

    public void setType(String s)
    {
        _type = s;
    }
}
