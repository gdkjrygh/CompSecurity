// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmcm.adsdk.b.c.b;
import com.cmcm.adsdk.b.e.a;

// Referenced classes of package com.cmcm.adsdk.b:
//            e, a

final class f extends BroadcastReceiver
{

    final e a;

    private f(e e1)
    {
        a = e1;
        super();
    }

    f(e e1, byte byte0)
    {
        this(e1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equalsIgnoreCase("com.cmcm.adsdk.ConfigMonitor_Action"))
        {
            b.a("ConfigChangeMonitor", "monitor requestConfig...");
            intent = com.cmcm.adsdk.b.e.b(a);
            if (com.cmcm.adsdk.b.b())
            {
                context = "http://unconf.mobad.ijinshan.com/b/";
            } else
            {
                context = "http://unconf.adkmob.com/b/";
            }
            intent.a(context, com.cmcm.adsdk.b.e.a.b(a(a)), com.cmcm.adsdk.b.a.a(a(a)));
        }
    }
}
