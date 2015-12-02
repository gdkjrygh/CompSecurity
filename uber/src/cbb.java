// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.paypal.android.sdk.payments.PayPalFuturePaymentActivity;
import com.paypal.android.sdk.payments.PayPalService;

public final class cbb
    implements ServiceConnection
{

    final PayPalFuturePaymentActivity a;

    public cbb(PayPalFuturePaymentActivity paypalfuturepaymentactivity)
    {
        a = paypalfuturepaymentactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(PayPalFuturePaymentActivity.a()).append(".onServiceConnected");
        if (a.isFinishing())
        {
            (new StringBuilder()).append(PayPalFuturePaymentActivity.a()).append(".onServiceConnected exit - isFinishing");
        } else
        {
            PayPalFuturePaymentActivity.a(a, ((bzu)ibinder).a);
            if (PayPalFuturePaymentActivity.b(a).a(new cbc(this)))
            {
                PayPalFuturePaymentActivity.c(a);
                return;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        PayPalFuturePaymentActivity.a(a, null);
        PayPalFuturePaymentActivity.a();
    }
}
