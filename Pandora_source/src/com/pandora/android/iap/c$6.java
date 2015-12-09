// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import p.cc.e;
import p.df.a;

// Referenced classes of package com.pandora.android.iap:
//            c, f

class eiver extends BroadcastReceiver
{

    final c a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (PandoraIntent.a("get_usage_result").equals(context))
        {
            b.a.C().a(this);
            if (intent.getBooleanExtra("intent_is_capped", false) && com.pandora.android.iap.c.a(a, c.g(a).d()) && c.g(a).e() == 0)
            {
                p.df.a.a("GoogleInApp", "Provisioning capped p2p owner...");
                com.pandora.android.iap.f.a();
                a.c(c.g(a));
            }
        }
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
