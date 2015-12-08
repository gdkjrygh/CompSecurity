// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

final class cwq extends BroadcastReceiver
{

    private cwp a;

    cwq(cwp cwp1)
    {
        a = cwp1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        c.a(cwp.a(a), "mBatteryAndScrenCallback", null);
        context = intent.getAction();
        if (cwp.f().matchAction(context))
        {
            cwp.a(a).run();
        }
    }
}
