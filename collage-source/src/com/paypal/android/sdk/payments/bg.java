// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PaymentConfirmActivity, ai, ck, PayPalService

final class bg
    implements ServiceConnection
{

    final PaymentConfirmActivity a;

    bg(PaymentConfirmActivity paymentconfirmactivity)
    {
        a = paymentconfirmactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(PaymentConfirmActivity.a()).append(".onServiceConnected");
        PaymentConfirmActivity.a(a, ((ai)ibinder).a);
        if (PaymentConfirmActivity.c(a).a(new ck(this)))
        {
            PaymentConfirmActivity.b(a);
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        PaymentConfirmActivity.a(a, null);
    }
}
