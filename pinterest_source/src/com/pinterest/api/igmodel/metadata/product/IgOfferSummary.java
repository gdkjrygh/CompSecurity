// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.metadata.product.OfferSummary;
import com.pinterest.network.json.PinterestJsonObject;

public class IgOfferSummary
    implements IgModel
{

    public Boolean a;
    public String b;
    public String c;
    public String d;

    public IgOfferSummary()
    {
    }

    public final OfferSummary a()
    {
        OfferSummary offersummary = new OfferSummary();
        offersummary.setInStock(a);
        offersummary.setPrice(b);
        offersummary.setMaxPrice(c);
        offersummary.setMinPrice(d);
        return offersummary;
    }

    public final PinterestJsonObject b()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        pinterestjsonobject.b("in_stock", a);
        pinterestjsonobject.b("price", b);
        pinterestjsonobject.b("max_price", c);
        pinterestjsonobject.b("min_price", d);
        return pinterestjsonobject;
    }

    public Object getModel()
    {
        return a();
    }
}
