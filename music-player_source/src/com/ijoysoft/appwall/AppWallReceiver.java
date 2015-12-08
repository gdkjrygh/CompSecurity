// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.ijoysoft.appwall:
//            c

public class AppWallReceiver extends BroadcastReceiver
{

    private c a;

    public AppWallReceiver(c c1)
    {
        a = c1;
    }

    public final void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("popularize.newnum");
        intentfilter.addAction("popularize.newnum2");
        context.registerReceiver(this, intentfilter);
    }

    public final void b(Context context)
    {
        context.unregisterReceiver(this);
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            context = null;
            if ("popularize.newnum".equals(intent.getAction()))
            {
                context = intent.getStringExtra("newnum");
            } else
            if ("popularize.newnum2".equals(intent.getAction()))
            {
                context = intent.getStringExtra("newnum2");
            }
            if (context != null)
            {
                a.a(context);
                return;
            }
        }
    }
}
