// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer:
//            ExoPlayer, ExoPlayerImplInternal, ExoPlaybackException, TrackRenderer

final class ExoPlayerImpl
    implements ExoPlayer
{

    private final Handler a = new _cls1(Looper.getMainLooper());
    private final ExoPlayerImplInternal b;
    private final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    private final boolean d[];
    private final boolean e[];
    private boolean f;
    private int g;
    private int h;

    public ExoPlayerImpl(int i, int j, int k)
    {
        boolean flag = false;
        super();
        f = false;
        g = 1;
        d = new boolean[i];
        e = new boolean[i];
        for (i = ((flag) ? 1 : 0); i < e.length; i++)
        {
            e[i] = true;
        }

        b = new ExoPlayerImplInternal(a, f, e, j, k);
    }

    public final int a()
    {
        return g;
    }

    public final void a(int i, boolean flag)
    {
        if (e[i] != flag)
        {
            e[i] = flag;
            b.a(i, flag);
        }
    }

    public final void a(long l)
    {
        b.a(l);
    }

    final void a(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 37
    //                   2 110
    //                   3 160
    //                   4 204;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        boolean aflag[] = (boolean[])(boolean[])message.obj;
        System.arraycopy(aflag, 0, d, 0, aflag.length);
        g = message.arg1;
        message = c.iterator();
        while (message.hasNext()) 
        {
            ((ExoPlayer.Listener)message.next()).a(f, g);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        g = message.arg1;
        message = c.iterator();
        while (message.hasNext()) 
        {
            ((ExoPlayer.Listener)message.next()).a(f, g);
        }
        if (true) goto _L1; else goto _L4
_L4:
        h = h - 1;
        if (h == 0)
        {
            message = c.iterator();
            while (message.hasNext()) 
            {
                message.next();
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        message = (ExoPlaybackException)message.obj;
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            ((ExoPlayer.Listener)iterator.next()).a(message);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
    {
        b.a(exoplayercomponent, i, obj);
    }

    public final void a(ExoPlayer.Listener listener)
    {
        c.add(listener);
    }

    public final void a(boolean flag)
    {
        if (f != flag)
        {
            f = flag;
            h = h + 1;
            b.a(flag);
            for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ExoPlayer.Listener)iterator.next()).a(flag, g)) { }
        }
    }

    public final transient void a(TrackRenderer atrackrenderer[])
    {
        Arrays.fill(d, false);
        b.a(atrackrenderer);
    }

    public final void b(ExoPlayer.ExoPlayerComponent exoplayercomponent, int i, Object obj)
    {
        b.b(exoplayercomponent, i, obj);
    }

    public final void b(ExoPlayer.Listener listener)
    {
        c.remove(listener);
    }

    public final boolean b()
    {
        return f;
    }

    public final void c()
    {
        b.d();
    }

    public final void d()
    {
        b.e();
        a.removeCallbacksAndMessages(null);
    }

    public final long e()
    {
        return b.c();
    }

    public final long f()
    {
        return b.a();
    }

    public final long g()
    {
        return b.b();
    }

    public final int h()
    {
        long l = 100L;
        long l1 = g();
        long l2 = e();
        if (l1 == -1L || l2 == -1L)
        {
            return 0;
        }
        if (l2 != 0L)
        {
            l = (100L * l1) / l2;
        }
        return (int)l;
    }

    private class _cls1 extends Handler
    {

        final ExoPlayerImpl a;

        public void handleMessage(Message message)
        {
            a.a(message);
        }

        _cls1(Looper looper)
        {
            a = ExoPlayerImpl.this;
            super(looper);
        }
    }

}
