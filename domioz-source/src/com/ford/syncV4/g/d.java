// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.g;

import android.util.Log;
import com.ford.syncV4.d.a;
import com.ford.syncV4.d.b.e;
import com.ford.syncV4.e.b;
import com.ford.syncV4.i.f;
import com.ford.syncV4.i.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ford.syncV4.g:
//            a, b

public final class d
    implements e, com.ford.syncV4.g.a
{

    private static CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    com.ford.syncV4.g.b a;
    com.ford.syncV4.d.b.d b;
    private byte d;
    private byte e;
    private com.ford.syncV4.g.a f;
    private f g;
    private b h;

    private d()
    {
        a = null;
        b = null;
        h = new b();
    }

    public static d a(byte byte0, com.ford.syncV4.g.a a1, f f1)
    {
        d d1 = new d();
        d1.e = byte0;
        d1.f = a1;
        d1.g = f1;
        return d1;
    }

    private static com.ford.syncV4.g.b b(f f1)
    {
        com.ford.syncV4.g.b b1 = null;
        int i = 0;
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.ford.syncV4.g.b b2 = (com.ford.syncV4.g.b)iterator.next();
            if (b2.a.c() == f1.a() && (i == 0 || i >= b2.c()))
            {
                i = b2.c();
                b1 = b2;
            }
        } while (true);
        return b1;
    }

    public final String a(f f1)
    {
        if (f1.c())
        {
            f1 = b(f1);
        } else
        {
            f1 = a;
        }
        if (f1 != null)
        {
            if (((com.ford.syncV4.g.b) (f1)).a == null)
            {
                return "";
            } else
            {
                return ((com.ford.syncV4.g.b) (f1)).a.d();
            }
        } else
        {
            return "";
        }
    }

    public final void a()
    {
        Log.d("SyncSession", "Asked to send heartbeat");
        if (a != null)
        {
            com.ford.syncV4.g.b b1 = a;
            if (b1.b != null && this != null)
            {
                b1.b.a(d);
            }
        }
    }

    public final void a(byte byte0)
    {
        f.a(byte0);
    }

    public final void a(com.ford.syncV4.d.a.f f1, byte byte0, byte byte1, String s)
    {
        d = byte0;
        h.a(byte0);
        f.a(f1, byte0, byte1, s);
        if (b != null)
        {
            b.a();
        }
    }

    public final void a(com.ford.syncV4.d.a.f f1, byte byte0, String s)
    {
        f.a(f1, byte0, s);
    }

    public final void a(com.ford.syncV4.d.b.d d1)
    {
        b = d1;
        b.a(this);
    }

    public final void a(com.ford.syncV4.d.e e1)
    {
        f.a(e1);
    }

    public final void a(String s)
    {
        f.a(s);
    }

    public final void a(String s, Exception exception)
    {
        f.a(s, exception);
    }

    public final void b()
    {
        if (a != null)
        {
            a.c.a(d);
        }
        e();
    }

    public final void b(com.ford.syncV4.d.e e1)
    {
        com.ford.syncV4.g.b b1;
        if (a != null)
        {
            if ((b1 = a).b != null)
            {
                b1.b.a(e1);
                return;
            }
        }
    }

    public final void b(String s, Exception exception)
    {
        f.b(s, exception);
    }

    public final b c()
    {
        return h;
    }

    public final byte d()
    {
        return d;
    }

    public final void e()
    {
        if (a != null)
        {
            a.b(this);
            if (a.c() == 0)
            {
                c.remove(a);
            }
            a = null;
        }
    }

    public final void f()
    {
        com.ford.syncV4.g.b b1;
        if (g.c())
        {
            com.ford.syncV4.g.b b2 = b(g);
            b1 = b2;
            if (b2 == null)
            {
                b1 = new com.ford.syncV4.g.b(g);
                c.add(b1);
            }
        } else
        {
            b1 = new com.ford.syncV4.g.b(g);
        }
        a = b1;
        b1.a(this);
    }

    public final boolean g()
    {
        while (a == null || a == null || !a.a().booleanValue()) 
        {
            return false;
        }
        return true;
    }

}
