// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.paypal.android.sdk.payments.PaymentMethodActivity;

public final class cbz
    implements android.view.View.OnClickListener
{

    private PaymentMethodActivity a;

    public cbz(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void onClick(View view)
    {
        PaymentMethodActivity.b(a);
    }
}
