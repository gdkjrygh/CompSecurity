// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.java_websocket.b.a;
import org.java_websocket.b.c;
import org.java_websocket.b.d;
import org.java_websocket.b.f;
import org.java_websocket.b.g;
import org.java_websocket.b.h;
import org.java_websocket.c.b;
import org.java_websocket.util.Charsetfunctions;

// Referenced classes of package org.java_websocket:
//            a, b, c, f

public class e
    implements org.java_websocket.a
{

    public static int a = 16384;
    public static boolean b = false;
    public static final List c;
    static final boolean h;
    public SelectionKey d;
    public ByteChannel e;
    public final BlockingQueue f = new LinkedBlockingQueue();
    public final BlockingQueue g = new LinkedBlockingQueue();
    private volatile boolean i;
    private int j;
    private final org.java_websocket.f k;
    private List l;
    private a m;
    private int n;
    private org.java_websocket.d.e o;
    private ByteBuffer p;
    private org.java_websocket.e.a q;
    private String r;
    private Integer s;
    private Boolean t;
    private String u;

    public e(org.java_websocket.f f1, a a1)
    {
        i = false;
        j = a;
        m = null;
        o = null;
        p = ByteBuffer.allocate(0);
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        if (f1 == null || a1 == null && n == b)
        {
            throw new IllegalArgumentException("parameters must not be null");
        }
        k = f1;
        n = org.java_websocket.c.a;
        if (a1 != null)
        {
            m = a1.c();
        }
    }

    private void a(int i1, String s1, boolean flag)
    {
label0:
        {
            if (j != d && j != b.e)
            {
                if (j != c)
                {
                    break MISSING_BLOCK_LABEL_185;
                }
                if (i1 != 1006)
                {
                    break label0;
                }
                if (!h && flag)
                {
                    throw new AssertionError();
                }
                j = d;
                b(i1, s1, false);
            }
            return;
        }
        if (m.b() == org.java_websocket.b.b.a) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        k.i();
_L3:
        a(((org.java_websocket.d.d) (new org.java_websocket.d.b(i1, s1))));
_L2:
        b(i1, s1, flag);
_L4:
        if (i1 == 1002)
        {
            b(i1, s1, flag);
        }
        j = d;
        p = null;
        return;
        Object obj;
        obj;
        k.b(((Exception) (obj)));
          goto _L3
        obj;
        k.b(((Exception) (obj)));
        b(1006, "generated frame is invalid", false);
          goto _L2
        if (i1 == -3)
        {
            if (!h && !flag)
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

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); d((ByteBuffer)list.next())) { }
    }

    private void a(b b1)
    {
        a(b1.a(), b1.getMessage(), false);
    }

    private void b(int i1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = i;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = Integer.valueOf(i1);
        r = s1;
        t = Boolean.valueOf(flag);
        i = true;
        if (m != null)
        {
            m.a();
        }
        q = null;
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    private boolean b(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        int j1;
        int k1;
        if (p.capacity() == 0)
        {
            bytebuffer1 = bytebuffer;
        } else
        {
            if (p.remaining() < bytebuffer.remaining())
            {
                bytebuffer1 = ByteBuffer.allocate(p.capacity() + bytebuffer.remaining());
                p.flip();
                bytebuffer1.put(p);
                p = bytebuffer1;
            }
            p.put(bytebuffer);
            p.flip();
            bytebuffer1 = p;
        }
        bytebuffer1.mark();
        if (m != null) goto _L2; else goto _L1
_L1:
        bytebuffer1.mark();
        if (bytebuffer1.limit() <= a.c.length) goto _L4; else goto _L3
_L3:
        j1 = c.b;
_L32:
        k1 = c.a;
        if (j1 != k1) goto _L2; else goto _L5
_L5:
        d(ByteBuffer.wrap(Charsetfunctions.a(k.a(this))));
        a(-3, "", false);
_L13:
        return false;
_L4:
        if (bytebuffer1.limit() < a.c.length)
        {
            throw new org.java_websocket.c.a(a.c.length);
        }
          goto _L6
        Object obj;
        obj;
        if (p.capacity() != 0) goto _L8; else goto _L7
_L7:
        int l1;
        bytebuffer1.reset();
        l1 = ((org.java_websocket.c.a) (obj)).a();
        if (l1 != 0) goto _L10; else goto _L9
_L9:
        j1 = bytebuffer1.capacity() + 16;
_L28:
        p = ByteBuffer.allocate(j1);
        p.put(bytebuffer);
_L26:
        return false;
_L6:
        j1 = 0;
_L30:
        if (!bytebuffer1.hasRemaining()) goto _L12; else goto _L11
_L12:
        j1 = c.a;
        continue; /* Loop/switch isn't completed */
        obj;
        a(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
          goto _L13
_L2:
        if (n != b) goto _L15; else goto _L14
_L14:
        if (m != null) goto _L17; else goto _L16
_L16:
        obj = l.iterator();
_L23:
        if (!((Iterator) (obj)).hasNext()) goto _L19; else goto _L18
_L18:
        a1 = ((a)((Iterator) (obj)).next()).c();
        a1.b(n);
        bytebuffer1.reset();
        obj2 = a1.b(bytebuffer1);
        if (obj2 instanceof org.java_websocket.e.a) goto _L21; else goto _L20
_L20:
        b(1002, "wrong http function", false);
        return false;
_L21:
        obj2 = (org.java_websocket.e.a)obj2;
        if (a1.a(((org.java_websocket.e.a) (obj2))) != c.a) goto _L23; else goto _L22
_L22:
        u = ((org.java_websocket.e.a) (obj2)).a();
        i1 = k.f();
        a(org.java_websocket.b.a.b(a1.a(((org.java_websocket.e.a) (obj2)), i1)));
        m = a1;
        h();
        return true;
        obj1;
        b(((b) (obj1)).a(), ((b) (obj1)).getMessage(), false);
        return false;
        obj1;
        k.b(((Exception) (obj1)));
        b(-1, ((RuntimeException) (obj1)).getMessage(), false);
        return false;
_L19:
        if (m == null)
        {
            a(1002, "no draft matches", false);
        }
          goto _L24
_L17:
        obj = m.b(bytebuffer1);
        if (obj instanceof org.java_websocket.e.a)
        {
            break MISSING_BLOCK_LABEL_562;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (org.java_websocket.e.a)obj;
        if (m.a(((org.java_websocket.e.a) (obj))) != c.a)
        {
            break MISSING_BLOCK_LABEL_587;
        }
        h();
        return true;
        a(1002, "the handshake did finaly not match", false);
        return false;
_L15:
        if (n != org.java_websocket.c.a) goto _L26; else goto _L25
_L25:
        m.b(n);
        obj = m.b(bytebuffer1);
        if (obj instanceof org.java_websocket.e.h)
        {
            break MISSING_BLOCK_LABEL_650;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (org.java_websocket.e.h)obj;
        if (m.a(q, ((org.java_websocket.e.h) (obj))) != c.a)
        {
            break MISSING_BLOCK_LABEL_679;
        }
        h();
        return true;
        a(1002, (new StringBuilder("draft ")).append(m).append(" refuses handshake").toString(), false);
          goto _L26
        obj;
        a(((b) (obj)));
          goto _L26
_L10:
        j1 = l1;
        if (h) goto _L28; else goto _L27
_L27:
        j1 = l1;
        if (((org.java_websocket.c.a) (obj)).a() >= bytebuffer1.remaining()) goto _L28; else goto _L29
_L29:
        throw new AssertionError();
_L8:
        p.position(p.limit());
        p.limit(p.capacity());
          goto _L26
        obj1;
          goto _L23
_L11:
        a a1;
        Object obj1;
        Object obj2;
        org.java_websocket.e.i i1;
        if (a.c[j1] != bytebuffer1.get())
        {
            bytebuffer1.reset();
            j1 = c.b;
            continue; /* Loop/switch isn't completed */
        }
        j1++;
          goto _L30
_L24:
        return false;
        if (true) goto _L32; else goto _L31
_L31:
    }

    private void c(ByteBuffer bytebuffer)
    {
        Iterator iterator = m.a(bytebuffer).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        org.java_websocket.d.e e1;
        boolean flag;
        bytebuffer = (org.java_websocket.d.d)iterator.next();
        if (b)
        {
            System.out.println((new StringBuilder("matched frame: ")).append(bytebuffer).toString());
        }
        e1 = bytebuffer.f();
        flag = bytebuffer.d();
        if (e1 != org.java_websocket.d.e.f) goto _L4; else goto _L3
_L3:
        int i1;
        if (!(bytebuffer instanceof org.java_websocket.d.a))
        {
            break MISSING_BLOCK_LABEL_399;
        }
        bytebuffer = (org.java_websocket.d.a)bytebuffer;
        i1 = bytebuffer.a();
        bytebuffer = bytebuffer.b();
_L15:
        if (j != d) goto _L6; else goto _L5
_L5:
        g();
          goto _L7
        bytebuffer;
        k.b(bytebuffer);
        a(bytebuffer);
_L2:
        return;
_L6:
label0:
        {
            if (m.b() != org.java_websocket.b.b.c)
            {
                break label0;
            }
            a(i1, bytebuffer, true);
        }
          goto _L7
        b(i1, bytebuffer, false);
          goto _L7
_L4:
        if (e1 != org.java_websocket.d.e.d) goto _L9; else goto _L8
_L8:
        k.a(this, bytebuffer);
          goto _L7
_L9:
        if (e1 == org.java_websocket.d.e.e) goto _L7; else goto _L10
_L10:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (e1 != org.java_websocket.d.e.a)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        if (e1 == org.java_websocket.d.e.a)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        if (o != null)
        {
            throw new b(1002, "Previous continuous frame sequence not completed.");
        }
        o = e1;
          goto _L7
        if (!flag) goto _L12; else goto _L11
_L11:
        if (o == null)
        {
            throw new b(1002, "Continuous frame sequence was not started.");
        }
        o = null;
          goto _L7
_L12:
        if (o != null) goto _L7; else goto _L13
_L13:
        throw new b(1002, "Continuous frame sequence was not started.");
        org.java_websocket.d.e e2;
        if (o != null)
        {
            throw new b(1002, "Continuous frame sequence not completed.");
        }
        e2 = org.java_websocket.d.e.b;
        if (e1 != e2)
        {
            continue; /* Loop/switch isn't completed */
        }
        k.b(Charsetfunctions.a(bytebuffer.c()));
          goto _L7
        bytebuffer;
        k.b(bytebuffer);
          goto _L7
        if (e1 == org.java_websocket.d.e.c) goto _L7; else goto _L14
_L14:
        throw new b(1002, "non control or continious frame expected");
        bytebuffer = "";
        i1 = 1005;
          goto _L15
    }

    private void d(ByteBuffer bytebuffer)
    {
        if (b)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder("write(")).append(bytebuffer.remaining()).append("): {");
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
        f.add(bytebuffer);
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = j;
        j1 = b.e;
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ByteChannel bytechannel;
        if (d != null)
        {
            d.cancel();
        }
        bytechannel = e;
        if (bytechannel == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        e.close();
_L3:
        k.h();
_L4:
        if (m != null)
        {
            m.a();
        }
        q = null;
        j = b.e;
        f.clear();
          goto _L1
        Object obj;
        obj;
        throw obj;
        obj;
        k.b(((Exception) (obj)));
          goto _L3
        obj;
        k.b(((Exception) (obj)));
          goto _L4
    }

    private void h()
    {
        if (b)
        {
            System.out.println((new StringBuilder("open using draft: ")).append(m.getClass().getSimpleName()).toString());
        }
        j = c;
        try
        {
            k.g();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            k.b(runtimeexception);
        }
    }

    public final void a()
    {
        g();
    }

    public final void a(ByteBuffer bytebuffer)
    {
        if (!h && !bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        }
        if (b)
        {
            PrintStream printstream = System.out;
            StringBuilder stringbuilder = (new StringBuilder("process(")).append(bytebuffer.remaining()).append("): {");
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
        if (j != a)
        {
            c(bytebuffer);
        } else
        if (b(bytebuffer))
        {
            if (!h && p.hasRemaining() == bytebuffer.hasRemaining() && bytebuffer.hasRemaining())
            {
                throw new AssertionError();
            }
            if (bytebuffer.hasRemaining())
            {
                c(bytebuffer);
            } else
            if (p.hasRemaining())
            {
                c(p);
            }
        }
        if (!h)
        {
            boolean flag;
            if (j == d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && !i && bytebuffer.hasRemaining())
            {
                throw new AssertionError();
            }
        }
    }

    public final void a(org.java_websocket.d.d d1)
    {
        if (b)
        {
            System.out.println((new StringBuilder("send frame: ")).append(d1).toString());
        }
        d(m.a(d1));
    }

    public final void a(org.java_websocket.e.b b1)
    {
        if (!h && j == org.java_websocket.b.b)
        {
            throw new AssertionError("shall only be called once");
        }
        q = m.a(b1);
        u = b1.a();
        if (!h && u == null)
        {
            throw new AssertionError();
        } else
        {
            a(org.java_websocket.b.a.b(q));
            return;
        }
    }

    public final void b()
    {
        if (j == a)
        {
            g();
            return;
        }
        if (i)
        {
            s.intValue();
            t.booleanValue();
            g();
            return;
        }
        if (m.b() == org.java_websocket.b.b.a)
        {
            g();
            return;
        }
        if (m.b() == org.java_websocket.b.b.b && n != b)
        {
            g();
            return;
        } else
        {
            g();
            return;
        }
    }

    public final void c()
    {
        a(1000, "", false);
    }

    public final InetSocketAddress d()
    {
        return k.j();
    }

    public final boolean e()
    {
        if (!h && j == c && i)
        {
            throw new AssertionError();
        }
        return j == c;
    }

    public final boolean f()
    {
        return j == b.e;
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
        if (!org/java_websocket/e.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        arraylist = new ArrayList(4);
        c = arraylist;
        arraylist.add(new f());
        c.add(new d());
        c.add(new h());
        c.add(new g());
    }
}
