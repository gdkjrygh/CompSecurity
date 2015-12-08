// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.d;
import com.pandora.radio.data.k;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.i;
import com.pandora.radio.util.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p.cw.b;
import p.cw.c;
import p.cx.g;
import p.cx.m;
import p.cx.p;
import p.cx.v;
import p.cx.x;
import p.dd.ao;
import p.dd.ap;
import p.dd.at;
import p.dd.ax;
import p.dd.ay;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.be;
import p.dd.bg;
import p.dd.bh;
import p.dd.bu;
import p.dd.n;
import p.df.a;
import p.di.z;

// Referenced classes of package p.dg:
//            g, m, b, d, 
//            j, c

public class l
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/dg/l$a, s1);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("SUCCESS", 0);
            b = new a("FAILURE", 1);
            c = new a("EXPIRED", 2);
            d = new a("NOMORETRACKS", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/dg/l$b, s1);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("ALIVE", 0);
            b = new b("DISCONNECTED", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private class c
        implements Runnable
    {

        WeakReference a;
        final l b;

        public void a(WeakReference weakreference)
        {
            a = weakreference;
        }

        public void run()
        {
            b.c("observerChangeRunnable running");
            y y1 = (y)a.get();
            if (y1 != null)
            {
                y1 = p.dg.l.a(b).y().b(p.dg.l.a(b).s(), y1.c());
                if (y1 != null && y1.c().equals(p.dg.l.d(b).c()))
                {
                    p.dg.l.a(b, y1);
                    p.dg.l.a(b).a(new ay(y1, p.dd.ay.a.c));
                    p.dg.l.a(b).a(new at(y1));
                }
            }
            l.e(b).removeCallbacks(this);
            b.c("observerChangeRunnable finished");
        }

        private c()
        {
            b = l.this;
            super();
        }

    }

    private static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d e[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(p/dg/l$d, s1);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            a = new d("CAPPED", 0);
            b = new d("EXPIRED", 1);
            c = new d("STATION_DOES_NOT_EXIST", 2);
            d = new d("NOMORETRACKS", 3);
            e = (new d[] {
                a, b, c, d
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        private static final e d[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(p/dg/l$e, s1);
        }

        public static e[] values()
        {
            return (e[])d.clone();
        }

        static 
        {
            a = new e("NEXT", 0);
            b = new e("NEXT_AFTER_AUDIOAD_POD", 1);
            c = new e("ALL", 2);
            d = (new e[] {
                a, b, c
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private boolean A;
    private ContentObserver B;
    private p.cx.v.a C;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    private String g;
    private long h;
    private long i;
    private b j;
    private final List k = Collections.synchronizedList(new LinkedList());
    private y l;
    private p.dg.m m;
    private String n;
    private j o;
    private v p;
    private boolean q;
    private boolean r;
    private final p.cw.c s;
    private final p.cw.b t;
    private final p.dg.d u;
    private final p.dg.g v;
    private final p.cw.f w;
    private p.cw.b.b x;
    private Handler y;
    private c z;

    public l(p.cw.c c1, y y1, Context context, String s1, j j1, boolean flag, p.cw.b.b b1, 
            p.cw.f f1)
    {
        h = 0L;
        i = 0L;
        j = p.dg.b.a;
        B = new ContentObserver(null) {

            final l a;

            public boolean deliverSelfNotifications()
            {
                return true;
            }

            public void onChange(boolean flag1)
            {
                if (p.dg.l.a(a).d() == p.dg.l.b(a))
                {
                    if (p.dg.l.c(a) == null)
                    {
                        p.dg.l.a(a, a. new c());
                    }
                    p.dg.l.c(a).a(new WeakReference(p.dg.l.d(a)));
                    l.e(a).post(p.dg.l.c(a));
                }
            }

            
            {
                a = l.this;
                super(handler);
            }
        };
        C = new p.cx.v.a() {

            final l a;

            private void a(String s2)
            {
                p.df.b.a((new StringBuilder()).append("stationController: ").append(s2).toString());
                a.c(s2);
            }

            public void a(g g1)
            {
                if (!g1.b() && (p.dg.l.a(a) == null || !p.dg.l.a(a).b())) goto _L2; else goto _L1
_L1:
                return;
_L2:
                p.dg.m m1;
                m1 = p.dg.l.f(a);
                if (p.dg.l.g(a).e() >= 50)
                {
                    a(String.format("recieved too many audio errors.  max is %s.  shutting down", new Object[] {
                        Integer.valueOf(50)
                    }));
                    p.cx.m.a();
                    l.h(a).a();
                    return;
                }
                if (p.dg.l.a(a).u().b())
                {
                    break; /* Loop/switch isn't completed */
                }
                if (p.dg.l.i(a) != p.dg.b.b)
                {
                    a("lost network connection");
                    p.dg.l.a(a, p.dg.b.b);
                }
                if (m1 != null && !m1.t() && !p.dg.l.b(a).p() && !p.dg.l.b(a).n())
                {
                    com.pandora.radio.util.i.d();
                } else
                if (m1 == null && !p.dg.l.b(a).p() && !p.dg.l.b(a).n())
                {
                    com.pandora.radio.util.i.d();
                }
                if (p.dg.l.a(a).C() && m1 == null)
                {
                    com.pandora.radio.util.i.d();
                    return;
                }
                if (true) goto _L1; else goto _L3
_L3:
                if (p.dg.l.i(a) == p.dg.b.b && p.dg.l.a(a).u().b())
                {
                    a("regained network connection");
                    p.dg.l.a(a, p.dg.b.a);
                    if (m1 != null && m1.h() != null)
                    {
                        p.dg.l.a(a).a(new ax(m1.h(), true));
                    }
                }
                l.j(a);
                if (p.dg.l.k(a))
                {
                    a("fetching playlist");
                    return;
                }
                static class _cls3
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[d.values().length];
                        try
                        {
                            b[p.dg.d.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            b[p.dg.d.a.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            b[p.dg.d.d.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            b[p.dg.d.b.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        a = new int[a.values().length];
                        try
                        {
                            a[p.dg.a.d.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[p.dg.a.c.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[p.dg.a.a.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (m1 == null)
                {
                    a("incrementing track");
                    g1 = p.dg.l.a(a, com.pandora.radio.util.k.n.c);
                    switch (p.dg._cls3.a[g1.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                    case 2: // '\002'
                        a("no current track - end of playlist.");
                        break;
                    }
                    p.dg.l.a(a, g1);
                    return;
                }
                if (m1.a(0x36ee80L))
                {
                    a("current track ttl has elapsed.  starting next song.");
                    p.dg.l.a(a, com.pandora.radio.util.k.n.g);
                    return;
                }
                if (m1.u())
                {
                    a("current track errored out.  skipping to the next song");
                    p.dg.l.a(a, com.pandora.radio.util.k.n.f);
                    return;
                }
                if (m1.m())
                {
                    g1 = p.dg.l.a(a, com.pandora.radio.util.k.n.d);
                    switch (p.dg._cls3.a[g1.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                    case 2: // '\002'
                        a("current track is complete - end of playlist.");
                        p.dg.l.a(a, g1);
                        return;

                    case 3: // '\003'
                        a("current track is complete.  starting next song.");
                        break;
                    }
                    return;
                }
                if (!m1.q())
                {
                    StringBuilder stringbuilder = (new StringBuilder()).append("unable to play ");
                    if (m1.h() == null)
                    {
                        g1 = "unknown track";
                    } else
                    {
                        g1 = m1.h();
                    }
                    a(stringbuilder.append(g1).append(".  skipping").toString());
                    p.dg.l.a(a, com.pandora.radio.util.k.n.f);
                    return;
                }
                if ((m1 instanceof p.dg.b) && !p.dg.l.a(a, (p.dg.b)m1))
                {
                    StringBuilder stringbuilder1 = (new StringBuilder()).append("blank audio ad, skipping ");
                    if (m1.h() == null)
                    {
                        g1 = "unknown track";
                    } else
                    {
                        g1 = m1.h();
                    }
                    a(stringbuilder1.append(g1).append(".").toString());
                    p.dg.l.a(a, com.pandora.radio.util.k.n.e);
                    return;
                }
                p.dg.l.a(a, m1);
                if (g1.b())
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!l.l(a).F())
                {
                    break; /* Loop/switch isn't completed */
                }
                a("waiting for videoad ad to clear");
                if (!m1.p() && !m1.n())
                {
                    m1.a(p.dg.m.f.b);
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
                if (!m1.o())
                {
                    a("loading normal track");
                    m1.a(p.dg.m.f.c);
                    return;
                }
                if (!m1.r())
                {
                    long l1;
                    if (p.dg.l.g(a).d())
                    {
                        try
                        {
                            a("starved for mediaplayers.  wait for 15 seconds");
                            Thread.sleep(15000L);
                        }
                        // Misplaced declaration of an exception variable
                        catch (g g1) { }
                    }
                    m1.b();
                    if (m1.h().l() == ac.c)
                    {
                        a.b(ac.c);
                        a.a(ac.b);
                        return;
                    }
                }
                while (false) 
                {
                    if (!m1.t() && (p.dg.l.b(a).p() || p.dg.l.b(a).n()))
                    {
                        if (p.dg.l.m(a) <= 0L)
                        {
                            p.dg.l.a(a, System.currentTimeMillis());
                            return;
                        }
                        l1 = System.currentTimeMillis() - p.dg.l.m(a);
                        if (!p.dg.l.a(a).E() && l1 > 0x493e0L)
                        {
                            a((new StringBuilder()).append("Current track has been paused for ").append(l1 / 1000L).append(" seconds.  Marking app eligible for shut down on low memory event").toString());
                            p.dg.l.a(a).a(true);
                            return;
                        }
                        continue;
                    }
                    p.dg.l.a(a, -1L);
                    p.dg.l.a(a).a(false);
                    if (m1.s() && !m1.t())
                    {
                        if (p.dg.l.n(a) <= 0L)
                        {
                            p.dg.l.b(a, System.currentTimeMillis());
                            a(String.format("the current track is hanging.  will wait %s milliseconds for the hang to clear", new Object[] {
                                Long.valueOf(20000L)
                            }));
                            return;
                        }
                        a("current track started but not playing");
                        l1 = System.currentTimeMillis() - p.dg.l.n(a);
                        if (l1 > 20000L)
                        {
                            p.dg.l.g(a).a("station");
                            a(String.format("current track has been hanging for %s milliseconds.  skipping to the next track", new Object[] {
                                Long.valueOf(l1)
                            }));
                            p.dg.l.a(a, com.pandora.radio.util.k.n.f);
                            return;
                        }
                    } else
                    {
                        if (p.dg.l.n(a) > 0L)
                        {
                            a("hang cleared up on it's own");
                        }
                        p.dg.l.b(a, -1L);
                        return;
                    }
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                a = l.this;
                super();
            }
        };
        if (y1 == null)
        {
            throw new IllegalArgumentException("Station constructor must have non-null StationData");
        }
        s = c1;
        t = s.d();
        v = p.dg.g.a(c1);
        w = f1;
        x = b1;
        u = s.i();
        l = y1;
        o = j1;
        d = y1.t();
        e = y1.A();
        if (s1 != null)
        {
            c1 = s1;
            if (s1.length() > 16)
            {
                c1 = s1.substring(0, 16);
            }
            f = c1;
        }
        r = flag;
    }

    static long a(l l1, long l2)
    {
        l1.h = l2;
        return l2;
    }

    static y a(l l1, y y1)
    {
        l1.l = y1;
        return y1;
    }

    static p.cw.c a(l l1)
    {
        return l1.s;
    }

    private a a(com.pandora.radio.util.k.n n1)
    {
        boolean flag;
        flag = false;
        if (p == null)
        {
            return p.dg.a.b;
        }
        if (m != null)
        {
            m.a(n1);
            b(((p.dg.m) (null)));
        }
        if (s.z().c())
        {
            t.a(p.cw.b.a.d);
            if (!q)
            {
                q = true;
                s.z().d();
            }
            return p.dg.a.b;
        }
        q = false;
        if (p() instanceof p.dg.b)
        {
            s.G().e();
        }
        if (n1 == com.pandora.radio.util.k.n.d && s.G().b())
        {
            t.a(p.cw.b.a.c);
            if (!A)
            {
                A = true;
                s.a(new bu(true));
            }
            return p.dg.a.b;
        }
        A = false;
        if (l.w())
        {
            return p.dg.a.c;
        }
        synchronized (k)
        {
            if (!k.isEmpty())
            {
                break MISSING_BLOCK_LABEL_224;
            }
            n1 = p.dg.a.d;
        }
        return n1;
        n1;
        list;
        JVM INSTR monitorexit ;
        throw n1;
        if (!d || com.pandora.radio.util.i.a(f)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L13:
        if (i1 >= k.size()) goto _L4; else goto _L3
_L3:
        n1 = ((p.dg.m)k.get(i1)).h().w();
        if (n1 == null) goto _L6; else goto _L5
_L5:
        if (!n1.equals(f)) goto _L6; else goto _L7
_L7:
        int j1 = i1 - 1;
        if (j1 < 0) goto _L9; else goto _L8
_L8:
        if (((p.dg.m)k.get(j1)).h().M())
        {
            i1 = j1;
        }
          goto _L9
_L11:
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        s.a(new n());
        f = null;
_L10:
        n1 = null;
        j1 = ((flag) ? 1 : 0);
        for (; j1 > i1; j1++)
        {
            break MISSING_BLOCK_LABEL_389;
        }

        n1 = (p.dg.m)k.remove(0);
        if (n1 != null)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        n1 = p.dg.a.b;
        list;
        JVM INSTR monitorexit ;
        return n1;
        c((new StringBuilder()).append("track incremented ").append(n1).toString());
        b(n1);
        list;
        JVM INSTR monitorexit ;
        p.df.b.a("Station: incrementTrack() restarting station timer");
        f();
        return p.dg.a.a;
_L4:
        j1 = 0;
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 0;
          goto _L10
_L9:
        j1 = 1;
        if (true) goto _L11; else goto _L6
_L6:
        i1++;
        if (true) goto _L13; else goto _L12
_L12:
    }

    static a a(l l1, com.pandora.radio.util.k.n n1)
    {
        return l1.a(n1);
    }

    static b a(l l1, b b1)
    {
        l1.j = b1;
        return b1;
    }

    static c a(l l1, c c1)
    {
        l1.z = c1;
        return c1;
    }

    private void a(int i1)
    {
        if (p == null)
        {
            return;
        } else
        {
            p.a();
            p.a(C, i1, 1000);
            return;
        }
    }

    private void a(long l1)
    {
        if (!c)
        {
            s.y().b(l1);
        } else
        {
            aa aaa[] = s.y().a(l1);
            if (aaa.length > 0)
            {
                if (!aaa[0].c(0x124f80L))
                {
                    a(a(aaa));
                    aj aj1 = s.k().J();
                    if (aj1 != null && aj1.g())
                    {
                        b(ac.c);
                    }
                }
                s.y().b(l1);
                if (d)
                {
                    b = false;
                    return;
                }
            }
        }
    }

    private static void a(ac ac1, e e1, List list)
    {
        if (p.dg.e.b == e1 && ac.b == ac1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Incompatible TrackDataType:").append(ac1).append(" with throwOutType:").append(p.dg.e.b).toString());
        }
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = list.iterator();
_L2:
        p.dg.m m1;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            m1 = (p.dg.m)iterator.next();
            if (ac1 != m1.h().l())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (m1.o())
            {
                m1.a(com.pandora.radio.util.k.n.e);
            }
            iterator.remove();
        } while (true);
        break; /* Loop/switch isn't completed */
        ac1;
        list;
        JVM INSTR monitorexit ;
        throw ac1;
        if (ac.b == m1.h().l() && p.dg.e.b == e1 || p.dg.e.c == e1) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
    }

    private void a(List list)
    {
        if (r && !list.isEmpty())
        {
            r = false;
            a(ac.b, p.dg.e.a, list);
            a(ac.c, p.dg.e.a, list);
        }
        k.addAll(list);
    }

    private void a(a a1)
    {
        d d1 = p.dg.d.d;
        p.dg._cls3.a[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 44
    //                   2 63;
           goto _L1 _L2 _L3
_L1:
        a1 = d1;
_L5:
        a(((d) (a1)));
        return;
_L2:
        a1 = d1;
        if (u.b())
        {
            a1 = p.dg.d.a;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        a1 = p.dg.d.b;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        flag = flag1;
        p.dg._cls3.b[d1.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 51
    //                   2 69
    //                   3 90
    //                   4 118;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        flag = false;
_L7:
        if (flag)
        {
            s.d().f();
        }
        return;
_L3:
        s.a(new p.dd.i());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (d && s.C())
        {
            b = true;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        if (!d)
        {
            flag = false;
        } else
        {
            c((new StringBuilder()).append("onPlaylistEnd(").append(d1).append(")- one playlist (cc) station - stopping station").toString());
            p.cw.c c1 = s;
            y y1 = l;
            if (d1 == p.dg.d.b)
            {
                flag2 = true;
            }
            c1.a(new p.dd.aa(y1, flag2));
            flag = flag1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static void a(l l1, a a1)
    {
        l1.a(a1);
    }

    static void a(l l1, p.dg.m m1)
    {
        l1.a(m1);
    }

    private void a(p.dg.m m1)
    {
        m1.b(o());
    }

    private boolean a(p.dg.b b1)
    {
        Object obj1;
        obj1 = (com.pandora.radio.data.d)b1.h();
        if (((com.pandora.radio.data.d) (obj1)).b())
        {
            break MISSING_BLOCK_LABEL_289;
        }
        c((new StringBuilder()).append("start to fetch audio ad metadata.  ad token: ").append(obj1).toString());
        p.df.b.a("audio ad metadata fetch started");
        s.e().a(((com.pandora.radio.data.d) (obj1)));
_L2:
        if (((com.pandora.radio.data.d) (obj1)).g())
        {
            c("this is an audio ad track, but we don't have audio ad inventory.  skipping track");
            b1.v();
            return false;
        }
        break MISSING_BLOCK_LABEL_246;
        Object obj;
        obj;
        int i1 = ((p.cx.y) (obj)).a();
        if (i1 != 1001 && i1 != 13)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            s.e().d();
            s.e().a(((com.pandora.radio.data.d) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            a((new StringBuilder()).append("exception while fetching audio ad metadata.  skipping track [").append(((p.cx.y) (obj)).getMessage()).append("]").toString(), ((Exception) (obj)));
            b1.v();
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        a((new StringBuilder()).append("exception while fetching audio ad metadata.  skipping track [").append(((p.cx.y) (obj)).getMessage()).append("]").toString(), ((Exception) (obj)));
        b1.v();
        return false;
        obj;
        a((new StringBuilder()).append("exception while fetching audio ad metadata.  skipping track [").append(((Exception) (obj)).getMessage()).append("]").toString(), ((Exception) (obj)));
        b1.v();
        return false;
        c((new StringBuilder()).append("dart returned audio ad data: ").append(obj1).toString());
        p.df.b.a("audio ad metadata fetch complete");
        a(ac.c, p.dg.e.b, k);
        return true;
    }

    static boolean a(l l1, p.dg.b b1)
    {
        return l1.a(b1);
    }

    static long b(l l1, long l2)
    {
        l1.i = l2;
        return l2;
    }

    static p.cw.b b(l l1)
    {
        return l1.t;
    }

    private void b(com.pandora.radio.util.k.n n1, aa aa1)
    {
        if (p.cw.d.b(o.b(this, aa1).a) && m != null)
        {
            o.c(this, m.h());
            c("calling stop from silentSkip");
            m.a(n1);
            t.a(p.cw.b.a.b);
            s.a(new ao(p.cw.d.a.a));
        } else
        {
            t();
            if (n1 == com.pandora.radio.util.k.n.b)
            {
                s.a(new ao(p.cw.d.a.i));
                return;
            }
        }
    }

    private void b(p.dg.m m1)
    {
        m = m1;
        if (m1 != null)
        {
            m1 = m1.h();
            if (m1 != null)
            {
                d(m1.w());
            }
        }
    }

    static c c(l l1)
    {
        return l1.z;
    }

    static y d(l l1)
    {
        return l1.l;
    }

    private void d(String s1)
    {
        if (f == null)
        {
            n = s1;
        }
    }

    static Handler e(l l1)
    {
        return l1.y;
    }

    static p.dg.m f(l l1)
    {
        return l1.m;
    }

    static p.dg.g g(l l1)
    {
        return l1.v;
    }

    static v h(l l1)
    {
        return l1.p;
    }

    static b i(l l1)
    {
        return l1.j;
    }

    static void j(l l1)
    {
        l1.y();
    }

    static boolean k(l l1)
    {
        return l1.s();
    }

    static p.cw.f l(l l1)
    {
        return l1.w;
    }

    static long m(l l1)
    {
        return l1.h;
    }

    static long n(l l1)
    {
        return l1.i;
    }

    private boolean s()
    {
        if (!b)
        {
            return false;
        }
        if (!a && x())
        {
            c("fetching more tracks");
            a(l.b());
            if (x())
            {
                a = true;
                u.c();
                k k1 = new k(n, f);
                a(this, s, x, k1);
                if (!d)
                {
                    f = null;
                }
            }
            x = p.cw.b.b.c;
        }
        return a;
    }

    private void t()
    {
        t.a(t.v());
    }

    private void u()
    {
        List list = k;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.dg.m m1 = (p.dg.m)iterator.next();
            if (m1.o())
            {
                m1.a(com.pandora.radio.util.k.n.e);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        k.clear();
        list;
        JVM INSTR monitorexit ;
    }

    private void v()
    {
        Object obj;
        if (!w())
        {
            return;
        }
        obj = new ArrayList(k.size());
        List list = k;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.dg.m m1 = (p.dg.m)iterator.next();
            if (!m1.o())
            {
                ((List) (obj)).add(m1.h());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_90;
        obj;
        list;
        JVM INSTR monitorexit ;
        throw obj;
        list;
        JVM INSTR monitorexit ;
        s.y().c(((List) (obj)));
        return;
    }

    private boolean w()
    {
        boolean flag1 = false;
        String s1 = l.c();
        boolean flag = flag1;
        if (!com.pandora.radio.util.i.a(s1))
        {
            Context context = s.s();
            flag = flag1;
            if (s.y().a(context, s1) != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean x()
    {
label0:
        {
            synchronized (k)
            {
                if (!k.isEmpty())
                {
                    break label0;
                }
            }
            return true;
        }
        Iterator iterator = k.iterator();
        p.dg.m m1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_75;
            }
            m1 = (p.dg.m)iterator.next();
        } while ((m1 instanceof p.dg.b) || !m1.q());
        list;
        JVM INSTR monitorexit ;
        return false;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        c("only audio ads left, ready to get new playlist");
        list;
        JVM INSTR monitorexit ;
        return true;
    }

    private void y()
    {
        p.dg.m m1;
        m1 = m;
        break MISSING_BLOCK_LABEL_5;
        if (m1 != null && m1.s() && m1.j() >= 0)
        {
            int i1 = v.b();
            if (m1.j() <= i1 * 1000 && !m1.p())
            {
                p.dg.m m2 = p();
                if (m2 != null && !m2.o() && m2.q() && !(m2 instanceof p.dg.b) && !s.z().c())
                {
                    m2.a(String.format("starting preload with a %s second headstart", new Object[] {
                        Integer.valueOf(i1)
                    }));
                    m2.a(p.dg.m.f.a);
                    return;
                }
            }
        }
        return;
    }

    public List a(aa aaa[])
    {
        if (aaa == null)
        {
            return new ArrayList();
        }
        ArrayList arraylist = new ArrayList();
        int j1 = aaa.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            aa aa1 = aaa[i1];
            c(String.format("PLAYLIST [%s]: %s", new Object[] {
                aa1.l(), aa1.s()
            }));
            if (aa1.M())
            {
                arraylist.add(new p.dg.b(s, this, (com.pandora.radio.data.d)aa1, o));
            } else
            {
                arraylist.add(new p.dg.m(s, this, aa1, o));
            }
            i1++;
        }
        return arraylist;
    }

    public void a()
    {
        boolean flag1;
        flag1 = true;
        if (p != null)
        {
            return;
        }
        s.b(this);
        p = new v();
        t.a(p.cw.b.a.b);
        android.net.Uri uri = ContentUris.withAppendedId(StationProvider.f, l.b());
        s.s().getContentResolver().registerContentObserver(uri, false, B);
        y = new Handler(Looper.getMainLooper());
        b = true;
        if (u.b()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!e) goto _L4; else goto _L3
_L3:
        if (!com.pandora.radio.util.i.a(f)) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        c = flag;
        u.c();
        a(0);
        return;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a(aa aa1)
    {
        aa aa2;
        aa aa3;
        if (m != null)
        {
            aa2 = m.h();
        } else
        {
            aa2 = null;
        }
        aa3 = aa1;
        if (aa1 == null)
        {
            aa3 = aa2;
        }
        if (aa3 == null)
        {
            c("Track empty, not marking as tired");
            return;
        }
        if (aa3.M())
        {
            c("Track is an audio ad, not marking as tired");
            return;
        }
        boolean flag;
        if (aa2 != null && !aa3.w().equals(aa2.w()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.a(new be(flag));
        (new z()).execute(new Object[] {
            aa3
        });
    }

    public void a(ac ac1)
    {
        a(ac1, p.dg.e.a, k);
    }

    public void a(com.pandora.radio.util.k.n n1, aa aa1)
    {
        if (b(aa1))
        {
            u();
        }
        b(n1, aa1);
    }

    public void a(Exception exception)
    {
        a = false;
        int i1;
        if (exception instanceof p.cx.y)
        {
            i1 = ((p.cx.y)exception).a();
        } else
        {
            i1 = -1;
        }
        switch (i1)
        {
        default:
            a((new StringBuilder()).append("error fetching fragment: ").append(exception).toString(), exception);
            return;

        case 1006: 
        case 1038: 
            c((new StringBuilder()).append("error fetching fragment: ").append(exception.getMessage()).toString());
            break;
        }
        b = false;
        if (i1 == 1006)
        {
            exception = p.dg.d.c;
        } else
        {
            exception = p.dg.d.b;
        }
        a(((d) (exception)));
        exception = l.c();
        s.y().a(exception);
        s.x().c();
        s.a(new p.dd.p(exception, true));
    }

    void a(String s1)
    {
        p.dg.m m1 = m;
        p.df.b.a("Station.skip(): starting");
        if (m1 == null)
        {
            s.a(new ap(p.cw.d.a.d, null, s1));
            c("Track empty, not skipping");
            return;
        }
        Object obj = m1.h();
        if (m1 instanceof p.dg.b)
        {
            s.a(new ap(p.cw.d.a.c, ((aa) (obj)), s1));
            return;
        }
        Object obj1 = o.b(this, ((aa) (obj)));
        if (p.cw.d.a(((j.a) (obj1)).a))
        {
            t();
            s.a(new ap(((j.a) (obj1)).a, ((aa) (obj)), s1));
            return;
        }
        s.a(new ap(p.cw.d.a.a, ((aa) (obj)), s1));
        o.c(this, ((aa) (obj)));
        b(ac.c);
        obj1 = (new StringBuilder()).append("calling stop from Station.skip, source = ");
        obj = s1;
        if (com.pandora.radio.util.i.a(s1))
        {
            obj = "unknown";
        }
        c(((StringBuilder) (obj1)).append(((String) (obj))).toString());
        m1.a(com.pandora.radio.util.k.n.a);
    }

    public void a(String s1, Exception exception)
    {
        String s2 = l.d();
        Object obj;
        if (m != null)
        {
            obj = m.h();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj = ((aa) (obj)).s();
        } else
        {
            obj = "";
        }
        p.df.a.a("Station", exception, "[%s] [%s] %s", new Object[] {
            s2, obj, s1
        });
    }

    public void a(List list, String s1)
    {
        if (u.b())
        {
            b = false;
            a = false;
            if (m == null)
            {
                a(p.dg.d.a);
            }
            return;
        }
        a = false;
        if (d && !s.C())
        {
            b = false;
        } else
        {
            b = true;
        }
        g = s1;
        a(list);
        u.g();
        p.df.b.a("Station: addToPlaylist() restarting station timer");
        f();
    }

    protected void a(l l1, p.cw.c c1, p.cw.b.b b1, k k1)
    {
        (new p.dg.c()).execute(new Object[] {
            l1, c1, b1, k1
        });
    }

    public void a(boolean flag, String s1, com.pandora.radio.util.k.n n1)
    {
        c((new StringBuilder()).append("stopping station - ").append(s1).toString());
        try
        {
            if (y != null)
            {
                y.removeCallbacks(z);
            }
            z = null;
            y = null;
            s.s().getContentResolver().unregisterContentObserver(B);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("Station", "stop", s1);
            return;
        }
        t.a(p.cw.b.a.e);
        if (p == null)
        {
            return;
        }
        c("killing timer");
        s.c(this);
        p.a();
        p = null;
        p.df.b.a("Station.stop(): saving track data");
        v();
        if (m != null)
        {
            c("stopping current track");
            m.a(n1);
            b(((p.dg.m) (null)));
        }
        p.df.b.a("Station.stop(): clearing playlist");
        u();
        if (!flag)
        {
            c("sending empty trackdata");
            s.a(new bh(p.dd.bh.a.a, null));
        } else
        {
            try
            {
                p.df.b.a("Station.stop(): sleeping for 500ms");
                Thread.sleep(500L);
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        c("stopped station");
        p.df.b.a("Station.stop(): finished");
    }

    public void b()
    {
        if (m != null)
        {
            m.d();
        }
    }

    public void b(ac ac1)
    {
        a(ac1, p.dg.e.c, k);
    }

    public void b(String s1)
    {
        f = s1;
        b = true;
        u();
    }

    public boolean b(aa aa1)
    {
        return o.a(this, aa1);
    }

    public j.a c(aa aa1)
    {
        return o.b(this, aa1);
    }

    public void c()
    {
        if (m != null)
        {
            m.c();
        }
    }

    public void c(String s1)
    {
        a(s1, ((Exception) (null)));
    }

    public void d()
    {
label0:
        {
            if (m != null)
            {
                if (!m.t())
                {
                    break label0;
                }
                m.k();
            }
            return;
        }
        m.c();
    }

    public void e()
    {
        if (m != null)
        {
            m.l();
        }
    }

    public void f()
    {
        a(20);
    }

    public void g()
    {
        u();
    }

    public void h()
    {
        if (m == null)
        {
            c("Track empty, not thumbing");
            return;
        }
        aa aa1 = m.h();
        if (m instanceof p.dg.b)
        {
            s.a(new bd(p.cw.d.a.e, aa1, false));
            return;
        }
        if (!aa1.B())
        {
            s.a(new bd(p.cw.d.a.f, aa1, false));
            return;
        }
        if (aa1.E() == 1)
        {
            s.a(new bc(aa1, 0, false));
            (new p.di.i()).execute(new Object[] {
                s, aa1, Integer.valueOf(0)
            });
            return;
        } else
        {
            s.a(new bd(p.cw.d.a.a, aa1, false));
            (new p.di.i()).execute(new Object[] {
                s, aa1, Integer.valueOf(1)
            });
            return;
        }
    }

    public void i()
    {
        if (m == null)
        {
            c("Track empty, not thumbing");
            return;
        }
        aa aa1 = m.h();
        if (m instanceof p.dg.b)
        {
            s.a(new bb(p.cw.d.a.g, aa1, false));
            return;
        }
        if (!m.h().B())
        {
            s.a(new bb(p.cw.d.a.h, aa1, false));
            return;
        }
        if (aa1.E() == -1)
        {
            s.a(new bc(aa1, 0, false));
            (new p.di.i()).execute(new Object[] {
                s, aa1, Integer.valueOf(0)
            });
            return;
        } else
        {
            s.a(new bb(p.cw.d.a.a, aa1, false));
            (new p.di.i()).execute(new Object[] {
                s, aa1, Integer.valueOf(-1)
            });
            return;
        }
    }

    public bh j()
    {
        p.dg.m m1 = m;
        if (m1 != null)
        {
            return m1.f();
        } else
        {
            return new bh(p.dd.bh.a.a, null);
        }
    }

    public bg k()
    {
        p.dg.m m1 = m;
        if (m1 != null)
        {
            return m1.g();
        } else
        {
            return new bg(0, 0);
        }
    }

    public void l()
    {
        if (m != null && (m instanceof p.dg.b))
        {
            c("stopping current track");
            m.a(com.pandora.radio.util.k.n.e);
            b(((p.dg.m) (null)));
            s.a(new bh(p.dd.bh.a.a, null));
        }
    }

    public y m()
    {
        return l;
    }

    public p.dg.m n()
    {
        return m;
    }

    public String o()
    {
        return g;
    }

    protected p.dg.m p()
    {
label0:
        {
            p.dg.m m1;
            synchronized (k)
            {
                Iterator iterator = k.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    m1 = (p.dg.m)iterator.next();
                } while (!m1.q());
            }
            return m1;
        }
        list;
        JVM INSTR monitorexit ;
        return null;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean q()
    {
        if (m != null && m.p())
        {
            return true;
        }
        List list = k;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = k.iterator();
_L2:
        p.dg.m m1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_70;
            }
            m1 = (p.dg.m)iterator.next();
        } while (m1 == null);
        if (!m1.p()) goto _L2; else goto _L1
_L1:
        list;
        JVM INSTR monitorexit ;
        return true;
        list;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean r()
    {
        return o.b();
    }
}
