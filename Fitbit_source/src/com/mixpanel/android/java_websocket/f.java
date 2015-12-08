// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket;

import com.mixpanel.android.java_websocket.b.h;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;
import com.mixpanel.android.java_websocket.drafts.a;
import com.mixpanel.android.java_websocket.drafts.b;
import com.mixpanel.android.java_websocket.drafts.c;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.mixpanel.android.java_websocket:
//            WebSocket, g

public class f
    implements WebSocket
{

    public static int c = 16384;
    public static boolean d = false;
    public static final List e;
    static final boolean k;
    public SelectionKey f;
    public ByteChannel g;
    public final BlockingQueue h;
    public final BlockingQueue i;
    public volatile com.mixpanel.android.java_websocket.c.c.b j;
    private volatile boolean l;
    private WebSocket.READYSTATE m;
    private final g n;
    private List o;
    private Draft p;
    private WebSocket.Role q;
    private com.mixpanel.android.java_websocket.framing.Framedata.Opcode r;
    private ByteBuffer s;
    private com.mixpanel.android.java_websocket.b.a t;
    private String u;
    private Integer v;
    private Boolean w;
    private String x;

    public f(g g1, Draft draft)
    {
        l = false;
        m = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a;
        p = null;
        r = null;
        s = ByteBuffer.allocate(0);
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        if (g1 == null || draft == null && q == com.mixpanel.android.java_websocket.WebSocket.Role.b)
        {
            throw new IllegalArgumentException("parameters must not be null");
        }
        h = new LinkedBlockingQueue();
        i = new LinkedBlockingQueue();
        n = g1;
        q = com.mixpanel.android.java_websocket.WebSocket.Role.a;
        if (draft != null)
        {
            p = draft.c();
        }
    }

    public f(g g1, Draft draft, Socket socket)
    {
        this(g1, draft);
    }

    public f(g g1, List list)
    {
        this(g1, (Draft)null);
        q = com.mixpanel.android.java_websocket.WebSocket.Role.b;
        if (list == null || list.isEmpty())
        {
            o = e;
            return;
        } else
        {
            o = list;
            return;
        }
    }

    public f(g g1, List list, Socket socket)
    {
        this(g1, list);
    }

    private void a(com.mixpanel.android.java_websocket.b.f f1)
    {
        if (d)
        {
            System.out.println((new StringBuilder()).append("open using draft: ").append(p.getClass().getSimpleName()).toString());
        }
        m = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c;
        try
        {
            n.a(this, f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.mixpanel.android.java_websocket.b.f f1)
        {
            n.a(this, f1);
        }
    }

    private void a(Collection collection)
    {
        if (!f())
        {
            throw new WebsocketNotConnectedException();
        }
        for (collection = collection.iterator(); collection.hasNext(); a((Framedata)collection.next())) { }
    }

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); f((ByteBuffer)list.next())) { }
    }

    private void c(int i1, String s1, boolean flag)
    {
label0:
        {
            if (m != WebSocket.READYSTATE.d && m != WebSocket.READYSTATE.e)
            {
                if (m != com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c)
                {
                    break MISSING_BLOCK_LABEL_191;
                }
                if (i1 != 1006)
                {
                    break label0;
                }
                if (!k && flag)
                {
                    throw new AssertionError();
                }
                m = WebSocket.READYSTATE.d;
                b(i1, s1, false);
            }
            return;
        }
        if (p.b() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.a) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        n.a(this, i1, s1);
_L3:
        a(new com.mixpanel.android.java_websocket.framing.b(i1, s1));
_L2:
        b(i1, s1, flag);
_L4:
        if (i1 == 1002)
        {
            b(i1, s1, flag);
        }
        m = WebSocket.READYSTATE.d;
        s = null;
        return;
        Object obj;
        obj;
        n.a(this, ((Exception) (obj)));
          goto _L3
        obj;
        n.a(this, ((Exception) (obj)));
        b(1006, "generated frame is invalid", false);
          goto _L2
        if (i1 == -3)
        {
            if (!k && !flag)
            {
                throw new AssertionError();
            }
            b(-3, s1, true);
        } else
        {
            b(-1, s1, false);
        }
          goto _L4
    }

    private boolean c(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState handshakestate;
        com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState handshakestate1;
        if (s.capacity() == 0)
        {
            bytebuffer1 = bytebuffer;
        } else
        {
            if (s.remaining() < bytebuffer.remaining())
            {
                bytebuffer1 = ByteBuffer.allocate(s.capacity() + bytebuffer.remaining());
                s.flip();
                bytebuffer1.put(s);
                s = bytebuffer1;
            }
            s.put(bytebuffer);
            s.flip();
            bytebuffer1 = s;
        }
        bytebuffer1.mark();
        if (p != null) goto _L2; else goto _L1
_L1:
        handshakestate = e(bytebuffer1);
        handshakestate1 = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        if (handshakestate != handshakestate1) goto _L2; else goto _L3
_L3:
        f(ByteBuffer.wrap(com.mixpanel.android.java_websocket.d.b.a(n.a(this))));
        a(-3, "");
_L5:
        return false;
        InvalidDataException invaliddataexception;
        invaliddataexception;
        c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        if (s.capacity() != 0) goto _L7; else goto _L6
_L6:
        int k1;
        bytebuffer1.reset();
        k1 = ((IncompleteHandshakeException) (obj)).a();
        if (k1 != 0) goto _L9; else goto _L8
_L8:
        int j1 = bytebuffer1.capacity() + 16;
_L23:
        s = ByteBuffer.allocate(j1);
        s.put(bytebuffer);
_L21:
        return false;
_L2:
        if (q != com.mixpanel.android.java_websocket.WebSocket.Role.b) goto _L11; else goto _L10
_L10:
        if (p != null) goto _L13; else goto _L12
_L12:
        obj = o.iterator();
_L19:
        if (!((Iterator) (obj)).hasNext()) goto _L15; else goto _L14
_L14:
        Object obj1 = ((Draft)((Iterator) (obj)).next()).c();
        Object obj3;
        ((Draft) (obj1)).a(q);
        bytebuffer1.reset();
        obj3 = ((Draft) (obj1)).d(bytebuffer1);
        if (obj3 instanceof com.mixpanel.android.java_websocket.b.a) goto _L17; else goto _L16
_L16:
        b(1002, "wrong http function", false);
        return false;
_L17:
        obj3 = (com.mixpanel.android.java_websocket.b.a)obj3;
        if (((Draft) (obj1)).a(((com.mixpanel.android.java_websocket.b.a) (obj3))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a) goto _L19; else goto _L18
_L18:
        x = ((com.mixpanel.android.java_websocket.b.a) (obj3)).a();
        com.mixpanel.android.java_websocket.b.i i1 = n.a(this, ((Draft) (obj1)), ((com.mixpanel.android.java_websocket.b.a) (obj3)));
        a(((Draft) (obj1)).a(((Draft) (obj1)).a(((com.mixpanel.android.java_websocket.b.a) (obj3)), i1), q));
        p = ((Draft) (obj1));
        a(((com.mixpanel.android.java_websocket.b.f) (obj3)));
        return true;
        Object obj2;
        obj2;
        b(((InvalidDataException) (obj2)).a(), ((InvalidDataException) (obj2)).getMessage(), false);
        return false;
        obj2;
        n.a(this, ((Exception) (obj2)));
        b(-1, ((RuntimeException) (obj2)).getMessage(), false);
        return false;
_L15:
        if (p == null)
        {
            a(1002, "no draft matches");
        }
        break MISSING_BLOCK_LABEL_791;
_L13:
        obj = p.d(bytebuffer1);
        if (obj instanceof com.mixpanel.android.java_websocket.b.a)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (com.mixpanel.android.java_websocket.b.a)obj;
        if (p.a(((com.mixpanel.android.java_websocket.b.a) (obj))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        a(((com.mixpanel.android.java_websocket.b.f) (obj)));
        return true;
        a(1002, "the handshake did finaly not match");
        return false;
_L11:
        if (q != com.mixpanel.android.java_websocket.WebSocket.Role.a) goto _L21; else goto _L20
_L20:
        p.a(q);
        obj = p.d(bytebuffer1);
        if (obj instanceof h)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (h)obj;
        obj2 = p.a(t, ((h) (obj)));
        obj3 = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        if (obj2 != obj3)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        n.a(this, t, ((h) (obj)));
        a(((com.mixpanel.android.java_websocket.b.f) (obj)));
        return true;
        obj;
        b(((InvalidDataException) (obj)).a(), ((InvalidDataException) (obj)).getMessage(), false);
        return false;
        obj;
        n.a(this, ((Exception) (obj)));
        b(-1, ((RuntimeException) (obj)).getMessage(), false);
        return false;
        a(1002, (new StringBuilder()).append("draft ").append(p).append(" refuses handshake").toString());
          goto _L21
        obj;
        a(((InvalidDataException) (obj)));
          goto _L21
_L9:
        j1 = k1;
        if (k) goto _L23; else goto _L22
_L22:
        j1 = k1;
        if (((IncompleteHandshakeException) (obj)).a() >= bytebuffer1.remaining()) goto _L23; else goto _L24
_L24:
        throw new AssertionError();
_L7:
        s.position(s.limit());
        s.limit(s.capacity());
          goto _L21
        obj2;
          goto _L19
        return false;
          goto _L21
    }

    private void d(ByteBuffer bytebuffer)
    {
        Iterator iterator = p.c(bytebuffer).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode;
        boolean flag;
        bytebuffer = (Framedata)iterator.next();
        if (d)
        {
            System.out.println((new StringBuilder()).append("matched frame: ").append(bytebuffer).toString());
        }
        opcode = bytebuffer.f();
        flag = bytebuffer.d();
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f) goto _L4; else goto _L3
_L3:
        int i1;
        if (!(bytebuffer instanceof com.mixpanel.android.java_websocket.framing.a))
        {
            break MISSING_BLOCK_LABEL_487;
        }
        bytebuffer = (com.mixpanel.android.java_websocket.framing.a)bytebuffer;
        i1 = bytebuffer.a();
        bytebuffer = bytebuffer.b();
_L12:
        if (m != WebSocket.READYSTATE.d) goto _L6; else goto _L5
_L5:
        a(i1, bytebuffer, true);
          goto _L7
_L2:
        return;
_L6:
label0:
        {
            if (p.b() != com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.c)
            {
                break label0;
            }
            c(i1, bytebuffer, true);
        }
          goto _L7
        b(i1, bytebuffer, false);
          goto _L7
_L4:
label1:
        {
            if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d)
            {
                break label1;
            }
            n.b(this, bytebuffer);
        }
          goto _L7
label2:
        {
            if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e)
            {
                break label2;
            }
            n.c(this, bytebuffer);
        }
          goto _L7
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a) goto _L9; else goto _L8
_L8:
        if (r != null)
        {
            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
        }
        r = opcode;
_L10:
        n.a(this, bytebuffer);
          goto _L7
        bytebuffer;
        n.a(this, bytebuffer);
          goto _L7
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (r == null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        r = null;
          goto _L10
        if (r != null) goto _L10; else goto _L11
_L11:
        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode1;
        if (r != null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        }
        opcode1 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b;
        if (opcode != opcode1)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        n.a(this, com.mixpanel.android.java_websocket.d.b.a(bytebuffer.c()));
          goto _L7
        bytebuffer;
        n.a(this, bytebuffer);
          goto _L7
        opcode1 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.c;
        if (opcode != opcode1)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        n.a(this, bytebuffer.c());
          goto _L7
        bytebuffer;
        n.a(this, bytebuffer);
          goto _L7
        try
        {
            throw new InvalidDataException(1002, "non control or continious frame expected");
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            n.a(this, bytebuffer);
            a(bytebuffer);
        }
          goto _L2
        bytebuffer = "";
        i1 = 1005;
          goto _L12
    }

    private com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState e(ByteBuffer bytebuffer)
        throws IncompleteHandshakeException
    {
        bytebuffer.mark();
        if (bytebuffer.limit() > Draft.c.length)
        {
            return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
        if (bytebuffer.limit() < Draft.c.length)
        {
            throw new IncompleteHandshakeException(Draft.c.length);
        }
        for (int i1 = 0; bytebuffer.hasRemaining(); i1++)
        {
            if (Draft.c[i1] != bytebuffer.get())
            {
                bytebuffer.reset();
                return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
            }
        }

        return com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
    }

    private void f(ByteBuffer bytebuffer)
    {
        if (d)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder()).append("write(").append(bytebuffer.remaining()).append("): {");
            String s1;
            if (bytebuffer.remaining() > 1000)
            {
                s1 = "too big to display";
            } else
            {
                s1 = new String(bytebuffer.array());
            }
            printstream.println(stringbuilder.append(s1).append("}").toString());
        }
        h.add(bytebuffer);
        n.b(this);
    }

    public void a()
    {
        a(1000);
    }

    public void a(int i1)
    {
        c(i1, "", false);
    }

    public void a(int i1, String s1)
    {
        c(i1, s1, false);
    }

    protected void a(int i1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        WebSocket.READYSTATE readystate;
        obj = m;
        readystate = WebSocket.READYSTATE.e;
        if (obj != readystate) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.cancel();
        }
        obj = g;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g.close();
_L3:
        n.a(this, i1, s1, flag);
_L4:
        if (p != null)
        {
            p.a();
        }
        t = null;
        m = WebSocket.READYSTATE.e;
        h.clear();
          goto _L1
        s1;
        throw s1;
        IOException ioexception;
        ioexception;
        n.a(this, ioexception);
          goto _L3
        s1;
        n.a(this, s1);
          goto _L4
    }

    protected void a(int i1, boolean flag)
    {
        a(i1, "", flag);
    }

    public void a(com.mixpanel.android.java_websocket.b.b b1)
        throws InvalidHandshakeException
    {
        if (!k && m == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.b)
        {
            throw new AssertionError("shall only be called once");
        }
        t = p.a(b1);
        x = b1.a();
        if (!k && x == null)
        {
            throw new AssertionError();
        }
        try
        {
            n.a(this, t);
        }
        // Misplaced declaration of an exception variable
        catch (com.mixpanel.android.java_websocket.b.b b1)
        {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        }
        // Misplaced declaration of an exception variable
        catch (com.mixpanel.android.java_websocket.b.b b1)
        {
            n.a(this, b1);
            throw new InvalidHandshakeException((new StringBuilder()).append("rejected because of").append(b1).toString());
        }
        a(p.a(t, q));
    }

    public void a(InvalidDataException invaliddataexception)
    {
        c(invaliddataexception.a(), invaliddataexception.getMessage(), false);
    }

    public void a(com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode, ByteBuffer bytebuffer, boolean flag)
    {
        a(((Collection) (p.a(opcode, bytebuffer, flag))));
    }

    public void a(Framedata framedata)
    {
        if (d)
        {
            System.out.println((new StringBuilder()).append("send frame: ").append(framedata).toString());
        }
        f(p.a(framedata));
    }

    public void a(String s1)
        throws WebsocketNotConnectedException
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        Draft draft = p;
        boolean flag;
        if (q == com.mixpanel.android.java_websocket.WebSocket.Role.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((Collection) (draft.a(s1, flag))));
    }

    public void a(ByteBuffer bytebuffer)
        throws IllegalArgumentException, WebsocketNotConnectedException
    {
        if (bytebuffer == null)
        {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        Draft draft = p;
        boolean flag;
        if (q == com.mixpanel.android.java_websocket.WebSocket.Role.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((Collection) (draft.a(bytebuffer, flag))));
    }

    public void a(byte abyte0[])
        throws IllegalArgumentException, WebsocketNotConnectedException
    {
        a(ByteBuffer.wrap(abyte0));
    }

    public void b(int i1, String s1)
    {
        a(i1, s1, false);
    }

    protected void b(int i1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = l;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        v = Integer.valueOf(i1);
        u = s1;
        w = Boolean.valueOf(flag);
        l = true;
        n.b(this);
        n.b(this, i1, s1, flag);
_L4:
        if (p != null)
        {
            p.a();
        }
        t = null;
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
        s1;
        n.a(this, s1);
          goto _L4
    }

    public void b(ByteBuffer bytebuffer)
    {
        if (!k && !bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        }
        if (d)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder()).append("process(").append(bytebuffer.remaining()).append("): {");
            String s1;
            if (bytebuffer.remaining() > 1000)
            {
                s1 = "too big to display";
            } else
            {
                s1 = new String(bytebuffer.array(), bytebuffer.position(), bytebuffer.remaining());
            }
            printstream.println(stringbuilder.append(s1).append("}").toString());
        }
        if (m != com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a)
        {
            d(bytebuffer);
        } else
        if (c(bytebuffer))
        {
            if (!k && s.hasRemaining() == bytebuffer.hasRemaining() && bytebuffer.hasRemaining())
            {
                throw new AssertionError();
            }
            if (bytebuffer.hasRemaining())
            {
                d(bytebuffer);
            } else
            if (s.hasRemaining())
            {
                d(s);
            }
        }
        if (!k && !g() && !h() && bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public boolean b()
    {
        return !h.isEmpty();
    }

    public InetSocketAddress c()
    {
        return n.d(this);
    }

    public InetSocketAddress d()
    {
        return n.c(this);
    }

    public boolean e()
    {
        if (k || !l || m == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.b)
        {
            return m == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.b;
        } else
        {
            throw new AssertionError();
        }
    }

    public boolean f()
    {
        if (k || m != com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c || !l)
        {
            return m == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c;
        } else
        {
            throw new AssertionError();
        }
    }

    public boolean g()
    {
        return m == WebSocket.READYSTATE.d;
    }

    public boolean h()
    {
        return l;
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public boolean i()
    {
        return m == WebSocket.READYSTATE.e;
    }

    public Draft j()
    {
        return p;
    }

    public WebSocket.READYSTATE k()
    {
        return m;
    }

    public String l()
    {
        return x;
    }

    public void m()
    {
        if (w == null)
        {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        } else
        {
            a(v.intValue(), u, w.booleanValue());
            return;
        }
    }

    public void n()
    {
        if (k() == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a)
        {
            a(-1, true);
            return;
        }
        if (l)
        {
            a(v.intValue(), u, w.booleanValue());
            return;
        }
        if (p.b() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.a)
        {
            a(1000, true);
            return;
        }
        if (p.b() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.b)
        {
            if (q == com.mixpanel.android.java_websocket.WebSocket.Role.b)
            {
                a(1006, true);
                return;
            } else
            {
                a(1000, true);
                return;
            }
        } else
        {
            a(1006, true);
            return;
        }
    }

    public String toString()
    {
        return super.toString();
    }

    static 
    {
        boolean flag;
        if (!com/mixpanel/android/java_websocket/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        e = new ArrayList(4);
        e.add(new a());
        e.add(new Draft_10());
        e.add(new c());
        e.add(new b());
    }
}
