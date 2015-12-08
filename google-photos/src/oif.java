// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class oif extends Thread
{

    private oid a;

    oif(oid oid1)
    {
        a = oid1;
        super();
    }

    private oie a()
    {
        Object obj = oid.g(a);
        obj;
        JVM INSTR monitorenter ;
_L2:
        oie oie = oid.h(a).a();
        if (oie == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj;
        JVM INSTR monitorexit ;
        return oie;
        oid.g(a).wait();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void run()
    {
        try
        {
            oie oie;
            for (; !isInterrupted(); oid.a(a, oie))
            {
                oie = a();
            }

        }
        catch (InterruptedException interruptedexception) { }
    }
}
