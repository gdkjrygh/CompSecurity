// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.media.MediaCodec;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public final class Wh
{
    final class a
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            a.b.a.lock();
            a.b.d();
            a.b.i();
            return;
            Exception exception;
            exception;
            a.b.i();
            throw exception;
        }

        private a()
        {
            a = Wh.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            a.b.a.lock();
            a.b.b();
            a.b.i();
            return;
            Exception exception;
            exception;
            a.b.i();
            throw exception;
        }

        private b()
        {
            a = Wh.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            a.b.a.lock();
            a.b.f();
            a.b.i();
            return;
            Exception exception;
            exception;
            a.b.i();
            throw exception;
        }

        private c()
        {
            a = Wh.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            Object obj;
            a.b.a.lock();
            obj = a.b;
            if (!((Wf) (obj)).a.isHeldByCurrentThread())
            {
                throw new IllegalStateException("Unlocking by thread not owning lock");
            }
            break MISSING_BLOCK_LABEL_54;
            obj;
            a.b.i();
            throw obj;
            obj.d = true;
            a.b.i();
            return;
        }

        private d()
        {
            a = Wh.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    final class e
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            Object obj;
            a.b.a.lock();
            obj = a.b;
            if (!((Wf) (obj)).a.isHeldByCurrentThread())
            {
                throw new IllegalStateException("Unlocking by thread not owning lock");
            }
            break MISSING_BLOCK_LABEL_54;
            obj;
            a.b.i();
            throw obj;
            obj.e = true;
            a.b.i();
            return;
        }

        private e()
        {
            a = Wh.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }

    final class f
        implements Wc
    {

        private Wh a;

        public final void a()
        {
            if (a.a != null)
            {
                a.a.j = true;
            }
        }

        private f()
        {
            a = Wh.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }


    VH a;
    final Wf b;
    Wm c;
    Wm d;
    Wm e;
    Wm f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile float i;
    public volatile double j;
    StringBuilder k;
    private Wg l;
    private WT m;
    private VK n;
    private VG o;
    private volatile boolean p;
    private volatile WP.b q;
    private volatile WP.b r;
    private ExecutorService s;

    public Wh(WJ wj, WA wa, VM vm)
    {
        this(wj, wa, vm, Executors.newFixedThreadPool(5));
    }

    private Wh(WJ wj, WA wa, VM vm, ExecutorService executorservice)
    {
        b = new Wf();
        c = null;
        d = null;
        e = null;
        f = null;
        p = false;
        g = false;
        h = false;
        q = WP.b.a;
        r = WP.b.a;
        i = 0.0F;
        k = new StringBuilder();
        WL.a();
        if (!WL.b())
        {
            throw new Wu("There is no looper thread");
        }
        WA wa1;
        wa1 = (WA)dv.a(wa);
        VM vm1 = (VM)dv.a(vm);
        s = (ExecutorService)dv.a(executorservice);
        vm1.b();
        if (wa.e != WA.a.a) goto _L2; else goto _L1
_L1:
        o = new VG(((Wq) (wa)).a, new b((byte)0));
        n = new VK(o.b(), new a((byte)0));
        o.c = n.getCodec();
        a = new VH(o.b(), n, wa.h, new c((byte)0));
_L3:
        m = new WT(((Wq) (wa1)).a, new d((byte)0));
        l = new Wg(wj, m.b(), wa.h, new e((byte)0), a, ((Wt) (wa)).c);
        l.a = vm;
        l.m = new f((byte)0);
        m.c = l.getCodec();
        c = new Wk(n, o, b);
        d = new Wj(a, b);
        e = new Wo(m, b);
        f = new Wn(l);
        return;
_L2:
        try
        {
            b.a.lock();
        }
        // Misplaced declaration of an exception variable
        catch (WJ wj)
        {
            c();
            throw new Wu(wj);
        }
        b.b();
        b.d();
        b.f();
        b.i();
          goto _L3
        wj;
        b.i();
        throw wj;
    }

    private void c()
    {
        if (m != null)
        {
            m.c();
            m = null;
        }
        if (l != null)
        {
            l.stop();
            l = null;
        }
        if (o != null)
        {
            o.c();
            o = null;
        }
        if (n != null)
        {
            n.stop();
            n = null;
        }
        if (a != null)
        {
            VH vh = a;
            if (vh.a != null)
            {
                vh.a.stop();
                vh.a.release();
                vh.a = null;
            }
            a = null;
        }
        if (d != null)
        {
            k.append(d.e());
        }
        if (c != null)
        {
            k.append(c.e());
        }
        if (e != null)
        {
            k.append(e.e());
        }
        if (f != null)
        {
            k.append(f.e());
        }
    }

    private boolean d()
    {
        boolean flag1 = true;
        b.a.lock();
        if (!b.h() || !b.c() || !b.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = b;
        if (!((Wf) (obj)).a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        }
          goto _L3
        obj;
        b.i();
        throw obj;
_L3:
        if (!((Wf) (obj)).e || !b.e()) goto _L2; else goto _L4
_L4:
        boolean flag = true;
_L5:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        boolean flag2 = b.g();
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_129;
        }
_L6:
        b.i();
        return flag1;
_L2:
        flag = false;
          goto _L5
        flag1 = false;
          goto _L6
    }

    public final void a()
    {
        b.a.lock();
        Wf wf = b;
        if (!wf.a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        }
        wf.c = true;
        if (b.f)
        {
            b.i();
            return;
        } else
        {
            m.e = true;
            o.e = true;
            n.c = true;
            a.b = true;
            l.b = true;
            c.b();
            d.b();
            e.b();
            f.b();
            b.i();
            return;
        }
    }

    public final void a(float f1)
    {
        if (a != null)
        {
            VH vh = a;
            if (vh.a != null)
            {
                vh.a.setStereoVolume(f1, f1);
            }
        }
    }

    public final void a(WP.b b1, WP.b b2)
    {
        q = b1;
        r = b2;
        p = true;
    }

    public final void b()
    {
        if (c != null)
        {
            s.execute(c);
        }
        if (e != null)
        {
            s.execute(e);
        }
        if (f != null)
        {
            s.execute(f);
        }
        if (d != null)
        {
            s.execute(d);
        }
_L2:
        while (d()) 
        {
            if (p)
            {
                p = false;
                if (l != null)
                {
                    Wg wg = l;
                    WP.b b1 = q;
                    WP.b b2 = r;
                    ((VP)wg.mDecoderOutputSurface).a(b1, b2);
                }
            }
            if (g)
            {
                g = false;
                if (l != null)
                {
                    Wg wg1 = l;
                    float f1 = i;
                    if (wg1.mDecoderOutputSurface != null)
                    {
                        ((VP)wg1.mDecoderOutputSurface).a(f1);
                    }
                }
            }
            if (h)
            {
                h = false;
                if (l != null)
                {
                    Wg wg2 = l;
                    double d1 = j;
                    wg2.l.a(d1);
                }
                if (a != null)
                {
                    VH vh = a;
                    double d2 = j;
                    vh.l.a(d2);
                }
            }
            if (l != null)
            {
                l.processFrame();
            }
        }
          goto _L1
        Object obj;
        obj;
        throw obj;
        obj;
        c();
        throw obj;
_L1:
        Object obj1;
        Object obj2;
        b.a.lock();
        if (!b.g())
        {
            b.a(true);
        }
        b.i();
        if (!b.f)
        {
            break MISSING_BLOCK_LABEL_812;
        }
        obj2 = new CyclicBarrier(4);
        obj1 = new CyclicBarrier(4);
        d.a(((CyclicBarrier) (obj2)), ((CyclicBarrier) (obj1)));
        e.a(((CyclicBarrier) (obj2)), ((CyclicBarrier) (obj1)));
        f.a(((CyclicBarrier) (obj2)), ((CyclicBarrier) (obj1)));
        ((CyclicBarrier) (obj2)).await();
        obj2 = l;
        if (((Wg) (obj2)).mCodec != null)
        {
            VU vu = ((Wg) (obj2)).mCodec;
            if (vu.a != null)
            {
                vu.a.flush();
                vu.c();
            }
        }
        obj2.n = null;
        obj2.k = -1L;
        (new StringBuilder("frames discard: ")).append(((Wg) (obj2)).d).append(" mOnlyDraw: ").append(((Wg) (obj2)).e).append(" mOnlySwap: ").append(((Wg) (obj2)).f).append(" mWholePlay: ").append(((Wg) (obj2)).g);
        obj2.d = 0;
        obj2.e = 0;
        obj2.f = 0;
        obj2.g = 0;
        obj2.h = 0;
        obj2.c = true;
        obj2.i = false;
        ((Wg) (obj2)).l.c();
        obj2.j = false;
        b.a.lock();
        obj2 = b;
        if (!((Wf) (obj2)).a.isHeldByCurrentThread())
        {
            throw new IllegalStateException("Unlocking by thread not owning lock");
        }
        break MISSING_BLOCK_LABEL_651;
        obj1;
        b.a.lock();
        b.a(false);
        if (b.g())
        {
            a();
        }
        b.i();
          goto _L2
        obj2.b = false;
        obj2.d = false;
        obj2.e = false;
        b.i();
        ((CyclicBarrier) (obj1)).await();
        b.a.lock();
        b.a(false);
        if (b.g())
        {
            a();
        }
        b.i();
          goto _L2
        obj1;
        b.a.lock();
        b.a(false);
        if (b.g())
        {
            a();
        }
        b.i();
          goto _L2
        obj1;
        b.a.lock();
        b.a(false);
        if (b.g())
        {
            a();
        }
        b.i();
        throw obj1;
        c();
        return;
    }
}
