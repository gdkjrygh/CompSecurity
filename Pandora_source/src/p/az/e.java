// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.az;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import p.bn.d;

// Referenced classes of package p.az:
//            a

public class e
{

    PriorityBlockingQueue a;
    a b;
    private Thread c;
    private Boolean d;

    public e(String s, Comparator comparator, a a1)
    {
        a = null;
        c = null;
        b = null;
        d = Boolean.valueOf(false);
        a = new PriorityBlockingQueue(10, comparator);
        b = a1;
        c = new Thread(new Runnable() {

            final e a;

            public void run()
            {
                e.a(a);
            }

            
            {
                a = e.this;
                super();
            }
        });
        c.setName(s);
        c.setDaemon(true);
        c.start();
    }

    static void a(e e1)
    {
        e1.b();
    }

    private void b()
    {
        try
        {
            Object obj;
            for (; !d.booleanValue(); b.a(obj))
            {
                obj = a.take();
            }

        }
        catch (InterruptedException interruptedexception) { }
        catch (Exception exception)
        {
            p.bn.d.a("Error occurred dispating message.", exception);
            b.a("Error occurred dispating message.", exception);
            return;
        }
    }

    public void a()
    {
        d = Boolean.valueOf(true);
        if (c != null)
        {
            c.interrupt();
            c = null;
        }
    }

    public void a(Object obj)
    {
        try
        {
            a.put(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("ClassCastException encountered when queueing message.", ((Exception) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b("Exception encountered when queueing message.", ((Exception) (obj)));
        }
    }
}
