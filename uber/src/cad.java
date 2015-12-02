// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PaymentActivity;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public final class cad
    implements bzv
{

    final PaymentActivity a;

    public cad(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public final void a()
    {
        Date date = Calendar.getInstance().getTime();
        if (PaymentActivity.d(a).compareTo(date) > 0)
        {
            long l = PaymentActivity.d(a).getTime() - date.getTime();
            PaymentActivity.a();
            (new StringBuilder("Delaying ")).append(l).append(" miliseconds so user doesn't see flicker.");
            PaymentActivity.a(a, new Timer());
            PaymentActivity.f(a).schedule(new cae(this), l);
            return;
        } else
        {
            PaymentActivity.e(a);
            return;
        }
    }

    public final void a(bzw bzw)
    {
        ccm.a(a, bzw);
    }
}
