// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalService

final class aw extends BroadcastReceiver
{

    private PayPalService a;

    aw(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        PayPalService.v();
        (new StringBuilder("received broadcast: ")).append(intent.getAction());
        if (intent.getAction().equals("com.paypal.android.sdk.clearAllUserData"))
        {
            a.h();
        }
    }
}
