// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            ProductDetails

final class ProductStatus
{

    public static final f SUCCESS = new _cls1();
    private final ProductDetails details;

    private ProductStatus(ProductDetails productdetails)
    {
        details = productdetails;
    }

    static ProductStatus fromNoProduct()
    {
        return new ProductStatus(null);
    }

    static ProductStatus fromSuccess(ProductDetails productdetails)
    {
        return new ProductStatus(productdetails);
    }

    public final ProductDetails getDetails()
    {
        return details;
    }

    public final boolean isSuccess()
    {
        return details != null;
    }


    private class _cls1
        implements f
    {

        public final ProductStatus call(ProductDetails productdetails)
        {
            return ProductStatus.fromSuccess(productdetails);
        }

        public final volatile Object call(Object obj)
        {
            return call((ProductDetails)obj);
        }

        _cls1()
        {
        }
    }

}
