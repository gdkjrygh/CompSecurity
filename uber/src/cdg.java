// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.paypal.android.sdk.payments.PayPalService;

final class cdg
    implements ServiceConnection
{

    final ccy a;

    cdg(ccy ccy1)
    {
        a = ccy1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        (new StringBuilder()).append(ccy.b()).append(".onServiceConnected");
        a.a = ((bzu)ibinder).a;
        if (a.a.a(new cdh(this)))
        {
            ccy.d(a);
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.a = null;
    }
}
