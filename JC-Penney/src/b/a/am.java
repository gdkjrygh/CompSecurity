// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.os.ConditionVariable;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

// Referenced classes of package b.a:
//            ek, ag, ao, an, 
//            q, ei, be, eu

final class am extends ek
{

    final ag a;
    final ag b;

    am(ag ag1, ag ag2)
    {
        b = ag1;
        a = ag2;
        super();
    }

    public final void a()
    {
        if (ag.a(a) != ao.c)
        {
            Object obj = new an(this);
            java.util.concurrent.ExecutorService executorservice = b.a.u;
            obj = new FutureTask(((Runnable) (obj)), null);
            executorservice.execute(((Runnable) (obj)));
            try
            {
                ((FutureTask) (obj)).get();
            }
            catch (InterruptedException interruptedexception)
            {
                eu.a(interruptedexception);
            }
            catch (ExecutionException executionexception)
            {
                eu.a(executionexception);
            }
        }
        b.a.r.a.block();
        if (ag.l())
        {
            b.a.o.a(ag.c(b));
            b.a.p.a(a);
            return;
        }
        synchronized (ag.m())
        {
            ag.m().clear();
        }
    }
}
