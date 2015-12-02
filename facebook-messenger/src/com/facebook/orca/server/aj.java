// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.a.e;
import com.facebook.common.v.a;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.DefaultBlueService;

// Referenced classes of package com.facebook.orca.server:
//            ak, al

public class aj
{

    private static final Class a = com/facebook/orca/server/aj;
    private final Context b;
    private final a c;
    private final BroadcastReceiver d = new ak(this);
    private final Handler e = new Handler();
    private boolean f;
    private boolean g;

    public aj(Context context, a a1)
    {
        b = context;
        c = a1;
        a1 = new IntentFilter();
        a1.addAction(a.a);
        android.support.v4.a.e.a(context).a(d, a1);
    }

    private void a()
    {
        com.facebook.debug.log.b.c(a, "maybeStartStopBlueService");
        boolean flag;
        if (c.c() || System.currentTimeMillis() - c.d() < 30000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (!f)
            {
                com.facebook.debug.log.b.c(a, "Starting BlueService");
                Intent intent = new Intent(b, com/facebook/fbservice/service/DefaultBlueService);
                intent.setAction("Orca.START");
                b.startService(intent);
                f = true;
            }
            if (!g)
            {
                e.postDelayed(new al(this), 30000L);
                g = true;
            }
        } else
        if (f)
        {
            com.facebook.debug.log.b.c(a, "Stopping BlueService");
            Intent intent1 = new Intent(b, com/facebook/fbservice/service/DefaultBlueService);
            intent1.setAction("Orca.STOP");
            b.startService(intent1);
            f = false;
            return;
        }
    }

    static void a(aj aj1)
    {
        aj1.b();
    }

    static boolean a(aj aj1, boolean flag)
    {
        aj1.g = flag;
        return flag;
    }

    private void b()
    {
        com.facebook.debug.log.b.a(a, "onActivityBroadcast");
        a();
    }

    static void b(aj aj1)
    {
        aj1.a();
    }

}
