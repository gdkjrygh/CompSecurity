// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.paypal.PayPalChargeData;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService

class val.userId
    implements Func1
{

    final PaymentService this$0;
    final String val$userId;

    public volatile Object call(Object obj)
    {
        return call((PayPalChargeData)obj);
    }

    public Observable call(PayPalChargeData paypalchargedata)
    {
        String s = paypalchargedata.getNonce();
        paypalchargedata = paypalchargedata.getDeviceData();
        return PaymentService.access$200(PaymentService.this).createPayPalChargeAccount(val$userId, s, paypalchargedata);
    }

    ()
    {
        this$0 = final_paymentservice;
        val$userId = String.this;
        super();
    }
}
