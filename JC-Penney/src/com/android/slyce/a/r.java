// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import android.util.Log;
import com.android.slyce.a.a.g;
import com.android.slyce.a.b.a;
import com.android.slyce.a.b.f;
import com.android.slyce.a.b.l;
import com.android.slyce.a.d.c;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.android.slyce.a:
//            af, ae, s, ab, 
//            bm, t, ac, v, 
//            d, ad, w, x, 
//            aa, u

public class r
{

    static r a = new r();
    static final WeakHashMap d = new WeakHashMap();
    static final boolean f;
    private static ExecutorService h = d();
    String b;
    PriorityQueue c;
    Thread e;
    private bm g;

    public r()
    {
        this(null);
    }

    public r(String s1)
    {
        c = new PriorityQueue(1, com.android.slyce.a.af.a);
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "AsyncServer";
        }
        b = s2;
    }

    private static long a(r r1, PriorityQueue priorityqueue)
    {
        long l1 = 0x7fffffffffffffffL;
_L4:
        r1;
        JVM INSTR monitorenter ;
        long l3 = System.currentTimeMillis();
        long l2 = l1;
        ae ae1;
        if (priorityqueue.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        ae1 = (ae)priorityqueue.remove();
        if (ae1.b > l3) goto _L2; else goto _L1
_L1:
        r1;
        JVM INSTR monitorexit ;
          goto _L3
_L2:
        l2 = ae1.b - l3;
        priorityqueue.add(ae1);
        break MISSING_BLOCK_LABEL_82;
        priorityqueue;
        r1;
        JVM INSTR monitorexit ;
        throw priorityqueue;
_L3:
        if (ae1 == null)
        {
            return l1;
        }
        ae1.a.run();
          goto _L4
        l1 = l2;
        ae1 = null;
          goto _L1
    }

    static ac a(r r1, InetSocketAddress inetsocketaddress, com.android.slyce.a.a.c c1)
    {
        return r1.b(inetsocketaddress, c1);
    }

    static bm a(r r1)
    {
        return r1.g;
    }

    public static r a()
    {
        return a;
    }

    private static void a(bm bm1)
    {
        h.execute(new s(bm1));
    }

    static void a(r r1, bm bm1, PriorityQueue priorityqueue)
    {
        b(r1, bm1, priorityqueue);
    }

    private void a(boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            Log.i("NIO", "Reentrant call");
            if (!f && Thread.currentThread() != e)
            {
                throw new AssertionError();
            }
            break MISSING_BLOCK_LABEL_49;
        }
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        flag1 = true;
        Object obj;
        Object obj1;
        obj = g;
        obj1 = c;
_L4:
        this;
        JVM INSTR monitorexit ;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        boolean flag2;
        try
        {
            c(this, ((bm) (obj)), ((PriorityQueue) (obj1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.i("NIO", "Selector closed", ((Throwable) (obj1)));
        }
        break MISSING_BLOCK_LABEL_191;
_L1:
        obj = new bm(SelectorProvider.provider().openSelector());
        g = ((bm) (obj));
        obj1 = c;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        e = new t(this, b, ((bm) (obj)), ((PriorityQueue) (obj1)));
_L2:
        flag2 = e();
        if (flag2)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            g.f();
        }
        catch (Exception exception1) { }
        g = null;
        e = null;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        return;
        e = Thread.currentThread();
          goto _L2
        if (!flag) goto _L4; else goto _L3
_L3:
        e.start();
        this;
        JVM INSTR monitorexit ;
        return;
        try
        {
            ((bm) (obj)).a().close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        b(this, ((bm) (obj)), ((PriorityQueue) (obj1)));
        return;
    }

    private ac b(InetSocketAddress inetsocketaddress, com.android.slyce.a.a.c c1)
    {
        ac ac1 = new ac(this, null);
        if (!f && inetsocketaddress.isUnresolved())
        {
            throw new AssertionError();
        } else
        {
            a(new v(this, ac1, c1, inetsocketaddress));
            return ac1;
        }
    }

    private static void b(bm bm1)
    {
        bm1 = bm1.d().iterator();
_L1:
        SelectionKey selectionkey;
        if (!bm1.hasNext())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        selectionkey = (SelectionKey)bm1.next();
        com.android.slyce.a.d.c.a(new Closeable[] {
            selectionkey.channel()
        });
        try
        {
            selectionkey.cancel();
        }
        catch (Exception exception) { }
          goto _L1
        bm1;
    }

    private static void b(r r1, bm bm1, PriorityQueue priorityqueue)
    {
_L2:
        try
        {
            c(r1, bm1, priorityqueue);
        }
        catch (ab ab1)
        {
            Log.i("NIO", "Selector exception, shutting down", ab1);
            try
            {
                bm1.a().close();
            }
            catch (Exception exception) { }
        }
        r1;
        JVM INSTR monitorenter ;
        if (!bm1.g() || bm1.d().size() <= 0 && priorityqueue.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        r1;
        JVM INSTR monitorexit ;
        continue; /* Loop/switch isn't completed */
        bm1;
        r1;
        JVM INSTR monitorexit ;
        throw bm1;
        c(bm1);
        if (r1.g == bm1)
        {
            r1.c = new PriorityQueue(1, com.android.slyce.a.af.a);
            r1.g = null;
            r1.e = null;
        }
        r1;
        JVM INSTR monitorexit ;
        synchronized (d)
        {
            d.remove(Thread.currentThread());
        }
        return;
        bm1;
        r1;
        JVM INSTR monitorexit ;
        throw bm1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void c(bm bm1)
    {
        b(bm1);
        try
        {
            bm1.f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bm bm1)
        {
            return;
        }
    }

    private static void c(r r1, bm bm1, PriorityQueue priorityqueue)
    {
        boolean flag1 = true;
        long l1 = a(r1, priorityqueue);
        r1;
        JVM INSTR monitorenter ;
        if (bm1.b() != 0) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (bm1.d().size() != 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        flag = flag1;
        if (l1 != 0x7fffffffffffffffL)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        r1;
        JVM INSTR monitorexit ;
        return;
_L16:
        r1;
        JVM INSTR monitorexit ;
        if (!flag) goto _L4; else goto _L3
_L3:
        if (l1 != 0x7fffffffffffffffL) goto _L6; else goto _L5
_L5:
        Object obj;
        Object obj1;
        Set set;
        Iterator iterator;
        try
        {
            bm1.c();
        }
        // Misplaced declaration of an exception variable
        catch (r r1)
        {
            throw new ab(r1);
        }
_L4:
        set = bm1.e();
        iterator = set.iterator();
_L12:
        if (!iterator.hasNext()) goto _L8; else goto _L7
_L7:
        obj = (SelectionKey)iterator.next();
        if (!((SelectionKey) (obj)).isAcceptable()) goto _L10; else goto _L9
_L9:
        priorityqueue = (ServerSocketChannel)((SelectionKey) (obj)).channel();
        priorityqueue = priorityqueue.accept();
        if (priorityqueue == null) goto _L12; else goto _L11
_L11:
        priorityqueue.configureBlocking(false);
        obj1 = priorityqueue.register(bm1.a(), 1);
        obj = (g)((SelectionKey) (obj)).attachment();
        d d1 = new d();
        d1.a(priorityqueue, (InetSocketAddress)priorityqueue.socket().getRemoteSocketAddress());
        d1.a(r1, ((SelectionKey) (obj1)));
        ((SelectionKey) (obj1)).attach(d1);
        ((g) (obj)).a(d1);
          goto _L12
        obj;
        obj = priorityqueue;
        priorityqueue = ((PriorityQueue) (obj1));
_L14:
        com.android.slyce.a.d.c.a(new Closeable[] {
            obj
        });
        if (priorityqueue != null)
        {
            try
            {
                priorityqueue.cancel();
            }
            // Misplaced declaration of an exception variable
            catch (PriorityQueue priorityqueue) { }
        }
          goto _L12
        bm1;
        r1;
        JVM INSTR monitorexit ;
        throw bm1;
_L6:
        bm1.a(l1);
          goto _L4
_L10:
label0:
        {
            if (!((SelectionKey) (obj)).isReadable())
            {
                break label0;
            }
            r1.a(((d)((SelectionKey) (obj)).attachment()).());
        }
          goto _L12
label1:
        {
            if (!((SelectionKey) (obj)).isWritable())
            {
                break label1;
            }
            ((d)((SelectionKey) (obj)).attachment()).b();
        }
          goto _L12
        if (!((SelectionKey) (obj)).isConnectable())
        {
            break MISSING_BLOCK_LABEL_461;
        }
        priorityqueue = (ac)((SelectionKey) (obj)).attachment();
        obj1 = (SocketChannel)((SelectionKey) (obj)).channel();
        ((SelectionKey) (obj)).interestOps(1);
        d d2;
        ((SocketChannel) (obj1)).finishConnect();
        d2 = new d();
        d2.a(r1, ((SelectionKey) (obj)));
        d2.a(((SocketChannel) (obj1)), (InetSocketAddress)((SocketChannel) (obj1)).socket().getRemoteSocketAddress());
        ((SelectionKey) (obj)).attach(d2);
        if (!priorityqueue.b(d2)) goto _L12; else goto _L13
_L13:
        ((ac) (priorityqueue)).b.a(null, d2);
          goto _L12
        priorityqueue;
        throw new RuntimeException(priorityqueue);
        IOException ioexception1;
        ioexception1;
        ((SelectionKey) (obj)).cancel();
        com.android.slyce.a.d.c.a(new Closeable[] {
            obj1
        });
        if (priorityqueue.a(ioexception1))
        {
            ((ac) (priorityqueue)).b.a(ioexception1, null);
        }
          goto _L12
        Log.i("NIO", "wtf");
        throw new RuntimeException("Unknown key state.");
_L8:
        set.clear();
        return;
        priorityqueue;
        priorityqueue = null;
        obj = null;
          goto _L14
        IOException ioexception;
        ioexception;
        Object obj2 = null;
        ioexception = priorityqueue;
        priorityqueue = obj2;
          goto _L14
_L2:
        flag = false;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private static ExecutorService d()
    {
        ad ad1 = new ad("AsyncServer-worker-");
        return new ThreadPoolExecutor(1, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ad1);
    }

    private boolean e()
    {
label0:
        {
            synchronized (d)
            {
                if ((r)d.get(e) == null)
                {
                    break label0;
                }
            }
            return false;
        }
        d.put(e, this);
        weakhashmap;
        JVM INSTR monitorexit ;
        return true;
        exception;
        weakhashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public a a(String s1, int i, com.android.slyce.a.a.c c1)
    {
        return a(InetSocketAddress.createUnresolved(s1, i), c1);
    }

    public a a(InetSocketAddress inetsocketaddress, com.android.slyce.a.a.c c1)
    {
        if (!inetsocketaddress.isUnresolved())
        {
            return b(inetsocketaddress, c1);
        } else
        {
            l l1 = new l();
            f f1 = b(inetsocketaddress.getHostName());
            l1.c(f1);
            f1.a(new w(this, c1, l1, inetsocketaddress));
            return l1;
        }
    }

    public f a(String s1)
    {
        l l1 = new l();
        h.execute(new x(this, s1, l1));
        return l1;
    }

    public Object a(Runnable runnable)
    {
        return a(runnable, 0L);
    }

    public Object a(Runnable runnable, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        l1 = System.currentTimeMillis() + l1;
_L1:
        PriorityQueue priorityqueue = c;
        runnable = new ae(runnable, l1);
        priorityqueue.add(runnable);
        if (g == null)
        {
            a(true);
        }
        if (!c())
        {
            a(g);
        }
        this;
        JVM INSTR monitorexit ;
        return runnable;
        l1 = c.size();
          goto _L1
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    protected void a(int i)
    {
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        c.remove(obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public f b(String s1)
    {
        return (f)a(s1).b(new aa(this));
    }

    public Thread b()
    {
        return e;
    }

    protected void b(int i)
    {
    }

    public void b(Runnable runnable)
    {
        if (Thread.currentThread() == e)
        {
            a(runnable);
            a(this, c);
            return;
        }
        Semaphore semaphore = new Semaphore(0);
        a(new u(this, runnable, semaphore));
        try
        {
            semaphore.acquire();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            Log.e("NIO", "run", runnable);
        }
    }

    public boolean c()
    {
        return e == Thread.currentThread();
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/r.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        try
        {
            if (android.os.Build.VERSION.SDK_INT <= 8)
            {
                System.setProperty("java.net.preferIPv4Stack", "true");
                System.setProperty("java.net.preferIPv6Addresses", "false");
            }
        }
        catch (Throwable throwable) { }
    }
}
