// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cv;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import p.bh.i;
import p.ct.e;
import p.cu.c;
import p.df.a;

public class d
{
    public static interface a
    {

        public abstract void a()
            throws p.ax.a;
    }

    public static interface b
    {

        public abstract void a(c c1);

        public abstract boolean a();
    }


    private Map a;
    private e b;
    private b c;
    private final int d = 5;
    private a e;

    public d()
    {
        a = new HashMap();
        b = null;
        c = null;
        e = new a() {

            final d a;

            public void a()
                throws p.ax.a
            {
                a.a();
            }

            
            {
                a = d.this;
                super();
            }
        };
        a.put(i.d, new PriorityBlockingQueue());
        a.put(i.c, new PriorityBlockingQueue());
        a.put(i.b, new PriorityBlockingQueue());
        a.put(i.a, new PriorityBlockingQueue());
    }

    private c a(Queue queue, e e1)
    {
        if (queue != null && e1 != null && e1.a((c)queue.peek()))
        {
            return (c)queue.poll();
        } else
        {
            return null;
        }
    }

    private void b(c c1)
    {
        if (c != null && c1 != null)
        {
            c.a(c1);
        }
    }

    private c d()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        c c2;
        c2 = null;
        c1 = c2;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        c1 = c2;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        c2 = a((Queue)a.get(i.d), b);
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        c1 = a((Queue)a.get(i.c), b);
        c2 = c1;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        c2 = a((Queue)a.get(i.b), b);
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        c1 = a((Queue)a.get(i.a), b);
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a()
    {
        if (c != null && c.a())
        {
            for (int j = 0; j < 5; j++)
            {
                b(d());
            }

        }
    }

    public void a(e e1)
    {
        b = e1;
    }

    public void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1 == null) goto _L2; else goto _L1
_L1:
        if (b == null || a == null) goto _L2; else goto _L3
_L3:
        i j = b.b(c1);
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        ((Queue)a.get(j)).add(c1);
_L4:
        a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        p.df.a.a("AppLink", "Unknown command");
          goto _L4
        c1;
        throw c1;
    }

    public void a(b b1)
    {
        c = b1;
    }

    public a b()
    {
        return e;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        ((Queue)a.get(i.d)).clear();
        ((Queue)a.get(i.c)).clear();
        ((Queue)a.get(i.b)).clear();
        ((Queue)a.get(i.a)).clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
