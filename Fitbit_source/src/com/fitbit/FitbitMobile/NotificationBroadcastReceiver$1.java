// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.FitbitMobile;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

// Referenced classes of package com.fitbit.FitbitMobile:
//            NotificationBroadcastReceiver

class a extends ResultReceiver
{

    final boolean a[];
    final NotificationBroadcastReceiver b;

    protected void onReceiveResult(int i, Bundle bundle)
    {
        a[0] = true;
    }

    (NotificationBroadcastReceiver notificationbroadcastreceiver, Handler handler, boolean aflag[])
    {
        b = notificationbroadcastreceiver;
        a = aflag;
        super(handler);
    }
}
