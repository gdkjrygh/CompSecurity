// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalPayment, bA

final class aw
{

    private Intent a;

    aw(Intent intent)
    {
        a = intent;
    }

    final PayPalPayment a()
    {
        return (PayPalPayment)a.getParcelableExtra("com.paypal.android.sdk.payment");
    }

    public final bA b()
    {
        return (bA)a.getParcelableExtra("com.paypal.android.sdk.payments.PaymentConfirmActivity.EXTRA_PAYMENT_INFO");
    }
}
