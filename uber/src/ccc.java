// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;
import com.paypal.android.sdk.payments.PaymentMethodActivity;
import java.util.TimerTask;

public final class ccc extends TimerTask
{

    private PaymentMethodActivity a;

    public ccc(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void run()
    {
        a.removeDialog(3);
        PaymentConfirmActivity.a(a, cbw.a, PaymentMethodActivity.g(a).d());
    }
}
