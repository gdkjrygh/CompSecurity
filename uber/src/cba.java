// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalService;

public final class cba
    implements android.content.DialogInterface.OnClickListener
{

    private PayPalFuturePaymentActivity a;

    public cba(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
    {
        a = paypalfuturepaymentactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PayPalFuturePaymentActivity.b(a).a(PayPalFuturePaymentActivity.a(a), true);
    }
}
