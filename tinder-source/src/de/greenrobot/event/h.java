// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;


// Referenced classes of package de.greenrobot.event:
//            g

final class h
{

    private g a;
    private g b;

    h()
    {
    }

    final g a()
    {
        this;
        JVM INSTR monitorenter ;
        g g1;
        g1 = a;
        if (a != null)
        {
            a = a.c;
            if (a == null)
            {
                b = null;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("null cannot be enqueued");
        g1;
        this;
        JVM INSTR monitorexit ;
        throw g1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        b.c = g1;
        b = g1;
_L1:
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
label0:
        {
            if (a != null)
            {
                break label0;
            }
            b = g1;
            a = g1;
        }
          goto _L1
        throw new IllegalStateException("Head present, but no tail");
    }

    final g b()
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        g g1;
        if (a == null)
        {
            wait(1000L);
        }
        g1 = a();
        this;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        throw exception;
    }
}
