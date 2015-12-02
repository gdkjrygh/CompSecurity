// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentConfirmActivity;

public final class can
    implements ServiceConnection
{

    final PaymentConfirmActivity a;

    public can(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(PaymentConfirmActivity.a()).append(".onServiceConnected");
        PaymentConfirmActivity.a(a, ((bzu)ibinder).a);
        if (PaymentConfirmActivity.c(a).a(new cbm(this)))
        {
            PaymentConfirmActivity.b(a);
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        PaymentConfirmActivity.a(a, null);
    }
}
