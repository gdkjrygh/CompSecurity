// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreePaymentActivity

class this._cls1
    implements Runnable
{

    final AddPaymentMethodView this$1;

    public void run()
    {
        BraintreePaymentActivity.access$202(_fld0, true);
        initAddPaymentMethodView();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/braintreepayments/api/dropin/BraintreePaymentActivity$2

/* anonymous class */
    class BraintreePaymentActivity._cls2
        implements Runnable
    {

        final BraintreePaymentActivity this$0;

        public void run()
        {
            if (!BraintreePaymentActivity.access$100(BraintreePaymentActivity.this).get())
            {
                runOnUiThread(new BraintreePaymentActivity._cls2._cls1());
            }
        }

            
            {
                this$0 = BraintreePaymentActivity.this;
                super();
            }
    }

}
