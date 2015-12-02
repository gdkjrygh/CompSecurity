// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.paypal.android.sdk.payments.PayPalConfiguration;
import com.paypal.android.sdk.payments.PayPalPayment;
import com.paypal.android.sdk.payments.PaymentActivity;

public final class caf extends byp
{

    public caf(Intent intent, PayPalConfiguration paypalconfiguration)
    {
        super(intent, paypalconfiguration);
    }

    protected final String a()
    {
        return com/paypal/android/sdk/payments/PaymentActivity.getSimpleName();
    }

    public final boolean e()
    {
        cag cag1 = new cag(b());
        boolean flag;
        if (cag1.a() != null && cag1.a().a())
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
