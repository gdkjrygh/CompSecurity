// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aw;


// Referenced classes of package p.aw:
//            a, c

public class b extends Thread
{

    private boolean a;
    private Object b;
    private a c;

    b(a a1)
    {
        a = false;
        c = a1;
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

    void c()
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
            c c1 = c.b();
            if (c1 != null)
            {
                c1.run();
                c.a(c1);
                if (c1.c())
                {
                    c.a(c1.e(), c1.d(), c1.c(), c1.d());
                }
            } else
            {
                c();
            }
        } while (true);
    }
}
