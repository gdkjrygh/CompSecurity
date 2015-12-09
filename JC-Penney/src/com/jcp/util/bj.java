// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import com.jcp.model.CartItemsDetails;
import com.jcp.model.trackorder.Price;
import com.jcp.productentity.PriceEntity;
import com.jcp.productentity.ProductEntityContainer;
import java.util.Iterator;
import java.util.List;

public final class bj
{

    public static String a(CartItemsDetails cartitemsdetails)
    {
        if (cartitemsdetails != null)
        {
            Price aprice[] = cartitemsdetails.getPrices();
            if (aprice != null && aprice.length > 0)
            {
                int j = aprice.length;
                int i = 0;
                Price price = null;
                cartitemsdetails = null;
                while (i < j) 
                {
                    Price price1 = aprice[i];
                    double d = price1.getAmount();
                    if (cartitemsdetails == null)
                    {
                        cartitemsdetails = Double.valueOf(d);
                        price = price1;
                    } else
                    if (d < cartitemsdetails.doubleValue())
                    {
                        cartitemsdetails = Double.valueOf(d);
                        price = price1;
                    }
                    i++;
                }
                if (price != null)
                {
                    return price.getType();
                }
            }
        }
        return null;
    }

    public static String a(ProductEntityContainer productentitycontainer)
    {
        Object obj;
        Object obj3;
        obj3 = null;
        obj = obj3;
        if (productentitycontainer == null) goto _L2; else goto _L1
_L1:
        productentitycontainer = productentitycontainer.getPrices();
        obj = obj3;
        if (productentitycontainer == null) goto _L2; else goto _L3
_L3:
        obj = obj3;
        if (productentitycontainer.isEmpty()) goto _L2; else goto _L4
_L4:
        Iterator iterator;
        iterator = productentitycontainer.iterator();
        productentitycontainer = null;
        obj = null;
_L6:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = (PriceEntity)iterator.next();
        double d = ((PriceEntity) (obj1)).getMin();
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        if (obj == null)
        {
            productentitycontainer = Double.valueOf(d);
            obj = obj1;
        } else
        {
            if (d >= ((Double) (obj)).doubleValue())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            productentitycontainer = Double.valueOf(d);
            obj = obj1;
        }
_L7:
        obj1 = productentitycontainer;
        productentitycontainer = ((ProductEntityContainer) (obj));
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
        obj = obj3;
        if (productentitycontainer != null)
        {
            obj = productentitycontainer.getType();
        }
_L2:
        return ((String) (obj));
        Object obj2 = obj;
        obj = productentitycontainer;
        productentitycontainer = ((ProductEntityContainer) (obj2));
          goto _L7
    }
}
