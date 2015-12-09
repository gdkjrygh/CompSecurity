// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.activity.PandoraIntent;

// Referenced classes of package com.pandora.android:
//            PandoraService

class it> extends BroadcastReceiver
{

    final PandoraService a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals(PandoraIntent.a("shuffle_options_changed")))
        {
            PandoraService.a(a);
        } else
        {
            if (context.equals(PandoraIntent.a("cmd_shutdown")))
            {
                PandoraService.b(a);
                return;
            }
            if (context.equals(PandoraIntent.a("cmd_music_search_to_create_station")))
            {
                int i = intent.getIntExtra("intent_station_creation_source", 0);
                context = p.cx..getIntExtra()[i];
                PandoraService.a(a, intent, context);
                return;
            }
            if (context.equals(PandoraIntent.a("cmd_music_search")))
            {
                int j = intent.getIntExtra("intent_station_creation_source", 0);
                context = p.cx..getIntExtra()[j];
                PandoraService.b(a, intent, context);
                return;
            }
            if (context.equals(PandoraIntent.a("cmd_create_station")))
            {
                PandoraService.a(a, intent);
                return;
            }
            if (context.equals(PandoraIntent.a("cmd_ack_trial_expired")))
            {
                PandoraService.b(a, intent);
                return;
            }
            if (context.equals(PandoraIntent.a("cmd_ack_trial_expired_success")))
            {
                PandoraService.c(a);
                return;
            }
        }
    }

    ntent(PandoraService pandoraservice)
    {
        a = pandoraservice;
        super();
    }
}
