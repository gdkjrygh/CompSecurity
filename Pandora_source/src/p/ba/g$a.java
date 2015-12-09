// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;

import java.io.ByteArrayOutputStream;
import java.util.Hashtable;
import p.bb.a;
import p.bb.b;
import p.bb.d;
import p.bb.e;

// Referenced classes of package p.ba:
//            g, d, f, b

protected class e
{

    protected boolean a;
    protected boolean b;
    protected ByteArrayOutputStream c;
    protected int d;
    protected int e;
    final g f;

    private void e(p.ba.d d1, byte abyte0[])
    {
        f.b(d1.i(), d1.e());
    }

    private void f(p.ba.d d1, byte abyte0[])
    {
        if (d1.d() == a.h.a())
        {
            e(d1, abyte0);
        } else
        {
            if (d1.d() == a.b.a())
            {
                p.ba.g.a(f, d1.i(), d1.e());
                return;
            }
            if (d1.d() == a.c.a())
            {
                if (f.l.get(Byte.valueOf(d1.e())) == null)
                {
                    abyte0 = ((byte []) (new Object()));
                    f.l.put(Byte.valueOf(d1.e()), abyte0);
                }
                if (f.a > 1)
                {
                    f.h = d1.g();
                }
                f.a(d1.i(), d1.e(), f.a, "");
                return;
            }
            if (d1.d() == a.d.a())
            {
                f.a((new StringBuilder()).append("Got StartSessionNACK for protocol sessionID=").append(d1.e()).toString(), null);
                return;
            }
            if (d1.d() != a.e.a())
            {
                continue;
            }
            if (f.a > 1)
            {
                if (f.h == d1.g())
                {
                    f.a(d1.i(), d1.e(), "");
                    return;
                }
            } else
            {
                f.a(d1.i(), d1.e(), "");
                return;
            }
        }
        do
        {
            return;
        } while (d1.d() != a.f.a());
        f.a(d1.i(), d1.e(), "");
    }

    private void g(p.ba.d d1, byte abyte0[])
    {
        f f1 = new f();
        if (d1.i() == e.c)
        {
            f1.a(d.c);
        } else
        if (d1.i() == e.d)
        {
            f1.a(d.b);
        }
        f1.a(d1.i());
        f1.b(d1.e());
        if (f.a > 1)
        {
            abyte0 = p.ba.b.a(abyte0);
            f1.a(f.a);
            f1.c(abyte0.b());
            f1.a(abyte0.c());
            f1.b(abyte0.d());
            if (abyte0.e() > 0)
            {
                f1.a(abyte0.f());
            }
            if (abyte0.g() != null)
            {
                f1.b(abyte0.g());
            }
        } else
        {
            f1.a(abyte0);
        }
        f.j.remove(Integer.valueOf(d1.g()));
        try
        {
            f.b(f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (p.ba.d d1)
        {
            p.bn.d.a((new StringBuilder()).append("Failure propagating onProtocolMessageReceived: ").append(d1.toString()).toString(), d1);
        }
        f.a("Failure propagating onProtocolMessageReceived: ", d1);
    }

    protected void a(p.ba.d d1)
    {
        if (d1.h() == b.e && d1.d() == 0)
        {
            f f1 = new f();
            f1.a(d1.i());
            f1.b(d1.e());
            if (f.a > 1)
            {
                p.ba.b b1 = p.ba.b.a(c.toByteArray());
                f1.a(f.a);
                f1.c(b1.b());
                f1.a(b1.c());
                f1.b(b1.d());
                if (b1.e() > 0)
                {
                    f1.a(b1.f());
                }
                if (b1.g() != null)
                {
                    f1.b(b1.g());
                }
            } else
            {
                f1.a(c.toByteArray());
            }
            f.j.remove(Integer.valueOf(d1.g()));
            try
            {
                f.b(f1);
            }
            // Misplaced declaration of an exception variable
            catch (p.ba.d d1)
            {
                p.bn.d.a((new StringBuilder()).append("Failure propagating onProtocolMessageReceived: ").append(d1.toString()).toString(), d1);
            }
            a = false;
            b = false;
            c = null;
        }
    }

    protected void a(p.ba.d d1, byte abyte0[])
    {
        a = true;
        d = p.bn.b.a(abyte0, 0) - p.ba.g.a();
        e = p.bn.b.a(abyte0, 4);
        c = new ByteArrayOutputStream(d);
    }

    protected void b(p.ba.d d1, byte abyte0[])
    {
        c.write(abyte0, 0, d1.f());
        a(d1);
    }

    protected void c(p.ba.d d1, byte abyte0[])
    {
        if (d1.h() == b.d)
        {
            a(d1, abyte0);
            return;
        } else
        {
            b(d1, abyte0);
            return;
        }
    }

    protected void d(p.ba.d d1, byte abyte0[])
    {
        if (d1.h().a(b.b))
        {
            f(d1, abyte0);
            return;
        }
        if (d1.h() == b.d || d1.h() == b.e)
        {
            c(d1, abyte0);
            return;
        } else
        {
            g(d1, abyte0);
            return;
        }
    }

    protected n(g g1)
    {
        f = g1;
        super();
        a = false;
        b = false;
        c = null;
        d = 0;
        e = 0;
    }
}
