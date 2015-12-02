// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.bA;

public final class cag
{

    private Intent a;

    public cag(Intent intent)
    {
        a = intent;
    }

    public final PayPalPayment a()
    {
        return (PayPalPayment)a.getParcelableExtra("com.paypal.android.sdk.payment");
    }

    public final bA b()
    {
        return (bA)a.getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO");
    }
}
