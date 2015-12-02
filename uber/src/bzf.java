// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.paypal.android.sdk.payments.LoginActivity;
import com.paypal.android.sdk.payments.PayPalService;

public final class bzf
    implements ServiceConnection
{

    final LoginActivity a;

    public bzf(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(com/paypal/android/sdk/payments/LoginActivity.getSimpleName()).append(".onServiceConnected");
        LoginActivity.a(a, ((bzu)ibinder).a);
        if (LoginActivity.l(a).a(new bzg(this)))
        {
            a.a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        LoginActivity.a(a, null);
    }
}
