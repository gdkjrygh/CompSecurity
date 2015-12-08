// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.DialogInterface;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalFuturePaymentActivity, PayPalService

final class aj
    implements android.content.DialogInterface.OnClickListener
{

    private PayPalFuturePaymentActivity a;

    aj(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
    {
        a = paypalfuturepaymentactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PayPalFuturePaymentActivity.b(a).a(PayPalFuturePaymentActivity.a(a), true);
    }
}
