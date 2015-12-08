// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.i;
import com.squareup.okhttp.internal.d;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import okio.l;
import okio.q;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            q, h, f, l, 
//            k, n, m

public final class j
    implements com.squareup.okhttp.internal.http.q
{

    private final h a;
    private final f b;

    public j(h h1, f f1)
    {
        a = h1;
        b = f1;
    }

    public final w a(v v1)
        throws IOException
    {
        Object obj;
        if (!h.c(v1))
        {
            obj = b.a(0L);
        } else
        if ("chunked".equalsIgnoreCase(v1.a("Transfer-Encoding")))
        {
            obj = b;
            h h1 = a;
            if (((f) (obj)).e != 4)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((f) (obj)).e).toString());
            }
            obj.e = 5;
            obj = new f.c(((f) (obj)), h1);
        } else
        {
            long l1 = k.a(v1);
            if (l1 != -1L)
            {
                obj = b.a(l1);
            } else
            {
                obj = b;
                if (((f) (obj)).e != 4)
                {
                    throw new IllegalStateException((new StringBuilder("state: ")).append(((f) (obj)).e).toString());
                }
                obj.e = 5;
                obj = new f.f(((f) (obj)), (byte)0);
            }
        }
        return new com.squareup.okhttp.internal.http.l(v1.f, l.a(((okio.r) (obj))));
    }

    public final q a(t t1, long l1)
        throws IOException
    {
        if ("chunked".equalsIgnoreCase(t1.a("Transfer-Encoding")))
        {
            t1 = b;
            if (((f) (t1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((f) (t1)).e).toString());
            } else
            {
                t1.e = 2;
                return new f.b(t1, (byte)0);
            }
        }
        if (l1 != -1L)
        {
            t1 = b;
            if (((f) (t1)).e != 1)
            {
                throw new IllegalStateException((new StringBuilder("state: ")).append(((f) (t1)).e).toString());
            } else
            {
                t1.e = 2;
                return new f.d(t1, l1, (byte)0);
            }
        } else
        {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final void a()
        throws IOException
    {
        b.a();
    }

    public final void a(h h1)
        throws IOException
    {
        f f1 = b;
        d.b.a(f1.b, h1);
    }

    public final void a(n n1)
        throws IOException
    {
        f f1 = b;
        if (f1.e != 1)
        {
            throw new IllegalStateException((new StringBuilder("state: ")).append(f1.e).toString());
        } else
        {
            f1.e = 3;
            n1.a(f1.d);
            return;
        }
    }

    public final void a(t t1)
        throws IOException
    {
        a.b();
        Object obj = a.c.b.b.type();
        com.squareup.okhttp.Protocol protocol = a.c.g;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(t1.b);
        stringbuilder.append(' ');
        boolean flag;
        if (!t1.d() && obj == java.net.Proxy.Type.HTTP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder.append(t1.a);
        } else
        {
            stringbuilder.append(m.a(t1.a));
        }
        stringbuilder.append(' ');
        stringbuilder.append(m.a(protocol));
        obj = stringbuilder.toString();
        b.a(t1.c, ((String) (obj)));
    }

    public final com.squareup.okhttp.v.a b()
        throws IOException
    {
        return b.c();
    }

    public final void c()
        throws IOException
    {
        if (d())
        {
            f f1 = b;
            f1.f = 1;
            if (f1.e == 0)
            {
                f1.f = 0;
                d.b.a(f1.a, f1.b);
            }
        } else
        {
            f f2 = b;
            f2.f = 2;
            if (f2.e == 0)
            {
                f2.e = 6;
                f2.b.c.close();
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
