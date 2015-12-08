// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.pinterest.api.igmodel.metadata.IgMetadata;
import com.pinterest.api.model.metadata.product.Product;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            IgOfferSummary

public class IgProduct extends IgMetadata
{

    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public IgOfferSummary n;

    public IgProduct()
    {
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = super.a();
        pinterestjsonobject.b("id", j);
        pinterestjsonobject.b("type", m);
        pinterestjsonobject.b("name", k);
        pinterestjsonobject.b("description", i);
        pinterestjsonobject.b("brand", h);
        pinterestjsonobject.b("product_id", l);
        if (n != null)
        {
            pinterestjsonobject.a("offer_summary", n.b());
        }
        return pinterestjsonobject;
    }

    public final Product b()
    {
        Product product = new Product();
        a(product);
        product.setBrand(h);
        product.setDescription(i);
        product.setId(j);
        product.setName(k);
        if (n != null)
        {
            product.setOfferSummary(n.a());
        }
        product.setProductId(l);
        product.setType(m);
        product.generateCacheContent();
        return product;
    }

    public Object getModel()
    {
        return b();
    }
}
