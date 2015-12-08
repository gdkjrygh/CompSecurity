// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.o;
import c.x;
import com.c.a.A;
import com.c.a.B;
import com.c.a.C;
import com.c.a.a.a;
import com.c.a.i;
import com.c.a.w;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

// Referenced classes of package com.c.a.a.a:
//            u, e, h, o, 
//            m, q, p

public final class l
    implements u
{

    private final h a;
    private final e b;

    public l(h h1, e e1)
    {
        a = h1;
        b = e1;
    }

    public final x a(w w1, long l1)
        throws IOException
    {
        if ("chunked".equalsIgnoreCase(w1.a("Transfer-Encoding")))
        {
            w1 = b;
            if (((e) (w1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((e) (w1)).e).toString());
            } else
            {
                w1.e = 2;
                return new e.b(w1, (byte)0);
            }
        }
        if (l1 != -1L)
        {
            w1 = b;
            if (((e) (w1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((e) (w1)).e).toString());
            } else
            {
                w1.e = 2;
                return new e.d(w1, l1, (byte)0);
            }
        } else
        {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final B a(A a1)
        throws IOException
    {
        Object obj;
        if (!h.c(a1))
        {
            obj = b.a(0L);
        } else
        if ("chunked".equalsIgnoreCase(a1.a("Transfer-Encoding")))
        {
            obj = b;
            h h1 = a;
            if (((e) (obj)).e != 4)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((e) (obj)).e).toString());
            }
            obj.e = 5;
            obj = new e.c(((e) (obj)), h1);
        } else
        {
            long l1 = com.c.a.a.a.m.a(a1);
            if (l1 != -1L)
            {
                obj = b.a(l1);
            } else
            {
                obj = b;
                if (((e) (obj)).e != 4)
                {
                    throw new IllegalStateException((new StringBuilder("state: ")).append(((e) (obj)).e).toString());
                }
                obj.e = 5;
                obj = new e.f(((e) (obj)), (byte)0);
            }
        }
        return new com.c.a.a.a.o(a1.f, o.a(((c.y) (obj))));
    }

    public final void a()
        throws IOException
    {
        b.a();
    }

    public final void a(q q1)
        throws IOException
    {
        e e1 = b;
        if (e1.e != 1)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(e1.e).toString());
        } else
        {
            e1.e = 3;
            q1.a(e1.d);
            return;
        }
    }

    public final void a(w w1)
        throws IOException
    {
        a.b();
        Object obj = a.c.b.b.type();
        com.c.a.v v = a.c.g;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(w1.b);
        stringbuilder.append(' ');
        boolean flag;
        if (!w1.e() && obj == java.net.Proxy.Type.HTTP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(w1.a());
        } else
        {
            stringbuilder.append(com.c.a.a.a.p.a(w1.a()));
        }
        stringbuilder.append(' ');
        stringbuilder.append(com.c.a.a.a.p.a(v));
        obj = stringbuilder.toString();
        b.a(w1.c, ((String) (obj)));
    }

    public final com.c.a.A.a b()
        throws IOException
    {
        return b.c();
    }

    public final void c()
        throws IOException
    {
        if (d())
        {
            e e1 = b;
            e1.f = 1;
            if (e1.e == 0)
            {
                e1.f = 0;
                a.b.a(e1.a, e1.b);
            }
        } else
        {
            e e2 = b;
            e2.f = 2;
            if (e2.e == 0)
            {
                e2.e = 6;
                e2.b.c.close();
                return;
            }
        }
    }

    public final boolean d()
    {
        if (!"close".equalsIgnoreCase(a.l.a("Connection")) && !"close".equalsIgnoreCase(a.d().a("Connection")))
        {
            boolean flag;
            if (b.e == 6)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                return true;
            }
        }
        return false;
    }
}
