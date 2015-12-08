// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            ProductStatus, ProductDetails

final class 
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

    ()
    {
    }
}
