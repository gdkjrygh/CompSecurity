// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.stripe.IStripeService;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class this._cls0
    implements Func1
{

    final PaymentService this$0;

    public volatile Object call(Object obj)
    {
        return call((ICard)obj);
    }

    public Observable call(ICard icard)
    {
        return PaymentService.access$400(PaymentService.this).createCardToken(icard);
    }

    ()
    {
        this$0 = PaymentService.this;
        super();
    }
}
