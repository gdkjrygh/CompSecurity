// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.os.Handler;
import com.nuance.b.b.a.ak;
import com.nuance.b.b.a.al;
import com.nuance.b.b.a.an;
import com.nuance.b.b.a.ao;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.audio.a.a;
import com.nuance.dragon.toolkit.audio.a.i;
import com.nuance.dragon.toolkit.audio.a.k;
import com.nuance.dragon.toolkit.audio.a.m;
import com.nuance.dragon.toolkit.audio.a.n;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.f;
import com.nuance.dragon.toolkit.audio.l;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.nuance.b.b:
//            bt, bn, v, az, 
//            br, bs, s, bo, 
//            bq, fr, bu, gh, 
//            bv, bc

final class bm
{

    private static boolean v;
    private static boolean w = false;
    public final boolean a;
    m b;
    private final gh c;
    private final bt d;
    private final int e;
    private final int f;
    private final l g;
    private final boolean h;
    private final e i;
    private bc j;
    private a k;
    private a l;
    private k m;
    private i n;
    private n o;
    private CountDownLatch p;
    private CountDownLatch q;
    private boolean r;
    private boolean s;
    private final b t;
    private s u;

    public bm(gh gh1, b b1, e e1, int i1, int j1, boolean flag, s s1)
    {
        boolean flag1;
        flag1 = true;
        super();
        d = new bt();
        p = new CountDownLatch(1);
        q = new CountDownLatch(1);
        r = false;
        c = gh1;
        t = b1;
        g = null;
        h = false;
        e = i1;
        f = j1;
        a = flag;
        u = s1;
        com.nuance.b.b.bn.a[e1.m.ordinal()];
        JVM INSTR tableswitch 1 2: default 124
    //                   1 134
    //                   2 134;
           goto _L1 _L2 _L2
_L1:
        throw new IllegalArgumentException("NinaRecorder AudioType encoding must be PCM_16 or SPEEX");
_L2:
        e1.l;
        JVM INSTR lookupswitch 2: default 164
    //                   8000: 228
    //                   16000: 174;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException("NinaRecorder AudioType frequency must be 8k or 16k");
_L5:
        i = e1;
_L6:
        gh1 = com.nuance.b.b.v.r();
        if (gh1 != null)
        {
            flag = gh1.j().D();
            v = flag;
            if (flag)
            {
                if (((v) (gh1)).c.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                w = flag;
            }
        }
        return;
_L4:
        i = e1;
          goto _L6
    }

    static bc a(bm bm1, bc bc1)
    {
        bm1.j = bc1;
        return bc1;
    }

    static e a(bm bm1)
    {
        return bm1.i;
    }

    static String a(b b1, String s1)
    {
        String s2 = s1;
        if (b1 != null)
        {
            s2 = (new StringBuilder()).append(s1).append(". ID:").append(b1.b()).toString();
        }
        return s2;
    }

    static void b(bm bm1)
    {
label0:
        {
            Object obj1 = bm1.j;
            Object obj = obj1;
            if (bm1.a)
            {
                obj = obj1;
                if (bm1.f > 0)
                {
                    bm1.l = com.nuance.b.b.bt.a(bm1.f, new br(bm1));
                    bm1.l.a(((com.nuance.dragon.toolkit.audio.b) (obj1)));
                    obj = bm1.l;
                }
            }
            obj1 = obj;
            if (bm1.e > 0)
            {
                bm1.k = com.nuance.b.b.bt.a(bm1.e, new bs(bm1));
                bm1.k.a(((com.nuance.dragon.toolkit.audio.b) (obj)));
                obj1 = bm1.k;
            }
            bm1.b = new m();
            bm1.b.a(((com.nuance.dragon.toolkit.audio.b) (obj1)));
            obj = bm1.u;
            bm1.o = new n(((s) (obj)).e(), ((s) (obj)).f(), ((s) (obj)).g(), ((s) (obj)).h(), ((s) (obj)).i(), ((s) (obj)).j(), ((s) (obj)).k(), ((s) (obj)).l(), ((s) (obj)).m());
            bm1.o.a(bm1.b);
            bm1.n = new i(new bo(bm1));
            bm1.n.a(bm1.b);
            if (bm1.a)
            {
                bm1.m = new k(new bq(bm1));
                bm1.m.a(bm1.o);
            }
            if (bm1.g != null)
            {
                if (!bm1.h)
                {
                    break label0;
                }
                bm1.g.d(bm1.a());
            }
            return;
        }
        bm1.g.d(bm1.n);
    }

    static bc c(bm bm1)
    {
        return bm1.j;
    }

    static boolean o()
    {
        return v;
    }

    static boolean p()
    {
        return w;
    }

    public final com.nuance.dragon.toolkit.audio.b a()
    {
        if (a)
        {
            return m;
        } else
        {
            return o;
        }
    }

    public final boolean b()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (!r) goto _L2; else goto _L1
_L1:
        com.nuance.b.b.fr.a(a(t, "Attempt to start destroyed recorder."));
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        CountDownLatch countdownlatch;
        bu bu1;
        countdownlatch = new CountDownLatch(1);
        bu1 = new bu(this, countdownlatch);
        if ("NMT_THREAD".equals(Thread.currentThread().getName()))
        {
            bu1.run();
            break MISSING_BLOCK_LABEL_104;
        }
        gh.d().post(bu1);
        countdownlatch.await();
        break MISSING_BLOCK_LABEL_104;
        Object obj;
        obj;
        com.nuance.b.b.fr.a(((InterruptedException) (obj)).toString());
        i();
        continue; /* Loop/switch isn't completed */
        obj;
        throw obj;
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c()
    {
        com.nuance.b.b.fr.e(a(t, "startCapturing()..."));
        if (e())
        {
            fr.c(a(t, "Recorder already stopped when trying to start capturing."));
            throw new bv("Recorder already stopped when trying to start capturing.");
        }
        String s1;
        try
        {
            if (q.await(1000L, TimeUnit.MILLISECONDS))
            {
                j.e();
                fr.c(a(t, "Capturing started"));
                return;
            }
        }
        catch (InterruptedException interruptedexception)
        {
            com.nuance.b.b.fr.b(a(t, "Interrupted waiting for ready event from the recorder."));
            throw new bv("Interrupted waiting for ready event from the recorder.", interruptedexception);
        }
        s1 = a(t, "Never got ready event from the recorder.");
        fr.c(s1);
        throw new bv(s1);
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        com.nuance.b.b.fr.e(a(t, "stop..."));
        if (!r) goto _L2; else goto _L1
_L1:
        fr.c("stop called but already destroyed");
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        j.i();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        return p.getCount() == 0L;
    }

    public final boolean f()
    {
        return s;
    }

    public final void g()
    {
        s = true;
    }

    public final boolean h()
    {
        return p.await(1000L, TimeUnit.MILLISECONDS);
    }

    public final void i()
    {
        this;
        JVM INSTR monitorenter ;
        r = true;
        q.countDown();
        p.countDown();
        if (j != null)
        {
            j.i();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void j()
    {
        q.countDown();
        fr.c(a(t, "Capturing started"));
        t.d(new an(t.b()));
    }

    final void k()
    {
        p.countDown();
        com.nuance.b.b.fr.e(a(t, "NinaRecorder onStopped."));
        t.a(new ao(t.b()));
    }

    final void l()
    {
        p.countDown();
        com.nuance.b.b.fr.e(a(t, "NinaRecorder onError"));
        t.b(new ak(t.b(), al.e, "Underlying recorder reported an error."));
    }

    final void m()
    {
        com.nuance.b.b.fr.e(a(t, "NinaRecorder onReady"));
    }

    public final b n()
    {
        return t;
    }

}
