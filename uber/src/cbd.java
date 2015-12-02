// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public final class cbd
    implements bzv
{

    final PayPalFuturePaymentActivity a;

    public cbd(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
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
            PayPalFuturePaymentActivity.f(a).schedule(new cbe(this), l);
            return;
        } else
        {
            PayPalFuturePaymentActivity.e(a);
            return;
        }
    }

    public final void a(bzw bzw)
    {
        ccm.a(a, bzw);
    }
}
