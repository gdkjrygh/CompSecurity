// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.h;
import c.y;
import com.c.a.a.a.e;
import com.c.a.a.a.m;
import com.c.a.a.b.s;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.c.a:
//            v, w, A, C, 
//            a, o, j

public final class i
{

    final j a;
    public final C b;
    public Socket c;
    boolean d;
    e e;
    s f;
    public v g;
    long h;
    public o i;
    int j;
    private Object k;

    public i(j j1, C c1)
    {
        d = false;
        g = v.b;
        a = j1;
        b = c1;
    }

    final void a(w w1, int l, int i1)
        throws IOException
    {
        e e1 = new e(a, this, c);
        e1.a(l, i1);
        URL url = w1.a();
        String s1 = (new StringBuilder("CONNECT ")).append(url.getHost()).append(":").append(url.getPort()).append(" HTTP/1.1").toString();
        do
        {
            e1.a(w1.c, s1);
            e1.a();
            Object obj = e1.c();
            obj.a = w1;
            w1 = ((A.a) (obj)).a();
            long l2 = m.a(w1);
            long l1 = l2;
            if (l2 == -1L)
            {
                l1 = 0L;
            }
            obj = e1.a(l1);
            com.c.a.a.i.a(((y) (obj)), 0x7fffffff, TimeUnit.MILLISECONDS);
            ((y) (obj)).close();
            switch (((A) (w1)).c)
            {
            default:
                throw new IOException((new StringBuilder("Unexpected response code for CONNECT: ")).append(((A) (w1)).c).toString());

            case 200: 
                if (e1.c.a().b > 0L)
                {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else
                {
                    return;
                }

            case 407: 
                obj = m.a(b.a.h, w1, b.b);
                w1 = ((w) (obj));
                break;
            }
        } while (obj != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    final void a(Object obj)
    {
        if (e())
        {
            return;
        }
        j j1 = a;
        j1;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            throw new IllegalStateException("Connection already has an owner!");
        }
        break MISSING_BLOCK_LABEL_37;
        obj;
        j1;
        JVM INSTR monitorexit ;
        throw obj;
        k = obj;
        j1;
        JVM INSTR monitorexit ;
    }

    final boolean a()
    {
label0:
        {
            synchronized (a)
            {
                if (k != null)
                {
                    break label0;
                }
            }
            return false;
        }
        k = null;
        j1;
        JVM INSTR monitorexit ;
        return true;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final boolean b()
    {
        return !c.isClosed() && !c.isInputShutdown() && !c.isOutputShutdown();
    }

    final boolean c()
    {
        return f == null || f.a();
    }

    final long d()
    {
        if (f == null)
        {
            return h;
        } else
        {
            return f.b();
        }
    }

    final boolean e()
    {
        return f != null;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Connection{")).append(b.a.b).append(":").append(b.a.c).append(", proxy=").append(b.b).append(" hostAddress=").append(b.c.getAddress().getHostAddress()).append(" cipherSuite=");
        String s1;
        if (i != null)
        {
            s1 = i.a;
        } else
        {
            s1 = "none";
        }
        return stringbuilder.append(s1).append(" protocol=").append(g).append('}').toString();
    }
}
