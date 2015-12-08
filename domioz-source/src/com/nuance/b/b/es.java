// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.res.Resources;
import android.os.Handler;
import com.nuance.b.b.a.aj;
import com.nuance.b.c.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.nuance.b.b:
//            fa, fr, et, ex, 
//            fb, fq, ew, dv, 
//            fz, ez, ey

final class es
{

    private static final fq a = new fa();
    private et b;
    private ex c;
    private BlockingQueue d;
    private fb e;
    private CountDownLatch f;
    private volatile CountDownLatch g;

    public es(Resources resources, Handler handler)
    {
        this(resources, handler, (byte)0);
    }

    private es(Resources resources, Handler handler, byte byte0)
    {
        fr.e("PromptPlayer()<init>");
        b = new et(this, resources);
        c = new ex(this, handler);
        d = new LinkedBlockingQueue();
        resources = new fb(this);
        e = resources;
        resources.start();
    }

    private static void a(CountDownLatch countdownlatch)
    {
        InterruptedException interruptedexception = null;
_L2:
        countdownlatch.await();
        if (interruptedexception != null)
        {
            throw interruptedexception;
        } else
        {
            return;
        }
        interruptedexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void f()
    {
        fr.e("PromptPlayer.finishClearing");
        CountDownLatch countdownlatch = g;
        if (countdownlatch != null)
        {
            countdownlatch.countDown();
            return;
        } else
        {
            fr.e("PromptPlayer.finishClearing latch is null");
            return;
        }
    }

    public final void a(fq fq1)
    {
        this;
        JVM INSTR monitorenter ;
        fr.e("PromptPlayer.add...");
        d.add(fq1);
        this;
        JVM INSTR monitorexit ;
        return;
        fq1;
        throw fq1;
    }

    public final boolean a()
    {
        return d.isEmpty() || d.peek() == a;
    }

    final void b()
    {
        fq fq1;
        CountDownLatch countdownlatch;
        long l;
        boolean flag1 = true;
        if (d.isEmpty() && f != null)
        {
            f.countDown();
            f = null;
        }
        fq1 = (fq)d.take();
        if (fq1 == a)
        {
            f();
            return;
        }
        countdownlatch = new CountDownLatch(1);
        fq1.b.a(new ew(countdownlatch));
        fq1.b.b(new ew(countdownlatch));
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (d.peek() != a)
            {
                flag1 = false;
            }
            fq1.b.a(new aj(fq1.b.b(), flag1));
            a(countdownlatch);
            return;
        }
        if (f == null)
        {
            f = new CountDownLatch(1);
        }
        l = fq1.b.b();
        if (fq1.a != dv.d)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        fr.e((new StringBuilder("Playing local prompt: ")).append(l).toString());
        fz fz1 = (fz)fq1;
        b.a(fz1.b, fz1.c);
_L1:
        fr.f((new StringBuilder("Awaiting prompt finished id: ")).append(l).toString());
        a(countdownlatch);
        Exception exception;
        ex ex1;
        if (fq1.a == dv.d)
        {
            b.a();
        } else
        {
            c.b();
        }
        fr.f((new StringBuilder("Prompt finished: ")).append(l).toString());
        return;
        fr.e((new StringBuilder("Playing prompt: ")).append(l).toString());
        ex1 = c;
        ex1.c = new ez(fq1, ex1.b);
        ex1.a.post(new ey(ex1, fq1));
          goto _L1
        exception;
        if (fq1.a == dv.d)
        {
            b.a();
        } else
        {
            c.b();
        }
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        fr.e("PromptPlayer.clear...");
        g = new CountDownLatch(1);
        d.add(a);
        b.a();
        c.b();
        fr.e("PromptPlayer.clear waiting for finished");
        g.await();
        g = null;
_L1:
        fr.e("PromptPlayer.clear FINISHED");
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.nuance.b.b.fr.b("Interrupted while stopping prompts.  There may still be prompts that weren't stopped.");
        f();
        g = null;
          goto _L1
        obj;
        throw obj;
        obj;
        g = null;
        throw obj;
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        c();
        e.interrupt();
        c.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        CountDownLatch countdownlatch = f;
        if (countdownlatch != null)
        {
            countdownlatch.await();
        }
    }

}
