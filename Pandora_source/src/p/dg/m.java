// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.d;
import com.pandora.radio.data.f;
import com.pandora.radio.data.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.h;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.io.IOException;
import p.cw.b;
import p.cw.c;
import p.cx.p;
import p.dd.ai;
import p.dd.bf;
import p.dd.bg;
import p.dd.bh;
import p.df.a;
import p.di.u;

// Referenced classes of package p.dg:
//            g, l, n, d, 
//            j

public class m
    implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a i[];
        private final int h;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/dg/m$a, s1);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        public int a()
        {
            return h;
        }

        static 
        {
            a = new a("SKIPPED", 0, 1);
            b = new a("STATION_CHANGE", 1, 2);
            c = new a("THUMBED_DOWN", 2, 3);
            d = new a("ERROR", 3, 4);
            e = new a("DISCARDED", 4, 5);
            f = new a("EXPIRED", 5, 6);
            g = new a("UNKNOWN", 6, 7);
            i = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s1, int i1, int j1)
        {
            super(s1, i1);
            h = j1;
        }
    }

    private class b
        implements Runnable
    {

        m a;
        f b;
        final m c;

        public void run()
        {
            String s1;
            Object obj = p.dg.m.a(c).c();
            s1 = p.dg.m.d[b.ordinal()];
            c.a((new StringBuilder()).append("START LOAD [audio type=").append(((String) (obj))).append("] ").append(s1).toString());
            if (p.dg.m.b(c).M())
            {
                p.dg.m.c(c).a(new p.dd.s(((com.pandora.radio.data.d)p.dg.m.b(c)).f()));
            }
            if (p.dg.m.b(c).D() == null)
            {
                c.a("missing url map, skipping track");
                c.a(com.pandora.radio.util.k.n.f);
                return;
            }
            obj = p.dg.m.a(c, ((String) (obj)));
            if (obj == null)
            {
                c.a("missing audioUrl, skipping track");
                c.a(com.pandora.radio.util.k.n.f);
                return;
            }
            s1 = ((com.pandora.radio.data.aa.a) (obj)).a;
            m m1 = c;
            if (!com.pandora.radio.util.i.a(((com.pandora.radio.data.aa.a) (obj)).b))
            {
                obj = ((com.pandora.radio.data.aa.a) (obj)).b;
            } else
            {
                obj = p.dg.m.b(c).a(s1);
            }
            p.dg.m.b(m1, ((String) (obj)));
            if (com.pandora.radio.util.i.a(s1))
            {
                c.a("missing audioUrl, skipping track");
                c.a(com.pandora.radio.util.k.n.f);
                return;
            }
            c.a = c.c.a();
            c.a.setAudioStreamType(3);
            c.a.setOnCompletionListener(a);
            c.a.setOnErrorListener(a);
            c.a.setOnInfoListener(a);
            c.a.setOnPreparedListener(a);
            c.a.setOnBufferingUpdateListener(a);
            c.k();
            try
            {
                c.a((new StringBuilder()).append("setting MediaPlayer datasource: ").append(s1).toString());
                p.dg.m.a(c, s1, b);
            }
            catch (IllegalStateException illegalstateexception)
            {
                try
                {
                    c.a((new StringBuilder()).append("trying again  - setting MediaPlayer datasource: ").append(s1).toString());
                    c.a.reset();
                    p.dg.m.a(c, s1, b);
                }
                catch (Exception exception)
                {
                    p.dg.m.a(c, (new StringBuilder()).append("Exception during mediaplayer load - ").append(exception.getMessage()).toString(), -1, -1);
                    return;
                }
            }
            p.df.b.a("Track.LoadRunnable: calling MediaPlayer.prepareAsync()");
            c.a.prepareAsync();
            p.dg.m.a(c, p.dg.m.d(c));
            return;
        }

        public b(m m2, f f1)
        {
            c = m.this;
            super();
            a = m2;
            b = f1;
        }
    }

    protected class c extends com.pandora.radio.util.b
    {

        final m a;

        public MediaPlayer a()
        {
            return new MediaPlayer();
        }

        protected c()
        {
            a = m.this;
            super();
        }
    }

    private class d
        implements Runnable
    {

        Runnable a;
        final m b;

        public void run()
        {
            try
            {
                m.v(b);
                a.run();
                return;
            }
            catch (Exception exception)
            {
                p.dg.m.a(b, "Exception runing media player command", exception);
            }
        }

        public d(Runnable runnable)
        {
            b = m.this;
            super();
            a = runnable;
        }
    }

    private class e
        implements Runnable
    {

        final m a;
        private com.pandora.radio.util.k.n b;

        public void run()
        {
            if (!p.dg.m.s(a))
            {
                p.dg.m.c(a, true);
                a.a((new StringBuilder()).append("STOPPED - ").append(b).toString());
                p.df.b.a("Track.StopRunnable.run(): track stopped");
                p.dg.m.a(a, b);
                a.v();
                a.b.b(false);
                m.t(a);
                Object obj = p.dg.m.u(a).n();
                if (obj != null)
                {
                    obj = ((m) (obj)).h();
                    if (obj != null)
                    {
                        boolean flag = p.dg.m.b(a).M();
                        boolean flag1 = ((aa) (obj)).M();
                        if (flag && flag1)
                        {
                            flag = ((com.pandora.radio.data.d)p.dg.m.b(a)).c().equals(((com.pandora.radio.data.d)obj).c());
                        } else
                        if (!flag && !flag1)
                        {
                            flag = p.dg.m.b(a).w().equals(((aa) (obj)).w());
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            p.dg.m.a(a, p.dd.bh.a.e, false);
                            p.df.b.a("Track: StopRunnable.run() restarting station timer");
                            p.dg.m.u(a).f();
                            return;
                        }
                    }
                }
            }
        }

        public e(com.pandora.radio.util.k.n n1)
        {
            a = m.this;
            super();
            b = n1;
        }
    }

    public static final class f extends Enum
    {

        public static final f a;
        public static final f b;
        public static final f c;
        private static final f d[];

        public static f valueOf(String s1)
        {
            return (f)Enum.valueOf(p/dg/m$f, s1);
        }

        public static f[] values()
        {
            return (f[])d.clone();
        }

        static 
        {
            a = new f("preload", 0);
            b = new f("preload_video", 1);
            c = new f("normal", 2);
            d = (new f[] {
                a, b, c
            });
        }

        private f(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static String d[] = {
        "preloader", "waiting for videoad to clear", "worker loop"
    };
    private final Object A = new Object();
    private boolean B;
    private AudioManager C;
    private int D;
    private long E;
    private j F;
    private int G;
    private final p.cw.c H;
    private final k I;
    private final g J;
    private int K;
    private p.dd.bh.a L;
    private boolean M;
    private String N;
    private Runnable O;
    private Runnable P;
    private Runnable Q;
    private Runnable R;
    private Runnable S;
    private Runnable T;
    protected MediaPlayer a;
    protected p.cw.b b;
    c c;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private boolean m;
    private boolean n;
    private n o;
    private int p;
    private final l q;
    private final y r;
    private aa s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final Context w;
    private HandlerThread x;
    private Handler y;
    private String z;

    public m(p.cw.c c1, l l1, aa aa1, j j1)
    {
        B = false;
        D = -1;
        E = -1L;
        O = new d(new Runnable() {

            final m a;
            private Runnable b;

            static Runnable a(_cls1 _pcls1)
            {
                return _pcls1.b;
            }

            public void run()
            {
                long l2 = System.currentTimeMillis();
                long l3 = p.dg.m.f(a);
                if (!m.g(a))
                {
                    p.df.b.a("trackLoadDaemon: not playable");
                    return;
                }
                if (a.o() && !p.dg.m.h(a) && l2 - l3 > 0x1d4c0L)
                {
                    a.a(String.format("Mediaplayer taking longer than %s ms to prepare, skipping track", new Object[] {
                        Integer.valueOf(0x1d4c0)
                    }));
                    p.dg.m.a(a, String.format("Mediaplayer taking longer than %s ms to prepare, skipping track", new Object[] {
                        Integer.valueOf(0x1d4c0)
                    }), -1, -1);
                    p.df.b.a("trackLoadDaemon: not prepared");
                    return;
                }
                if (!p.dg.m.h(a) || !p.dg.m.i(a) || m.j(a))
                {
                    break MISSING_BLOCK_LABEL_393;
                }
                if (p.dg.m.k(a) <= 0)
                {
                    p.dg.m.a(a, m.l(a));
                }
                if (!a.b.p())
                {
                    break MISSING_BLOCK_LABEL_265;
                }
                if (!m.m(a))
                {
                    m.n(a);
                    m.o(a);
                    p.dg.m.a(a, true);
                }
                m.e(a).removeCallbacks(p.dg.m.d(a));
                m.e(a).removeCallbacks(b);
                p.dg.m.a(a, b, 250L);
                return;
                a.a("ABOUT TO START PLAYING");
                p.dg.m.b(a, true);
                p.dg.m.b(a, 0);
                m.n(a);
                a.a();
                if (p.dg.m.p(a))
                {
                    p.dg.m.b(a, m.q(a));
                }
                a.a("STARTED PLAYING");
                p.df.b.a("trackLoadDaemon: started playing");
                p.df.b.b();
                m.e(a).removeCallbacks(p.dg.m.d(a));
                m.e(a).removeCallbacks(b);
                p.dg.m.a(a, b, 250L);
                return;
                int i1;
                if (!p.dg.m.h(a) || !p.dg.m.i(a) || !m.j(a))
                {
                    break MISSING_BLOCK_LABEL_555;
                }
                if (p.dg.m.k(a) <= 0)
                {
                    p.dg.m.a(a, m.l(a));
                }
                if (!p.dg.m.p(a))
                {
                    break MISSING_BLOCK_LABEL_509;
                }
                i1 = m.q(a);
                if (i1 <= 0)
                {
                    break MISSING_BLOCK_LABEL_501;
                }
                if (m.r(a) < i1)
                {
                    p.dg.m.c(a, i1);
                    p.dg.m.b(a).c(i1);
                }
                p.dg.m.b(a, i1);
                m.e(a).removeCallbacks(p.dg.m.d(a));
                m.e(a).removeCallbacks(b);
                p.dg.m.a(a, b, 250L);
                return;
                m.e(a).removeCallbacks(p.dg.m.d(a));
                m.e(a).removeCallbacks(b);
                p.dg.m.a(a, b, 250L);
                return;
                Exception exception;
                exception;
                m.e(a).removeCallbacks(p.dg.m.d(a));
                m.e(a).removeCallbacks(b);
                p.dg.m.a(a, b, 250L);
                throw exception;
            }

            
            {
                a = m.this;
                super();
                b = a. new d(new _cls1(this));
            }
        });
        P = new Runnable() {

            final m a;

            public void run()
            {
                p.dg.m.c(a).a(new ai());
            }

            
            {
                a = m.this;
                super();
            }
        };
        Q = new d(new Runnable() {

            final m a;

            public void run()
            {
                while (!m.j(a) || !p.dg.m.h(a) || !m.g(a) || a.a == null || a.t()) 
                {
                    return;
                }
                a.a("UNPAUSE");
                a.a();
            }

            
            {
                a = m.this;
                super();
            }
        });
        R = new d(new Runnable() {

            final m a;

            public void run()
            {
                while (!m.j(a) || !p.dg.m.h(a) || !m.g(a) || a.a == null || !a.t()) 
                {
                    return;
                }
                a.a("PAUSE");
                try
                {
                    a.a.pause();
                    m.o(a);
                    return;
                }
                catch (Exception exception)
                {
                    p.dg.m.a(a, (new StringBuilder()).append("Error during togglepause ").append(exception.getMessage()).toString(), -1, -1);
                }
            }

            
            {
                a = m.this;
                super();
            }
        });
        S = new d(new Runnable() {

            final m a;

            public void run()
            {
                float f1 = 1.0F;
                String s1;
                if (a.a != null)
                {
                    if (!com.pandora.radio.util.i.a(s1 = p.dg.m.b(a).F()))
                    {
                        float f3 = Float.parseFloat(s1);
                        float f2 = (float)Math.pow(10D, f3 / 100F) * 0.95F;
                        a.a(String.format("gain=%s; adjusted track volume=%s", new Object[] {
                            Float.valueOf(f3), Float.valueOf(f2)
                        }));
                        if (f2 <= 1.0F)
                        {
                            f1 = f2;
                        }
                        try
                        {
                            a.a.setVolume(f1, f1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            p.dg.m.a(a, "Exception setting volume", exception);
                        }
                        return;
                    }
                }
            }

            
            {
                a = m.this;
                super();
            }
        });
        T = new d(new Runnable() {

            final m a;

            public void run()
            {
                if (a.a != null)
                {
                    a.a.setVolume(0.1F, 0.1F);
                }
            }

            
            {
                a = m.this;
                super();
            }
        });
        H = c1;
        b = c1.d();
        J = p.dg.g.a(H);
        w = c1.s();
        I = c1.o();
        q = l1;
        r = l1.m();
        s = aa1;
        L = p.dd.bh.a.a;
        e = true;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
        l = 0L;
        t = false;
        o = new n(aa1.w());
        C = (AudioManager)w.getSystemService("audio");
        F = j1;
        c = new c();
    }

    private void A()
    {
        o = new n("0");
    }

    private void B()
    {
        int i1 = C.getStreamVolume(3);
        long l1 = System.currentTimeMillis();
        if (D == -1 || E == -1L)
        {
            E = l1;
            D = i1;
        } else
        if (D != i1 && E + 5000L < l1)
        {
            H.z().a();
            E = l1;
            D = i1;
            return;
        }
    }

    private int C()
    {
        while (k || !o() || !g || a == null) 
        {
            return -1;
        }
        int i1;
        try
        {
            i1 = a.getDuration();
        }
        catch (Exception exception)
        {
            a("MediaPlayer.getDuration() errored out", -1, -1);
            return -1;
        }
        return i1;
    }

    private int D()
    {
        return o.d();
    }

    private int E()
    {
        while (f || k || !g || a == null) 
        {
            return -1;
        }
        int i1;
        try
        {
            i1 = a.getCurrentPosition();
        }
        catch (Exception exception)
        {
            return -1;
        }
        return i1;
    }

    private boolean F()
    {
        boolean flag = false;
        if (f || k)
        {
            return false;
        }
        if (u)
        {
            return v;
        }
        u = true;
        int j1 = D();
        int i1;
        boolean flag1;
        if (p > 0)
        {
            i1 = p;
        } else
        {
            i1 = s.G();
        }
        if (j1 > 0 && i1 > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(String.format("END_OF_PLAY: _prepared=%b, _erroredOut=%b", new Object[] {
            Boolean.valueOf(g), Boolean.valueOf(k)
        }));
        a(String.format("END_OF_PLAY: validData=%b, position=%d, duration=%d", new Object[] {
            Boolean.valueOf(flag1), Integer.valueOf(j1), Integer.valueOf(i1)
        }));
        v = false;
        if (!g || flag1 && Math.abs(i1 - j1) > 1500)
        {
            a("PREMATURE_END_OF_PLAY!!! type=[INTERNAL_INFO_PREMATURE_END_OF_PLAY_POSITION");
            i1 = ((flag) ? 1 : 0);
            if (g)
            {
                i1 = 1;
            }
            I.a("InternalInfo", 1, i1, i);
            v = true;
        }
        return v;
    }

    private boolean G()
    {
        return this == q.n();
    }

    private boolean H()
    {
        while (a == null || !j || !g) 
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.isPlaying();
        }
        catch (IllegalStateException illegalstateexception)
        {
            return false;
        }
        return flag;
    }

    static int a(m m1, int i1)
    {
        m1.p = i1;
        return i1;
    }

    static com.pandora.radio.data.aa.a a(m m1, String s1)
    {
        return m1.e(s1);
    }

    static g a(m m1)
    {
        return m1.J;
    }

    private void a(int i1)
    {
        int j1 = i1;
        if (i1 != 0)
        {
            j1 = Math.round((float)i1 / 1000F);
        }
        if (K != j1)
        {
            K = j1;
            if (b.q())
            {
                H.a(g());
            }
        }
    }

    private void a(Runnable runnable)
    {
        if (!e)
        {
            return;
        } else
        {
            b(runnable);
            return;
        }
    }

    private void a(Runnable runnable, long l1)
    {
        Handler handler;
        if (e)
        {
            if ((handler = y) != null)
            {
                handler.postDelayed(runnable, l1);
                return;
            }
        }
    }

    private void a(String s1, int i1, int j1)
    {
        x();
        break MISSING_BLOCK_LABEL_4;
        if (e && !k)
        {
            I.a("MediaPlayer", i1, j1, i);
            a(s1);
            k = true;
            if (e)
            {
                a(com.pandora.radio.util.k.n.f);
                J.a("track");
                return;
            }
        }
        return;
    }

    private void a(String s1, com.pandora.radio.util.k.n n1, int i1)
    {
        if (com.pandora.radio.util.i.a(s1)) goto _L2; else goto _L1
_L1:
        static class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[com.pandora.radio.util.k.n.values().length];
                try
                {
                    a[com.pandora.radio.util.k.n.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.pandora.radio.util.k.n.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.pandora.radio.util.k.n.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.pandora.radio.util.k.n.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.radio.util.k.n.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.pandora.radio.util.k.n.g.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.radio.util.k.n.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.radio.util.k.n.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.radio.util.k.n.d.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.dg._cls7.a[n1.ordinal()];
        JVM INSTR tableswitch 1 6: default 52
    //                   1 176
    //                   2 183
    //                   3 190
    //                   4 197
    //                   5 204
    //                   6 211;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        n1 = null;
_L11:
        if (n1 != null)
        {
            s1 = Uri.parse(s1).buildUpon();
            s1.appendQueryParameter("sec", (new StringBuilder()).append("").append(i1).toString());
            s1.appendQueryParameter("reason", (new StringBuilder()).append("").append(n1.a()).toString());
            s1 = s1.build().toString();
            p.df.a.a("Track", "pingDRMSkip : %s", new Object[] {
                s1
            });
            H.g().a(new s(s1, System.currentTimeMillis(), 0x5265c00L, null));
        }
_L2:
        return;
_L4:
        n1 = p.dg.a.a;
        continue; /* Loop/switch isn't completed */
_L5:
        n1 = p.dg.a.c;
        continue; /* Loop/switch isn't completed */
_L6:
        n1 = p.dg.a.b;
        continue; /* Loop/switch isn't completed */
_L7:
        n1 = p.dg.a.d;
        continue; /* Loop/switch isn't completed */
_L8:
        n1 = a.e;
        continue; /* Loop/switch isn't completed */
_L9:
        n1 = p.dg.a.f;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void a(String s1, Throwable throwable)
    {
        a(s1, false, throwable);
    }

    private void a(String s1, f f1)
        throws IllegalArgumentException, SecurityException, IllegalStateException, IOException
    {
        a.setDataSource(s1);
        if (!s.M())
        {
            boolean flag;
            if (f1 != p.dg.f.c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            I.a(flag, z, r.c());
        }
        I.d();
    }

    private void a(String s1, boolean flag)
    {
        a(s1, flag, ((Throwable) (null)));
    }

    private void a(String s1, boolean flag, Throwable throwable)
    {
        s1 = d(s1);
        if (flag)
        {
            p.df.a.a("Track", s1, throwable);
            return;
        } else
        {
            p.df.a.c("Track", s1, throwable);
            return;
        }
    }

    private void a(p.dd.bh.a a1, String s1)
    {
        a(a1, false, s1);
    }

    private void a(p.dd.bh.a a1, boolean flag)
    {
        a(a1, flag, N);
    }

    private void a(p.dd.bh.a a1, boolean flag, String s1)
    {
        e();
        M = flag;
        L = a1;
        N = s1;
        if (b.D())
        {
            aa aa1;
            if (p.dd.bh.a.e.equals(a1))
            {
                aa1 = null;
            } else
            {
                aa1 = s;
            }
            H.a(new bh(a1, aa1, flag, s1));
        }
    }

    static void a(m m1, com.pandora.radio.util.k.n n1)
    {
        m1.b(n1);
    }

    static void a(m m1, Runnable runnable)
    {
        m1.a(runnable);
    }

    static void a(m m1, Runnable runnable, long l1)
    {
        m1.a(runnable, l1);
    }

    static void a(m m1, String s1, int i1, int j1)
    {
        m1.a(s1, i1, j1);
    }

    static void a(m m1, String s1, Throwable throwable)
    {
        m1.a(s1, throwable);
    }

    static void a(m m1, String s1, f f1)
        throws IllegalArgumentException, SecurityException, IllegalStateException, IOException
    {
        m1.a(s1, f1);
    }

    static void a(m m1, p.dd.bh.a a1, boolean flag)
    {
        m1.a(a1, flag);
    }

    private void a(boolean flag)
    {
        if (G())
        {
            H.a(new bf(flag, o));
        }
    }

    static boolean a(m m1, boolean flag)
    {
        m1.t = flag;
        return flag;
    }

    static aa b(m m1)
    {
        return m1.s;
    }

    static String b(m m1, String s1)
    {
        m1.z = s1;
        return s1;
    }

    private void b(com.pandora.radio.util.k.n n1)
    {
        int i1;
        byte byte0 = -1;
        int k1 = D();
        int j1 = s.G();
        i1 = j1;
        if (j1 <= 0)
        {
            i1 = p;
        }
        j1 = k1;
        if (i1 > 0)
        {
            j1 = k1;
            if (k1 > i1)
            {
                j1 = i1;
            }
        }
        k1 = byte0;
        if (i1 > 0)
        {
            k1 = byte0;
            if (j1 >= 0)
            {
                k1 = byte0;
                if (i1 >= j1)
                {
                    k1 = Math.round((float)(i1 - j1) / 1000F);
                }
            }
        }
        i1 = Math.round((float)j1 / 1000F);
        if (!s.M())
        {
            I.a(n1, z, r.c(), i1, k1);
        }
        if (m) goto _L2; else goto _L1
_L1:
        c(s.J());
_L4:
        if (m && i1 > 0 && i1 < 900)
        {
            H.i().a(i1, s);
        }
        return;
_L2:
        if (!s.M() && n1 != com.pandora.radio.util.k.n.d)
        {
            a(s.K(), n1, i1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(Runnable runnable)
    {
        Handler handler = y;
        if (handler != null)
        {
            handler.post(runnable);
        }
    }

    static void b(m m1, int i1)
    {
        m1.a(i1);
    }

    static boolean b(m m1, boolean flag)
    {
        m1.j = flag;
        return flag;
    }

    static int c(m m1, int i1)
    {
        m1.G = i1;
        return i1;
    }

    static p.cw.c c(m m1)
    {
        return m1.H;
    }

    private void c(String s1)
    {
        if (!com.pandora.radio.util.i.a(s1))
        {
            H.g().a(new s(s1, System.currentTimeMillis(), 0x5265c00L, null));
        }
    }

    static boolean c(m m1, boolean flag)
    {
        m1.f = flag;
        return flag;
    }

    static Runnable d(m m1)
    {
        return m1.O;
    }

    private String d(String s1)
    {
        String s2;
        String s3;
        long l1;
        if (r != null)
        {
            s3 = r.d();
        } else
        {
            s3 = "NO STATION";
        }
        if (s.M())
        {
            s2 = (new StringBuilder()).append("audio ad ").append(((com.pandora.radio.data.d)s).c()).toString();
        } else
        if (s != null)
        {
            s2 = s.s();
        } else
        {
            s2 = "NO TRACK";
        }
        if (l > 0L)
        {
            l1 = System.currentTimeMillis() - l;
        } else
        {
            l1 = 0L;
        }
        return String.format("TRACK [%s] [%s] [%s] %s", new Object[] {
            s3, s2, Long.valueOf(l1), s1
        });
    }

    static Handler e(m m1)
    {
        return m1.y;
    }

    private com.pandora.radio.data.aa.a e(String s1)
    {
        a((new StringBuilder()).append("Audio quality: ").append(s1).toString());
        return s.a(s1, H.B(), H.l().m());
    }

    static long f(m m1)
    {
        return m1.l;
    }

    static boolean g(m m1)
    {
        return m1.e;
    }

    static boolean h(m m1)
    {
        return m1.g;
    }

    static boolean i(m m1)
    {
        return m1.h;
    }

    static boolean j(m m1)
    {
        return m1.j;
    }

    static int k(m m1)
    {
        return m1.p;
    }

    static int l(m m1)
    {
        return m1.C();
    }

    static boolean m(m m1)
    {
        return m1.t;
    }

    static void n(m m1)
    {
        m1.x();
    }

    static void o(m m1)
    {
        m1.y();
    }

    static boolean p(m m1)
    {
        return m1.H();
    }

    static int q(m m1)
    {
        return m1.D();
    }

    static int r(m m1)
    {
        return m1.G;
    }

    static boolean s(m m1)
    {
        return m1.f;
    }

    static void t(m m1)
    {
        m1.A();
    }

    static l u(m m1)
    {
        return m1.q;
    }

    static void v(m m1)
    {
        m1.z();
    }

    private void w()
    {
        x = new HandlerThread("Media player handler");
        x.start();
        y = new Handler(x.getLooper());
    }

    private void x()
    {
        if (y != null)
        {
            y.removeCallbacks(P);
        }
    }

    private void y()
    {
        H.d().b(false);
        a(p.dd.bh.a.d, F.a(q, s));
    }

    private void z()
    {
        B();
        int i1 = E();
        o.a(i1);
        o.b(H());
        o.a(p());
    }

    void a(com.pandora.radio.util.k.n n1)
    {
        a(((Runnable) (new d(new e(n1)))));
    }

    protected void a(String s1)
    {
        a(s1, false);
    }

    void a(f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!o())
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        l = System.currentTimeMillis();
        this;
        JVM INSTR monitorexit ;
        w();
        b(new d(new b(this, f1)));
        return;
        f1;
        this;
        JVM INSTR monitorexit ;
        throw f1;
    }

    protected boolean a()
    {
        try
        {
            a.start();
            if (!m && !s.M())
            {
                (new u()).execute(new Object[] {
                    s.w()
                });
            }
            m = true;
            H.d().b(true);
            if (!H.v().a())
            {
                H.v().start();
            }
        }
        catch (Exception exception)
        {
            a("Error during mediaplayer start", -1, -1);
            return false;
        }
        a(p.dd.bh.a.c, F.a(q, s));
        return true;
    }

    boolean a(long l1)
    {
        return !o() && s.c(l1);
    }

    void b()
    {
        h = true;
        a("PLAY REQUESTED");
        p.df.b.a("requestPlay: ");
        synchronized (P)
        {
            x();
            a(P, 3000L);
        }
        return;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(String s1)
    {
label0:
        {
            synchronized (A)
            {
                if (s != null && !B)
                {
                    break label0;
                }
            }
            return;
        }
        a("broadcasting start");
        a(p.dd.bh.a.b, s1);
        B = true;
        obj;
        JVM INSTR monitorexit ;
        p.df.b.a("Track: broadcastTrackStart() restarting station timer");
        q.f();
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    void c()
    {
        a(Q);
    }

    void d()
    {
        a(R);
    }

    protected void e()
    {
        int j1 = p;
        int i1 = j1;
        if (j1 <= 0)
        {
            i1 = C();
        }
        if (i1 > 0)
        {
            s.a(i1);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (m)obj;
            if (s == null ? ((m) (obj)).s != null : !s.equals(((m) (obj)).s))
            {
                return false;
            }
        }
        return true;
    }

    public bh f()
    {
        if (L == p.dd.bh.a.a)
        {
            return new bh(L, null, M, N);
        } else
        {
            return new bh(L, s, M, N);
        }
    }

    public bg g()
    {
        return new bg(K, p);
    }

    public aa h()
    {
        return s;
    }

    public int hashCode()
    {
        if (s != null)
        {
            return s.hashCode();
        } else
        {
            return 0;
        }
    }

    public y i()
    {
        return r;
    }

    int j()
    {
        if (k)
        {
            return -1;
        }
        int i1;
        if (!j || p < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        i1 = D();
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        int j1 = p;
        return j1 - i1;
        Exception exception;
        exception;
        a("Error calling getRemainingPlaytimeMilliseconds", exception);
        return -1;
    }

    void k()
    {
        a(S);
    }

    void l()
    {
        a(T);
    }

    boolean m()
    {
        return f;
    }

    boolean n()
    {
        return i;
    }

    boolean o()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
    {
        n = true;
        if (!k)
        {
            if (i1 >= 99 && !i)
            {
                a(String.format((new StringBuilder()).append("BUFFERING percent: ").append(i1).toString(), new Object[0]), true);
                i = true;
                a(true);
                a(String.format("LOADED %sms track in %sms", new Object[] {
                    Integer.valueOf(p), Long.valueOf(System.currentTimeMillis() - l)
                }));
                return;
            }
            if (!i)
            {
                a(String.format((new StringBuilder()).append("BUFFERING percent: ").append(i1).toString(), new Object[0]), true);
                return;
            }
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        x();
        a("TRACK COMPLETED");
        if (F())
        {
            mediaplayer = com.pandora.radio.util.k.n.i;
        } else
        {
            mediaplayer = com.pandora.radio.util.k.n.d;
        }
        a(mediaplayer);
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = new StringBuilder();
        mediaplayer.append("MEDIA PLAYER ERROR: ");
        i1;
        JVM INSTR lookupswitch 3: default 52
    //                   1: 123
    //                   100: 112
    //                   200: 101;
           goto _L1 _L2 _L3 _L4
_L1:
        mediaplayer.append(" Non standard (");
        mediaplayer.append(i1);
        mediaplayer.append(")");
_L6:
        mediaplayer.append(" extra=").append(p.da.a.a(j1));
        a(mediaplayer.toString(), i1, j1);
        return true;
_L4:
        mediaplayer.append("MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
        continue; /* Loop/switch isn't completed */
_L3:
        mediaplayer.append("MEDIA_ERROR_SERVER_DIED");
        continue; /* Loop/switch isn't completed */
_L2:
        mediaplayer.append("MEDIA_ERROR_UNKNOWN");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
    {
        mediaplayer = new StringBuilder();
        mediaplayer.append("MEDIA PLAYER WARN: ");
        i1;
        JVM INSTR lookupswitch 7: default 84
    //                   1: 128
    //                   700: 139
    //                   701: 183
    //                   702: 194
    //                   800: 150
    //                   801: 161
    //                   802: 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        mediaplayer.append(" Non standard (");
        mediaplayer.append(i1);
        mediaplayer.append(")");
_L10:
        mediaplayer.append(" extra=").append(j1);
        a(mediaplayer.toString());
        return true;
_L2:
        mediaplayer.append("MEDIA_INFO_UNKNOWN");
        continue; /* Loop/switch isn't completed */
_L3:
        mediaplayer.append("MEDIA_INFO_VIDEO_TRACK_LAGGING");
        continue; /* Loop/switch isn't completed */
_L6:
        mediaplayer.append("MEDIA_INFO_BAD_INTERLEAVING");
        continue; /* Loop/switch isn't completed */
_L7:
        mediaplayer.append("MEDIA_INFO_NOT_SEEKABLE");
        continue; /* Loop/switch isn't completed */
_L8:
        mediaplayer.append("MEDIA_INFO_METADATA_UPDATE");
        continue; /* Loop/switch isn't completed */
_L4:
        mediaplayer.append("MEDIA_INFO_BUFFERING_START");
        continue; /* Loop/switch isn't completed */
_L5:
        mediaplayer.append("MEDIA_INFO_BUFFERING_END");
        a(true);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (k)
        {
            return;
        } else
        {
            p.df.b.a("MediaPlayer prepared");
            long l1 = System.currentTimeMillis() - l;
            J.a(Long.valueOf(l1));
            g = true;
            a(String.format("PREPARED %sms track in %sms", new Object[] {
                Integer.valueOf(p), Long.valueOf(l1)
            }));
            return;
        }
    }

    boolean p()
    {
        return o() && !n();
    }

    boolean q()
    {
        return e;
    }

    boolean r()
    {
        return h;
    }

    boolean s()
    {
        return j;
    }

    public boolean t()
    {
        return o.c();
    }

    public String toString()
    {
        return d("");
    }

    boolean u()
    {
        return k;
    }

    void v()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e = false;
        this;
        JVM INSTR monitorexit ;
        a("RELEASING RESOURCES");
        MediaPlayer mediaplayer = a;
        if (mediaplayer == null) goto _L2; else goto _L1
_L1:
        a.stop();
_L5:
        a.reset();
_L3:
        a.release();
_L2:
        a = null;
        if (y != null)
        {
            y.removeCallbacksAndMessages(null);
        }
        y = null;
        F = null;
        C = null;
        if (x != null)
        {
            x.quit();
        }
        x = null;
        return;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a("error stopping media player", ((Throwable) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        a = null;
        if (y != null)
        {
            y.removeCallbacksAndMessages(null);
        }
        y = null;
        F = null;
        C = null;
        if (x != null)
        {
            x.quit();
        }
        x = null;
        throw obj;
        obj;
        a("error resetting media player", ((Throwable) (obj)));
          goto _L3
        obj;
        a("error releasing media player", ((Throwable) (obj)));
          goto _L2
        obj;
        x = null;
        throw obj;
        obj;
        x = null;
        throw obj;
        if (true) goto _L5; else goto _L4
_L4:
    }


    // Unreferenced inner class p/dg/m$1$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final _cls1 a;

        public void run()
        {
            m.e(a.a).removeCallbacks(p.dg.m.d(a.a));
            m.e(a.a).removeCallbacks(p.dg._cls1.a(a));
            p.dg.m.a(a.a, p.dg.m.d(a.a), 250L);
        }

            
            {
                a = _pcls1;
                super();
            }
    }

}
