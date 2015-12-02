// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.paypal.android.sdk.payments.PayPalService;

public final class bzr extends BroadcastReceiver
{

    private PayPalService a;

    public bzr(PayPalService paypalservice)
    {
        a = paypalservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.paypal.android.sdk.clearAllUserData"))
        {
            a.g();
            Log.w("paypal.sdk", "active service user data cleared");
        }
    }
}
