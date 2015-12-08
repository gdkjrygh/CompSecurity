// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.Context;
import android.content.Intent;
import com.arist.c.j;

// Referenced classes of package com.arist.service:
//            MusicPlayService, RestartPlayerServiceReceiver

final class q
    implements Runnable
{

    final RestartPlayerServiceReceiver a;
    private final Context b;
    private final Intent c;

    q(RestartPlayerServiceReceiver restartplayerservicereceiver, Context context, Intent intent)
    {
        a = restartplayerservicereceiver;
        b = context;
        c = intent;
        super();
    }

    public final void run()
    {
        if (MusicPlayService.b)
        {
            b.sendBroadcast(j.a(c.getAction()));
        }
    }
}
