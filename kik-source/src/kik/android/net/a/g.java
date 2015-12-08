// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;


// Referenced classes of package kik.android.net.a:
//            e

final class g
    implements Runnable
{

    final e a;

    g(e e1)
    {
        a = e1;
        super();
    }

    public final void run()
    {
        e.b(a);
        e.b();
        (new StringBuilder("File upload manager thread ending: ")).append(e.c(a));
        synchronized (e.c())
        {
            e.d();
        }
        for (; e.d(a).isHeld(); e.d(a).release()) { }
        break MISSING_BLOCK_LABEL_216;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        InterruptedException interruptedexception;
        interruptedexception;
        interruptedexception.printStackTrace();
        e.b();
        (new StringBuilder("File upload manager thread ending: ")).append(e.c(a));
        synchronized (e.c())
        {
            e.d();
        }
        for (; e.d(a).isHeld(); e.d(a).release()) { }
        break MISSING_BLOCK_LABEL_216;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        e.b();
        (new StringBuilder("File upload manager thread ending: ")).append(e.c(a));
        synchronized (e.c())
        {
            e.d();
        }
        for (; e.d(a).isHeld(); e.d(a).release()) { }
        break MISSING_BLOCK_LABEL_214;
        exception2;
        obj2;
        JVM INSTR monitorexit ;
        throw exception2;
        throw exception2;
    }
}
