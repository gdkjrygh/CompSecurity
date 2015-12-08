// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class cvh
    implements dei, nfp
{

    private static final String m = cvh.getSimpleName();
    final deo a;
    boolean b;
    volatile boolean c;
    cji d;
    cqn e;
    int f;
    cnq g;
    List h;
    cuu i;
    cje j;
    long k;
    long l;
    private final cvg n;
    private final k o;
    private final cba p = new cba();
    private volatile cvi q;
    private cnq r;
    private long s;
    private final chp t;
    private ciy u;
    private ciy v;
    private long w;
    private long x;
    private final cts y = new cts();

    public cvh(cvg cvg1, chp chp1, k k1)
    {
        n = (cvg)b.a(cvg1, "listener", null);
        t = (chp)b.a(chp1, "videoSink", null);
        o = k1;
        a = new deo(m);
        k = -1L;
        x = -1L;
    }

    private ciy a(cje cje1)
    {
        ciy ciy1;
        long l1;
label0:
        {
            ciy1 = (ciy)cje1.b();
            if (ciy1 != null)
            {
                l1 = ciy1.a;
                if (cje1 != j)
                {
                    break label0;
                }
                k = l1;
            }
            return ciy1;
        }
        if (cje1 == h.get(f + 1))
        {
            x = l1;
            return ciy1;
        } else
        {
            throw c.a("Pulled frame from an unrecognised source");
        }
    }

    private void a(long l1, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (f == e.d() - 1)
        {
            f = f + 1;
            g = null;
            r = null;
            j = null;
            l = SystemClock.elapsedRealtimeNanos() / 1000L;
            n.a();
        } else
        {
            s = s + ((g.f.a() + g.f.b) - r.f.b - b(f));
            f = f + 1;
            g = r;
            if (f < e.d() - 1)
            {
                r = e.b(f + 1);
                q = cvi.b;
            } else
            {
                r = null;
                q = cvi.a;
            }
            d();
            j = (cje)h.get(f);
            u = v;
            v = null;
            k = x;
            x = -1L;
        }
_L4:
        a.b("Update stream state");
        return;
_L2:
        if (l1 >= e() && q != cvi.c)
        {
            q = cvi.c;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private long b(int i1)
    {
        czw czw1;
        if (i1 >= 0 && i1 != e.d() - 1)
        {
            if ((czw1 = e.d(i1)) != null)
            {
                return czw1.b();
            }
        }
        return 0L;
    }

    private cux c()
    {
        cuy cuy1 = new cuy();
        int i1;
        int j1;
        int k1;
        int i2;
        int j2;
        boolean flag;
        boolean flag1;
        if (q == cvi.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cuy1.b = flag;
        i2 = g.j + 1;
        if (flag && r != null)
        {
            i1 = r.j + 1;
        } else
        {
            i1 = 0;
        }
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        j2 = i2 + j1;
        if (flag)
        {
            j1 = j2 - i1;
        } else
        {
            j1 = 0;
        }
        if (i1 <= i2 + 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.a(flag1, "new layout should at most include one extra input");
        k1 = 0;
        do
        {
            while (k1 < j2) 
            {
                int k2 = (k1 - i2) + 1;
                if (k2 >= 0 || k1 < y.a.size())
                {
                    ciy ciy1;
                    cpz cpz1;
                    cpz cpz2;
                    Object obj;
                    int l1;
                    if (flag && k1 == j2 - 1)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    if (l1 != 0)
                    {
                        cpz1 = cpz.a(i2);
                    } else
                    {
                        cpz1 = cpz.a(k1, i2);
                    }
                    if (!flag || k1 < j1)
                    {
                        cpz2 = cpz.a(i1);
                    } else
                    {
                        cpz2 = cpz.a(k1 - j1, i1);
                    }
                    if (k2 < 0)
                    {
                        ciy1 = ((ctt)y.a.get(k1)).a;
                    } else
                    if (k2 == 0)
                    {
                        ciy1 = u;
                    } else
                    {
                        ciy1 = v;
                    }
                    obj = e;
                    if (k2 < 0)
                    {
                        l1 = ((ctt)y.a.get(k1)).c;
                    } else
                    {
                        l1 = f + k2;
                    }
                    obj = ((cqn) (obj)).c(l1);
                    cuy1.a.add(new cpy(ciy1, ((cnu) (obj)), cpz1, cpz2));
                }
                k1++;
            }
            return new cux(Collections.unmodifiableList(cuy1.a), cuy1.b);
        } while (true);
    }

    private void d()
    {
        p.f = f;
        p.h = e.d();
        p.e = g.f.a();
        p.i = g.d;
        p.o = b(f);
        p.n = b(f - 1);
        p.p = e.h().trim();
        p.q = e.i().trim();
        p.r = e.j();
        p.s = e.c(f).d.a(0L, g.f.a());
        p.x = g.b();
        if (f < e.d() - 1)
        {
            p.k = r.d;
            p.l = r.f.a();
            p.t = e.c(f + 1).d.a(0L, g.f.a());
            p.y = r.b();
        }
        if (f > 0)
        {
            p.j = e.b(f - 1).d;
            p.z = e.b(f - 1).b();
        }
    }

    private long e()
    {
        return g.f.c - b(f);
    }

    public final Bitmap a(chq chq1)
    {
        t.c();
        p.g = -1;
        p.c = 0L;
        p.w = true;
        boolean flag = b;
        b = true;
        while (!Thread.currentThread().isInterrupted() && !b(k) && j != null) ;
        b = flag;
        p.g = -1;
        p.c = 0L;
        p.w = false;
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        if (j == null)
        {
            return null;
        }
        try
        {
            chq1 = chq1.a(t, null);
            t.b();
        }
        // Misplaced declaration of an exception variable
        catch (chq chq1)
        {
            Log.e(m, "error getting last rendered frame", chq1);
            return null;
        }
        return chq1;
    }

    void a()
    {
        if (v != null)
        {
            ((cje)h.get(f + 1)).a(v);
            v = null;
        }
        if (u != null)
        {
            long l1 = u.a;
            boolean flag = u.b;
            j.a(u);
            u = null;
            if (flag)
            {
                a(l1, flag);
            }
        }
    }

    void a(int i1)
    {
        f = i1;
        j = (cje)h.get(f);
        g = e.b(i1);
        if (f < e.d() - 1)
        {
            r = e.b(f + 1);
            return;
        } else
        {
            r = null;
            return;
        }
    }

    void a(cqn cqn1)
    {
        e = (cqn)b.a(cqn1, "timeline", null);
        p.v = e.l();
        i.a(e.g());
    }

    public final void a(nfn nfn1)
    {
        nfn1.a("State %s. Last pulled frames primary: %d us  (storyboard offset %d us for clip index %d), secondary: %d us", new Object[] {
            q.toString(), Long.valueOf(k), Long.valueOf(s), Integer.valueOf(f), Long.valueOf(x)
        });
    }

    public final boolean a(long l1)
    {
        c.a(h.size(), "mVideoSources.size()", e.d(), null);
        int i1;
        boolean flag;
        if (d != null || l1 == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "either timestampUs must be zero or seeker must be non-null");
        a();
        if (d != null)
        {
            i1 = d.a(l1, h, f);
        } else
        {
            i1 = 0;
        }
        if (i1 == h.size())
        {
            return false;
        } else
        {
            a(i1);
            return c(l1);
        }
    }

    public final void b()
    {
        a.a("stop()");
        if (u != null)
        {
            j.a(u);
            u = null;
        }
        if (v != null)
        {
            ((cje)h.get(f + 1)).a(v);
            v = null;
        }
        for (cts cts1 = y; cts1.a.size() > 0;)
        {
            ctt ctt1 = (ctt)cts1.a.pollLast();
            if (ctt1.b != null)
            {
                ctt1.b.a(ctt1.a);
            } else
            {
                dee.a(ctt1.a);
            }
        }

        if (h != null)
        {
            for (Iterator iterator = h.iterator(); iterator.hasNext(); ((cje)iterator.next()).a()) { }
            h = null;
        }
        j = null;
        a.a(false);
        a.a();
        e = null;
        dee.a(d);
        d = null;
        k = -1L;
        x = -1L;
    }

    public final boolean b(long l1)
    {
        boolean flag;
        if (j == null)
        {
            a.a(false);
            return false;
        }
        a.a("step()");
        if (u == null)
        {
            u = a(j);
        }
        if (q == cvi.c && v == null)
        {
            v = a((cje)h.get(f + 1));
        }
        if (q == cvi.b)
        {
            ciy ciy1 = a((cje)h.get(f + 1));
            if (ciy1 != null)
            {
                if (ciy1.a >= r.f.b)
                {
                    v = ciy1;
                    q = cvi.a;
                } else
                {
                    ((cje)h.get(f + 1)).a(ciy1);
                }
            }
        }
        a.b("Advance sources");
        if (u == null || q == cvi.c && v == null)
        {
            a.a(false);
            return false;
        }
        if (q != cvi.c)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        long l2 = u.a - e() - (v.a - r.f.b);
        if (l2 > 50000L)
        {
            ((cje)h.get(f + 1)).a(v);
            v = null;
            a.b("Release diverged frames");
        } else
        {
label0:
            {
                if (l2 >= -50000L)
                {
                    break label0;
                }
                l2 = u.a;
                boolean flag1 = u.b;
                j.a(u);
                u = null;
                a.b("Release diverged frames");
                a(l2, flag1);
            }
        }
        flag = true;
_L2:
        if (flag)
        {
            a.a(false);
            return false;
        }
        break MISSING_BLOCK_LABEL_416;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        long l3;
        long l4;
        long l5;
        boolean flag2;
        boolean flag3;
        l3 = u.a;
        l4 = l3 + s;
        if (l3 < g.f.c)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        c.a(flag2, "primary presentation timestamp must be less than the clip end point");
        if (!b && l1 < l4)
        {
            a.a(false);
            return false;
        }
        l5 = l4 - w;
        if (l5 > 0x186a0L || l5 < 0L)
        {
            String s1 = m;
            l5 = w / 1000L;
            long l6 = l4 / 1000L;
            Log.w(s1, (new StringBuilder(80)).append("Storyboard time discontinuity; from ").append(l5).append(" to ").append(l6).toString());
        }
        w = l4;
        a.b("Compute and check storyboard time");
        boolean flag4 = u.b;
        flag3 = false;
        l5 = l1 - l4;
        if (!b && l5 > 0x493e0L)
        {
            String s2 = m;
            l4 = l5 / 1000L;
            l1 /= 1000L;
            Log.e(s2, (new StringBuilder(95)).append("Frame is ").append(l4).append(" ms late: requesting resync. Media time is ").append(l1).append(" ms").toString());
            a.a(false);
            n.b();
            flag2 = flag3;
        } else
        if (!b && l5 > 50000L)
        {
            String s3 = m;
            l4 = l5 / 1000L;
            l1 /= 1000L;
            Log.w(s3, (new StringBuilder(89)).append("Frame is ").append(l4).append(" ms late: dropping it. Media time is ").append(l1).append(" ms").toString());
            flag2 = flag3;
        } else
        {
label1:
            {
                if (l3 >= g.f.b)
                {
                    break label1;
                }
                flag2 = flag3;
                if (flag4)
                {
                    Log.w(m, "Unexpected end of clip before reaching the clip start point.");
                    flag2 = flag3;
                }
            }
        }
_L5:
        float f1;
        Object obj;
        Object obj1;
        if (flag4)
        {
            y.a(u, j, f, r);
        } else
        {
            j.a(u);
        }
        u = null;
        if (q == cvi.c)
        {
            ((cje)h.get(f + 1)).a(v);
            v = null;
        }
        a(l3, flag4);
        a.a(false);
        return flag2;
        if (q == cvi.c || f <= 0) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (l3 < g.f.b + e.d(f - 1).b()) goto _L5; else goto _L4
_L4:
        if (b) goto _L7; else goto _L6
_L6:
        flag2 = flag3;
        if (l5 >= 50000L) goto _L5; else goto _L7
_L7:
        if (!b && l5 > 50000L)
        {
            obj = m;
            l5 /= 1000L;
            l1 /= 1000L;
            Log.w(((String) (obj)), (new StringBuilder(76)).append("Frame is ").append(l5).append(" ms late. Media time is ").append(l1).append(" ms").toString());
        }
        p.b = l4;
        l1 = e.g().s(p);
        if (l4 != 0L || l1 == 0L) goto _L9; else goto _L8
_L8:
        p.a = l1;
        p.d = l1 - g.f.b;
        obj1 = p;
_L11:
        obj = obj1;
        f1 = 0.0F;
_L12:
        obj.m = f1;
        e.g().z(p);
        obj = c();
        i.a(((cux) (obj)), t, l4, e.g(), p);
        a.b("Render frames");
        flag2 = true;
          goto _L5
_L9:
        p.a = l4;
        p.d = u.a - g.f.b;
        obj = p;
        obj1 = obj;
        if (q != cvi.c) goto _L11; else goto _L10
_L10:
        obj1 = e.d(f);
        if (obj1 == null)
        {
            f1 = 0.0F;
        } else
        {
            f1 = ((czw) (obj1)).a(l3 - e());
        }
          goto _L12
    }

    boolean c(long l1)
    {
        long l4;
        l4 = 0L;
        long l2 = 0L;
        int i1 = 0;
        while (i1 <= f) 
        {
            long l6 = e.b(i1).f.a();
            long l5;
            if (i1 < e.d() - 1)
            {
                l5 = e.d(i1).b();
            } else
            {
                l5 = 0L;
            }
            i1++;
            l4 = l2;
            l2 = (l2 + l6) - l5;
        }
        s = l4 - g.f.b;
        a.a("seek()");
        c = false;
        a.b("Initialize state");
        q = cvi.a;
        cje cje1;
        long l3;
        cje1 = j;
        l3 = g.f.b;
        Object obj = null;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_181;
        }
        cje1.a(obj);
_L3:
        if (Thread.interrupted() || c)
        {
            c = false;
            throw new InterruptedException("interrupted while pulling a video frame");
        }
          goto _L1
        obj;
        u = null;
        Thread.currentThread().interrupt();
_L6:
        a.b("Prepare primary source");
        if (r != null)
        {
            ciy ciy1;
            if (l1 - l4 >= g.f.a() - e.d(f).b())
            {
                q = cvi.c;
            } else
            {
                q = cvi.b;
            }
            a.b("Prepare secondary source");
        }
        if (v == null)
        {
            x = -1L;
        }
        if (u != null)
        {
            w = u.a + s;
        } else
        {
            k = -1L;
        }
        d();
        p.c = 0L;
        a.b("Updating timestamps and clip parameters");
        a.a(false);
        if (Thread.interrupted())
        {
            throw new InterruptedException("Interrupted while seeking video timeline.");
        }
        break MISSING_BLOCK_LABEL_451;
_L1:
        ciy1 = a(cje1);
        if (ciy1 == null) goto _L3; else goto _L2
_L2:
        if (ciy1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ciy1.a >= (l1 - l4) + l3)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ciy1;
        if (!ciy1.b) goto _L5; else goto _L4
_L4:
        u = ciy1;
          goto _L6
        return j != null && u != null;
    }

}
