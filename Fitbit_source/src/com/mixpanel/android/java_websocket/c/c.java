// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.c;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.b.a;
import com.mixpanel.android.java_websocket.b.i;
import com.mixpanel.android.java_websocket.d;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.e;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.f;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.java_websocket.h;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
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

// Referenced classes of package com.mixpanel.android.java_websocket.c:
//            b

public abstract class c extends d
    implements Runnable
{

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

    public c()
        throws UnknownHostException
    {
        this(new InetSocketAddress(80), a, null);
    }

    public c(InetSocketAddress inetsocketaddress)
    {
        this(inetsocketaddress, a, null);
    }

    public c(InetSocketAddress inetsocketaddress, int i1)
    {
        this(inetsocketaddress, i1, null);
    }

    public c(InetSocketAddress inetsocketaddress, int i1, List list)
    {
        this(inetsocketaddress, i1, list, ((Collection) (new HashSet())));
    }

    public c(InetSocketAddress inetsocketaddress, int i1, List list, Collection collection)
    {
        int j1 = 0;
        super();
        i = new AtomicBoolean(false);
        m = 0;
        n = new AtomicInteger(0);
        o = new b();
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
    /* block-local class not found */
    class b {}

            inetsocketaddress = new b();
            j.add(inetsocketaddress);
            inetsocketaddress.start();
        }

    }

    public c(InetSocketAddress inetsocketaddress, List list)
    {
        this(inetsocketaddress, a, list);
    }

    static void a(c c1, WebSocket websocket, Exception exception)
    {
        c1.c(websocket, exception);
    }

    static void a(c c1, ByteBuffer bytebuffer)
        throws InterruptedException
    {
        c1.a(bytebuffer);
    }

    private void a(f f1)
        throws InterruptedException
    {
        if (f1.j == null)
        {
            f1.j = (b)j.get(m % j.size());
            m = m + 1;
        }
        f1.j.a(f1);
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

    private void a(SelectionKey selectionkey, WebSocket websocket, IOException ioexception)
    {
        if (websocket != null)
        {
            websocket.b(1006, ioexception.getMessage());
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
                if (f.d)
                {
                    System.out.println((new StringBuilder()).append("Connection closed because of").append(ioexception).toString());
                    return;
                }
            }
        }
    }

    private void c(WebSocket websocket, Exception exception)
    {
        b(websocket, exception);
        try
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            b(null, websocket);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        b(null, websocket);
    }

    private Socket i(WebSocket websocket)
    {
        return ((SocketChannel)((f)websocket).f.channel()).socket();
    }

    private ByteBuffer j()
        throws InterruptedException
    {
        return (ByteBuffer)l.take();
    }

    public i a(WebSocket websocket, Draft draft, a a1)
        throws InvalidDataException
    {
        return super.a(websocket, draft, a1);
    }

    public void a()
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
        for (obj = ((List) (obj1)).iterator(); ((Iterator) (obj)).hasNext(); ((WebSocket)((Iterator) (obj)).next()).a(1001)) { }
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

    public void a(WebSocket websocket, int i1, String s)
    {
        b(websocket, i1, s);
    }

    public final void a(WebSocket websocket, int i1, String s, boolean flag)
    {
        f.wakeup();
        if (g(websocket))
        {
            d(websocket, i1, s, flag);
        }
        try
        {
            f(websocket);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        return;
        s;
        try
        {
            f(websocket);
        }
        // Misplaced declaration of an exception variable
        catch (WebSocket websocket)
        {
            Thread.currentThread().interrupt();
        }
        throw s;
    }

    public final void a(WebSocket websocket, com.mixpanel.android.java_websocket.b.f f1)
    {
        if (h(websocket))
        {
            b(websocket, (a)f1);
        }
    }

    public void a(WebSocket websocket, Framedata framedata)
    {
        d(websocket, framedata);
    }

    public final void a(WebSocket websocket, Exception exception)
    {
        b(websocket, exception);
    }

    public final void a(WebSocket websocket, String s)
    {
        b(websocket, s);
    }

    public final void a(WebSocket websocket, ByteBuffer bytebuffer)
    {
        b(websocket, bytebuffer);
    }

    public final void a(a a1)
    {
        o = a1;
    }

    protected boolean a(SelectionKey selectionkey)
    {
        return true;
    }

    public void b()
        throws IOException, InterruptedException
    {
        a(0);
    }

    public final void b(WebSocket websocket)
    {
        websocket = (f)websocket;
        try
        {
            ((f) (websocket)).f.interestOps(5);
        }
        catch (CancelledKeyException cancelledkeyexception)
        {
            ((f) (websocket)).h.clear();
        }
        f.wakeup();
    }

    public void b(WebSocket websocket, int i1, String s)
    {
    }

    public void b(WebSocket websocket, int i1, String s, boolean flag)
    {
        c(websocket, i1, s, flag);
    }

    public abstract void b(WebSocket websocket, a a1);

    public abstract void b(WebSocket websocket, Exception exception);

    public abstract void b(WebSocket websocket, String s);

    public void b(WebSocket websocket, ByteBuffer bytebuffer)
    {
    }

    public InetSocketAddress c(WebSocket websocket)
    {
        return (InetSocketAddress)i(websocket).getLocalSocketAddress();
    }

    public Collection c()
    {
        return c;
    }

    public void c(WebSocket websocket, int i1, String s, boolean flag)
    {
    }

    public InetSocketAddress d()
    {
        return d;
    }

    public InetSocketAddress d(WebSocket websocket)
    {
        return (InetSocketAddress)i(websocket).getRemoteSocketAddress();
    }

    public abstract void d(WebSocket websocket, int i1, String s, boolean flag);

    public void d(WebSocket websocket, Framedata framedata)
    {
    }

    public int e()
    {
        int j1 = d().getPort();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = j1;
            if (e != null)
            {
                i1 = e.socket().getLocalPort();
            }
        }
        return i1;
    }

    protected void e(WebSocket websocket)
        throws InterruptedException
    {
        if (n.get() >= j.size() * 2 + 1)
        {
            return;
        } else
        {
            n.incrementAndGet();
            l.put(g());
            return;
        }
    }

    public List f()
    {
        return Collections.unmodifiableList(g);
    }

    protected void f(WebSocket websocket)
        throws InterruptedException
    {
    }

    public ByteBuffer g()
    {
        return ByteBuffer.allocate(f.c);
    }

    protected boolean g(WebSocket websocket)
    {
        Collection collection = c;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = c.remove(websocket);
        if (b || flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        throw new AssertionError();
        websocket;
        collection;
        JVM INSTR monitorexit ;
        throw websocket;
        collection;
        JVM INSTR monitorexit ;
        if (i.get() && c.size() == 0)
        {
            h.interrupt();
        }
        return flag;
    }

    protected String h()
    {
        return (new StringBuilder()).append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"").append(e()).append("\" /></cross-domain-policy>").toString();
    }

    protected boolean h(WebSocket websocket)
    {
        if (i.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Collection collection = c;
        collection;
        JVM INSTR monitorenter ;
        boolean flag = c.add(websocket);
        if (b || flag)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        throw new AssertionError();
        websocket;
        collection;
        JVM INSTR monitorexit ;
        throw websocket;
        collection;
        JVM INSTR monitorexit ;
        return flag;
        websocket.a(1001);
        return true;
    }

    public final e i()
    {
        return o;
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
            serversocket.setReceiveBufferSize(f.c);
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
    /* block-local class not found */
    class a {}

        Object obj5 = o.b(this, g, ((SocketChannel) (obj)).socket());
        obj3 = obj2;
        obj5.f = ((SocketChannel) (obj)).register(f, 1, obj5);
        obj3 = obj2;
        obj5.g = o.a(((SocketChannel) (obj)), ((f) (obj5)).f);
        obj3 = obj2;
        iterator.remove();
        obj3 = obj2;
        e(((WebSocket) (obj5)));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj = obj2;
        obj3 = obj2;
        if (!((SelectionKey) (obj1)).isReadable()) goto _L6; else goto _L5
_L5:
        obj3 = obj2;
        obj2 = (f)((SelectionKey) (obj1)).attachment();
        obj3 = obj2;
        try
        {
            obj5 = j();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj2 = obj1;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        if (!com.mixpanel.android.java_websocket.c.a(((ByteBuffer) (obj5)), ((f) (obj2)), ((f) (obj2)).g)) goto _L8; else goto _L7
_L7:
        if (!((ByteBuffer) (obj5)).hasRemaining()) goto _L10; else goto _L9
_L9:
        ((f) (obj2)).i.put(obj5);
        a(((f) (obj2)));
        iterator.remove();
        obj = obj2;
        if (!(((f) (obj2)).g instanceof h)) goto _L6; else goto _L11
_L11:
        obj = obj2;
        if (!((h)((f) (obj2)).g).c()) goto _L6; else goto _L12
_L12:
        k.add(obj2);
        obj = obj2;
_L6:
        obj3 = obj;
        if (!((SelectionKey) (obj1)).isWritable()) goto _L14; else goto _L13
_L13:
        obj3 = obj;
        obj = (f)((SelectionKey) (obj1)).attachment();
        if (!com.mixpanel.android.java_websocket.c.a(((f) (obj)), ((f) (obj)).g) || !((SelectionKey) (obj1)).isValid()) goto _L16; else goto _L15
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
            obj1 = (f)k.remove(0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = obj;
            obj = obj1;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        obj3 = (h)((f) (obj1)).g;
        obj2 = j();
        if (com.mixpanel.android.java_websocket.c.a(((ByteBuffer) (obj2)), ((f) (obj1)), ((h) (obj3))))
        {
            k.add(obj1);
        }
        if (!((ByteBuffer) (obj2)).hasRemaining())
        {
            break MISSING_BLOCK_LABEL_751;
        }
        ((f) (obj1)).i.put(obj2);
        a(((f) (obj1)));
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
        a(((SelectionKey) (obj2)), ((WebSocket) (obj1)), ((IOException) (obj)));
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
                b(null, ((Exception) (obj)));
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
                b(null, ((Exception) (obj)));
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
                b(null, ((Exception) (obj)));
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
                b(null, ((Exception) (obj)));
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
                b(null, ((Exception) (obj1)));
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
        if (!com/mixpanel/android/java_websocket/c/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
