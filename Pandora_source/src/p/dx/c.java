// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.net.InetSocketAddress;
import p.dz.a;
import p.ea.b;
import p.ea.d;
import p.ec.e;
import p.ec.h;
import p.ec.i;

// Referenced classes of package p.dx:
//            e, b

public abstract class c
    implements p.dx.e
{

    public c()
    {
    }

    public String a(p.dx.b b1)
        throws b
    {
        b1 = b1.a();
        if (b1 == null)
        {
            throw new d("socket not bound");
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(90);
            stringbuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringbuffer.append(b1.getPort());
            stringbuffer.append("\" /></cross-domain-policy>\0");
            return stringbuffer.toString();
        }
    }

    public i a(p.dx.b b1, a a1, p.ec.a a2)
        throws b
    {
        return new e();
    }

    public void a(p.dx.b b1, p.eb.d d1)
    {
    }

    public void a(p.dx.b b1, p.ec.a a1, h h)
        throws b
    {
    }

    public void b(p.dx.b b1, p.eb.d d1)
    {
        d1 = new p.eb.e(d1);
        d1.a(p.eb.d.a.e);
        b1.a(d1);
    }

    public void b(p.dx.b b1, p.ec.a a1)
        throws b
    {
    }

    public void c(p.dx.b b1, p.eb.d d1)
    {
    }
}
