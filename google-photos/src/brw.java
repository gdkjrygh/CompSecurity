// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class brw
    implements Runnable
{

    private brv a;

    brw(brv brv1)
    {
        a = brv1;
        super();
    }

    public final void run()
    {
        synchronized (brv.a(a))
        {
            brv.b(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
