// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a;

import com.android.slyce.report.a.b.a;
import com.android.slyce.report.a.b.c;
import com.android.slyce.report.a.b.d;
import com.android.slyce.report.a.b.f;
import com.android.slyce.report.a.b.g;
import com.android.slyce.report.a.b.h;
import com.android.slyce.report.a.c.b;
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

// Referenced classes of package com.android.slyce.report.a:
//            a, b, c, f

public class e
    implements com.android.slyce.report.a.a
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
    private com.android.slyce.report.a.b j;
    private final com.android.slyce.report.a.f k;
    private List l;
    private a m;
    private com.android.slyce.report.a.c n;
    private com.android.slyce.report.a.d.e o;
    private ByteBuffer p;
    private com.android.slyce.report.a.e.a q;
    private String r;
    private Integer s;
    private Boolean t;
    private String u;

    public e(com.android.slyce.report.a.f f1, a a1)
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
        n = com.android.slyce.report.a.c.a;
        if (a1 != null)
        {
            m = a1.c();
        }
    }

    private void a(com.android.slyce.report.a.e.f f1)
    {
        if (b)
        {
            System.out.println((new StringBuilder()).append("open using draft: ").append(m.getClass().getSimpleName()).toString());
        }
        j = c;
        try
        {
            k.a(this, f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.report.a.e.f f1)
        {
            k.a(this, f1);
        }
    }

    private void a(Collection collection)
    {
        if (!c())
        {
            throw new com.android.slyce.report.a.c.g();
        }
        for (collection = collection.iterator(); collection.hasNext(); a((com.android.slyce.report.a.d.d)collection.next())) { }
    }

    private void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); e((ByteBuffer)list.next())) { }
    }

    private boolean b(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1;
        c c1;
        c c2;
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
        c1 = d(bytebuffer1);
        c2 = c.a;
        if (c1 != c2) goto _L2; else goto _L3
_L3:
        e(ByteBuffer.wrap(com.android.slyce.report.a.f.c.a(k.a(this))));
        a(-3, "");
_L5:
        return false;
        b b1;
        b1;
        c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
        if (true) goto _L5; else goto _L4
_L4:
        Object obj;
        obj;
        if (p.capacity() != 0) goto _L7; else goto _L6
_L6:
        int k1;
        bytebuffer1.reset();
        k1 = ((com.android.slyce.report.a.c.a) (obj)).a();
        if (k1 != 0) goto _L9; else goto _L8
_L8:
        int j1 = bytebuffer1.capacity() + 16;
_L23:
        p = ByteBuffer.allocate(j1);
        p.put(bytebuffer);
_L21:
        return false;
_L2:
        if (n != b) goto _L11; else goto _L10
_L10:
        if (m != null) goto _L13; else goto _L12
_L12:
        obj = l.iterator();
_L19:
        if (!((Iterator) (obj)).hasNext()) goto _L15; else goto _L14
_L14:
        Object obj1 = ((a)((Iterator) (obj)).next()).c();
        Object obj3;
        ((a) (obj1)).a(n);
        bytebuffer1.reset();
        obj3 = ((a) (obj1)).d(bytebuffer1);
        if (obj3 instanceof com.android.slyce.report.a.e.a) goto _L17; else goto _L16
_L16:
        b(1002, "wrong http function", false);
        return false;
_L17:
        obj3 = (com.android.slyce.report.a.e.a)obj3;
        if (((a) (obj1)).a(((com.android.slyce.report.a.e.a) (obj3))) != c.a) goto _L19; else goto _L18
_L18:
        u = ((com.android.slyce.report.a.e.a) (obj3)).a();
        com.android.slyce.report.a.e.i i1 = k.a(this, ((a) (obj1)), ((com.android.slyce.report.a.e.a) (obj3)));
        a(((a) (obj1)).a(((a) (obj1)).a(((com.android.slyce.report.a.e.a) (obj3)), i1), n));
        m = ((a) (obj1));
        a(((com.android.slyce.report.a.e.f) (obj3)));
        return true;
        Object obj2;
        obj2;
        b(((b) (obj2)).a(), ((b) (obj2)).getMessage(), false);
        return false;
        obj2;
        k.a(this, ((Exception) (obj2)));
        b(-1, ((RuntimeException) (obj2)).getMessage(), false);
        return false;
_L15:
        if (m == null)
        {
            a(1002, "no draft matches");
        }
        break MISSING_BLOCK_LABEL_791;
_L13:
        obj = m.d(bytebuffer1);
        if (obj instanceof com.android.slyce.report.a.e.a)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (com.android.slyce.report.a.e.a)obj;
        if (m.a(((com.android.slyce.report.a.e.a) (obj))) != c.a)
        {
            break MISSING_BLOCK_LABEL_517;
        }
        a(((com.android.slyce.report.a.e.f) (obj)));
        return true;
        a(1002, "the handshake did finaly not match");
        return false;
_L11:
        if (n != com.android.slyce.report.a.c.a) goto _L21; else goto _L20
_L20:
        m.a(n);
        obj = m.d(bytebuffer1);
        if (obj instanceof com.android.slyce.report.a.e.h)
        {
            break MISSING_BLOCK_LABEL_579;
        }
        b(1002, "wrong http function", false);
        return false;
        obj = (com.android.slyce.report.a.e.h)obj;
        obj2 = m.a(q, ((com.android.slyce.report.a.e.h) (obj)));
        obj3 = c.a;
        if (obj2 != obj3)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        k.a(this, q, ((com.android.slyce.report.a.e.h) (obj)));
        a(((com.android.slyce.report.a.e.f) (obj)));
        return true;
        obj;
        b(((b) (obj)).a(), ((b) (obj)).getMessage(), false);
        return false;
        obj;
        k.a(this, ((Exception) (obj)));
        b(-1, ((RuntimeException) (obj)).getMessage(), false);
        return false;
        a(1002, (new StringBuilder()).append("draft ").append(m).append(" refuses handshake").toString());
          goto _L21
        obj;
        a(((b) (obj)));
          goto _L21
_L9:
        j1 = k1;
        if (h) goto _L23; else goto _L22
_L22:
        j1 = k1;
        if (((com.android.slyce.report.a.c.a) (obj)).a() >= bytebuffer1.remaining()) goto _L23; else goto _L24
_L24:
        throw new AssertionError();
_L7:
        p.position(p.limit());
        p.limit(p.capacity());
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
            if (j != d && j != b.e)
            {
                if (j != c)
                {
                    break MISSING_BLOCK_LABEL_191;
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
        if (m.b() == com.android.slyce.report.a.b.b.a) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        k.a(this, i1, s1);
_L3:
        a(new com.android.slyce.report.a.d.b(i1, s1));
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
        k.a(this, ((Exception) (obj)));
          goto _L3
        obj;
        k.a(this, ((Exception) (obj)));
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

    private void c(ByteBuffer bytebuffer)
    {
        Iterator iterator = m.c(bytebuffer).iterator();
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.android.slyce.report.a.d.e e1;
        boolean flag;
        bytebuffer = (com.android.slyce.report.a.d.d)iterator.next();
        if (b)
        {
            System.out.println((new StringBuilder()).append("matched frame: ").append(bytebuffer).toString());
        }
        e1 = bytebuffer.f();
        flag = bytebuffer.d();
        if (e1 != com.android.slyce.report.a.d.e.f) goto _L4; else goto _L3
_L3:
        int i1;
        if (!(bytebuffer instanceof com.android.slyce.report.a.d.a))
        {
            break MISSING_BLOCK_LABEL_487;
        }
        bytebuffer = (com.android.slyce.report.a.d.a)bytebuffer;
        i1 = bytebuffer.a();
        bytebuffer = bytebuffer.b();
_L12:
        if (j != d) goto _L6; else goto _L5
_L5:
        a(i1, bytebuffer, true);
          goto _L7
_L2:
        return;
_L6:
label0:
        {
            if (m.b() != com.android.slyce.report.a.b.b.c)
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
            if (e1 != com.android.slyce.report.a.d.e.d)
            {
                break label1;
            }
            k.b(this, bytebuffer);
        }
          goto _L7
label2:
        {
            if (e1 != com.android.slyce.report.a.d.e.e)
            {
                break label2;
            }
            k.c(this, bytebuffer);
        }
          goto _L7
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        if (e1 != com.android.slyce.report.a.d.e.a)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        if (e1 == com.android.slyce.report.a.d.e.a) goto _L9; else goto _L8
_L8:
        if (o != null)
        {
            throw new b(1002, "Previous continuous frame sequence not completed.");
        }
        o = e1;
_L10:
        k.a(this, bytebuffer);
          goto _L7
        bytebuffer;
        k.a(this, bytebuffer);
          goto _L7
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o == null)
        {
            throw new b(1002, "Continuous frame sequence was not started.");
        }
        o = null;
          goto _L10
        if (o != null) goto _L10; else goto _L11
_L11:
        throw new b(1002, "Continuous frame sequence was not started.");
        com.android.slyce.report.a.d.e e2;
        if (o != null)
        {
            throw new b(1002, "Continuous frame sequence not completed.");
        }
        e2 = com.android.slyce.report.a.d.e.b;
        if (e1 != e2)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        k.a(this, com.android.slyce.report.a.f.c.a(bytebuffer.c()));
          goto _L7
        bytebuffer;
        k.a(this, bytebuffer);
          goto _L7
        e2 = com.android.slyce.report.a.d.e.c;
        if (e1 != e2)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        k.a(this, bytebuffer.c());
          goto _L7
        bytebuffer;
        k.a(this, bytebuffer);
          goto _L7
        try
        {
            throw new b(1002, "non control or continious frame expected");
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            k.a(this, bytebuffer);
            a(bytebuffer);
        }
          goto _L2
        bytebuffer = "";
        i1 = 1005;
          goto _L12
    }

    private c d(ByteBuffer bytebuffer)
    {
        bytebuffer.mark();
        if (bytebuffer.limit() > a.c.length)
        {
            return c.b;
        }
        if (bytebuffer.limit() < a.c.length)
        {
            throw new com.android.slyce.report.a.c.a(a.c.length);
        }
        for (int i1 = 0; bytebuffer.hasRemaining(); i1++)
        {
            if (a.c[i1] != bytebuffer.get())
            {
                bytebuffer.reset();
                return c.b;
            }
        }

        return c.a;
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
        k.b(this);
    }

    public InetSocketAddress a()
    {
        return k.c(this);
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
        com.android.slyce.report.a.b b1;
        obj = j;
        b1 = b.e;
        if (obj != b1) goto _L2; else goto _L1
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
        k.a(this, i1, s1, flag);
_L4:
        if (m != null)
        {
            m.a();
        }
        q = null;
        j = b.e;
        f.clear();
          goto _L1
        s1;
        throw s1;
        IOException ioexception;
        ioexception;
        k.a(this, ioexception);
          goto _L3
        s1;
        k.a(this, s1);
          goto _L4
    }

    protected void a(int i1, boolean flag)
    {
        a(i1, "", flag);
    }

    public void a(b b1)
    {
        c(b1.a(), b1.getMessage(), false);
    }

    public void a(com.android.slyce.report.a.d.d d1)
    {
        if (b)
        {
            System.out.println((new StringBuilder()).append("send frame: ").append(d1).toString());
        }
        e(m.a(d1));
    }

    public void a(com.android.slyce.report.a.d.e e1, ByteBuffer bytebuffer, boolean flag)
    {
        a(((Collection) (m.a(e1, bytebuffer, flag))));
    }

    public void a(com.android.slyce.report.a.e.b b1)
    {
        if (!h && j == com.android.slyce.report.a.b.b)
        {
            throw new AssertionError("shall only be called once");
        }
        q = m.a(b1);
        u = b1.a();
        if (!h && u == null)
        {
            throw new AssertionError();
        }
        try
        {
            k.a(this, q);
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.report.a.e.b b1)
        {
            throw new com.android.slyce.report.a.c.d("Handshake data rejected by client.");
        }
        // Misplaced declaration of an exception variable
        catch (com.android.slyce.report.a.e.b b1)
        {
            k.a(this, b1);
            throw new com.android.slyce.report.a.c.d((new StringBuilder()).append("rejected because of").append(b1).toString());
        }
        a(m.a(q, n));
    }

    public void a(ByteBuffer bytebuffer)
    {
        if (!h && !bytebuffer.hasRemaining())
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
        if (!h && !d() && !e() && bytebuffer.hasRemaining())
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    public void b()
    {
        if (g() == a)
        {
            a(-1, true);
            return;
        }
        if (i)
        {
            a(s.intValue(), r, t.booleanValue());
            return;
        }
        if (m.b() == com.android.slyce.report.a.b.b.a)
        {
            a(1000, true);
            return;
        }
        if (m.b() == com.android.slyce.report.a.b.b.b)
        {
            if (n == b)
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

    public void b(int i1, String s1)
    {
        a(i1, s1, false);
    }

    protected void b(int i1, String s1, boolean flag)
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
        k.b(this);
        k.b(this, i1, s1, flag);
_L4:
        if (m != null)
        {
            m.a();
        }
        q = null;
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
        s1;
        k.a(this, s1);
          goto _L4
    }

    public boolean c()
    {
        if (h || j != c || !i)
        {
            return j == c;
        } else
        {
            throw new AssertionError();
        }
    }

    public boolean d()
    {
        return j == d;
    }

    public boolean e()
    {
        return i;
    }

    public boolean f()
    {
        return j == b.e;
    }

    public com.android.slyce.report.a.b g()
    {
        return j;
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
        boolean flag;
        if (!com/android/slyce/report/a/e.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        c = new ArrayList(4);
        c.add(new f());
        c.add(new d());
        c.add(new h());
        c.add(new g());
    }
}
