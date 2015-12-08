// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.photos.videoplayer.view.VideoViewHolder;

final class ehb
    implements jej
{

    final Context a;
    final jgc b;
    final jfz c;
    final jgf d;
    final nal e;
    final jdu f = new jdu();
    final jet g = new jet();
    final jgd h = new jgd();
    jfq i;
    VideoViewHolder j;
    int k;
    ehi l;
    boolean m;
    jgl n;
    jdv o;
    ekp p;
    final nug q = new ehc(this);
    final nug r = new ehd(this);
    private final grl s;

    ehb(Context context)
    {
        a = context;
        e = (nal)olm.a(context, nal);
        b = (jgc)olm.a(context, jgc);
        c = (jfz)olm.a(context, jfz);
        s = (grl)olm.a(context, grl);
        d = new jgf(context);
    }

    static void a(ehb ehb1)
    {
        ehb1.j.b(true);
        ehb1.i.start();
        ehb1.i.a(jfw.a);
        ehb1.f.a(jek.a);
    }

    private void e()
    {
        while (!i.e() || p == null || !c.c || !jga.c(c.b)) 
        {
            return;
        }
        mtj.a(a, new jdt(p, (int)(jga.a(c.b) * (float)i.getDuration()), (int)(jga.b(c.b) * (float)i.getDuration())));
    }

    void a(int i1, boolean flag)
    {
        b.a(i1, flag);
    }

    final void a(VideoViewHolder videoviewholder, boolean flag)
    {
        if (i == null)
        {
            return;
        } else
        {
            g.b();
            i.pause();
            e();
            b.a.a(q);
            c.a.a(r);
            jfq jfq1 = i;
            jfq1.i = null;
            jfq1.j = null;
            jfq1.l = null;
            jfq1.k = null;
            jfq1.a(null);
            i.b();
            videoviewholder.f();
            videoviewholder = i;
            videoviewholder.b(false);
            videoviewholder.j();
            i = null;
            g.a = null;
            return;
        }
    }

    public final void a(jel jel)
    {
        f.a(jel);
    }

    void a(jfq jfq1, boolean flag)
    {
        if (l != null)
        {
            l.cancel(true);
        }
        l = new ehi(this);
        l.execute(new ehj[] {
            new ehj(this, jfq1, k, flag)
        });
    }

    public final void a(jfw jfw1)
    {
        p.a(i);
        i.a(jfw1);
    }

    public final boolean a()
    {
        return i != null && i.isPlaying();
    }

    public final void b()
    {
        p.a(i);
        i.start();
        f.a(jek.b);
        s.a(true);
        if (i.e())
        {
            d();
            a(i.getCurrentPosition(), false);
            g.a();
        }
    }

    public final void c()
    {
        p.a(i);
        i.pause();
        f.a(jek.a);
        s.a(false);
        e();
    }

    void d()
    {
        int i1;
        int j1;
        if (o != null)
        {
            i1 = (int)o.p();
        } else
        {
            i1 = 0;
        }
        j1 = i.getDuration();
        if (i1 <= 0)
        {
            i1 = j1;
        }
        b.a(i1);
        d.a(i1);
        h.a = i1;
        h.b = j1;
    }
}
