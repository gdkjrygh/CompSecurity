// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bjj
{

    private bji a;
    private bji b;

    bjj()
    {
    }

    bji a()
    {
        this;
        JVM INSTR monitorenter ;
        bji bji1;
        bji1 = a;
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
        return bji1;
        Exception exception;
        exception;
        throw exception;
    }

    bji a(int i)
        throws InterruptedException
    {
        this;
        JVM INSTR monitorenter ;
        bji bji1;
        if (a == null)
        {
            wait(i);
        }
        bji1 = a();
        this;
        JVM INSTR monitorexit ;
        return bji1;
        Exception exception;
        exception;
        throw exception;
    }

    void a(bji bji1)
    {
        this;
        JVM INSTR monitorenter ;
        if (bji1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("null cannot be enqueued");
        bji1;
        this;
        JVM INSTR monitorexit ;
        throw bji1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        b.c = bji1;
        b = bji1;
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
            b = bji1;
            a = bji1;
        }
          goto _L1
        throw new IllegalStateException("Head present, but no tail");
    }
}
