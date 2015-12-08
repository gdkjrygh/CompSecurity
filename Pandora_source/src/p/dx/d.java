// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p.dz.a;
import p.dz.b;
import p.dz.c;
import p.dz.e;
import p.ea.g;
import p.ec.f;
import p.ec.h;

// Referenced classes of package p.dx:
//            b, e

public class d
    implements p.dx.b
{

    public static int a = 16384;
    public static boolean b = false;
    public static final List c;
    static final boolean i;
    public SelectionKey d;
    public ByteChannel e;
    public final BlockingQueue f;
    public final BlockingQueue g;
    public volatile p.ed.b.b h;
    private volatile boolean j;
    private b.a k;
    private final p.dx.e l;
    private List m;
    private a n;
    private b.b o;
    private p.eb.a p;
    private ByteBuffer q;
    private p.ec.a r;
    private String s;
    private Integer t;
    private Boolean u;
    private String v;

    public d(p.dx.e e1, List list)
    {
        this(e1, (a)null);
        o = p.dx.b.b.b;
        if (list == null || list.isEmpty())
        {
            m = c;
            return;
        } else
        {
            m = list;
            return;
        }
    }

    public d(p.dx.e e1, a a1)
    {
        j = false;
        k = p.dx.b.a.a;
        n = null;
        p = null;
        q = ByteBuffer.allocate(0);
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        if (e1 == null || a1 == null && o == p.dx.b.b.b)
        {
            throw new IllegalArgumentException("parameters must not be null");
        }
        f = new LinkedBlockingQueue();
        g = new LinkedBlockingQueue();
        l = e1;
        o = p.dx.b.b.a;
        if (a1 != null)
        {
            n = a1.c();
        }
    }

    private void a(Collection collection)
    {
        if (!c())
        {
            throw new g();
        }
        for (collection = collection.iterator(); collection.hasNext(); a((p.eb.d)collection.next())) { }
    }

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); e((ByteBuffer)list.next())) { }
    }

    private void a(f f1)
    {
        if (b)
        {
            System.out.println((new StringBuilder()).append("open using draft: ").append(n.getClass().getSimpleName()).toString());
        }
        k = p.dx.b.a.c;
        try
        {
            l.a(this, f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            l.b(this, f1);
        }
    }

    private boolean b(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        p.dz.a.b b1;
        p.dz.a.b b3;
        if (q.capacity() == 0)
        {
            bytebuffer1 = bytebuffer;
        } else
        {
            if (q.remaining() < bytebuffer.remaining())
            {
                bytebuffer1 = ByteBuffer.allocate(q.capacity() + bytebuffer.remaining());
                q.flip();
                bytebuffer1.put(q);
                q = bytebuffer1;
            }
            q.put(bytebuffer);
            q.flip();
            bytebuffer1 = q;
        }
        bytebuffer1.mark();
        if (n != null) goto _L2; else goto _L1
_L1:
        b1 = d(bytebuffer1);
        b3 = p.dz.a.b.a;
        if (b1 != b3) goto _L2; else goto _L3
_L3:
        e(ByteBuffer.wrap(p.ee.b.a(l.a(this))));
        b(-3, "");
_L5:
        return false;
        p.ea.b b2;
        b2;
        c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        if (q.capacity() != 0) goto _L7; else goto _L6
_L6:
        int k1;
        bytebuffer1.reset();
        k1 = ((p.ea.a) (obj)).a();
        if (k1 != 0) goto _L9; else goto _L8
_L8:
        int j1 = bytebuffer1.capacity() + 16;
_L23:
        q = ByteBuffer.allocate(j1);
        q.put(bytebuffer);
_L21:
        return false;
_L2:
        if (o != p.dx.b.b.b) goto _L11; else goto _L10
_L10:
        if (n != null) goto _L13; else goto _L12
_L12:
        obj = m.iterator();
_L19:
        if (!((Iterator) (obj)).hasNext()) goto _L15; else goto _L14
_L14:
        Object obj1 = ((a)((Iterator) (obj)).next()).c();
        Object obj3;
        ((a) (obj1)).a(o);
        bytebuffer1.reset();
        obj3 = ((a) (obj1)).d(bytebuffer1);
        if (obj3 instanceof p.ec.a) goto _L17; else goto _L16
_L16:
        b(1002, "wrong http function", false);
        return false;
_L17:
        obj3 = (p.ec.a)obj3;
        if (((a) (obj1)).a(((p.ec.a) (obj3))) != p.dz.a.b.a) goto _L19; else goto _L18
_L18:
        v = ((p.ec.a) (obj3)).a();
        p.ec.i i1 = l.a(this, ((a) (obj1)), ((p.ec.a) (obj3)));
        a(((a) (obj1)).a(((a) (obj1)).a(((p.ec.a) (obj3)), i1), o));
        n = ((a) (obj1));
        a(((f) (obj3)));
        return true;
        Object obj2;
        obj2;
        b(((p.ea.b) (obj2)).a(), ((p.ea.b) (obj2)).getMessage(), false);
        return false;
        obj2;
        l.b(this, ((Exception) (obj2)));
        b(-1, ((RuntimeException) (obj2)).getMessage(), false);
        return false;
_L15:
        if (n == null)
        {
            b(1002, "no draft matches");
        }
        break MISSING_BLOCK_LABEL_791;
_L13:
        obj = n.d(bytebuffer1);
        if (obj instanceof p.ec.a)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (p.ec.a)obj;
        if (n.a(((p.ec.a) (obj))) != p.dz.a.b.a)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        a(((f) (obj)));
        return true;
        b(1002, "the handshake did finaly not match");
        return false;
_L11:
        if (o != p.dx.b.b.a) goto _L21; else goto _L20
_L20:
        n.a(o);
        obj = n.d(bytebuffer1);
        if (obj instanceof h)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (h)obj;
        obj2 = n.a(r, ((h) (obj)));
        obj3 = p.dz.a.b.a;
        if (obj2 != obj3)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        l.a(this, r, ((h) (obj)));
        a(((f) (obj)));
        return true;
        obj;
        b(((p.ea.b) (obj)).a(), ((p.ea.b) (obj)).getMessage(), false);
        return false;
        obj;
        l.b(this, ((Exception) (obj)));
        b(-1, ((RuntimeException) (obj)).getMessage(), false);
        return false;
        b(1002, (new StringBuilder()).append("draft ").append(n).append(" refuses handshake").toString());
          goto _L21
        obj;
        a(((p.ea.b) (obj)));
          goto _L21
_L9:
        j1 = k1;
        if (i) goto _L23; else goto _L22
_L22:
        j1 = k1;
        if (((p.ea.a) (obj)).a() >= bytebuffer1.remaining()) goto _L23; else goto _L24
_L24:
        throw new AssertionError();
_L7:
        q.position(q.limit());
        q.limit(q.capacity());
          goto _L21
        obj2;
          goto _L19
        return false;
          goto _L21
    }

    private void c(int i1, String s1, boolean flag)
    {
label0:
        {
            if (k != b.a.d && k != p.dx.b.a.e)
            {
                if (k != p.dx.b.a.c)
                {
                    break MISSING_BLOCK_LABEL_191;
                }
                if (i1 != 1006)
                {
                    break label0;
                }
                if (!i && flag)
                {
                    throw new AssertionError();
                }
                k = b.a.d;
                b(i1, s1, false);
            }
            return;
        }
        if (n.b() == p.dz.a.a.a) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        l.a(this, i1, s1);
_L3:
        a(new p.eb.b(i1, s1));
_L2:
        b(i1, s1, flag);
_L4:
        if (i1 == 1002)
        {
            b(i1, s1, flag);
        }
        k = b.a.d;
        q = null;
        return;
        Object obj;
        obj;
        l.b(this, ((Exception) (obj)));
          goto _L3
        obj;
        l.b(this, ((Exception) (obj)));
        b(1006, "generated frame is invalid", false);
          goto _L2
        if (i1 == -3)
        {
            if (!i && !flag)
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

    private void c(ByteBuffer bytebuffer)
    {
        Iterator iterator = n.c(bytebuffer).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        p.eb.a a1;
        boolean flag;
        bytebuffer = (p.eb.d)iterator.next();
        if (b)
        {
            System.out.println((new StringBuilder()).append("matched frame: ").append(bytebuffer).toString());
        }
        a1 = bytebuffer.f();
        flag = bytebuffer.d();
        if (a1 != p.eb.a.f) goto _L4; else goto _L3
_L3:
        int i1;
        if (!(bytebuffer instanceof p.eb.a))
        {
            break MISSING_BLOCK_LABEL_487;
        }
        bytebuffer = (p.eb.a)bytebuffer;
        i1 = bytebuffer.a();
        bytebuffer = bytebuffer.b();
_L12:
        if (k != b.a.d) goto _L6; else goto _L5
_L5:
        a(i1, bytebuffer, true);
          goto _L7
_L2:
        return;
_L6:
label0:
        {
            if (n.b() != p.dz.a.a.c)
            {
                break label0;
            }
            c(i1, ((String) (bytebuffer)), true);
        }
          goto _L7
        b(i1, bytebuffer, false);
          goto _L7
_L4:
label1:
        {
            if (a1 != p.eb.a.d)
            {
                break label1;
            }
            l.b(this, bytebuffer);
        }
          goto _L7
label2:
        {
            if (a1 != p.eb.a.e)
            {
                break label2;
            }
            l.c(this, bytebuffer);
        }
          goto _L7
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (a1 != p.eb.a.a)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (a1 == p.eb.a.a) goto _L9; else goto _L8
_L8:
        if (p != null)
        {
            throw new p.ea.b(1002, "Previous continuous frame sequence not completed.");
        }
        p = a1;
_L10:
        l.a(this, bytebuffer);
          goto _L7
        bytebuffer;
        l.b(this, bytebuffer);
          goto _L7
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p == null)
        {
            throw new p.ea.b(1002, "Continuous frame sequence was not started.");
        }
        p = null;
          goto _L10
        if (p != null) goto _L10; else goto _L11
_L11:
        throw new p.ea.b(1002, "Continuous frame sequence was not started.");
        p.eb.a a2;
        if (p != null)
        {
            throw new p.ea.b(1002, "Continuous frame sequence not completed.");
        }
        a2 = p.eb.a.b;
        if (a1 != a2)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        l.b(this, p.ee.b.a(bytebuffer.c()));
          goto _L7
        bytebuffer;
        l.b(this, bytebuffer);
          goto _L7
        a2 = p.eb.a.c;
        if (a1 != a2)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        l.b(this, bytebuffer.c());
          goto _L7
        bytebuffer;
        l.b(this, bytebuffer);
          goto _L7
        try
        {
            throw new p.ea.b(1002, "non control or continious frame expected");
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            l.b(this, bytebuffer);
            a(bytebuffer);
        }
          goto _L2
        bytebuffer = "";
        i1 = 1005;
          goto _L12
    }

    private p.dz.a.b d(ByteBuffer bytebuffer)
        throws p.ea.a
    {
        bytebuffer.mark();
        if (bytebuffer.limit() > a.c.length)
        {
            return p.dz.a.b.b;
        }
        if (bytebuffer.limit() < a.c.length)
        {
            throw new p.ea.a(a.c.length);
        }
        for (int i1 = 0; bytebuffer.hasRemaining(); i1++)
        {
            if (a.c[i1] != bytebuffer.get())
            {
                bytebuffer.reset();
                return p.dz.a.b.b;
            }
        }

        return p.dz.a.b.a;
    }

    private void e(ByteBuffer bytebuffer)
    {
        if (b)
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
        f.add(bytebuffer);
        l.b(this);
    }

    public InetSocketAddress a()
    {
        return l.c(this);
    }

    public void a(int i1)
    {
        c(i1, "", false);
    }

    public void a(int i1, String s1)
    {
        a(i1, s1, false);
    }

    protected void a(int i1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        b.a a1;
        obj = k;
        a1 = p.dx.b.a.e;
        if (obj != a1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (d != null)
        {
            d.cancel();
        }
        obj = e;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e.close();
_L3:
        l.b(this, i1, s1, flag);
_L4:
        if (n != null)
        {
            n.a();
        }
        r = null;
        k = p.dx.b.a.e;
        f.clear();
          goto _L1
        s1;
        throw s1;
        IOException ioexception;
        ioexception;
        l.b(this, ioexception);
          goto _L3
        s1;
        l.b(this, s1);
          goto _L4
    }

    protected void a(int i1, boolean flag)
    {
        a(i1, "", flag);
    }

    public void a(ByteBuffer bytebuffer)
    {
        if (!i && !bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        }
        if (b)
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
        if (k != p.dx.b.a.a)
        {
            c(bytebuffer);
        } else
        if (b(bytebuffer))
        {
            if (!i && q.hasRemaining() == bytebuffer.hasRemaining() && bytebuffer.hasRemaining())
            {
                throw new AssertionError();
            }
            if (bytebuffer.hasRemaining())
            {
                c(bytebuffer);
            } else
            if (q.hasRemaining())
            {
                c(q);
            }
        }
        if (!i && !g() && !h() && bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void a(p.ea.b b1)
    {
        c(b1.a(), b1.getMessage(), false);
    }

    public void a(p.eb.d d1)
    {
        if (b)
        {
            System.out.println((new StringBuilder()).append("send frame: ").append(d1).toString());
        }
        e(n.a(d1));
    }

    public void a(p.ec.b b1)
        throws p.ea.d
    {
        if (!i && k == p.dx.b.a.b)
        {
            throw new AssertionError("shall only be called once");
        }
        r = n.a(b1);
        v = b1.a();
        if (!i && v == null)
        {
            throw new AssertionError();
        }
        try
        {
            l.b(this, r);
        }
        // Misplaced declaration of an exception variable
        catch (p.ec.b b1)
        {
            throw new p.ea.d("Handshake data rejected by client.");
        }
        // Misplaced declaration of an exception variable
        catch (p.ec.b b1)
        {
            l.b(this, b1);
            throw new p.ea.d((new StringBuilder()).append("rejected because of").append(b1).toString());
        }
        a(n.a(r, o));
    }

    public void b(int i1, String s1)
    {
        c(i1, s1, false);
    }

    protected void b(int i1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = j;
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        t = Integer.valueOf(i1);
        s = s1;
        u = Boolean.valueOf(flag);
        j = true;
        l.b(this);
        l.c(this, i1, s1, flag);
_L4:
        if (n != null)
        {
            n.a();
        }
        r = null;
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
        s1;
        l.b(this, s1);
          goto _L4
    }

    public boolean b()
    {
        if (i || !j || k == p.dx.b.a.b)
        {
            return k == p.dx.b.a.b;
        } else
        {
            throw new AssertionError();
        }
    }

    public void c(String s1)
        throws g
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        a a1 = n;
        boolean flag;
        if (o == p.dx.b.b.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(a1.a(s1, flag));
    }

    public boolean c()
    {
        if (i || k != p.dx.b.a.c || !j)
        {
            return k == p.dx.b.a.c;
        } else
        {
            throw new AssertionError();
        }
    }

    public boolean d()
    {
        return k == p.dx.b.a.e;
    }

    public void e()
    {
        if (u == null)
        {
            throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
        } else
        {
            a(t.intValue(), s, u.booleanValue());
            return;
        }
    }

    public void f()
    {
        if (i() == p.dx.b.a.a)
        {
            a(-1, true);
            return;
        }
        if (j)
        {
            a(t.intValue(), s, u.booleanValue());
            return;
        }
        if (n.b() == p.dz.a.a.a)
        {
            a(1000, true);
            return;
        }
        if (n.b() == p.dz.a.a.b)
        {
            if (o == p.dx.b.b.b)
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

    public boolean g()
    {
        return k == b.a.d;
    }

    public boolean h()
    {
        return j;
    }

    public int hashCode()
    {
        return super.hashCode();
    }

    public b.a i()
    {
        return k;
    }

    public a j()
    {
        return n;
    }

    public void k()
    {
        a(1000);
    }

    public String toString()
    {
        return super.toString();
    }

    static 
    {
        boolean flag;
        if (!p/dx/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        c = new ArrayList(4);
        c.add(new c());
        c.add(new b());
        c.add(new e());
        c.add(new p.dz.d());
    }
}
