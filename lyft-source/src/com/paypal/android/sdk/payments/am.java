// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            aA, PayPalFuturePaymentActivity, an, d, 
//            aB

final class am
    implements aA
{

    final PayPalFuturePaymentActivity a;

    am(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
    {
        a = paypalfuturepaymentactivity;
        super();
    }

    public final void a()
    {
        Date date = Calendar.getInstance().getTime();
        if (PayPalFuturePaymentActivity.d(a).compareTo(date) > 0)
        {
            long l = PayPalFuturePaymentActivity.d(a).getTime() - date.getTime();
            PayPalFuturePaymentActivity.a();
            (new StringBuilder("Delaying ")).append(l).append(" milliseconds so user doesn't see flicker.");
            PayPalFuturePaymentActivity.a(a, new Timer());
            PayPalFuturePaymentActivity.f(a).schedule(new an(this), l);
            return;
        } else
        {
            PayPalFuturePaymentActivity.e(a);
            return;
        }
    }

    public final void a(aB ab)
    {
        d.a(a, ab, 1, 2, 3);
    }
}
