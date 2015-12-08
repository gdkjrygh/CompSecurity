// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p.cw.c;
import p.dd.y;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            NetworkUtil, l

public class a extends BroadcastReceiver
{

    final NetworkUtil a;

    public void onReceive(Context context, Intent intent)
    {
        context = ((ConnectivityManager)com.pandora.radio.util.l.a(context, "connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (!context.isConnected())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        boolean flag = true;
_L1:
        try
        {
            if (com.pandora.radio.util.NetworkUtil.a(a) != flag)
            {
                com.pandora.radio.util.NetworkUtil.a(a, flag);
                NetworkUtil.b(a).a(new y(flag));
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.c("NetworkUtil", "ConnectionChangeReceiver", context);
        }
        break MISSING_BLOCK_LABEL_79;
        flag = false;
          goto _L1
    }

    public A(NetworkUtil networkutil)
    {
        a = networkutil;
        super();
    }
}
