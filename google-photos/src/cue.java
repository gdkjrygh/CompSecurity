// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class cue
{

    private static final String g = cue.getSimpleName();
    private boolean A;
    private ctq B;
    private cqf C;
    private Bitmap D;
    final LinkedBlockingQueue a = new LinkedBlockingQueue();
    final Object b = new Object();
    final AtomicBoolean c = new AtomicBoolean(true);
    cuk d;
    volatile cvh e;
    cqf f;
    private final Context h;
    private final noj i;
    private final cjs j;
    private final ckx k;
    private final ckx l;
    private final chq m;
    private final cuu n;
    private final buf o;
    private final cko p;
    private final boolean q;
    private final Executor r;
    private final Executor s;
    private final cvf t;
    private final k u;
    private long v;
    private final RectF w = new RectF();
    private final Runnable x = new cug(this);
    private final cvg y = new cuf(this);
    private int z;

    public cue(Context context, noj noj1, cjs cjs1, ckx ckx1, ckx ckx2, chq chq1, cuu cuu1, 
            buf buf1, cko cko1, cqf cqf1, boolean flag, Executor executor, Executor executor1, cvf cvf1, 
            k k1)
    {
        h = (Context)b.a(context, "context", null);
        i = (noj)b.a(noj1, "movieMakerProvider", null);
        j = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        k = (ckx)b.a(ckx1, "audioDecoderPool", null);
        l = (ckx)b.a(ckx2, "videoDecoderPool", null);
        m = (chq)b.a(chq1, "renderContext", null);
        n = (cuu)b.a(cuu1, "renderer", null);
        o = (buf)b.a(buf1, "stateTracker", null);
        p = (cko)b.a(cko1, "bitmapFactory", null);
        C = (cqf)b.a(cqf1, "storyboard", null);
        q = flag;
        r = (Executor)b.a(executor, "decoderExecutor", null);
        s = executor1;
        t = cvf1;
        u = k1;
        if (t != null)
        {
            b.a(executor1, "listenerExecutor", "cannot be null if mPlaybackStateListener or mProgressListener are non-null");
        }
        d = cuk.c;
    }

    private void a(int i1)
    {
        synchronized (b)
        {
            z = i1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(cue cue1)
    {
        Object obj = cue1.B;
        long l1;
        long l2;
        if (((ctq) (obj)).f)
        {
            l1 = (SystemClock.elapsedRealtimeNanos() / 1000L - ((ctq) (obj)).g) * -1L;
        } else
        {
            l1 = ((ctq) (obj)).c.c() - ((ctq) (obj)).c();
        }
        obj = cue1.e;
        if (((cvh) (obj)).j == null)
        {
            l2 = (SystemClock.elapsedRealtimeNanos() / 1000L - ((cvh) (obj)).l) * -1L;
        } else
        {
            l2 = 0L;
            int i1 = ((cvh) (obj)).f;
            while (i1 < ((cvh) (obj)).e.d()) 
            {
                long l4 = ((cvh) (obj)).e.b(i1).f.c;
                long l5 = ((cvh) (obj)).e.b(i1).f.b;
                long l3;
                if (i1 < ((cvh) (obj)).e.d() - 1)
                {
                    l3 = ((cvh) (obj)).e.d(i1).b();
                } else
                {
                    l3 = 0L;
                }
                l2 += l4 - l5 - l3;
                i1++;
            }
            l2 -= ((cvh) (obj)).k - ((cvh) (obj)).g.f.b;
        }
        if (cue1.q)
        {
            if (l1 <= 0L && l2 <= 0L)
            {
                cue1.a(true);
                cue1.d();
            }
        } else
        {
            if (l1 <= 0L)
            {
                if (l2 > 50000L)
                {
                    Log.w(g, String.format("Audio stopped %d ms ago. Video has %d ms remaining.", new Object[] {
                        Long.valueOf(-l1 / 1000L), Long.valueOf(l2 / 1000L)
                    }));
                }
                cue1.a(true);
                cue1.d();
                return;
            }
            if (l1 > 50000L)
            {
                Log.w(g, String.format("Video stopped %d ms ago. Audio has %d ms remaining.", new Object[] {
                    Long.valueOf(-l2 / 1000L), Long.valueOf(l1 / 1000L)
                }));
                return;
            }
        }
    }

    private void a(cuk cuk1, long l1)
    {
        synchronized (b)
        {
            d = cuk1;
            if (d != cuk.c)
            {
                z = 0;
                A = false;
            }
        }
        if (t != null)
        {
            obj = D;
            s.execute(new cuh(this, cuk1, ((Bitmap) (obj)), l1));
        }
        return;
        cuk1;
        obj;
        JVM INSTR monitorexit ;
        throw cuk1;
    }

    private void a(boolean flag)
    {
        synchronized (b)
        {
            A = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean a(long l1, cua cua1)
    {
        cua1.d();
        return B.a(l1) && e.a(cua1.c());
    }

    private boolean a(long l1, cua cua1, cqf cqf1, int i1)
    {
        int j2 = cqf.a(C, cqf1);
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        l1 = 0L;
_L5:
        int j1;
        int k1;
        Object obj;
        Object obj1;
        Object obj2;
        ckg ackg[];
        Object obj3;
        cnq cnq1;
        ckg ckg1;
        int i2;
        long l2;
        long l3;
        boolean flag;
        if (cqf1 != null)
        {
            flag = Collections.unmodifiableList(C.c).equals(Collections.unmodifiableList(cqf1.c));
        } else
        {
            flag = false;
        }
        if (flag)
        {
            B.a(C);
            k1 = 1;
        } else
        {
            dej.a(B);
            cqf cqf2;
            try
            {
                cqf1 = cja.a(C, k, j, i1);
            }
            // Misplaced declaration of an exception variable
            catch (cua cua1)
            {
                return false;
            }
            obj = B;
            cqf2 = C;
            c.b(((ctq) (obj)).d, "mMixer", "already initialized");
            obj.d = (cjk)b.a(cqf1, "audioMixer", null);
            obj.e = false;
            ((ctq) (obj)).a(cqf2);
            k1 = B.a(l1) & true;
        }
        if (k1 == 0)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_518;
_L2:
        if (j2 == 1)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj = C;
        b.a(cqf1, "oldStoryboard", null);
        l1 = b.b(l1, "oldTimestampUs");
        for (j1 = 0; j1 < cqf1.d() && l1 >= cqf1.b(j1).f.a(); j1++)
        {
            l2 = l1 - cqf1.b(j1).f.a();
            l1 = l2;
            if (j1 < cqf1.d() - 1)
            {
                l1 = l2 + cqf1.d(j1).b();
            }
        }

        if (cqf1.b(0).d == cnt.d && ((cqf) (obj)).b(0).d != cnt.d)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0 || j1 != 0) goto _L4; else goto _L3
_L3:
        l2 = 0L;
_L7:
        l1 = l2;
          goto _L5
_L4:
        if (k1 != 0)
        {
            k1 = j1 - 1;
        } else
        {
            k1 = j1;
        }
        i2 = k1;
        if (cqf1.b(0).d != cnt.d)
        {
            i2 = k1;
            if (((cqf) (obj)).b(0).d == cnt.d)
            {
                i2 = k1 + 1;
            }
        }
        c.a(i2, "newClipIndex", Collections.unmodifiableList(((cqf) (obj)).b));
        b.a(cqf1.b(j1).e, "oldStoryboard.getVideoClip(clipIndex).uri", ((cqf) (obj)).b(i2).e);
        j1 = 0;
        l2 = l1;
        if (j1 >= i2) goto _L7; else goto _L6
_L6:
        l2 = ((cqf) (obj)).b(j1).f.a();
        l3 = ((cqf) (obj)).d(j1).b();
        j1++;
        l1 = (l1 + l2) - l3;
        break MISSING_BLOCK_LABEL_352;
        if (cqf1 != null)
        {
            l1 = 0L;
        }
          goto _L5
        if (j2 == 1) goto _L9; else goto _L8
_L8:
        cqf1 = e;
        obj = C;
        l1 = cua1.c();
        b.a(obj, "timeline", null);
        c.a(((cvh) (cqf1)).d, "mSeeker", null);
        cqf1.a();
        cua1 = ((cvh) (cqf1)).d.a(((cqn) (obj)));
        if ((j2 & 2) == 0) goto _L11; else goto _L10
_L10:
        ((cvh) (cqf1)).h.add(0, cua1);
        i1 = ((cvh) (cqf1)).f + 1;
_L14:
        cqf1.f = i1;
          goto _L12
_L11:
        if ((j2 & 4) != 0)
        {
            ((cvh) (cqf1)).h.remove(0);
            if (((cvh) (cqf1)).f == 0)
            {
                i1 = -1;
            } else
            {
                i1 = ((cvh) (cqf1)).f - 1;
            }
            continue; /* Loop/switch isn't completed */
        }
_L12:
        cua1 = ((cvh) (cqf1)).d;
        obj1 = ((cvh) (cqf1)).h;
        j2 = ((cvh) (cqf1)).f;
        b.a(obj, "timeline", null);
        for (obj2 = ((cji) (cua1)).a.iterator(); ((Iterator) (obj2)).hasNext(); c.a(i2, "oldClipIndex", ((ckl) (obj3)).c.size(), "new timeline is incompatible with existing clips"))
        {
            obj3 = (ckl)((Iterator) (obj2)).next();
            b.a(obj, "timeline", null);
            i2 = 0;
            for (j1 = 0; j1 < ((cqn) (obj)).d();)
            {
                cnq1 = ((cqn) (obj)).b(j1);
                i1 = i2;
                if (cnq1.d == cnt.c)
                {
                    i1 = i2;
                    if (i2 < ((ckl) (obj3)).c.size())
                    {
                        i1 = i2;
                        if (cnq1.e.b.equals(((cnq)((ckl) (obj3)).c.get(i2)).e.b))
                        {
                            ((ckl) (obj3)).c.set(i2, cnq1);
                            ((ckl) (obj3)).d.set(i2, Long.valueOf(((cqn) (obj)).e(j1)));
                            i2++;
                            i1 = i2;
                            if (i2 > ((ckl) (obj3)).c.size())
                            {
                                throw c.a("new timeline is incompatible with existing clips");
                            }
                        }
                    }
                }
                j1++;
                i2 = i1;
            }

        }

        if (!((cqn) (obj)).k() && ((cji) (cua1)).c.k())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!((cji) (cua1)).c.k() && ((cqn) (obj)).k())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        ackg = new ckg[((cqn) (obj)).d()];
        do
        {
            if (j1 >= ((cqn) (obj)).d())
            {
                break;
            }
            obj3 = ((cqn) (obj)).b(j1);
            if (i1 == ((cji) (cua1)).c.d())
            {
                if (((cnq) (obj3)).d != cnt.d)
                {
                    cua1 = String.valueOf(obj3);
                    throw b.a((new StringBuilder(String.valueOf(cua1).length() + 38)).append("cannot replace timeline with new clip ").append(cua1).toString());
                }
                break;
            }
            cnq1 = ((cji) (cua1)).c.b(i1);
            b.a(((cnq) (obj3)).d, "newClip.type", cnq1.d);
            b.a(((cnq) (obj3)).e, "newClip.mediaIdentifier", cnq1.e);
            if (((cnq) (obj3)).d == cnt.a || ((cnq) (obj3)).d == cnt.e)
            {
                ckg1 = ((cji) (cua1)).d[i1];
                if (ckg1 == null)
                {
                    cua1 = String.valueOf(cnq1);
                    throw c.a((new StringBuilder(String.valueOf(cua1).length() + 40)).append("no media source found for existing clip ").append(cua1).toString());
                }
                if (!ckg1.a(((cnq) (obj3)).f))
                {
                    ((cje)((List) (obj1)).get(j1)).a();
                }
                ackg[j1] = ckg1;
            } else
            {
                ackg[j1] = null;
            }
            j1++;
            i1++;
        } while (true);
        cua1.c = ((cqn) (obj));
        cua1.d = ackg;
        i1 = cua1.a(l1, ((List) (obj1)), j2);
        if (i1 == ((cvh) (cqf1)).h.size())
        {
            flag = false;
        } else
        {
            cqf1.a(((cqn) (obj)));
            cqf1.a(i1);
            flag = cqf1.c(l1);
        }
        return flag & k1;
_L9:
        dej.a(e);
        cqf1 = new cji(C, new cjb(m));
        obj = cja.a(C, l, new cjd(m, r, p, h, i, i1), j, cqf1, i1);
        obj1 = e;
        ackg = C;
        obj3 = n;
        c.b(((cvh) (obj1)).h, "mVideoSources", "already initialized");
        ((cvh) (obj1)).a.a("initialize()");
        obj1.d = cqf1;
        obj1.h = (List)b.a(obj, "videoSources", null);
        obj1.i = (cuu)b.a(obj3, "renderer", null);
        ((cvh) (obj1)).a(ackg);
        obj1.f = -1;
        return e.a(cua1.c()) & k1;
        cua1;
        return false;
        if (true) goto _L14; else goto _L13
_L13:
    }

    static RectF b(cue cue1)
    {
        return cue1.w;
    }

    static long c(cue cue1)
    {
        return cue1.v;
    }

    private boolean c()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == cuk.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static cvf d(cue cue1)
    {
        return cue1.t;
    }

    private void d()
    {
        synchronized (b)
        {
            if (d != cuk.c)
            {
                a.add(cul.a(cuk.c));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Object e(cue cue1)
    {
        return cue1.b;
    }

    private void e()
    {
        D = e.a(m);
        a(cuk.a, 0L);
        D = null;
    }

    static int f(cue cue1)
    {
        return cue1.z;
    }

    static boolean g(cue cue1)
    {
        return cue1.A;
    }

    public final void a(long l1)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cul cul1 = (cul)iterator.next();
            if (cul1.a == cuk.d)
            {
                a.remove(cul1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_69;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.add(new cul(cuk.d, l1));
        if (d == cuk.d)
        {
            e.c = true;
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(cuc cuc1, ctp ctp1, chp chp1, int i1)
    {
        deo deo1;
        long l1;
        if (t != null)
        {
            t.a();
        }
        deo1 = new deo(g);
        l1 = cuc1.b;
        if (l1 >= C.i || l1 >= C.h)
        {
            a(true);
            return;
        }
        ctq ctq1;
        B = new ctq(y, ctp1);
        e = new cvh(y, chp1, u);
        a(cuk.d, 0L);
        ctq1 = B;
        if (a(l1, ((cua) (ctq1)), ((cqf) (null)), i1))
        {
            break MISSING_BLOCK_LABEL_236;
        }
        a(true);
        a(cuk.c, 0L);
        dej.a(B);
        B = null;
        dej.a(e);
        e = null;
        a.clear();
        deo1.a();
        cuc1 = ((cuc) (b));
        cuc1;
        JVM INSTR monitorenter ;
        if (z != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        cuc1;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            b.a(o.f, g);
        }
        o.a(null);
        return;
        ctp1;
        cuc1;
        JVM INSTR monitorexit ;
        throw ctp1;
        cuj cuj1;
        e.b = q;
        cuj1 = new cuj();
        cuj1.a = l1;
        cuj1.b = l1;
        cuj1.c = e;
        o.a(cuj1);
        if (!cuc1.b() && !cuc1.c()) goto _L2; else goto _L1
_L1:
        n.a(chp1.d(), chp1.e());
        e();
_L6:
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = true;
        l1 = 0L;
        RectF rectf = new RectF();
_L12:
        if (flag1) goto _L4; else goto _L3
_L3:
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L5
        cuc1;
        throw cuc1;
        cuc1;
        a(cuk.c, 0L);
        dej.a(B);
        B = null;
        dej.a(e);
        e = null;
        a.clear();
        deo1.a();
        ctp1 = ((ctp) (b));
        ctp1;
        JVM INSTR monitorenter ;
        cqf cqf1;
        boolean flag2;
        long l2;
        boolean flag3;
        if (z != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ctp1;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            b.a(o.f, g);
        }
        o.a(null);
        throw cuc1;
_L2:
        B.b.c();
        a(cuk.b, 0L);
          goto _L6
        cuc1;
        throw new InterruptedException("sink destroyed");
_L5:
        Thread.yield();
        l2 = ctq1.c();
        cuj1.b = l2;
        deo1.a("playLoop");
        if (c.getAndSet(false))
        {
            n.a(chp1.d(), chp1.e());
        }
        if (ctp1.f() >= 0x11170L || q || c())
        {
            if (e.b(l2) && c())
            {
                e.b = q;
            }
            deo1.b("Video step");
        }
        obj = B;
        if (((ctq) (obj)).f) goto _L8; else goto _L7
_L7:
        if (!((ctq) (obj)).e) goto _L10; else goto _L9
_L9:
        if (((ctq) (obj)).b.e() == 0)
        {
            obj.f = true;
            obj.g = SystemClock.elapsedRealtimeNanos() / 1000L;
            ((ctq) (obj)).b.h();
            ((ctq) (obj)).a.a();
        }
_L8:
        deo1.b("Audio step");
        deo1.a(false);
        if (Math.abs(l2 - l1) > 0x186a0L)
        {
            flag = true;
        }
        if (t == null || !flag)
        {
            break MISSING_BLOCK_LABEL_805;
        }
        n.a(rectf);
        c.a(t, "mListener", null);
        synchronized (w)
        {
            v = l2;
            w.set(rectf);
        }
        s.execute(x);
        flag = false;
        l1 = l2;
        flag2 = flag;
        if (cuc1.c())
        {
            flag1 = true;
            flag2 = flag;
        }
_L29:
        obj = (cul)a.poll();
        flag = flag2;
_L20:
        if (flag1 || obj == null) goto _L12; else goto _L11
_L11:
        flag3 = a();
        cui.a[((cul) (obj)).a.ordinal()];
        JVM INSTR tableswitch 1 6: default 1480
    //                   1 949
    //                   2 963
    //                   3 1483
    //                   4 981
    //                   5 1142
    //                   6 1206;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L13:
        obj = (cul)a.poll();
          goto _L20
_L10:
        ((ctq) (obj)).a();
          goto _L8
        cuc1;
        a(2);
        throw cuc1;
        cuc1;
        obj;
        JVM INSTR monitorexit ;
        throw cuc1;
        cuc1;
        a(1);
        throw cuc1;
_L14:
        ctq1.d();
        e();
          goto _L13
_L15:
        ctq1.e();
        a(cuk.b, 0L);
          goto _L13
_L17:
        a(cuk.d, ((cul) (obj)).b);
        if (!a(((cul) (obj)).b, ((cua) (ctq1))))
        {
            break MISSING_BLOCK_LABEL_1050;
        }
        if (!flag3) goto _L22; else goto _L21
_L21:
        a(cuk.b, 0L);
        ctq1.e();
_L23:
        cuj1.a = ((cul) (obj)).b;
          goto _L13
_L22:
        e();
        flag = true;
          goto _L23
        if (!Thread.interrupted()) goto _L25; else goto _L24
_L24:
        obj = (cul)a.poll();
        if (obj == null) goto _L27; else goto _L26
_L26:
        if (((cul) (obj)).a != cuk.a && ((cul) (obj)).a != cuk.b) goto _L20; else goto _L28
_L28:
        a(0L);
        flag2 = flag;
          goto _L29
        cuc1;
        if (!(cuc1.getCause() instanceof oko)) goto _L31; else goto _L30
_L30:
        a(3);
_L34:
        throw cuc1;
_L27:
        flag1 = true;
          goto _L13
_L25:
        a(true);
        flag1 = true;
          goto _L13
_L18:
        a(cuk.e, 0L);
        if (!a(ctq1.c(), ((cua) (ctq1))))
        {
            break MISSING_BLOCK_LABEL_1489;
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_1199;
        }
        a(cuk.b, 0L);
        ctq1.e();
_L32:
        cuj1.a = ((cul) (obj)).b;
          goto _L13
        e();
          goto _L32
_L19:
        cqf1 = C;
        synchronized (b)
        {
            C = f;
        }
        l2 = ctq1.c();
        ctq1.d();
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_1330;
        }
        D = e.a(m);
_L33:
        a(cuk.f, 0L);
        deo1.a();
        if (!a(l2, ((cua) (ctq1)), cqf1, i1))
        {
            break MISSING_BLOCK_LABEL_1345;
        }
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_1338;
        }
        D = null;
        a(cuk.b, 0L);
        ctq1.e();
          goto _L13
        cuc1;
        obj1;
        JVM INSTR monitorexit ;
        throw cuc1;
        D = null;
          goto _L33
        e();
          goto _L13
        flag1 = true;
          goto _L13
_L4:
        a(cuk.c, 0L);
        dej.a(B);
        B = null;
        dej.a(e);
        e = null;
        a.clear();
        deo1.a();
        cuc1 = ((cuc) (b));
        cuc1;
        JVM INSTR monitorenter ;
        if (z != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        cuc1;
        JVM INSTR monitorexit ;
        if (i1 != 0)
        {
            b.a(o.f, g);
        }
        o.a(null);
        return;
        ctp1;
        cuc1;
        JVM INSTR monitorexit ;
        throw ctp1;
_L31:
        a(1);
          goto _L34
        cuc1;
        ctp1;
        JVM INSTR monitorexit ;
        throw cuc1;
_L16:
        flag1 = true;
          goto _L13
        flag1 = true;
          goto _L13
    }

    public final boolean a()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == cuk.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == cuk.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
