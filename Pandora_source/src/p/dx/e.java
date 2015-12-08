// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dx;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import p.dz.a;
import p.ea.b;
import p.eb.d;
import p.ec.f;
import p.ec.h;
import p.ec.i;

// Referenced classes of package p.dx:
//            b

public interface e
{

    public abstract String a(p.dx.b b1)
        throws b;

    public abstract i a(p.dx.b b1, a a1, p.ec.a a2)
        throws b;

    public abstract void a(p.dx.b b1, int i, String s);

    public abstract void a(p.dx.b b1, d d);

    public abstract void a(p.dx.b b1, p.ec.a a1, h h)
        throws b;

    public abstract void a(p.dx.b b1, f f);

    public abstract void b(p.dx.b b1);

    public abstract void b(p.dx.b b1, int i, String s, boolean flag);

    public abstract void b(p.dx.b b1, Exception exception);

    public abstract void b(p.dx.b b1, String s);

    public abstract void b(p.dx.b b1, ByteBuffer bytebuffer);

    public abstract void b(p.dx.b b1, d d);

    public abstract void b(p.dx.b b1, p.ec.a a1)
        throws b;

    public abstract InetSocketAddress c(p.dx.b b1);

    public abstract void c(p.dx.b b1, int i, String s, boolean flag);

    public abstract void c(p.dx.b b1, d d);
}
