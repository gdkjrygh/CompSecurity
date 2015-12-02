// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.AudioManager;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.analytics.av;
import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.facebook.orca.j.c;
import java.io.File;

// Referenced classes of package com.facebook.orca.d:
//            ap, ag, al, am, 
//            an, aj, ai, ak, 
//            ao

public class af
{

    private static final Class a = com/facebook/orca/d/af;
    private final AudioManager b;
    private final a c;
    private final c d;
    private final av e;
    private final com.facebook.common.time.a f;
    private final Handler g = new Handler();
    private final Handler h;
    private final ap i = new ap(this, null);
    private final Runnable j = new ag(this);
    private ao k;
    private long l;
    private long m;
    private boolean n;
    private File o;
    private MediaRecorder p;

    public af(AudioManager audiomanager, a a1, c c1, av av, com.facebook.common.time.a a2)
    {
        b = audiomanager;
        c = a1;
        d = c1;
        e = av;
        f = a2;
        audiomanager = new HandlerThread("audio_recorder_worker_thread");
        audiomanager.setPriority(10);
        audiomanager.start();
        h = new Handler(audiomanager.getLooper());
    }

    static a a(af af1)
    {
        return af1.c;
    }

    static void a(af af1, Runnable runnable)
    {
        af1.a(runnable);
    }

    private void a(Runnable runnable)
    {
        c.a();
        if (!d())
        {
            return;
        } else
        {
            n = false;
            g.removeCallbacks(j);
            g();
            h.post(new al(this, runnable));
            return;
        }
    }

    static boolean a(af af1, boolean flag)
    {
        af1.n = flag;
        return flag;
    }

    static File b(af af1)
    {
        return af1.o;
    }

    static ao c(af af1)
    {
        return af1.k;
    }

    static void d(af af1)
    {
        af1.h();
    }

    static void e(af af1)
    {
        af1.j();
    }

    static Handler f(af af1)
    {
        return af1.g;
    }

    private void f()
    {
        l = f.a();
        m = 0L;
    }

    static Runnable g(af af1)
    {
        return af1.j;
    }

    private void g()
    {
        m = f.a() - l;
        l = 0L;
    }

    private void h()
    {
        c.b();
        try
        {
            if (p != null)
            {
                j();
                p = null;
            }
            p = i();
            g.post(new am(this));
            return;
        }
        catch (Throwable throwable)
        {
            j();
            g.post(new an(this, throwable));
            return;
        }
    }

    static void h(af af1)
    {
        af1.f();
    }

    private MediaRecorder i()
    {
        c.b();
        MediaRecorder mediarecorder = new MediaRecorder();
        o = d.a("orca-audio-", ".mp4", Boolean.valueOf(true));
        mediarecorder.setAudioSource(1);
        mediarecorder.setOutputFormat(2);
        mediarecorder.setAudioEncoder(3);
        mediarecorder.setAudioChannels(1);
        mediarecorder.setAudioSamplingRate(8000);
        mediarecorder.setOutputFile(o.getAbsolutePath());
        mediarecorder.prepare();
        if (1 != b.requestAudioFocus(i, 0, 2))
        {
            throw new Exception("Failed to acquire the audio focus.");
        } else
        {
            mediarecorder.start();
            return mediarecorder;
        }
    }

    static boolean i(af af1)
    {
        return af1.n;
    }

    static av j(af af1)
    {
        return af1.e;
    }

    private void j()
    {
        c.b();
        if (p == null)
        {
            return;
        }
        p.stop();
        p.reset();
        p.release();
        p = null;
_L2:
        try
        {
            b.abandonAudioFocus(i);
            return;
        }
        catch (Throwable throwable)
        {
            com.facebook.debug.log.b.e(a, "Error in abandoning the audio focus.", throwable);
        }
        return;
        Object obj;
        obj;
        com.facebook.debug.log.b.e(a, "Error in stopping the audio recorder.", ((Throwable) (obj)));
        p.reset();
        p.release();
        p = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        p.reset();
        p.release();
        p = null;
        throw obj;
    }

    public void a()
    {
        a(((Runnable) (new aj(this))));
    }

    public void a(ao ao)
    {
        c.a();
        k = ao;
        n = true;
        h.post(new ai(this));
    }

    public void b()
    {
        a(new ak(this));
    }

    public int c()
    {
        int i1;
        if (p == null || !d())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i1 = p.getMaxAmplitude();
        return i1;
        Throwable throwable;
        throwable;
        com.facebook.debug.log.b.d(a, "Error occurred when querying the recorder amplitude.");
        return 0;
    }

    public boolean d()
    {
        return n;
    }

    public long e()
    {
        return m;
    }

}
