// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import com.braintreepayments.api.models.PaymentMethod;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreePaymentActivity

class a
    implements Runnable
{

    final PaymentMethod a;
    final BraintreePaymentActivity b;

    public void run()
    {
    /* block-local class not found */
    class _cls1 {}

        b.runOnUiThread(new _cls1());
    }

    _cls1(BraintreePaymentActivity braintreepaymentactivity, PaymentMethod paymentmethod)
    {
        b = braintreepaymentactivity;
        a = paymentmethod;
        super();
    }
}
