// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.view.View;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentMethodActivity

final class cy
    implements android.view.View.OnClickListener
{

    private PaymentMethodActivity a;

    cy(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void onClick(View view)
    {
        PaymentMethodActivity.c(a);
    }
}
