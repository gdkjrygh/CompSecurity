// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.service;

import android.content.Intent;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.session.SessionState;
import dxc;
import eda;
import gox;
import gph;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spotify.music.spotlets.radio.service:
//            RadioActionsService

final class a
    implements eda
{

    private RadioActionsService a;

    public final void a(SessionState sessionstate)
    {
label0:
        {
            boolean flag;
            if (sessionstate.e && !sessionstate.g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag != RadioActionsService.a(a))
            {
                RadioActionsService.a(a, flag);
                if (!RadioActionsService.a(a))
                {
                    break label0;
                }
                sessionstate = RadioActionsService.b(a);
                ((gox) (sessionstate)).a.connect();
                gph gph1 = ((gox) (sessionstate)).e;
                Player player = ((gox) (sessionstate)).b;
                player.registerPlayerStateObserver(gph1.c);
                gph1.f = player;
                sessionstate.b();
                RadioActionsService.c(a).a();
                Intent intent;
                for (sessionstate = RadioActionsService.d(a).iterator(); sessionstate.hasNext(); a.startService(intent))
                {
                    intent = (Intent)sessionstate.next();
                }

                RadioActionsService.d(a).clear();
            }
            return;
        }
        RadioActionsService.b(a).a();
        RadioActionsService.c(a).b();
        a.stopSelf();
    }

    (RadioActionsService radioactionsservice)
    {
        a = radioactionsservice;
        super();
    }
}
