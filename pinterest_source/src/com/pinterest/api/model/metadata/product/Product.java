// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.product;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinMetadata;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model.metadata.product:
//            OfferSummary, Offer

public class Product extends PinMetadata
{

    private String _brand;
    private final String _bullet;
    private PinterestJsonArray _category;
    private String _description;
    private String _id;
    private String _metadataDisplay;
    private String _name;
    private OfferSummary _offerSummary;
    private List _offers;
    private String _productId;
    private String _type;

    public Product()
    {
        super(null, null);
        _bullet = " &#8226; ";
        _category = new PinterestJsonArray();
        _offers = new ArrayList();
    }

    public Product(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        super(pin, pinterestjsonobject);
        _bullet = " &#8226; ";
        _category = new PinterestJsonArray();
        _offers = new ArrayList();
        if (pinterestjsonobject == null)
        {
            return;
        }
        PinterestJsonArray pinterestjsonarray = pinterestjsonobject.e("products_history");
        Object obj;
        obj = null;
        pin = obj;
        if (pinterestjsonarray.a() <= 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        pinterestjsonarray = pinterestjsonarray.d(0).d("products");
        pin = obj;
        if (pinterestjsonarray == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        pin = (new OfferSummary(pinterestjsonarray.d(0).c("offer_summary"))).getPrice();
        pinterestjsonobject = pinterestjsonobject.e("products").d(0);
        _brand = pinterestjsonobject.a("brand", "");
        _category = pinterestjsonobject.e("category");
        _description = pinterestjsonobject.a("description", "");
        _id = pinterestjsonobject.a("id", "");
        _name = pinterestjsonobject.a("name", "");
        _offerSummary = new OfferSummary(pinterestjsonobject.c("offer_summary"), pin);
        _offers = Offer.getOffers(pinterestjsonobject.e("offers"));
        _productId = pinterestjsonobject.a("product_id", "");
        _type = pinterestjsonobject.a("type", "");
_L2:
        generateCacheContent();
        return;
        pin;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String makeMetadataDisplay()
    {
        if (ModelHelper.isValid(_offerSummary) && ModelHelper.isValid(_offerSummary.getOfferDisplay()))
        {
            return _offerSummary.getOfferDisplay();
        } else
        {
            return "";
        }
    }

    public void generateCacheContent()
    {
        _metadataDisplay = makeMetadataDisplay();
    }

    public String getBrand()
    {
        return _brand;
    }

    public PinterestJsonArray getCategory()
    {
        return _category;
    }

    public String getDescription()
    {
        return _description;
    }

    public String getId()
    {
        return _id;
    }

    public Spanned getMetadataDisplay()
    {
        return Html.fromHtml(_metadataDisplay);
    }

    public String getName()
    {
        return _name;
    }

    public OfferSummary getOfferSummary()
    {
        return _offerSummary;
    }

    public List getOffers()
    {
        return _offers;
    }

    public String getProductId()
    {
        return _productId;
    }

    public String getType()
    {
        return _type;
    }

    public boolean isInStock()
    {
        return _offerSummary != null && _offerSummary.getInStock();
    }

    public void setBrand(String s)
    {
        _brand = s;
    }

    public void setCategory(PinterestJsonArray pinterestjsonarray)
    {
        _category = pinterestjsonarray;
    }

    public void setDescription(String s)
    {
        _description = s;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setOfferSummary(OfferSummary offersummary)
    {
        _offerSummary = offersummary;
    }

    public void setOffers(List list)
    {
        _offers = list;
    }

    public void setProductId(String s)
    {
        _productId = s;
    }

    public void setType(String s)
    {
        _type = s;
    }
}
