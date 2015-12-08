// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import com.ford.syncV4.d.a.b;
import com.ford.syncV4.d.a.e;
import com.ford.syncV4.d.a.f;
import com.ford.syncV4.util.a;
import com.ford.syncV4.util.c;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;

// Referenced classes of package com.ford.syncV4.d:
//            d, f, e, b

public final class g
{

    protected boolean a;
    protected boolean b;
    protected ByteArrayOutputStream c;
    protected int d;
    protected int e;
    final com.ford.syncV4.d.f f;

    protected g(com.ford.syncV4.d.f f1)
    {
        f = f1;
        super();
        a = false;
        b = false;
        c = null;
        d = 0;
        e = 0;
    }

    private void b(d d1, byte abyte0[])
    {
        if (d1.h() == b.d)
        {
            a = true;
            d = com.ford.syncV4.util.a.a(abyte0, 0) - com.ford.syncV4.d.f.a();
            e = com.ford.syncV4.util.a.a(abyte0, 4);
            c = new ByteArrayOutputStream(d);
        } else
        {
            c.write(abyte0, 0, d1.f());
            if (d1.h() == b.e && d1.d() == 0)
            {
                abyte0 = new com.ford.syncV4.d.e();
                abyte0.a(d1.i());
                abyte0.b(d1.e());
                if (f.a > 1)
                {
                    com.ford.syncV4.d.b b1 = com.ford.syncV4.d.b.a(c.toByteArray());
                    abyte0.a(f.a);
                    abyte0.c(b1.b());
                    abyte0.b(b1.c());
                    abyte0.c(b1.d());
                    if (b1.e() > 0)
                    {
                        abyte0.a(b1.f());
                    }
                    if (b1.g() != null)
                    {
                        abyte0.b(b1.g());
                    }
                } else
                {
                    abyte0.a(c.toByteArray());
                }
                f.j.remove(Integer.valueOf(d1.g()));
                try
                {
                    f.b(abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (d d1)
                {
                    com.ford.syncV4.util.c.a((new StringBuilder("Failure propagating onProtocolMessageReceived: ")).append(d1.toString()).toString(), d1);
                }
                a = false;
                b = false;
                c = null;
                return;
            }
        }
    }

    protected final void a(d d1, byte abyte0[])
    {
        if (d1.h().a(b.b))
        {
            if (d1.d() == com.ford.syncV4.d.a.a.h.a())
            {
                f.b(d1.e());
            } else
            {
                if (d1.d() == com.ford.syncV4.d.a.a.b.a())
                {
                    com.ford.syncV4.d.f.a(f, d1.i(), d1.e());
                    return;
                }
                if (d1.d() == com.ford.syncV4.d.a.a.c.a())
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
                if (d1.d() == com.ford.syncV4.d.a.a.d.a())
                {
                    f.a((new StringBuilder("Got StartSessionNACK for protocol sessionID=")).append(d1.e()).toString(), null);
                    return;
                }
                if (d1.d() != com.ford.syncV4.d.a.a.e.a())
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
            } while (d1.d() != com.ford.syncV4.d.a.a.f.a());
            f.a(d1.i(), d1.e(), "");
            return;
        }
        if (d1.h() == b.d || d1.h() == b.e)
        {
            b(d1, abyte0);
            return;
        }
        com.ford.syncV4.d.e e1 = new com.ford.syncV4.d.e();
        if (d1.i() == f.c)
        {
            e1.a(e.c);
        } else
        if (d1.i() == f.d)
        {
            e1.a(e.b);
        }
        e1.a(d1.i());
        e1.b(d1.e());
        if (f.a > 1)
        {
            abyte0 = com.ford.syncV4.d.b.a(abyte0);
            e1.a(f.a);
            e1.c(abyte0.b());
            e1.b(abyte0.c());
            e1.c(abyte0.d());
            if (abyte0.e() > 0)
            {
                e1.a(abyte0.f());
            }
            if (abyte0.g() != null)
            {
                e1.b(abyte0.g());
            }
        } else
        {
            e1.a(abyte0);
        }
        f.j.remove(Integer.valueOf(d1.g()));
        try
        {
            f.b(e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            com.ford.syncV4.util.c.a((new StringBuilder("Failure propagating onProtocolMessageReceived: ")).append(d1.toString()).toString(), d1);
        }
        f.a("Failure propagating onProtocolMessageReceived: ", d1);
    }
}
