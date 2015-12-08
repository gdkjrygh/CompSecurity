// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.Intent;

// Referenced classes of package com.paypal.android.sdk.payments:
//            d, PaymentActivity, aw, PayPalPayment, 
//            PayPalConfiguration

final class av extends d
{

    av(Intent intent, PayPalConfiguration paypalconfiguration)
    {
        super(intent, paypalconfiguration);
    }

    protected final String a()
    {
        return com/paypal/android/sdk/payments/PaymentActivity.getSimpleName();
    }

    final boolean e()
    {
        aw aw1 = new aw(b());
        boolean flag;
        if (aw1.a() != null && aw1.a().a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, "PaymentActivity.EXTRA_PAYMENT");
        return flag;
    }
}
