// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.nuance.b.b:
//            o, gd, p, q, 
//            gh, fr, r, bm, 
//            m, s, v, g, 
//            f, h, az, ax, 
//            i, j

final class e
{

    com.nuance.dragon.toolkit.a.x a;
    private bm b;
    private final int c;
    private final int d;
    private final boolean e;
    private final String f;
    private o g;
    private final gh h;
    private ExecutorService i;
    private gd j;
    private b k;
    private String l;
    private s m;
    private boolean n;

    public e(b b1, gh gh1, int i1, int j1, boolean flag, String s1, String s2, 
            s s3)
    {
        g = o.a;
        i = Executors.newSingleThreadExecutor();
        j = new gd();
        k = b1;
        h = gh1;
        c = i1;
        d = j1;
        e = flag;
        f = s1;
        l = s2;
        m = s3;
        n = true;
        b1.b(new p(this));
        b1.a(new com.nuance.b.b.q(this));
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

    static void a(Runnable runnable)
    {
        gh.d().post(runnable);
    }

    static boolean a(e e1)
    {
        e1.n = false;
        return false;
    }

    static boolean b(e e1)
    {
        return e1.e;
    }

    static b c(e e1)
    {
        return e1.k;
    }

    final b a()
    {
        return k;
    }

    public final boolean a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (g == com.nuance.b.b.o.b) goto _L2; else goto _L1
_L1:
        if (!flag) goto _L4; else goto _L3
_L3:
        if (g != o.c) goto _L4; else goto _L2
_L2:
        String s1 = "Cancelling dictation";
        if (g != com.nuance.b.b.o.b)
        {
            s1 = (new StringBuilder()).append("Cancelling dictation").append(" (FORCED)").toString();
        }
        fr.c(a(k, s1));
        flag = true;
        g = o.d;
        k.b(new x(k.b(), y.i, null, "Cancelled"));
        i();
        a(((Runnable) (new r(this))));
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        fr.c(a(k, (new StringBuilder("Not cancelling dictation because state is ")).append(g).toString()));
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag = b.e();
        if (!flag) goto _L3; else goto _L2
_L2:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        bm bm1 = b;
        if (bm1 != null)
        {
            return bm1.h();
        } else
        {
            return true;
        }
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (g == o.a) goto _L2; else goto _L1
_L1:
        fr.c(a(k, (new StringBuilder("Dictation in ")).append(g).append(" state instead of STOPPED state.").toString()));
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a(new m(this));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e()
    {
        return n;
    }

    final void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (n) goto _L2; else goto _L1
_L1:
        fr.c(a(k, "Aborting starting recording for dictation because the deferred was already resolved/rejected."));
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g != o.a)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        m.b();
        Object obj = v.r().j();
        Object obj1 = k;
        fr.f(a(((b) (obj1)), "Dictation creating the recorder deferred for NinaRecorder"));
        b b1 = new b(((b) (obj1)).b());
        b1.c(new g(this, ((b) (obj1))));
        b1.b(new f(this, ((b) (obj1))));
        b1.a(new h(this, ((b) (obj1))));
        b = h.a(b1, ((az) (obj)).v(), c, d, e, m);
        new ax();
        long l1 = k.b();
        obj = l;
        obj1 = com.nuance.b.b.ax.b(l1);
        ((com.nuance.dragon.toolkit.b.e) (obj1)).a("conceptSlot", ((String) (obj)));
        if (f != null)
        {
            ((com.nuance.dragon.toolkit.b.e) (obj1)).a("dictation_language", f);
        }
        a = new com.nuance.dragon.toolkit.a.x("NINA_DICTATION_CMD", ((com.nuance.dragon.toolkit.b.e) (obj1)), new i(k, this), 30000);
        obj = com.nuance.b.b.ax.b();
        a.a(com.nuance.b.b.ax.b(((com.nuance.dragon.toolkit.b.e) (obj))));
        if (!b.b())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        g = com.nuance.b.b.o.b;
        obj = b.a();
        a.a(new q("AUDIO_INFO", ((com.nuance.dragon.toolkit.audio.b) (obj))));
        obj = new j(this, k);
        i.submit(((Runnable) (obj)));
          goto _L3
        Exception exception;
        exception;
        throw exception;
        fr.a(a(k, "Unable to start recording"));
        g();
        k.b(new x(k.b(), y.l, null, "Unable to start recording"));
          goto _L3
        fr.a((new StringBuilder("Dictation (")).append(k.b()).append(") in ").append(g).append(" state instead of STOPPED state when trying to start dictation.").toString());
          goto _L3
    }

    final void g()
    {
        this;
        JVM INSTR monitorenter ;
        g = o.a;
        a = null;
        if (b != null)
        {
            b.i();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != com.nuance.b.b.o.b)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!n) goto _L2; else goto _L1
_L1:
        fr.e(a(k, "Processing the result."));
        a.e();
        g = o.c;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.nuance.b.b.fr.b(a(k, "Ignoring interpretCapturedAudio because the deferred is already resolved/rejected."));
          goto _L3
        Exception exception;
        exception;
        throw exception;
        com.nuance.b.b.fr.b(a(k, (new StringBuilder("Ignoring interpretCapturedAudio because in state ")).append(g).append(" instead of LISTENING").toString()));
          goto _L3
    }

    public final boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        fr.e(a(k, "stopRecording..."));
        if (g != com.nuance.b.b.o.b && g != o.d) goto _L2; else goto _L1
_L1:
        if (b == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        fr.e(a(k, "stopRecording calling recorder.stop()"));
        flag = b.d();
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        fr.c(a(k, (new StringBuilder("Ignoring stopRecording because in state ")).append(g).append(" instead of LISTENING or CANCELLING").toString()));
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    final void j()
    {
        this;
        JVM INSTR monitorenter ;
        fr.e(a(k, "Doing cancel of dictation"));
        if (g != o.d) goto _L2; else goto _L1
_L1:
        a.f();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.nuance.b.b.fr.b(a(k, (new StringBuilder("Not cancelling dictation because state is ")).append(g).append(" instead of CANCELLLING").toString()));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean k()
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag = b.f();
        if (!flag) goto _L2; else goto _L3
_L3:
        flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    final void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (n) goto _L2; else goto _L1
_L1:
        fr.c(a(k, "Aborting starting the recognizer for dictation because the deferred was resolved/rejected."));
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fr.e(a(k, "startDictationFromNMTHandlerThread..."));
        h.a(a);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void m()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
