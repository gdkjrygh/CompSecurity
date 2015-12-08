// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.pinterest.api.model.metadata.product.OfferSummary;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            HistoryProduct, IgOfferSummary

public class IgProductHistory
{

    public List a;

    public IgProductHistory()
    {
    }

    public final String a()
    {
        if (a != null && a.size() > 0 && ((HistoryProduct)a.get(0)).a != null)
        {
            return ((HistoryProduct)a.get(0)).a.a().getOldPrice();
        } else
        {
            return null;
        }
    }

    public final PinterestJsonObject b()
    {
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject();
        if (a != null)
        {
            PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
            PinterestJsonObject pinterestjsonobject1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); pinterestjsonarray.a(pinterestjsonobject1))
            {
                HistoryProduct historyproduct = (HistoryProduct)iterator.next();
                pinterestjsonobject1 = new PinterestJsonObject();
                if (historyproduct.a != null)
                {
                    pinterestjsonobject1.a("offer_summary", historyproduct.a.b());
                }
            }

            pinterestjsonobject.a("products", pinterestjsonarray);
        }
        return pinterestjsonobject;
    }
}
