// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.Calendar;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalProfileSharingActivity, az, PayPalService, av

final class as
    implements ServiceConnection
{

    private PayPalProfileSharingActivity a;

    as(PayPalProfileSharingActivity paypalprofilesharingactivity)
    {
        a = paypalprofilesharingactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalProfileSharingActivity.getSimpleName()).append(".onServiceConnected");
        if (a.isFinishing())
        {
            (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalProfileSharingActivity.getSimpleName()).append(".onServiceConnected exit - isFinishing");
            return;
        }
        PayPalProfileSharingActivity.a(a, ((az)ibinder).a);
        if (PayPalProfileSharingActivity.b(a).e() == null)
        {
            Log.e(PayPalProfileSharingActivity.a(), "Service state invalid.  Did you start the PayPalService?");
            a.setResult(2);
            a.finish();
            return;
        }
        componentname = new av(a.getIntent(), PayPalProfileSharingActivity.b(a).e(), true);
        if (!componentname.d())
        {
            Log.e(PayPalProfileSharingActivity.a(), "Service extras invalid.  Please see the docs.");
            a.setResult(2);
            a.finish();
            return;
        }
        if (!componentname.e())
        {
            Log.e(PayPalProfileSharingActivity.a(), "Extras invalid.  Please see the docs.");
            a.setResult(2);
            a.finish();
            return;
        }
        if (PayPalProfileSharingActivity.b(a).j())
        {
            PayPalProfileSharingActivity.c(a);
            return;
        } else
        {
            componentname = Calendar.getInstance();
            componentname.add(13, 1);
            PayPalProfileSharingActivity.a(a, componentname.getTime());
            PayPalProfileSharingActivity.b(a).a(PayPalProfileSharingActivity.a(a), false);
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        PayPalProfileSharingActivity.a(a, null);
        PayPalProfileSharingActivity.a();
    }
}
