// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ed;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p.dx.c;
import p.dx.d;
import p.dx.f;
import p.ec.a;
import p.ec.i;

// Referenced classes of package p.ed:
//            a

public abstract class p.ed.b extends c
    implements Runnable
{
    public static interface a
    {

        public abstract d a(c c1, List list, Socket socket);

        public abstract ByteChannel b(SocketChannel socketchannel, SelectionKey selectionkey)
            throws IOException;
    }

    public class b extends Thread
    {

        static final boolean a;
        final p.ed.b b;
        private BlockingQueue c;

        public void a(d d1)
            throws InterruptedException
        {
            c.put(d1);
        }

        public void run()
        {
            Object obj = null;
_L2:
            Object obj1 = (d)c.take();
            obj = obj1;
            ByteBuffer bytebuffer = (ByteBuffer)((d) (obj1)).g.poll();
            obj = obj1;
            if (!a && bytebuffer == null)
            {
                obj = obj1;
                try
                {
                    throw new AssertionError();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    p.ed.b.a(b, ((p.dx.b) (obj)), ((Exception) (obj1)));
                }
                break; /* Loop/switch isn't completed */
            }
            ((d) (obj1)).a(bytebuffer);
            obj = obj1;
            p.ed.b.a(b, bytebuffer);
            obj = obj1;
            if (true) goto _L2; else goto _L1
_L1:
            return;
            Exception exception;
            exception;
            obj = obj1;
            p.ed.b.a(b, bytebuffer);
            obj = obj1;
            throw exception;
        }

        static 
        {
            boolean flag;
            if (!p/ed/b.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        public b()
        {
            b = p.ed.b.this;
            super();
            c = new LinkedBlockingQueue();
            setName((new StringBuilder()).append("WebSocketWorker-").append(getId()).toString());
            setUncaughtExceptionHandler(new _cls1(this, p.ed.b.this));
        }
    }


    public static int a = Runtime.getRuntime().availableProcessors();
    static final boolean b;
    private final Collection c;
    private final InetSocketAddress d;
    private ServerSocketChannel e;
    private Selector f;
    private List g;
    private Thread h;
    private volatile AtomicBoolean i;
    private List j;
    private List k;
    private BlockingQueue l;
    private int m;
    private AtomicInteger n;
    private a o;

    public p.ed.b()
        throws UnknownHostException
    {
        this(new InetSocketAddress(80), a, null);
    }

    public p.ed.b(InetSocketAddress inetsocketaddress, int i1, List list)
    {
        this(inetsocketaddress, i1, list, ((Collection) (new HashSet())));
    }

    public p.ed.b(InetSocketAddress inetsocketaddress, int i1, List list, Collection collection)
    {
        int j1 = 0;
        super();
        i = new AtomicBoolean(false);
        m = 0;
        n = new AtomicInteger(0);
        o = new p.ed.a();
        if (inetsocketaddress == null || i1 < 1 || collection == null)
        {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null)
        {
            g = Collections.emptyList();
        } else
        {
            g = list;
        }
        d = inetsocketaddress;
        c = collection;
        k = new LinkedList();
        j = new ArrayList(i1);
        l = new LinkedBlockingQueue();
        for (; j1 < i1; j1++)
        {
            inetsocketaddress = new b();
            j.add(inetsocketaddress);
            inetsocketaddress.start();
        }

    }

    public p.ed.b(InetSocketAddress inetsocketaddress, List list)
    {
        this(inetsocketaddress, a, list);
    }

    private ByteBuffer a()
        throws InterruptedException
    {
        return (ByteBuffer)l.take();
    }

    private void a(ByteBuffer bytebuffer)
        throws InterruptedException
    {
        if (l.size() > n.intValue())
        {
            return;
        } else
        {
            l.put(bytebuffer);
            return;
        }
    }

    private void a(SelectionKey selectionkey, p.dx.b b1, IOException ioexception)
    {
        if (b1 != null)
        {
            b1.a(1006, ioexception.getMessage());
        } else
        if (selectionkey != null)
        {
            selectionkey = selectionkey.channel();
            if (selectionkey != null && selectionkey.isOpen())
            {
                try
                {
                    selectionkey.close();
                }
                // Misplaced declaration of an exception variable
                catch (SelectionKey selectionkey) { }
                if (d.b)
                {
                    System.out.println((new StringBuilder()).append("Connection closed because of").append(ioexception).toString());
                    return;
                }
            }
        }
    }

    private void a(d d1)
        throws InterruptedException
    {
        if (d1.h == null)
        {
            d1.h = (b)j.get(m % j.size());
            m = m + 1;
        }
        d1.h.a(d1);
    }

    static void a(p.ed.b b1, ByteBuffer bytebuffer)
        throws InterruptedException
    {
        b1.a(bytebuffer);
    }

    static void a(p.ed.b b1, p.dx.b b2, Exception exception)
    {
        b1.c(b2, exception);
    }

    private void c(p.dx.b b1, Exception exception)
    {
        a(b1, exception);
        try
        {
            e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.dx.b b1)
        {
            a(((p.dx.b) (null)), b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.dx.b b1)
        {
            Thread.currentThread().interrupt();
        }
        a(((p.dx.b) (null)), b1);
    }

    private Socket h(p.dx.b b1)
    {
        return ((SocketChannel)((d)b1).d.channel()).socket();
    }

    public i a(p.dx.b b1, p.dz.a a1, p.ec.a a2)
        throws p.ea.b
    {
        return super.a(b1, a1, a2);
    }

    public void a(int i1)
        throws InterruptedException
    {
        if (!i.compareAndSet(false, true))
        {
            return;
        }
        synchronized (c)
        {
            obj1 = new ArrayList(c);
        }
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); ((p.dx.b)((Iterator) (obj)).next()).a(1001)) { }
        break MISSING_BLOCK_LABEL_75;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        this;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            if (Thread.currentThread() == h);
            if (h != Thread.currentThread())
            {
                if (((List) (obj1)).size() > 0)
                {
                    h.join(i1);
                }
                h.interrupt();
                h.join();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(p.dx.b b1, int i1, String s)
    {
        b(b1, i1, s);
    }

    public abstract void a(p.dx.b b1, int i1, String s, boolean flag);

    public abstract void a(p.dx.b b1, Exception exception);

    public abstract void a(p.dx.b b1, String s);

    public void a(p.dx.b b1, ByteBuffer bytebuffer)
    {
    }

    public void a(p.dx.b b1, p.eb.d d1)
    {
        d(b1, d1);
    }

    public abstract void a(p.dx.b b1, p.ec.a a1);

    public final void a(p.dx.b b1, p.ec.f f1)
    {
        if (g(b1))
        {
            a(b1, (p.ec.a)f1);
        }
    }

    protected boolean a(SelectionKey selectionkey)
    {
        return true;
    }

    public final void b(p.dx.b b1)
    {
        b1 = (d)b1;
        try
        {
            ((d) (b1)).d.interestOps(5);
        }
        catch (CancelledKeyException cancelledkeyexception)
        {
            ((d) (b1)).f.clear();
        }
        f.wakeup();
    }

    public void b(p.dx.b b1, int i1, String s)
    {
    }

    public final void b(p.dx.b b1, int i1, String s, boolean flag)
    {
        f.wakeup();
        if (f(b1))
        {
            a(b1, i1, s, flag);
        }
        try
        {
            e(b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.dx.b b1)
        {
            Thread.currentThread().interrupt();
        }
        return;
        s;
        try
        {
            e(b1);
        }
        // Misplaced declaration of an exception variable
        catch (p.dx.b b1)
        {
            Thread.currentThread().interrupt();
        }
        throw s;
    }

    public final void b(p.dx.b b1, Exception exception)
    {
        a(b1, exception);
    }

    public final void b(p.dx.b b1, String s)
    {
        a(b1, s);
    }

    public final void b(p.dx.b b1, ByteBuffer bytebuffer)
    {
        a(b1, bytebuffer);
    }

    public InetSocketAddress c(p.dx.b b1)
    {
        return (InetSocketAddress)h(b1).getLocalSocketAddress();
    }

    public void c(p.dx.b b1, int i1, String s, boolean flag)
    {
        d(b1, i1, s, flag);
    }

    public void d()
    {
        if (h != null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(" can only be started once.").toString());
        } else
        {
            (new Thread(this)).start();
            return;
        }
    }

    protected void d(p.dx.b b1)
        throws InterruptedException
    {
        if (n.get() >= j.size() * 2 + 1)
        {
            return;
        } else
        {
            n.incrementAndGet();
            l.put(f());
            return;
        }
    }

    public void d(p.dx.b b1, int i1, String s, boolean flag)
    {
    }

    public void d(p.dx.b b1, p.eb.d d1)
    {
    }

    public void e()
        throws IOException, InterruptedException
    {
        a(0);
    }

    protected void e(p.dx.b b1)
        throws InterruptedException
    {
    }

    public ByteBuffer f()
    {
        return ByteBuffer.allocate(d.a);
    }

    protected boolean f(p.dx.b b1)
    {
        Collection collection = c;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = c.remove(b1);
        if (b || flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        throw new AssertionError();
        b1;
        collection;
        JVM INSTR monitorexit ;
        throw b1;
        collection;
        JVM INSTR monitorexit ;
        if (i.get() && c.size() == 0)
        {
            h.interrupt();
        }
        return flag;
    }

    protected boolean g(p.dx.b b1)
    {
        if (i.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Collection collection = c;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = c.add(b1);
        if (b || flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        throw new AssertionError();
        b1;
        collection;
        JVM INSTR monitorexit ;
        throw b1;
        collection;
        JVM INSTR monitorexit ;
        return flag;
        b1.a(1001);
        return true;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(" can only be started once.").toString());
        }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        h = Thread.currentThread();
        if (!i.get())
        {
            break MISSING_BLOCK_LABEL_68;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Iterator iterator;
        h.setName((new StringBuilder()).append("WebsocketSelector").append(h.getId()).toString());
        boolean flag;
        try
        {
            e = ServerSocketChannel.open();
            e.configureBlocking(false);
            ServerSocket serversocket = e.socket();
            serversocket.setReceiveBufferSize(d.a);
            serversocket.bind(d);
            f = Selector.open();
            e.register(f, e.validOps());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c(null, ((Exception) (obj)));
            return;
        }
_L23:
        flag = h.isInterrupted();
        if (flag) goto _L2; else goto _L1
_L1:
        f.select();
        iterator = f.selectedKeys().iterator();
        obj2 = null;
        obj = null;
_L21:
        obj1 = obj2;
        obj3 = obj2;
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        obj3 = obj2;
        obj1 = (SelectionKey)iterator.next();
        obj3 = obj2;
        flag = ((SelectionKey) (obj1)).isValid();
        if (!flag)
        {
            obj = obj1;
            continue; /* Loop/switch isn't completed */
        }
        obj3 = obj2;
        if (!((SelectionKey) (obj1)).isAcceptable())
        {
            break MISSING_BLOCK_LABEL_406;
        }
        obj3 = obj2;
        if (a(((SelectionKey) (obj1))))
        {
            break MISSING_BLOCK_LABEL_297;
        }
        obj3 = obj2;
        ((SelectionKey) (obj1)).cancel();
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj3 = obj2;
        obj = e.accept();
        obj3 = obj2;
        ((SocketChannel) (obj)).configureBlocking(false);
        obj3 = obj2;
        Object obj5 = o.a(this, g, ((SocketChannel) (obj)).socket());
        obj3 = obj2;
        obj5.d = ((SocketChannel) (obj)).register(f, 1, obj5);
        obj3 = obj2;
        obj5.e = o.b(((SocketChannel) (obj)), ((d) (obj5)).d);
        obj3 = obj2;
        iterator.remove();
        obj3 = obj2;
        d(((p.dx.b) (obj5)));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = obj2;
        obj3 = obj2;
        if (!((SelectionKey) (obj1)).isReadable()) goto _L6; else goto _L5
_L5:
        obj3 = obj2;
        obj2 = (d)((SelectionKey) (obj1)).attachment();
        obj3 = obj2;
        try
        {
            obj5 = a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj2 = obj1;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        if (!p.dx.a.a(((ByteBuffer) (obj5)), ((d) (obj2)), ((d) (obj2)).e)) goto _L8; else goto _L7
_L7:
        if (!((ByteBuffer) (obj5)).hasRemaining()) goto _L10; else goto _L9
_L9:
        ((d) (obj2)).g.put(obj5);
        a(((d) (obj2)));
        iterator.remove();
        obj = obj2;
        if (!(((d) (obj2)).e instanceof f)) goto _L6; else goto _L11
_L11:
        obj = obj2;
        if (!((f)((d) (obj2)).e).c()) goto _L6; else goto _L12
_L12:
        k.add(obj2);
        obj = obj2;
_L6:
        obj3 = obj;
        if (!((SelectionKey) (obj1)).isWritable()) goto _L14; else goto _L13
_L13:
        obj3 = obj;
        obj = (d)((SelectionKey) (obj1)).attachment();
        if (!p.dx.a.a(((d) (obj)), ((d) (obj)).e) || !((SelectionKey) (obj1)).isValid()) goto _L16; else goto _L15
_L15:
        ((SelectionKey) (obj1)).interestOps(1);
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L10:
        a(((ByteBuffer) (obj5)));
        obj = obj2;
          goto _L6
        obj;
        obj3 = obj2;
        a(((ByteBuffer) (obj5)));
        obj3 = obj2;
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
_L8:
        a(((ByteBuffer) (obj5)));
        obj = obj2;
          goto _L6
        obj;
          goto _L17
_L4:
        obj3 = obj1;
        if (k.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = obj1;
        try
        {
            obj1 = (d)k.remove(0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = obj;
            obj = obj1;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj3 = (f)((d) (obj1)).e;
        obj2 = a();
        if (p.dx.a.a(((ByteBuffer) (obj2)), ((d) (obj1)), ((f) (obj3))))
        {
            k.add(obj1);
        }
        if (!((ByteBuffer) (obj2)).hasRemaining())
        {
            break MISSING_BLOCK_LABEL_751;
        }
        ((d) (obj1)).g.put(obj2);
        a(((d) (obj1)));
          goto _L4
        a(((ByteBuffer) (obj2)));
          goto _L4
        obj3;
        a(((ByteBuffer) (obj2)));
        throw obj3;
        obj3;
        obj2 = obj;
        obj = obj3;
_L19:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_784;
        }
        ((SelectionKey) (obj2)).cancel();
        a(((SelectionKey) (obj2)), ((p.dx.b) (obj1)), ((IOException) (obj)));
        continue; /* Loop/switch isn't completed */
        obj;
        c(null, ((Exception) (obj)));
        break MISSING_BLOCK_LABEL_801;
_L17:
        if (j != null)
        {
            for (obj = j.iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).interrupt()) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((p.dx.b) (null)), ((Exception) (obj)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        if (j != null)
        {
            for (obj = j.iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).interrupt()) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((p.dx.b) (null)), ((Exception) (obj)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (j != null)
        {
            for (obj = j.iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).interrupt()) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((p.dx.b) (null)), ((Exception) (obj)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        if (j != null)
        {
            for (obj = j.iterator(); ((Iterator) (obj)).hasNext(); ((b)((Iterator) (obj)).next()).interrupt()) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((p.dx.b) (null)), ((Exception) (obj)));
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        if (j != null)
        {
            for (obj1 = j.iterator(); ((Iterator) (obj1)).hasNext(); ((b)((Iterator) (obj1)).next()).interrupt()) { }
        }
        if (e != null)
        {
            try
            {
                e.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                a(((p.dx.b) (null)), ((Exception) (obj1)));
            }
        }
        throw obj;
        obj;
        obj1 = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj2;
        Object obj4 = obj;
        obj = obj2;
        obj2 = obj1;
        obj1 = obj4;
        if (true) goto _L19; else goto _L18
_L18:
        break; /* Loop/switch isn't completed */
_L16:
        obj2 = obj;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L14:
        obj2 = obj;
        obj = obj1;
        if (true) goto _L21; else goto _L20
_L20:
        return;
        if (true) goto _L23; else goto _L22
_L22:
    }

    static 
    {
        boolean flag;
        if (!p/ed/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }

    // Unreferenced inner class p/ed/b$b$1

/* anonymous class */
    class b._cls1
        implements Thread.UncaughtExceptionHandler
    {

        final p.ed.b a;
        final b b;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, throwable);
        }

            
            {
                b = b1;
                a = b2;
                super();
            }
    }

}
