// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.mopub.common.Preconditions;

// Referenced classes of package com.mopub.mraid:
//            MraidController

final class p extends BroadcastReceiver
{

    final MraidController a;
    private Context b;
    private int c;

    p(MraidController mraidcontroller)
    {
        a = mraidcontroller;
        super();
        c = -1;
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (b != null && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()))
        {
            int i = MraidController.k(a);
            if (i != c)
            {
                c = i;
                a.c();
                return;
            }
        }
    }

    public final void register(Context context)
    {
        Preconditions.checkNotNull(context);
        b = context.getApplicationContext();
        if (b != null)
        {
            b.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        }
    }

    public final void unregister()
    {
        if (b != null)
        {
            b.unregisterReceiver(this);
            b = null;
        }
    }
}
