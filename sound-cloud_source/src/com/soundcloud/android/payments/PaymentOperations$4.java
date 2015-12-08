// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            ProductStatus, PaymentOperations

class this._cls0
    implements f
{

    final PaymentOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((oduct)obj);
    }

    public b call(oduct oduct)
    {
        if (oduct.isEmpty())
        {
            return b.just(ProductStatus.fromNoProduct());
        } else
        {
            return PaymentOperations.access$100(PaymentOperations.this, oduct.id).map(ProductStatus.SUCCESS);
        }
    }

    oduct()
    {
        this$0 = PaymentOperations.this;
        super();
    }
}
