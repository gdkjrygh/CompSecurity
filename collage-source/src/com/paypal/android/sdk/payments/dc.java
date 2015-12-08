// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentMethodActivity, ai, dd, PayPalService

final class dc
    implements ServiceConnection
{

    final PaymentMethodActivity a;

    dc(PaymentMethodActivity paymentmethodactivity)
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
            PaymentMethodActivity.a(a, ((ai)ibinder).a);
            if (PaymentMethodActivity.g(a).a(new dd(this)))
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
