// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Context;
import android.content.IntentFilter;

// Referenced classes of package com.arist.service:
//            c, MusicPlayService

public final class b
{

    private c a;
    private MusicPlayService b;

    public b()
    {
    }

    static MusicPlayService a(b b1)
    {
        return b1.b;
    }

    public final void a(Context context)
    {
        if (a != null)
        {
            b = null;
            context.unregisterReceiver(a);
        }
    }

    public final void a(MusicPlayService musicplayservice)
    {
        b = musicplayservice;
        a = new c(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.HEADSET_PLUG");
        musicplayservice.registerReceiver(a, intentfilter);
    }
}
