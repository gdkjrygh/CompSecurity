// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.BuyableProduct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, IgProductLayout, IgVariations, IgProductVariant

public class IgBuyableProduct
    implements IgModel
{

    public IgProductLayout A;
    public List B;
    public IgVariations C;
    public String a;
    public String b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public Integer g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public Boolean p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public IgBuyableProduct()
    {
    }

    public final BuyableProduct a()
    {
        BuyableProduct buyableproduct = new BuyableProduct();
        buyableproduct.setUid(a);
        buyableproduct.setDisplayActiveMinPrice(b);
        buyableproduct.setDisplayActiveMaxPrice(v);
        buyableproduct.setHasSwatches(c);
        buyableproduct.setCurrency(d);
        buyableproduct.setFaviconLink(e);
        buyableproduct.setTitle(f);
        buyableproduct.setAvailability(g);
        buyableproduct.setMinPrice(h);
        buyableproduct.setCanonicalMerchantDomain(i);
        buyableproduct.setShortDescription(j);
        buyableproduct.setSalePrice(k);
        buyableproduct.setMerchantName(l);
        buyableproduct.setDescription(m);
        buyableproduct.setDisplayPrice(n);
        buyableproduct.setPrice(o);
        buyableproduct.setIsAvailable(p);
        buyableproduct.setMerchantId(q);
        buyableproduct.setDisplaySalePrice(r);
        buyableproduct.setDisplayMaxPrice(s);
        buyableproduct.setDisplayMinPrice(t);
        buyableproduct.setActiveMinPrice(u);
        buyableproduct.setActiveMaxPrice(w);
        buyableproduct.setLink(x);
        buyableproduct.setMaxPrice(y);
        buyableproduct.setMerchantItemGroupId(z);
        if (A != null)
        {
            buyableproduct.setLayout(A.a());
        }
        if (C != null)
        {
            HashMap hashmap = new HashMap();
            if (C.a != null)
            {
                hashmap.put("colors", C.a);
            }
            if (C.b != null)
            {
                hashmap.put("sizes", C.b);
            }
            buyableproduct.setVariations(hashmap);
        }
        if (B != null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = B.iterator(); iterator.hasNext(); arraylist.add(((IgProductVariant)iterator.next()).a())) { }
            buyableproduct.setVariants(arraylist);
        }
        return buyableproduct;
    }

    public Object getModel()
    {
        return a();
    }
}
