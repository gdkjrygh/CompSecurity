// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;
import com.arist.activity.MyApplication;
import com.arist.b.c;
import com.arist.c.a;
import java.util.ArrayList;

// Referenced classes of package com.arist.service:
//            MusicPlayService, o

final class k extends BroadcastReceiver
{

    final MusicPlayService a;

    k(MusicPlayService musicplayservice)
    {
        a = musicplayservice;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        Log.i("MusicPlayService", intent.getAction());
        if (a.b.equals(intent.getAction()))
        {
            a.a();
        } else
        {
            if (a.f.equals(intent.getAction()))
            {
                MusicPlayService.b(a);
                return;
            }
            if (a.g.equals(intent.getAction()))
            {
                com.arist.service.MusicPlayService.a(a);
                return;
            }
            if (a.e.equals(intent.getAction()))
            {
                try
                {
                    int i = intent.getIntExtra("seekProgress", 0);
                    MyApplication.a.seekTo(i);
                    if (MyApplication.j == 2 || MyApplication.j == 3)
                    {
                        MyApplication.a.start();
                    }
                    a.sendBroadcast(new Intent(a.l));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return;
                }
            }
            if (a.q.equals(intent.getAction()))
            {
                Log.i("MusicPlayService", "\u5DF2\u6536\u5230\u9500\u6BC1\u5E7F\u64AD");
                a.stopSelf();
                return;
            }
            if (a.s.equals(intent.getAction()))
            {
                long l = intent.getLongExtra("sleep_time", 0L);
                com.arist.service.MusicPlayService.a(a, l);
                return;
            }
            if (a.i.equals(intent.getAction()))
            {
                Log.i("MusicPlayService", "\u6E05\u9664\u901A\u77E5");
                if (MyApplication.d())
                {
                    MyApplication.a.pause();
                    MyApplication.j = 3;
                    MyApplication.q.sendBroadcast(new Intent(a.l));
                }
                a.stopForeground(true);
                com.arist.service.MusicPlayService.c(a).b();
                MusicPlayService.d(a).abandonAudioFocus(null);
                return;
            }
            if (a.h.equals(intent.getAction()))
            {
                MusicPlayService.e(a);
                return;
            }
            if (a.k.equals(intent.getAction()))
            {
                com.arist.service.MusicPlayService.a.clear();
                com.arist.service.MusicPlayService.a.addAll(MyApplication.f().f());
                return;
            }
        }
    }
}
