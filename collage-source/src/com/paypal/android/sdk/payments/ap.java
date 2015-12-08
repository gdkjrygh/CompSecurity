// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.DialogInterface;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentActivity, PayPalService

final class ap
    implements android.content.DialogInterface.OnClickListener
{

    private PaymentActivity a;

    ap(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PaymentActivity.b(a).a(PaymentActivity.a(a), true);
    }
}
