// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            PurchaseStatus, PaymentOperations

class this._cls0
    implements f
{

    final PaymentOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((PurchaseStatus)obj);
    }

    public b call(PurchaseStatus purchasestatus)
    {
        if (purchasestatus.isPending())
        {
            return PaymentOperations.access$300(PaymentOperations.this);
        } else
        {
            return b.just(PurchaseStatus.UPDATE_FAIL);
        }
    }

    _cls9()
    {
        this$0 = PaymentOperations.this;
        super();
    }
}
