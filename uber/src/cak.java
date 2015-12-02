// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PaymentConfirmActivity;

public final class cak
    implements bzv
{

    private PaymentConfirmActivity a;

    public cak(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void a()
    {
        PaymentConfirmActivity.a();
        PaymentConfirmActivity.l(a);
    }

    public final void a(bzw bzw1)
    {
        PaymentConfirmActivity.f(a);
        ccm.a(a, bux.a(bzw1.b), 1);
        if (PaymentConfirmActivity.g(a) != cbw.a)
        {
            PaymentConfirmActivity.i(a).b(true);
        }
    }
}
