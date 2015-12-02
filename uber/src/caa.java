// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentActivity;

public final class caa
    implements android.content.DialogInterface.OnClickListener
{

    private PaymentActivity a;

    public caa(PaymentActivity paymentactivity)
    {
        a = paymentactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PaymentActivity.b(a).a(PaymentActivity.a(a), true);
    }
}
