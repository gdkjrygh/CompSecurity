// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import com.arist.c.a;
import com.arist.c.h;
import com.arist.model.equize.n;
import com.arist.model.lrc.LrcView;
import com.arist.model.skin.ColorProgressBar;

// Referenced classes of package com.arist.activity:
//            MusicPlayActivity, MyApplication

final class ai extends BroadcastReceiver
{

    final MusicPlayActivity a;

    private ai(MusicPlayActivity musicplayactivity)
    {
        a = musicplayactivity;
        super();
    }

    ai(MusicPlayActivity musicplayactivity, byte byte0)
    {
        this(musicplayactivity);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (a.q.equals(intent.getAction()))
        {
            a.finish();
        } else
        {
            if (a.j.equals(intent.getAction()))
            {
                com.arist.activity.MusicPlayActivity.a(a);
                return;
            }
            if (a.l.equals(intent.getAction()))
            {
                MusicPlayActivity.b(a).setSelected(MyApplication.d());
                MusicPlayActivity.c(a).a(MyApplication.d());
                return;
            }
            if (a.r.equals(intent.getAction()))
            {
                int i = intent.getIntExtra("musicProgress", 0);
                int j = MyApplication.b();
                MusicPlayActivity.d(a).a(((float)i * 1.0F) / (float)j);
                MusicPlayActivity.e(a).setText(h.a(j));
                MusicPlayActivity.f(a).setText(h.a(i));
                if (MusicPlayActivity.g(a) != null && MusicPlayActivity.g(a).c())
                {
                    MusicPlayActivity.g(a).a(i);
                    return;
                }
            }
        }
    }
}
