// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.facebook.common.executors.a;
import com.facebook.debug.log.b;
import com.google.common.a.hq;
import com.google.common.b.c;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import com.google.common.d.a.u;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.d:
//            f, l, ae, g, 
//            h, i, j, k

public class e
{

    private static final Class a = com/facebook/orca/d/e;
    private final a b;
    private final u c;
    private final Executor d;
    private final ae e;
    private final Handler f;
    private final List g = hq.a();
    private Uri h;
    private MediaPlayer i;
    private s j;
    private final Runnable k = new f(this);

    e(a a1, u u1, Executor executor, ae ae1, Handler handler)
    {
        b = a1;
        c = u1;
        d = executor;
        e = ae1;
        f = handler;
    }

    static Handler a(e e1)
    {
        return e1.f;
    }

    static s a(e e1, s s1)
    {
        e1.j = s1;
        return s1;
    }

    static void a(e e1, k k1)
    {
        e1.a(k1);
    }

    private void a(k k1)
    {
        int i1 = 0;
        l al[] = (l[])g.toArray(new l[0]);
        for (int j1 = al.length; i1 < j1; i1++)
        {
            al[i1].a(k1);
        }

    }

    static void b(e e1)
    {
        e1.k();
    }

    static void c(e e1)
    {
        e1.j();
    }

    static Runnable d(e e1)
    {
        return e1.k;
    }

    private void j()
    {
        FileInputStream fileinputstream;
        b.b();
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("Playing the audio clip: ").append(h).toString());
        fileinputstream = new FileInputStream(new File(h.getPath()));
        i.setDataSource(fileinputstream.getFD());
        i.prepare();
        com.google.common.b.c.a(fileinputstream);
        i.start();
        return;
        Exception exception;
        exception;
        com.google.common.b.c.a(fileinputstream);
        throw exception;
    }

    private void k()
    {
        f.removeCallbacks(k);
        if (i != null)
        {
            i.reset();
            i.release();
            i = null;
        }
    }

    public void a()
    {
        i = new MediaPlayer();
        e.a(i);
        i.setOnCompletionListener(new g(this));
        i.setOnErrorListener(new h(this));
        j = c.c(new com.facebook.orca.d.i(this));
        j j1 = new j(this);
        com.google.common.d.a.i.a(j, j1, d);
    }

    public void a(Uri uri)
    {
        Preconditions.checkNotNull(uri);
        h = uri;
    }

    public void a(l l1)
    {
        g.add(l1);
    }

    public Uri b()
    {
        return h;
    }

    public void b(l l1)
    {
        g.remove(l1);
    }

    public void c()
    {
        if (j != null)
        {
            j.cancel(false);
        }
        k();
        a(k.PLAYBACK_STOPPED);
    }

    public void d()
    {
        try
        {
            if (i != null && i.isPlaying())
            {
                i.pause();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            com.facebook.debug.log.b.e(a, "The player finished playing before pause() was called");
        }
        f.removeCallbacks(k);
    }

    public void e()
    {
        i.start();
        e.b();
        f.post(k);
    }

    public boolean f()
    {
        return i != null && !i.isPlaying();
    }

    public int g()
    {
        return e.a();
    }

    public int h()
    {
        return i.getDuration();
    }

    public boolean i()
    {
        return i != null;
    }

}
