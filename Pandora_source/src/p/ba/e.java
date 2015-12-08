// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;

import p.bb.a;
import p.bb.b;

// Referenced classes of package p.ba:
//            b, d

public class e
{

    public static p.ba.b a(byte byte0, int i, int j, int k)
    {
        p.ba.b b1 = new p.ba.b();
        b1.a(byte0);
        b1.a(i);
        b1.b(j);
        b1.c(k);
        return b1;
    }

    public static d a(p.bb.e e1, byte byte0, byte byte1)
    {
        return a(e1, byte0, byte1, a.a);
    }

    private static d a(p.bb.e e1, byte byte0, byte byte1, a a1)
    {
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(e1);
        d1.c(byte0);
        d1.b(a1.c());
        return d1;
    }

    public static d a(p.bb.e e1, byte byte0, int i, byte byte1)
    {
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(e1);
        d1.c(byte0);
        d1.b(a.c.c());
        d1.b(i);
        return d1;
    }

    public static d a(p.bb.e e1, byte byte0, int i, byte byte1, int j, byte byte2)
    {
        d d1 = new d();
        d1.a(byte2);
        d1.a(b.e);
        d1.a(e1);
        d1.b(byte1);
        d1.c(byte0);
        d1.a(i);
        d1.b(j);
        return d1;
    }

    public static d a(p.bb.e e1, byte byte0, int i, int j, byte byte1)
    {
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.c);
        d1.a(e1);
        d1.b((byte)0);
        d1.c(byte0);
        d1.a(i);
        d1.b(j);
        return d1;
    }

    public static d a(p.bb.e e1, int i, byte byte0, byte byte1)
    {
        d d1 = new d();
        d1.a(byte0);
        d1.a(b.b);
        d1.a(e1);
        d1.b(a.b.c());
        d1.b(i);
        d1.c(byte1);
        return d1;
    }

    public static d b(p.bb.e e1, byte byte0, int i, byte byte1)
    {
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.b);
        d1.a(e1);
        d1.c(byte0);
        d1.b(a.e.c());
        d1.b(i);
        return d1;
    }

    public static d c(p.bb.e e1, byte byte0, int i, byte byte1)
    {
        d d1 = new d();
        d1.a(byte1);
        d1.a(b.d);
        d1.a(e1);
        d1.b((byte)0);
        d1.c(byte0);
        d1.a(8);
        d1.b(i);
        return d1;
    }
}
