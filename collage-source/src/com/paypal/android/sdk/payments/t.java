// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.paypal.android.sdk.payments:
//            LoginActivity, ai, u, PayPalService

final class t
    implements ServiceConnection
{

    final LoginActivity a;

    t(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(com/paypal/android/sdk/payments/LoginActivity.getSimpleName()).append(".onServiceConnected");
        LoginActivity.a(a, ((ai)ibinder).a);
        if (LoginActivity.f(a).a(new u(this)))
        {
            a.a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        LoginActivity.a(a, null);
    }
}
