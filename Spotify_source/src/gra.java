// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class gra
{

    private static final gra a;
    private final int b;
    private final long c;
    private final LinkedList d = new LinkedList();
    private Executor e;
    private final Runnable f = new Runnable() {

        private gra a;

        public final void run()
        {
            gra.a(a);
        }

            
            {
                a = gra.this;
                super();
            }
    };

    private gra(int i, long l)
    {
        e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), gsp.a("OkHttp ConnectionPool", true));
        b = i;
        c = l * 1000L * 1000L;
    }

    public static gra a()
    {
        return a;
    }

    static void a(gra gra1)
    {
        while (gra1.b()) ;
    }

    private boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d.isEmpty())
        {
            break MISSING_BLOCK_LABEL_16;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        Object obj = new ArrayList();
        int i = 0;
        ListIterator listiterator;
        long l;
        long l1;
        l1 = System.nanoTime();
        l = c;
        listiterator = d.listIterator(d.size());
_L4:
        gqz gqz1;
        long l3;
        if (!listiterator.hasPrevious())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        gqz1 = (gqz)listiterator.previous();
        l3 = (gqz1.d() + c) - l1;
        if (l3 <= 0L) goto _L2; else goto _L1
_L1:
        if (gqz1.b()) goto _L3; else goto _L2
_L2:
        listiterator.remove();
        ((List) (obj)).add(gqz1);
          goto _L4
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        if (!gqz1.c()) goto _L4; else goto _L5
_L5:
        l = Math.min(l, l3);
        i++;
          goto _L4
        listiterator = d.listIterator(d.size());
_L6:
        gqz gqz2;
        do
        {
            if (!listiterator.hasPrevious() || i <= b)
            {
                break MISSING_BLOCK_LABEL_220;
            }
            gqz2 = (gqz)listiterator.previous();
        } while (!gqz2.c());
        ((List) (obj)).add(gqz2);
        listiterator.remove();
        i--;
          goto _L6
        boolean flag = ((List) (obj)).isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        long l2 = l / 0xf4240L;
        wait(l2, (int)(l - 0xf4240L * l2));
        this;
        JVM INSTR monitorexit ;
        return true;
_L8:
        this;
        JVM INSTR monitorexit ;
        int k = ((List) (obj)).size();
        for (int j = 0; j < k; j++)
        {
            gsp.a(((gqz)((List) (obj)).get(j)).c);
        }

        return true;
        InterruptedException interruptedexception;
        interruptedexception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final gqz a(gqk gqk1)
    {
        this;
        JVM INSTR monitorenter ;
        ListIterator listiterator = d.listIterator(d.size());
_L1:
        gqz gqz1;
        boolean flag;
        do
        {
            if (!listiterator.hasPrevious())
            {
                break MISSING_BLOCK_LABEL_170;
            }
            gqz1 = (gqz)listiterator.previous();
        } while (!gqz1.b.a.equals(gqk1) || !gqz1.b() || System.nanoTime() - gqz1.d() >= c);
        listiterator.remove();
        flag = gqz1.e();
        Object obj;
        obj = gqz1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        gsk.a().a(gqz1.c);
        for (obj = gqz1; obj == null; obj = null)
        {
            break MISSING_BLOCK_LABEL_127;
        }

        if (((gqz) (obj)).e())
        {
            d.addFirst(obj);
        }
        this;
        JVM INSTR monitorexit ;
        return ((gqz) (obj));
        obj;
        gsp.a(gqz1.c);
        gsk.a();
        gsk.a((new StringBuilder("Unable to tagSocket(): ")).append(obj).toString());
          goto _L1
        gqk1;
        throw gqk1;
    }

    final void a(gqz gqz1)
    {
        boolean flag = d.isEmpty();
        d.addFirst(gqz1);
        if (flag)
        {
            e.execute(f);
            return;
        } else
        {
            notifyAll();
            return;
        }
    }

    static 
    {
        String s = System.getProperty("http.keepAlive");
        String s1 = System.getProperty("http.keepAliveDuration");
        String s2 = System.getProperty("http.maxConnections");
        long l;
        if (s1 != null)
        {
            l = Long.parseLong(s1);
        } else
        {
            l = 0x493e0L;
        }
        if (s != null && !Boolean.parseBoolean(s))
        {
            a = new gra(0, l);
        } else
        if (s2 != null)
        {
            a = new gra(Integer.parseInt(s2), l);
        } else
        {
            a = new gra(5, l);
        }
    }
}
