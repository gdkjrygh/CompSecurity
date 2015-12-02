// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.paypal.android.sdk.payments.PayPalService;
import com.paypal.android.sdk.payments.PaymentMethodActivity;

public final class ccf
    implements ServiceConnection
{

    final PaymentMethodActivity a;

    public ccf(PaymentMethodActivity paymentmethodactivity)
    {
        a = paymentmethodactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(PaymentMethodActivity.a()).append(".onServiceConnected");
        if (a.isFinishing())
        {
            (new StringBuilder()).append(PaymentMethodActivity.a()).append(".onServiceConnected exit - isFinishing");
        } else
        {
            PaymentMethodActivity.a(a, ((bzu)ibinder).a);
            if (PaymentMethodActivity.g(a).a(new ccg(this)))
            {
                PaymentMethodActivity.i(a);
                return;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        PaymentMethodActivity.a(a, null);
    }
}
