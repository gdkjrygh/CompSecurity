// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.task;


// Referenced classes of package com.comscore.utils.task:
//            TaskExecutor, a

public class TaskThread extends Thread
{

    private boolean a;
    private Object b;
    private TaskExecutor c;

    TaskThread(TaskExecutor taskexecutor)
    {
        a = false;
        c = taskexecutor;
        b = new Object();
    }

    private void a(long l)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        b.wait(l);
_L1:
        return;
        Object obj1;
        obj1;
        ((InterruptedException) (obj1)).printStackTrace();
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    boolean a()
    {
        return a;
    }

    void b()
    {
        a = true;
    }

    void c()
    {
        synchronized (b)
        {
            b.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void d()
    {
        long l = c.a();
        if (l > 0L)
        {
            a(l);
        }
    }

    public void run()
    {
        do
        {
            if (a())
            {
                break;
            }
            a a1 = c.b();
            if (a1 != null)
            {
                a1.run();
                c.a(a1);
                if (a1.g())
                {
                    c.execute(a1.i(), a1.h(), a1.g(), a1.h());
                }
            } else
            {
                d();
            }
        } while (true);
    }
}
