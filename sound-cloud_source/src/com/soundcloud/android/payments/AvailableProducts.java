// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import java.util.List;
import rx.b.f;

class AvailableProducts
{
    public static class Product
    {

        private static final String EMPTY = "unavailable";
        public final String id;
        public final String planId;

        public static Product empty()
        {
            return new Product("unavailable", "unavailable");
        }

        public boolean isEmpty()
        {
            return id.equals("unavailable");
        }

        public Product(String s, String s1)
        {
            id = s;
            planId = s1;
        }
    }


    private static final String MID_TIER = "mid_tier";
    public static final f TO_PRODUCT = new _cls1();
    public final List products;

    public AvailableProducts(List list)
    {
        products = list;
    }


    private class _cls1
        implements f
    {

        public final Product call(AvailableProducts availableproducts)
        {
            for (availableproducts = availableproducts.products.iterator(); availableproducts.hasNext();)
            {
                Product product = (Product)availableproducts.next();
                if (product.planId.equals("mid_tier"))
                {
                    return product;
                }
            }

            return Product.empty();
        }

        public final volatile Object call(Object obj)
        {
            return call((AvailableProducts)obj);
        }

        _cls1()
        {
        }
    }

}
