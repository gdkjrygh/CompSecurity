// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.support.v4.a.e;
import com.facebook.c.k;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.google.common.a.es;
import com.google.common.a.ev;
import com.google.common.a.ew;
import java.util.Iterator;
import javax.inject.a;

// Referenced classes of package com.facebook.l:
//            h, b, d, f

public class c
    implements com.facebook.base.c
{

    private static final Class a = com/facebook/l/c;
    private final Context b;
    private com.facebook.l.b c;
    private final com.facebook.common.time.a d;
    private final e e;
    private final AudioManager f;
    private final a g;
    private final h h;
    private final Handler i;
    private com.facebook.l.h j;
    private long k;

    public c(Context context, com.facebook.common.time.a a1, e e1, AudioManager audiomanager, com.facebook.l.b b1, a a2, h h1, 
            Handler handler)
    {
        j = h.UNKNOWN;
        b = context;
        d = a1;
        e = e1;
        f = audiomanager;
        c = b1;
        g = a2;
        h = h1;
        i = handler;
    }

    static AudioManager a(c c1)
    {
        return c1.f;
    }

    static Handler b(c c1)
    {
        return c1.i;
    }

    private void b()
    {
        com.facebook.debug.log.b.b(a, "Mqtt connected, try to send music-presence status");
        c.a(f.isMusicActive());
    }

    private void c()
    {
        com.facebook.debug.log.b.b(a, "Registered MusicPresenceReceiver");
        Object obj = es.a("com.android.music.metachanged", "com.android.music.playstatechanged", "com.android.music.playbackcomplete", "com.android.music.queuechanged", "com.sec.android.app.music.playstatechanged", "com.nullsoft.winamp.playstatechanged", "com.amazon.mp3.playstatechanged", "com.htc.music.playstatechanged", "com.samsung.sec.android.MusicPlayer.playstatechanged", "com.samsung.music.playstatechanged", "com.samsung.MusicPlayer.playstatechanged", "com.samsung.sec.android.playstatechanged", new String[] {
            "com.rdio.android.playstatechanged"
        });
        Object obj1 = new d(this);
        Object obj2 = new ew();
        for (Iterator iterator = ((es) (obj)).iterator(); iterator.hasNext(); ((ew) (obj2)).b((String)iterator.next(), obj1)) { }
        obj1 = new k(((ew) (obj2)).b());
        obj2 = new IntentFilter();
        for (obj = ((es) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((IntentFilter) (obj2)).addAction((String)((Iterator) (obj)).next())) { }
        try
        {
            b.registerReceiver(((android.content.BroadcastReceiver) (obj1)), ((IntentFilter) (obj2)));
            return;
        }
        catch (Throwable throwable)
        {
            h.a(a.getSimpleName(), "failed to register receiver for music playing events", throwable);
        }
    }

    static void c(c c1)
    {
        c1.b();
    }

    private void d()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
        k k1 = new k(ev.a("com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED", new f(this)));
        e.a(k1, intentfilter);
    }

    public void a()
    {
        if (((Boolean)g.b()).booleanValue())
        {
            c();
            d();
        }
    }

    protected void a(boolean flag)
    {
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("tryToReportMusicPresenceChange, isListeningToMusic=").append(flag).toString());
        long l = d.a();
        com.facebook.l.h h1;
        if (flag)
        {
            h1 = h.MUSIC_IS_PLAYING;
        } else
        {
            h1 = h.MUSIC_IS_NOT_PLAYING;
        }
        if (h1 != j || l - k > 10000L)
        {
            c.a(flag);
            k = l;
            j = h1;
        }
    }

}
