// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

final class init> extends aba
{

    private ZV a;
    private ZV b;

    public final void a()
    {
        if (ZV.a(a) != 3)
        {
            Object obj = new Runnable() {

                public final void run()
                {
                }

            };
            java.util.concurrent.ExecutorService executorservice = b.a.r;
            obj = new FutureTask(((Runnable) (obj)), null);
            executorservice.execute(((Runnable) (obj)));
            try
            {
                ((FutureTask) (obj)).get();
            }
            catch (InterruptedException interruptedexception)
            {
                abk.a(interruptedexception);
            }
            catch (ExecutionException executionexception)
            {
                abk.a(executionexception);
            }
        }
        b.a.o.b.block();
        b.a.l.a(ZV.c(b));
        b.a.m.a(a);
    }

    >(ZV zv, ZV zv1)
    {
        b = zv;
        a = zv1;
        super();
    }
}
