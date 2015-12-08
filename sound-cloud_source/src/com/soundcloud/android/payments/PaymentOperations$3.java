// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import com.soundcloud.android.payments.googleplay.SubscriptionStatus;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.payments:
//            PaymentOperations, TokenStorage, PurchaseStatus

class this._cls0
    implements f
{

    final PaymentOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((SubscriptionStatus)obj);
    }

    public b call(SubscriptionStatus subscriptionstatus)
    {
        if (subscriptionstatus.isSubscribed())
        {
            PaymentOperations.access$000(PaymentOperations.this).setCheckoutToken(subscriptionstatus.getToken());
            return verify(subscriptionstatus.getPayload());
        } else
        {
            return b.just(PurchaseStatus.NONE);
        }
    }

    ionStatus()
    {
        this$0 = PaymentOperations.this;
        super();
    }
}
