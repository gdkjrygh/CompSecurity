// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import android.util.Log;
import com.android.slyce.a.a.a;
import com.android.slyce.a.a.e;
import com.android.slyce.a.a.h;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

// Referenced classes of package com.android.slyce.a:
//            ag, aj, al, bp, 
//            r, e, bn, f

public class d
    implements ag
{

    static final boolean j;
    InetSocketAddress a;
    com.android.slyce.a.d.a b;
    boolean c;
    h d;
    e e;
    a f;
    boolean g;
    Exception h;
    boolean i;
    private al k;
    private SelectionKey l;
    private r m;
    private aj n;
    private a o;

    d()
    {
        n = new aj();
        i = false;
    }

    private void a(int i1)
    {
        if (!l.isValid())
        {
            throw new IOException(new CancelledKeyException());
        }
        if (i1 > 0)
        {
            if (!j && k.c())
            {
                throw new AssertionError();
            } else
            {
                l.interestOps(5);
                return;
            }
        } else
        {
            l.interestOps(1);
            return;
        }
    }

    private void m()
    {
        if (n.e())
        {
            com.android.slyce.a.bp.a(this, n);
        }
    }

    public void a()
    {
        k.a();
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(e e1)
    {
        e = e1;
    }

    public void a(h h1)
    {
        d = h1;
    }

    public void a(aj aj1)
    {
        if (m.b() != Thread.currentThread())
        {
            m.b(new com.android.slyce.a.e(this, aj1));
        } else
        if (!k.b())
        {
            if (!j && k.c())
            {
                throw new AssertionError();
            }
        } else
        {
            try
            {
                int i1 = aj1.d();
                ByteBuffer abytebuffer[] = aj1.b();
                k.a(abytebuffer);
                aj1.a(abytebuffer);
                a(aj1.d());
                m.b(i1 - aj1.d());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (aj aj1)
            {
                e();
            }
            c(aj1);
            a(((Exception) (aj1)));
            return;
        }
    }

    void a(r r1, SelectionKey selectionkey)
    {
        m = r1;
        l = selectionkey;
    }

    protected void a(Exception exception)
    {
        if (!c)
        {
            c = true;
            if (f != null)
            {
                f.a(exception);
                f = null;
                return;
            }
        }
    }

    void a(SocketChannel socketchannel, InetSocketAddress inetsocketaddress)
    {
        a = inetsocketaddress;
        b = new com.android.slyce.a.d.a();
        k = new bn(socketchannel);
    }

    public void b()
    {
        if (d != null)
        {
            d.a();
        }
    }

    public void b(a a1)
    {
        o = a1;
    }

    void b(Exception exception)
    {
        if (!g)
        {
            g = true;
            if (o != null)
            {
                o.a(exception);
                return;
            }
            if (exception != null)
            {
                Log.e("NIO", "Unhandled exception", exception);
                return;
            }
        }
    }

    int c()
    {
        int i1;
        boolean flag;
        int j1;
        i1 = 0;
        flag = false;
        j1 = 0;
        m();
        if (!i) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        Object obj;
        long l1;
        j1 = ((flag) ? 1 : 0);
        try
        {
            obj = b.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            e();
            c(((Exception) (obj)));
            a(((Exception) (obj)));
            return j1;
        }
        j1 = ((flag) ? 1 : 0);
        l1 = k.read(((ByteBuffer) (obj)));
        if (l1 >= 0L) goto _L4; else goto _L3
_L3:
        j1 = ((flag) ? 1 : 0);
        e();
        flag = true;
_L8:
        if (l1 <= 0L) goto _L6; else goto _L5
_L5:
        j1 = i1;
        b.a(l1);
        j1 = i1;
        ((ByteBuffer) (obj)).flip();
        j1 = i1;
        n.a(((ByteBuffer) (obj)));
        j1 = i1;
        com.android.slyce.a.bp.a(this, n);
_L9:
        j1 = i1;
        if (!flag) goto _L1; else goto _L7
_L7:
        j1 = i1;
        c(null);
        j1 = i1;
        a(((Exception) (null)));
        return i1;
_L4:
        i1 = (int)((long)0 + l1);
        flag = false;
          goto _L8
_L6:
        j1 = i1;
        aj.c(((ByteBuffer) (obj)));
          goto _L9
    }

    void c(Exception exception)
    {
        if (n.e())
        {
            h = exception;
            return;
        } else
        {
            b(exception);
            return;
        }
    }

    public void d()
    {
        e();
        a(((Exception) (null)));
    }

    public void e()
    {
        l.cancel();
        try
        {
            k.close();
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public e f()
    {
        return e;
    }

    public h g()
    {
        return d;
    }

    public a h()
    {
        return o;
    }

    public boolean i()
    {
        return k.b() && l.isValid();
    }

    public void j()
    {
        if (m.b() != Thread.currentThread())
        {
            m.b(new f(this));
        } else
        if (i)
        {
            i = false;
            try
            {
                l.interestOps(l.interestOps() | 1);
            }
            catch (Exception exception) { }
            m();
            if (!i())
            {
                c(h);
                return;
            }
        }
    }

    public boolean k()
    {
        return i;
    }

    public r l()
    {
        return m;
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
    }
}
