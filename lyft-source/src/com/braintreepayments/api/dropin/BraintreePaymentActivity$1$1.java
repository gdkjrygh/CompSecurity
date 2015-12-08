// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import com.braintreepayments.api.models.PaymentMethod;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreePaymentActivity

class this._cls1
    implements Runnable
{

    final l.paymentMethod this$1;

    public void run()
    {
        finalizeSelection(paymentMethod);
    }

    l.paymentMethod()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/braintreepayments/api/dropin/BraintreePaymentActivity$1

/* anonymous class */
    class BraintreePaymentActivity._cls1
        implements Runnable
    {

        final BraintreePaymentActivity this$0;
        final PaymentMethod val$paymentMethod;

        public void run()
        {
            runOnUiThread(new BraintreePaymentActivity._cls1._cls1());
        }

            
            {
                this$0 = final_braintreepaymentactivity;
                paymentMethod = PaymentMethod.this;
                super();
            }
    }

}
