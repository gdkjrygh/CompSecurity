// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import p.cw.b;
import p.cw.c;
import p.cw.d;
import p.cw.f;
import p.dd.ag;
import p.dd.at;
import p.dd.ay;
import p.dd.bb;
import p.dd.be;
import p.dd.bg;
import p.dd.bh;
import p.dd.p;
import p.df.a;

// Referenced classes of package p.dg:
//            j, l, g, i

public class p.dg.h
    implements p.cw.b
{
    private class a
        implements Runnable
    {

        final p.dg.h a;
        private final p.cw.b.c b;

        public void run()
        {
            if (!a.n() && p.dg.h.a(a) != null)
            {
                if (b == p.cw.b.c.a)
                {
                    a.b(p.cw.b.a.c);
                }
                a.a(p.cw.b.a.c);
            }
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).b();
            }
        }

        public a(p.cw.b.c c1)
        {
            a = p.dg.h.this;
            super();
            b = c1;
        }
    }

    private class b
        implements Runnable
    {

        final p.dg.h a;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).d();
            }
        }

        private b()
        {
            a = p.dg.h.this;
            super();
        }

    }

    private class c
        implements Runnable
    {

        final p.dg.h a;
        private final p.cw.b.c b;

        public void run()
        {
            if (b == p.cw.b.c.a)
            {
                a.b(p.cw.b.a.b);
            }
            while (com.pandora.radio.util.i.f() || p.dg.h.a(a) == null) 
            {
                return;
            }
            a.a(p.cw.b.a.b);
            p.dg.h.a(a).c();
        }

        public c(p.cw.b.c c1)
        {
            a = p.dg.h.this;
            super();
            b = c1;
        }
    }

    private class d
        implements Runnable
    {

        final p.dg.h a;
        private final String b;

        public void run()
        {
            if (p.dg.h.a(a) == null)
            {
                return;
            } else
            {
                p.dg.h.a(a, p.dg.h.d(a));
                a.a(p.cw.b.a.b);
                p.dg.h.b(a).f().b();
                p.dg.h.a(a).a(b);
                return;
            }
        }

        public d(String s1)
        {
            a = p.dg.h.this;
            super();
            b = s1;
        }
    }

    private class e
        implements Runnable
    {

        final p.dg.h a;
        private final y b;
        private final String c;
        private final boolean d;
        private final p.cw.b.b e;
        private final Object f;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).a(false, "changing stations", com.pandora.radio.util.k.n.c);
            }
            boolean flag = a.a(b);
            p.dg.h.b(a).x().a("CURRENT_STATION_TOKEN", b.c());
            p.dg.h.a(a, a.b.a(p.dg.h.b(a), b, p.dg.h.b(a).s(), c, a.a, d, e, p.dg.h.c(a)));
            p.df.b.a("PandoraService.stationStart(): starting station");
            p.dd.ay.a a1;
            if (flag)
            {
                a1 = p.dd.ay.a.b;
            } else
            {
                a1 = p.dd.ay.a.a;
            }
            p.dg.h.a(a).a();
            p.dg.h.b(a).a(new ay(b, a1, f));
            p.dg.h.b(a).a(new at(b));
        }

        public e(y y1, String s1, boolean flag, p.cw.b.b b1, Object obj)
        {
            a = p.dg.h.this;
            super();
            b = y1;
            c = s1;
            d = flag;
            e = b1;
            f = obj;
        }
    }

    protected static class f extends com.pandora.radio.util.b
    {

        public l a(p.cw.c c1, y y1, Context context, String s1, p.dg.j j1, boolean flag, p.cw.b.b b1, 
                p.cw.f f1)
        {
            return new l(c1, y1, c1.s(), s1, j1, flag, b1, f1);
        }

        protected f()
        {
        }
    }

    private class g
        implements Runnable
    {

        final p.dg.h a;
        private final boolean b;
        private final String c;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).a(b, c, com.pandora.radio.util.k.n.e);
                p.dg.h.b(a).a(new ay(null, p.dd.ay.a.d));
                p.dg.h.b(a).a(new at(null));
            }
            p.dg.h.a(a, null);
        }

        public g(boolean flag, String s1)
        {
            a = p.dg.h.this;
            super();
            b = flag;
            c = s1;
        }
    }

    private class h
        implements Runnable
    {

        final ac a;
        final l.e b;
        final p.dg.h c;

        public void run()
        {
            if (p.dg.h.a(c) == null)
            {
                return;
            }
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[p.dg.l.e.values().length];
                    try
                    {
                        a[p.dg.l.e.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.dg.l.e.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (p.dg._cls1.a[b.ordinal()])
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("unsupported ThrowOutTracksType ").append(b).toString());

            case 1: // '\001'
                p.dg.h.a(c).a(a);
                return;

            case 2: // '\002'
                p.dg.h.a(c).b(a);
                break;
            }
        }

        h(ac ac1, l.e e1)
        {
            c = p.dg.h.this;
            super();
            a = ac1;
            b = e1;
        }
    }

    private class i
        implements Runnable
    {

        final p.dg.h a;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).i();
            }
        }

        private i()
        {
            a = p.dg.h.this;
            super();
        }

    }

    private class j
        implements Runnable
    {

        final p.dg.h a;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).h();
            }
        }

        private j()
        {
            a = p.dg.h.this;
            super();
        }

    }

    private class k
        implements Runnable
    {

        final p.dg.h a;
        private final aa b;

        public void run()
        {
            if (p.dg.h.a(a) != null)
            {
                p.dg.h.a(a).a(b);
            }
        }

        public k(aa aa)
        {
            a = p.dg.h.this;
            super();
            b = aa;
        }
    }


    protected p.dg.j a;
    protected f b;
    private l c;
    private Handler d;
    private p.cw.c e;
    private p.dt.i f;
    private p.cw.b.a g;
    private p.cw.b.a h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private final p.cw.f m;

    public p.dg.h(p.cw.c c1, p.dt.i i1, p.cw.f f1)
    {
        g = null;
        j = 1;
        e = c1;
        f = i1;
        m = f1;
        d = g();
        a = new p.dg.j(c1);
        c1.g();
        b = new f();
    }

    static p.cw.b.a a(p.dg.h h1, p.cw.b.a a1)
    {
        h1.h = a1;
        return a1;
    }

    static l a(p.dg.h h1)
    {
        return h1.c;
    }

    static l a(p.dg.h h1, l l1)
    {
        h1.c = l1;
        return l1;
    }

    private void a(com.pandora.radio.util.k.n n1, aa aa)
    {
        if (c == null)
        {
            return;
        } else
        {
            h = g;
            a(p.cw.b.a.b);
            c.a(n1, aa);
            return;
        }
    }

    static p.cw.c b(p.dg.h h1)
    {
        return h1.e;
    }

    static p.cw.f c(p.dg.h h1)
    {
        return h1.m;
    }

    static p.cw.b.a d(p.dg.h h1)
    {
        return h1.g;
    }

    private void h()
    {
        if (c != null)
        {
            c.g();
        }
    }

    public boolean A()
    {
        return c == null || !c.q();
    }

    public void B()
    {
        if (!l)
        {
            l = true;
            e.b(this);
            if (!k)
            {
                k = true;
                a(p.cw.b.a.a);
                h = p.cw.b.a.a;
                return;
            }
        }
    }

    public void C()
    {
        if (!l)
        {
            return;
        } else
        {
            l = false;
            e.c(this);
            return;
        }
    }

    public boolean D()
    {
        return l;
    }

    public boolean W()
    {
        return c != null && c.b(s());
    }

    public void X()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.discardPlaylist() called after player shutdown");
            return;
        } else
        {
            h();
            return;
        }
    }

    public boolean Y()
    {
        return c != null && c.r();
    }

    public void a()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.updateSkipLimits() called after player shutdown");
            return;
        } else
        {
            a.c();
            return;
        }
    }

    public void a(aa aa)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.tiredOfTrack() called after player shutdown");
            return;
        } else
        {
            d.post(new k(aa));
            return;
        }
    }

    public void a(ac ac1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.throwOutAudioAdTracks(%s) called after player shutdown", new Object[] {
                ac1
            });
            return;
        } else
        {
            d.post(new h(ac1, p.dg.l.e.a));
            return;
        }
    }

    public void a(y y1, String s1, boolean flag, p.cw.b.b b1, Object obj)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.start() called after player shutdown");
            return;
        } else
        {
            d.post(new e(y1, s1, flag, b1, obj));
            return;
        }
    }

    public void a(com.pandora.radio.util.k.n n1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.discardPlaylistAndSkip() called after player shutdown");
            return;
        } else
        {
            a(n1, ((aa) (null)));
            return;
        }
    }

    public void a(String s1, String s2)
    {
        if (c != null && c.m().c().equals(s1))
        {
            c.b(s2);
        }
    }

    public void a(p.cw.b.a a1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.setState() called after player shutdown");
        } else
        if (g != a1)
        {
            g = a1;
            if (l)
            {
                e.a(new ag(a1, t()));
                return;
            }
        }
    }

    public void a(p.cw.b.c c1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.resume() called after player shutdown");
            return;
        } else
        {
            d.post(new c(c1));
            return;
        }
    }

    public void a(boolean flag, String s1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.stop(boolean force, final String why) called after player shutdown");
            return;
        } else
        {
            d.post(new g(flag, s1));
            return;
        }
    }

    public boolean a(y y1)
    {
        return c != null && y1 != null && c.m() != null && c.m().c() != null && c.m().c().equals(y1.c());
    }

    public void b()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.togglePause() called after player shutdown");
            return;
        }
        if (o())
        {
            d.post(new a(p.cw.b.c.a));
            return;
        } else
        {
            d.post(new c(p.cw.b.c.a));
            return;
        }
    }

    public void b(ac ac1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.throwOutAllTracks(%s) called after player shutdown", new Object[] {
                ac1
            });
            return;
        } else
        {
            d.post(new h(ac1, p.dg.l.e.c));
            return;
        }
    }

    public void b(String s1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.skip() called after player shutdown");
            return;
        } else
        {
            d.post(new d(s1));
            return;
        }
    }

    public void b(p.cw.b.a a1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.setRestoreState() called after player shutdown");
            return;
        } else
        {
            h = a1;
            return;
        }
    }

    public void b(p.cw.b.c c1)
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.pause() called after player shutdown");
            return;
        } else
        {
            d.post(new a(c1));
            return;
        }
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public void c()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.thumbUp() called after player shutdown");
            return;
        } else
        {
            d.post(new j(null));
            return;
        }
    }

    public void d()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.thumbDown() called after player shutdown");
            return;
        } else
        {
            d.post(new i(null));
            return;
        }
    }

    public void d(y y1)
    {
        (new g(true, "internal switch")).run();
        c = b.a(e, y1, e.s(), null, a, false, p.cw.b.b.c, m);
    }

    public boolean e()
    {
        return c != null && c.m().r();
    }

    public void f()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.stop() called after player shutdown");
            return;
        } else
        {
            d.post(new g(false, "ACTION_CMD_STOP"));
            return;
        }
    }

    protected Handler g()
    {
        return new Handler(Looper.getMainLooper());
    }

    public bg getTrackElapsedTimeEvent()
    {
        if (c != null)
        {
            return c.k();
        } else
        {
            return new bg(0, 0);
        }
    }

    public void k()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.shutdown() called after player shutdown");
            return;
        } else
        {
            (new g(true, "app is shutting down")).run();
            k = false;
            a.a();
            C();
            p.dg.g.a(e).a();
            f = null;
            c = null;
            d = null;
            e = null;
            a = null;
            return;
        }
    }

    public void l()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.restoreVolumeOrResumePlaying() called after player shutdown");
            return;
        } else
        {
            d.post(new b(null));
            return;
        }
    }

    public boolean m()
    {
        return i;
    }

    public boolean n()
    {
        return g == p.cw.b.a.d;
    }

    public boolean o()
    {
        return g == p.cw.b.a.b;
    }

    public void onDeleteStationSuccess(p p1)
    {
        boolean flag1 = true;
        p1 = p1.a;
        y y1 = t();
        boolean flag;
        if (p1 != null && y1 != null && p1.equals(y1.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e.y().d())
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            a(false, "going to delete the station");
            com.pandora.radio.util.i.c();
        }
    }

    public void onThumbDown(bb bb1)
    {
        if (p.cw.d.b(bb1.a) && !bb1.c)
        {
            a(com.pandora.radio.util.k.n.b, bb1.b);
        }
    }

    public void onTiredOfTrack(be be1)
    {
        if (!be1.a)
        {
            b("onTiredOfTrack");
        }
    }

    public boolean p()
    {
        return g == p.cw.b.a.c;
    }

    public at produceStationDataEvent()
    {
        y y1;
        if (c == null)
        {
            y1 = null;
        } else
        {
            y1 = c.m();
        }
        return new at(y1);
    }

    public bh produceTrackStateEvent()
    {
        if (c != null)
        {
            return c.j();
        } else
        {
            return new bh(p.dd.bh.a.a, null);
        }
    }

    public boolean q()
    {
        return f.b();
    }

    public void r()
    {
        if (e())
        {
            j = j + 1;
        }
    }

    public aa s()
    {
        return produceTrackStateEvent().b;
    }

    public y t()
    {
        return produceStationDataEvent().a;
    }

    public p.cw.b.a u()
    {
        return g;
    }

    public p.cw.b.a v()
    {
        return h;
    }

    public int w()
    {
        return j;
    }

    public void x()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.duckVolume() called after player shutdown");
        } else
        if (c != null)
        {
            c.e();
            return;
        }
    }

    public void y()
    {
        if (!k)
        {
            p.df.a.c("PlayerImpl", "Player.discardAudioAds() called after player shutdown");
        } else
        if (c != null)
        {
            c.a(ac.b);
            c.l();
            return;
        }
    }

    public boolean z()
    {
        return c != null && !p.cw.d.a(c.c(s()).a);
    }
}
