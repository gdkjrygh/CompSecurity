// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class ewd extends BroadcastReceiver
{

    private final ewe a;

    public ewd(ewe ewe1)
    {
        a = ewe1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if (context != null && context.isConnected() && context.getType() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.a(flag);
    }
}
