// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.i;
import com.squareup.okhttp.internal.k;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.okhttp:
//            i, x, a

public final class j
{

    private static final j a;
    private final int b;
    private final long c;
    private final LinkedList d = new LinkedList();
    private Executor e;
    private final Runnable f = new Runnable() {

        final j a;

        public final void run()
        {
            j.a(a);
        }

            
            {
                a = j.this;
                super();
            }
    };

    private j(int l, long l1)
    {
        e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), k.a("OkHttp ConnectionPool", true));
        b = l;
        c = l1 * 1000L * 1000L;
    }

    public static j a()
    {
        return a;
    }

    static void a(j j1)
    {
        while (j1.b()) ;
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
        int j1 = 0;
        ListIterator listiterator;
        long l2;
        long l3;
        l3 = System.nanoTime();
        l2 = c;
        listiterator = d.listIterator(d.size());
_L4:
        com.squareup.okhttp.i l;
        long l5;
        if (!listiterator.hasPrevious())
        {
            break MISSING_BLOCK_LABEL_147;
        }
        l = (com.squareup.okhttp.i)listiterator.previous();
        l5 = (l.d() + c) - l3;
        if (l5 <= 0L) goto _L2; else goto _L1
_L1:
        if (l.b()) goto _L3; else goto _L2
_L2:
        listiterator.remove();
        ((List) (obj)).add(l);
          goto _L4
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        if (!l.c()) goto _L4; else goto _L5
_L5:
        l2 = Math.min(l2, l5);
        j1++;
          goto _L4
        listiterator = d.listIterator(d.size());
_L6:
        com.squareup.okhttp.i i1;
        do
        {
            if (!listiterator.hasPrevious() || j1 <= b)
            {
                break MISSING_BLOCK_LABEL_220;
            }
            i1 = (com.squareup.okhttp.i)listiterator.previous();
        } while (!i1.c());
        ((List) (obj)).add(i1);
        listiterator.remove();
        j1--;
          goto _L6
        boolean flag = ((List) (obj)).isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        long l4 = l2 / 0xf4240L;
        wait(l4, (int)(l2 - 0xf4240L * l4));
        this;
        JVM INSTR monitorexit ;
        return true;
_L8:
        this;
        JVM INSTR monitorexit ;
        int l1 = ((List) (obj)).size();
        for (int k1 = 0; k1 < l1; k1++)
        {
            k.a(((com.squareup.okhttp.i)((List) (obj)).get(k1)).c);
        }

        return true;
        InterruptedException interruptedexception;
        interruptedexception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final com.squareup.okhttp.i a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        ListIterator listiterator = d.listIterator(d.size());
_L1:
        com.squareup.okhttp.i l;
        boolean flag;
        do
        {
            if (!listiterator.hasPrevious())
            {
                break MISSING_BLOCK_LABEL_170;
            }
            l = (com.squareup.okhttp.i)listiterator.previous();
        } while (!l.b.a.equals(a1) || !l.b() || System.nanoTime() - l.d() >= c);
        listiterator.remove();
        flag = l.e();
        Object obj;
        obj = l;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        i.a().a(l.c);
        for (obj = l; obj == null; obj = null)
        {
            break MISSING_BLOCK_LABEL_127;
        }

        if (((com.squareup.okhttp.i) (obj)).e())
        {
            d.addFirst(obj);
        }
        this;
        JVM INSTR monitorexit ;
        return ((com.squareup.okhttp.i) (obj));
        obj;
        k.a(l.c);
        i.a();
        i.a((new StringBuilder("Unable to tagSocket(): ")).append(obj).toString());
          goto _L1
        a1;
        throw a1;
    }

    final void a(com.squareup.okhttp.i l)
    {
        boolean flag = d.isEmpty();
        d.addFirst(l);
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
            a = new j(0, l);
        } else
        if (s2 != null)
        {
            a = new j(Integer.parseInt(s2), l);
        } else
        {
            a = new j(5, l);
        }
    }
}
