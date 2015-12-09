// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dud
    implements Runnable
{

    private static final Object a = new Object();
    private static dud b;
    private static int c;
    private int d;
    private duc e;
    private dud f;

    private dud(duc duc1, int i)
    {
        b(duc1, i);
    }

    public static dud a(duc duc1, int i)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        dud dud1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        dud1 = b;
        dud1.b(duc1, i);
        b = dud1.f;
        dud1.f = null;
        c--;
        return dud1;
        obj;
        JVM INSTR monitorexit ;
        return new dud(duc1, i);
        duc1;
        obj;
        JVM INSTR monitorexit ;
        throw duc1;
    }

    private void a()
    {
        b(null, 0);
        synchronized (a)
        {
            if (c < 50)
            {
                f = b;
                b = this;
                c++;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void b(duc duc1, int i)
    {
        e = duc1;
        d = i;
    }

    public final void run()
    {
        duc.a(e, d);
        a();
        return;
        Exception exception;
        exception;
        a();
        throw exception;
    }

}
