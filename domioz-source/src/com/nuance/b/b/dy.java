// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.os.Handler;
import com.nuance.b.b.a.w;
import com.nuance.b.b.a.x;
import com.nuance.b.b.a.y;
import com.nuance.b.c.b;
import com.nuance.dragon.toolkit.a.a.f;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.nuance.b.b:
//            el, gd, ef, ee, 
//            gh, fr, bm, eh, 
//            eg, s, eb, ea, 
//            dz, v, az, ec, 
//            ej

final class dy
{

    final int a;
    final int b;
    final boolean c;
    final s d;
    private com.nuance.dragon.toolkit.a.a.b e;
    private bm f;
    private el g;
    private final gh h;
    private ExecutorService i;
    private b j;
    private gd k;
    private boolean l;

    public dy(gh gh1, b b1, int i1, int j1, boolean flag, s s1)
    {
        g = el.a;
        i = Executors.newSingleThreadExecutor();
        h = gh1;
        j = b1;
        a = i1;
        b = j1;
        c = flag;
        d = s1;
        k = new gd();
        l = true;
        b1.b(new ef(this));
        b1.a(new ee(this));
    }

    static void a(Runnable runnable)
    {
        gh.d().post(runnable);
    }

    static boolean a(dy dy1)
    {
        dy1.l = false;
        return false;
    }

    final b a()
    {
        return j;
    }

    final void a(long l1, ec ec1, f f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l) goto _L2; else goto _L1
_L1:
        fr.c((new StringBuilder("Aborting starting the recognizer for a speech interpretation (")).append(j.b()).append(") because the deferred was resolved/rejected.").toString());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fr.e((new StringBuilder("startRecognitionFromNMTHandlerThread... (")).append(l1).append(")").toString());
        com.nuance.dragon.toolkit.audio.b b1 = f.a();
        fr.e((new StringBuilder("startRecognitionFromNMTHandlerThread (")).append(l1).append(") calling cloudRecognizer.startRecognition").toString());
        e.a(f1, b1, ec1);
        if (true) goto _L4; else goto _L3
_L3:
        ec1;
        throw ec1;
    }

    public final boolean a(boolean flag)
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        fr.c("SpeechInterpreter.cancel() called");
        boolean flag1 = flag2;
        if (g == com.nuance.b.b.el.f) goto _L2; else goto _L1
_L1:
        Object obj;
        el el1;
        obj = g;
        el1 = el.e;
        if (obj != el1) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L4:
        if (g != el.a && g != com.nuance.b.b.el.b)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        fr.c("Cancelled before started");
        j.b(new x(j.b(), y.i, null, "Cancelled"));
        g = com.nuance.b.b.el.f;
        flag1 = flag2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
        if (g != el.c && !flag)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        exception = "Cancelling speech interpretation";
        if (g != el.c)
        {
            exception = (new StringBuilder()).append("Cancelling speech interpretation").append(" (FORCED)").toString();
        }
        fr.c(exception);
        g = el.e;
        j.b(new x(j.b(), y.i, null, "Cancelled"));
        h();
        a(((Runnable) (new eh(this))));
        flag1 = flag2;
        continue; /* Loop/switch isn't completed */
        fr.c((new StringBuilder("Not cancelling speech interpretation because state is ")).append(g).toString());
        flag1 = false;
        if (true) goto _L2; else goto _L5
_L5:
    }

    final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null) goto _L2; else goto _L1
_L1:
        boolean flag = f.e();
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
        bm bm1 = f;
        if (bm1 != null)
        {
            return bm1.h();
        } else
        {
            return true;
        }
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != el.a)
        {
            fr.c((new StringBuilder("SpeechInterpreter in ")).append(g).append(" state instead of NOT_STARTED state").toString());
            throw new IllegalStateException("SpeechInterpreter.startSpeechInterpretation not in its initial state ");
        }
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        g = com.nuance.b.b.el.b;
        a(new eg(this));
        this;
        JVM INSTR monitorexit ;
    }

    final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (l) goto _L2; else goto _L1
_L1:
        fr.c((new StringBuilder("Aborting starting recording for a speech interpretation (")).append(j.b()).append(") because the deferred was already resolved/rejected.").toString());
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g != com.nuance.b.b.el.b)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        d.d();
        e = new com.nuance.dragon.toolkit.a.a.b(h.b());
        Object obj1 = j;
        com.nuance.b.b.fr.f("SpeechInterpreter creating the recorder deferred for NinaRecorder");
        Object obj = new b(((b) (obj1)).b());
        ((b) (obj)).c(new eb(this, ((b) (obj1))));
        ((b) (obj)).b(new ea(this, ((b) (obj1))));
        ((b) (obj)).a(new dz(this, ((b) (obj1))));
        obj1 = v.r().j();
        f = h.a(((b) (obj)), ((az) (obj1)).v(), a, b, c, d);
        obj = new ec(j, this);
        if (!f.b())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        g = el.c;
        obj = new ej(this, j, ((ec) (obj)));
        i.submit(((Runnable) (obj)));
          goto _L3
        Exception exception;
        exception;
        throw exception;
        fr.a("Unable to start recording");
        f();
        j.b(new x(j.b(), y.l, null, "Unable to start recording"));
          goto _L3
        fr.a((new StringBuilder("SpeechInterpreter (")).append(j.b()).append(") in ").append(g).append(" state instead of STARTING state when trying to start an interpretation.").toString());
          goto _L3
    }

    final void f()
    {
        this;
        JVM INSTR monitorenter ;
        g = com.nuance.b.b.el.f;
        e = null;
        if (f != null)
        {
            f.i();
            f = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != el.c)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if (!l) goto _L2; else goto _L1
_L1:
        fr.e("Telling CloudRecognizer to process the result.");
        e.a();
        g = el.d;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        fr.c((new StringBuilder("IllegalStateException from CloudRecognizer.processResult ")).append(((IllegalStateException) (obj)).getMessage()).toString());
        aq aq = gd.a(j.b());
        j.a(new w(j.b(), aq));
        g = com.nuance.b.b.el.f;
          goto _L3
        aq;
        throw aq;
_L2:
        com.nuance.b.b.fr.b((new StringBuilder("Ignoring interpretCapturedAudio because the deferred is already resolved/rejected. ReqId:")).append(j.b()).toString());
          goto _L3
        com.nuance.b.b.fr.b((new StringBuilder("Ignoring interpretCapturedAudio because in state ")).append(g).append(" instead of LISTENING. ReqId:").append(j.b()).toString());
          goto _L3
    }

    public final boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        fr.e("stopRecording...");
        if (g != el.c && g != el.e) goto _L2; else goto _L1
_L1:
        if (f == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        fr.e((new StringBuilder("stopRecording calling recorder.stop().  ReqId:")).append(j.b()).toString());
        flag = f.d();
_L8:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (g != el.a && g != com.nuance.b.b.el.b) goto _L6; else goto _L5
_L5:
        fr.c((new StringBuilder("stopRecording called before recording even started.  Aborting...   ReqId:")).append(j.b()).toString());
        aq aq = gd.a(j.b());
        j.a(new w(j.b(), aq));
        g = com.nuance.b.b.el.f;
          goto _L4
_L6:
        fr.c((new StringBuilder("Ignoring stopRecording because in state ")).append(g).append(" instead of LISTENING or CANCELLING.  ReqId:").append(j.b()).toString());
          goto _L4
        Exception exception;
        exception;
        throw exception;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean i()
    {
        return l;
    }

    final void j()
    {
        this;
        JVM INSTR monitorenter ;
        fr.e("Doing cancel of speech interpretation");
        if (g != el.e) goto _L2; else goto _L1
_L1:
        e.b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.nuance.b.b.fr.b((new StringBuilder("Not cancelling recongition because state is ")).append(g).append(" instead of CANCELLLING").toString());
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
        if (f == null) goto _L2; else goto _L1
_L1:
        boolean flag = f.f();
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

    public final void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null)
        {
            f.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
