// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdManager, SkypeAdPlacer

final class > extends BroadcastReceiver
{

    final SkypeAdManager a;

    public final void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
            {
                boolean flag = intent.getBooleanExtra("noConnectivity", false);
                if (SkypeAdManager.a(a) != flag)
                {
                    SkypeAdManager.a(a, flag);
                    context = SkypeAdPlacer.a();
                    if (context == null || !context.e())
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        SkypeAdManager.b(a);
    }

    (SkypeAdManager skypeadmanager)
    {
        a = skypeadmanager;
        super();
    }
}
