// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

// Referenced classes of package com.roidapp.photogrid.video:
//            MusicPlayerService

final class i extends BroadcastReceiver
{

    final MusicPlayerService a;

    i(MusicPlayerService musicplayerservice)
    {
        a = musicplayerservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction() != "MusicPlayerService.PlayMusic") goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("MusicPlayerService.Source");
        if (MusicPlayerService.a(a) == null) goto _L4; else goto _L3
_L3:
        MusicPlayerService.a(a).removeMessages(1);
        MusicPlayerService.a(a).removeMessages(2);
        MusicPlayerService.a(a).sendMessage(MusicPlayerService.a(a).obtainMessage(1, context));
_L6:
        return;
_L4:
        MusicPlayerService.a(a, context);
        return;
_L2:
        if (intent.getAction() == "MusicPlayerService.StopMusic")
        {
            if (MusicPlayerService.a(a) != null)
            {
                MusicPlayerService.a(a).removeMessages(1);
                MusicPlayerService.a(a).removeMessages(2);
                MusicPlayerService.a(a).sendMessage(MusicPlayerService.a(a).obtainMessage(2));
                return;
            } else
            {
                MusicPlayerService.b(a);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
