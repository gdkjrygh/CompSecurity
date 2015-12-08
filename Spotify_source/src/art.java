// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public class art
{

    private final Object a;
    private arv b;
    private final int c;
    private final Executor d;
    private arv e;
    private int f;

    art()
    {
        this(8);
    }

    public art(int i)
    {
        this(i, aph.c());
    }

    private art(int i, Executor executor)
    {
        a = new Object();
        e = null;
        f = 0;
        c = i;
        d = executor;
    }

    static Object a(art art1)
    {
        return art1.a;
    }

    static void a(art art1, arv arv1)
    {
        art1.a(arv1);
    }

    private void a(arv arv1)
    {
        arv arv2 = null;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (arv1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        e = arv1.a(e);
        f = f - 1;
        arv1 = arv2;
        if (f >= c)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        arv2 = b;
        arv1 = arv2;
        if (arv2 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        b = arv2.a(b);
        e = arv2.a(e, false);
        f = f + 1;
        arv2.b = true;
        arv1 = arv2;
        obj;
        JVM INSTR monitorexit ;
        if (arv1 != null)
        {
            d.execute(new Runnable(arv1) {

                private arv a;
                private art b;

                public final void run()
                {
                    a.a.run();
                    art.a(b, a);
                    return;
                    Exception exception;
                    exception;
                    art.a(b, a);
                    throw exception;
                }

            
            {
                b = art.this;
                a = arv1;
                super();
            }
            });
        }
        return;
        arv1;
        obj;
        JVM INSTR monitorexit ;
        throw arv1;
    }

    static arv b(art art1)
    {
        return art1.b;
    }

    static arv b(art art1, arv arv1)
    {
        art1.b = arv1;
        return arv1;
    }

    public final aru a(Runnable runnable)
    {
        arv arv1 = new arv(this, runnable);
        synchronized (a)
        {
            b = arv1.a(b, true);
        }
        a(((arv) (null)));
        return arv1;
        exception;
        runnable;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        art.desiredAssertionStatus();
    }
}
