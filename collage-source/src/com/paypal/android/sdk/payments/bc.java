// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import com.paypal.android.sdk.ek;
import com.paypal.android.sdk.eu;

// Referenced classes of package com.paypal.android.sdk.payments:
//            ak, PaymentConfirmActivity, al, di, 
//            cu

final class bc
    implements ak
{

    private PaymentConfirmActivity a;

    bc(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void a()
    {
        PaymentConfirmActivity.a();
        PaymentConfirmActivity.k(a);
    }

    public final void a(al al1)
    {
        PaymentConfirmActivity.f(a);
        di.a(a, ek.a(al1.b), 1);
        if (PaymentConfirmActivity.g(a) != cu.a)
        {
            PaymentConfirmActivity.i(a).b(true);
        }
    }
}
