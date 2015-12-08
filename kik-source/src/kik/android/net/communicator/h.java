// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

// Referenced classes of package kik.android.net.communicator:
//            CommunicatorService

final class h extends BroadcastReceiver
{

    final CommunicatorService a;

    h(CommunicatorService communicatorservice)
    {
        a = communicatorservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        boolean flag;
        if (context != null && context.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((new StringBuilder("Connectivity changed: info= ")).append(context).toString() != null)
        {
            context.toString();
        }
        if (flag)
        {
            CommunicatorService.a(a, 1L, true, "Connectivity change");
            return;
        }
        try
        {
            CommunicatorService.e(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
