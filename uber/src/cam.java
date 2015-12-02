// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;

public final class cam
    implements android.view.View.OnClickListener
{

    private PaymentConfirmActivity a;

    public cam(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void onClick(View view)
    {
        a.onBackPressed();
    }
}
