// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class cvz
    implements WebSocket
{

    public static int a = 16384;
    public static final boolean j;
    private static List k;
    public final BlockingQueue b = new LinkedBlockingQueue();
    public volatile boolean c;
    public com.mixpanel.android.java_websocket.WebSocket.READYSTATE d;
    public Draft e;
    public com.mixpanel.android.java_websocket.WebSocket.Role f;
    public ByteBuffer g;
    public cwk h;
    public String i;
    private cwa l;
    private com.mixpanel.android.java_websocket.framing.Framedata.Opcode m;
    private String n;
    private Integer o;
    private Boolean p;

    public cvz(cwa cwa1, Draft draft)
    {
        c = false;
        d = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a;
        e = null;
        m = null;
        g = ByteBuffer.allocate(0);
        h = null;
        n = null;
        o = null;
        p = null;
        i = null;
        if (cwa1 == null || draft == null && f == com.mixpanel.android.java_websocket.WebSocket.Role.b)
        {
            throw new IllegalArgumentException("parameters must not be null");
        }
        new LinkedBlockingQueue();
        l = cwa1;
        f = com.mixpanel.android.java_websocket.WebSocket.Role.a;
        if (draft != null)
        {
            e = draft.c();
        }
    }

    private void a(int i1, String s, boolean flag)
    {
        if (d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.d || d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.e) goto _L2; else goto _L1
_L1:
        if (d != com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c) goto _L4; else goto _L3
_L3:
        if (i1 != 1006) goto _L6; else goto _L5
_L5:
        if (!j && flag)
        {
            throw new AssertionError();
        }
        d = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.d;
        b(i1, s, false);
_L2:
        return;
_L6:
        if (e.b() != com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.a)
        {
            try
            {
                a(((Framedata) (new cwh(i1, s))));
            }
            catch (InvalidDataException invaliddataexception)
            {
                l.a(invaliddataexception);
                b(1006, "generated frame is invalid", false);
            }
        }
        b(i1, s, flag);
_L8:
        if (i1 == 1002)
        {
            b(i1, s, flag);
        }
        d = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.d;
        g = null;
        return;
_L4:
        if (i1 == -3)
        {
            if (!j && !flag)
            {
                throw new AssertionError();
            }
            b(-3, s, true);
        } else
        {
            b(-1, s, false);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(InvalidDataException invaliddataexception)
    {
        a(invaliddataexception.closecode, invaliddataexception.getMessage(), false);
    }

    private void b(int i1, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = c;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        o = Integer.valueOf(i1);
        n = s;
        p = Boolean.valueOf(flag);
        c = true;
        if (e != null)
        {
            e.a();
        }
        h = null;
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    private void c(ByteBuffer bytebuffer)
    {
        b.add(bytebuffer);
    }

    private void e()
    {
        d = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c;
        try
        {
            l.c();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            l.a(runtimeexception);
        }
    }

    public final InetSocketAddress a()
    {
        return l.d();
    }

    public final void a(int i1, String s)
    {
        this;
        JVM INSTR monitorenter ;
        com.mixpanel.android.java_websocket.WebSocket.READYSTATE readystate;
        com.mixpanel.android.java_websocket.WebSocket.READYSTATE readystate1;
        readystate = d;
        readystate1 = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.e;
        if (readystate != readystate1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        l.a(i1, s);
_L4:
        if (e != null)
        {
            e.a();
        }
        h = null;
        d = com.mixpanel.android.java_websocket.WebSocket.READYSTATE.e;
        b.clear();
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
        s;
        l.a(s);
          goto _L4
    }

    public final void a(Framedata framedata)
    {
        c(e.a(framedata));
    }

    public final void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); c((ByteBuffer)list.next())) { }
    }

    public final boolean a(ByteBuffer bytebuffer)
    {
        Object obj;
        ByteBuffer bytebuffer1;
        com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState handshakestate;
        if (g.capacity() == 0)
        {
            bytebuffer1 = bytebuffer;
        } else
        {
            if (g.remaining() < bytebuffer.remaining())
            {
                obj = ByteBuffer.allocate(g.capacity() + bytebuffer.remaining());
                g.flip();
                ((ByteBuffer) (obj)).put(g);
                g = ((ByteBuffer) (obj));
            }
            g.put(bytebuffer);
            g.flip();
            bytebuffer1 = g;
        }
        bytebuffer1.mark();
        if (e != null) goto _L2; else goto _L1
_L1:
        bytebuffer1.mark();
        if (bytebuffer1.limit() <= Draft.b.length) goto _L4; else goto _L3
_L3:
        obj = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
_L11:
        handshakestate = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
        if (obj != handshakestate) goto _L2; else goto _L5
_L5:
        c(ByteBuffer.wrap(cwu.a(l.a(this))));
        a(-3, "", false);
_L12:
        return false;
_L4:
        if (bytebuffer1.limit() < Draft.b.length)
        {
            throw new IncompleteHandshakeException(Draft.b.length);
        }
          goto _L6
        obj;
        if (g.capacity() != 0) goto _L8; else goto _L7
_L7:
        int j1;
        bytebuffer1.reset();
        j1 = ((IncompleteHandshakeException) (obj)).newsize;
        if (j1 != 0) goto _L10; else goto _L9
_L9:
        int i1 = bytebuffer1.capacity() + 16;
_L18:
        g = ByteBuffer.allocate(i1);
        g.put(bytebuffer);
_L16:
        return false;
_L6:
        i1 = 0;
_L20:
label0:
        {
            if (!bytebuffer1.hasRemaining())
            {
                break label0;
            }
            if (Draft.b[i1] == bytebuffer1.get())
            {
                break MISSING_BLOCK_LABEL_583;
            }
            bytebuffer1.reset();
            obj = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.b;
        }
          goto _L11
        obj = com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a;
          goto _L11
        obj;
        a(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
          goto _L12
_L2:
        if (f != com.mixpanel.android.java_websocket.WebSocket.Role.b) goto _L14; else goto _L13
_L13:
        if (e == null)
        {
            throw new NullPointerException();
        }
        obj = e.b(bytebuffer1);
        if (obj instanceof cwk)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (cwk)obj;
        if (e.a(((cwk) (obj))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        e();
        return true;
        a(1002, "the handshake did finaly not match", false);
        return false;
_L14:
        if (f != com.mixpanel.android.java_websocket.WebSocket.Role.a) goto _L16; else goto _L15
_L15:
        e.a(f);
        obj = e.b(bytebuffer1);
        if (obj instanceof cwr)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (cwr)obj;
        if (e.a(h, ((cwr) (obj))) != com.mixpanel.android.java_websocket.drafts.Draft.HandshakeState.a)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        e();
        return true;
        a(1002, (new StringBuilder("draft ")).append(e).append(" refuses handshake").toString(), false);
          goto _L16
        obj;
        a(((InvalidDataException) (obj)));
          goto _L16
_L10:
        i1 = j1;
        if (j) goto _L18; else goto _L17
_L17:
        i1 = j1;
        if (((IncompleteHandshakeException) (obj)).newsize >= bytebuffer1.remaining()) goto _L18; else goto _L19
_L19:
        throw new AssertionError();
_L8:
        g.position(g.limit());
        g.limit(g.capacity());
          goto _L16
        i1++;
          goto _L20
    }

    public final void b()
    {
        if (d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.a)
        {
            a(-1, "");
            return;
        }
        if (c)
        {
            int i1 = o.intValue();
            String s = n;
            p.booleanValue();
            a(i1, s);
            return;
        }
        if (e.b() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.a)
        {
            a(1000, "");
            return;
        }
        if (e.b() == com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.b && f != com.mixpanel.android.java_websocket.WebSocket.Role.b)
        {
            a(1000, "");
            return;
        } else
        {
            a(1006, "");
            return;
        }
    }

    public final void b(ByteBuffer bytebuffer)
    {
        Iterator iterator = e.a(bytebuffer).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode;
        boolean flag;
        bytebuffer = (Framedata)iterator.next();
        opcode = bytebuffer.f();
        flag = bytebuffer.d();
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.f) goto _L4; else goto _L3
_L3:
        int i1;
        if (!(bytebuffer instanceof cwg))
        {
            break MISSING_BLOCK_LABEL_373;
        }
        bytebuffer = (cwg)bytebuffer;
        i1 = bytebuffer.a();
        bytebuffer = bytebuffer.b();
_L15:
        if (d != com.mixpanel.android.java_websocket.WebSocket.READYSTATE.d) goto _L6; else goto _L5
_L5:
        a(i1, bytebuffer);
          goto _L7
        bytebuffer;
        l.a(bytebuffer);
        a(bytebuffer);
_L2:
        return;
_L6:
label0:
        {
            if (e.b() != com.mixpanel.android.java_websocket.drafts.Draft.CloseHandshakeType.c)
            {
                break label0;
            }
            a(i1, bytebuffer, true);
        }
          goto _L7
        b(i1, ((String) (bytebuffer)), false);
          goto _L7
_L4:
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.d) goto _L9; else goto _L8
_L8:
        l.a(this, bytebuffer);
          goto _L7
_L9:
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.e) goto _L7; else goto _L10
_L10:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (opcode != com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.a)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        if (m != null)
        {
            throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
        }
        m = opcode;
          goto _L7
        if (!flag) goto _L12; else goto _L11
_L11:
        if (m == null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        }
        m = null;
          goto _L7
_L12:
        if (m != null) goto _L7; else goto _L13
_L13:
        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
        com.mixpanel.android.java_websocket.framing.Framedata.Opcode opcode1;
        if (m != null)
        {
            throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
        }
        opcode1 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.b;
        if (opcode != opcode1)
        {
            continue; /* Loop/switch isn't completed */
        }
        l.a(cwu.a(bytebuffer.c()));
          goto _L7
        bytebuffer;
        l.a(bytebuffer);
          goto _L7
        if (opcode == com.mixpanel.android.java_websocket.framing.Framedata.Opcode.c) goto _L7; else goto _L14
_L14:
        throw new InvalidDataException(1002, "non control or continious frame expected");
        bytebuffer = "";
        i1 = 1005;
          goto _L15
    }

    public final boolean c()
    {
        if (!j && d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c && c)
        {
            throw new AssertionError();
        }
        return d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.c;
    }

    public final boolean d()
    {
        return d == com.mixpanel.android.java_websocket.WebSocket.READYSTATE.d;
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public String toString()
    {
        return super.toString();
    }

    static 
    {
        ArrayList arraylist;
        boolean flag;
        if (!cvz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        arraylist = new ArrayList(4);
        k = arraylist;
        arraylist.add(new cwd());
        k.add(new Draft_10());
        k.add(new cwf());
        k.add(new cwe());
    }
}
