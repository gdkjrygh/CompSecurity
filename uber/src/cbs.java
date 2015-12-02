// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;

public final class cbs
    implements android.content.DialogInterface.OnClickListener
{

    private PaymentConfirmActivity a;

    public cbs(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        PaymentConfirmActivity.j(a);
    }
}
