// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import java.util.TimerTask;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentMethodActivity, cu, PayPalService, PaymentConfirmActivity

final class bq extends TimerTask
{

    private PaymentMethodActivity a;

    bq(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void run()
    {
        a.removeDialog(3);
        PaymentConfirmActivity.a(a, 2, cu.a, null, PaymentMethodActivity.g(a).d());
    }
}
