// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bj;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p.ax.a;
import p.ba.f;
import p.bb.e;
import p.bd.b;

// Referenced classes of package p.bj:
//            a, b

public class c
    implements p.bc.c, p.bj.a
{

    private static CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    p.bj.b a;
    p.bc.b b;
    private byte d;
    private byte e;
    private p.bj.a f;
    private p.bm.c g;
    private b h;

    private c()
    {
        a = null;
        b = null;
        h = new b();
    }

    public static c a(byte byte0, p.bj.a a1, p.bm.c c1)
    {
        c c2 = new c();
        c2.e = byte0;
        c2.f = a1;
        c2.g = c1;
        return c2;
    }

    private static p.bj.b b(p.bm.c c1)
    {
        p.bj.b b1 = null;
        int i = 0;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p.bj.b b2 = (p.bj.b)iterator.next();
            if (b2.f() == c1.a() && (i == 0 || i >= b2.g()))
            {
                i = b2.g();
                b1 = b2;
            }
        } while (true);
        return b1;
    }

    private void f()
    {
        if (b != null)
        {
            b.a();
        }
    }

    public String a(p.bm.c c1)
    {
        if (c1.c())
        {
            c1 = b(c1);
        } else
        {
            c1 = a;
        }
        if (c1 != null)
        {
            return c1.c();
        } else
        {
            return "";
        }
    }

    public b a()
    {
        return h;
    }

    public void a(byte byte0)
    {
        f.a(byte0);
    }

    public void a(String s)
    {
        f.a(s);
    }

    public void a(String s, Exception exception)
    {
        f.a(s, exception);
    }

    public void a(f f1)
    {
        f.a(f1);
    }

    public void a(e e1, byte byte0, byte byte1, String s)
    {
        d = byte0;
        h.a(byte0);
        f.a(e1, byte0, byte1, s);
        f();
    }

    public void a(e e1, byte byte0, String s)
    {
        f.a(e1, byte0, s);
    }

    public void a(p.bc.b b1)
    {
        Log.d("SyncSession", "Asked to send heartbeat");
        if (a != null)
        {
            a.b(this);
        }
    }

    public byte b()
    {
        return d;
    }

    public void b(String s, Exception exception)
    {
        f.b(s, exception);
    }

    public void b(f f1)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b(f1);
            return;
        }
    }

    public void b(p.bc.b b1)
    {
        if (a != null)
        {
            a.c.a(d);
        }
        c();
    }

    public void c()
    {
        if (a != null)
        {
            a.c(this);
            if (a.g() == 0)
            {
                c.remove(a);
            }
            a = null;
        }
    }

    public void c(p.bc.b b1)
    {
        b = b1;
        b.a(this);
    }

    public void d()
        throws a
    {
        p.bj.b b1;
        if (g.c())
        {
            p.bj.b b2 = b(g);
            b1 = b2;
            if (b2 == null)
            {
                b1 = new p.bj.b(g);
                c.add(b1);
            }
        } else
        {
            b1 = new p.bj.b(g);
        }
        a = b1;
        b1.a(this);
    }

    public boolean e()
    {
        while (a == null || a == null || !a.b().booleanValue()) 
        {
            return false;
        }
        return true;
    }

}
