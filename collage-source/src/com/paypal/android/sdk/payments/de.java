// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.AsyncTask;
import io.card.payment.CardIOActivity;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentMethodActivity, bw

final class de extends AsyncTask
{

    final PaymentMethodActivity a;

    private de(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    de(PaymentMethodActivity paymentmethodactivity, byte byte0)
    {
        this(paymentmethodactivity);
    }

    protected final Object doInBackground(Object aobj[])
    {
        long l = System.currentTimeMillis();
        PaymentMethodActivity.a();
        PaymentMethodActivity.a(a, CardIOActivity.a());
        PaymentMethodActivity.a();
        (new StringBuilder("cameraAvailable:")).append(PaymentMethodActivity.e(a)).append(" time elapsed = ").append(Long.toString(System.currentTimeMillis() - l));
        a.runOnUiThread(new bw(this));
        return null;
    }
}
