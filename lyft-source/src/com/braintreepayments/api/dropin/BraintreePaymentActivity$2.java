// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreePaymentActivity

class this._cls0
    implements Runnable
{

    final BraintreePaymentActivity this$0;

    public void run()
    {
        if (!BraintreePaymentActivity.access$100(BraintreePaymentActivity.this).get())
        {
            runOnUiThread(new Runnable() {

                final BraintreePaymentActivity._cls2 this$1;

                public void run()
                {
                    BraintreePaymentActivity.access$202(this$0, true);
                    initAddPaymentMethodView();
                }

            
            {
                this$1 = BraintreePaymentActivity._cls2.this;
                super();
            }
            });
        }
    }

    _cls1.this._cls1()
    {
        this$0 = BraintreePaymentActivity.this;
        super();
    }
}
