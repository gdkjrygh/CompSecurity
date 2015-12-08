// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ak, PaymentActivity, aQ, di, 
//            al

final class au
    implements ak
{

    final PaymentActivity a;

    au(PaymentActivity paymentactivity)
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
            PaymentActivity.f(a).schedule(new aQ(this), l);
            return;
        } else
        {
            PaymentActivity.e(a);
            return;
        }
    }

    public final void a(al al)
    {
        di.a(a, al, 1, 2, 3);
    }
}
