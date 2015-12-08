// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            h, m, q, t, 
//            d, u

public class o
{

    private static final h b = h.a();
    protected volatile q a;
    private d c;
    private h d;
    private volatile d e;

    public o()
    {
    }

    private static q a(q q1, d d1, h h1)
    {
        try
        {
            d1 = q1.l().a(d1, h1).g();
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            return q1;
        }
        return d1;
    }

    public final q a(q q1)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
_L2:
        return a;
_L4:
        if (c == null) goto _L6; else goto _L5
_L5:
        a = (q)q1.g().a(c, d);
        e = c;
        c = null;
_L7:
        this;
        JVM INSTR monitorexit ;
          goto _L2
        q1;
        this;
        JVM INSTR monitorexit ;
        throw q1;
_L6:
        a = q1;
        e = d.a;
        c = null;
          goto _L7
        m m1;
        m1;
        a = q1;
        e = d.a;
        c = null;
          goto _L7
    }

    public final void a(d d1, h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (d1 == null)
        {
            throw new NullPointerException("found null ByteString");
        } else
        {
            c = d1;
            d = h1;
            a = null;
            e = null;
            return;
        }
    }

    public final void a(o o1)
    {
        if (!o1.a())
        {
            if (a())
            {
                c = o1.c;
                a = o1.a;
                e = o1.e;
                if (o1.d != null)
                {
                    d = o1.d;
                    return;
                }
            } else
            {
                if (d == null)
                {
                    d = o1.d;
                }
                if (c != null && o1.c != null)
                {
                    d d1 = c;
                    o1 = o1.c;
                    int i = d1.b();
                    int j = o1.b();
                    if ((long)i + (long)j >= 0x7fffffffL)
                    {
                        throw new IllegalArgumentException((new StringBuilder(53)).append("ByteString would be too long: ").append(i).append("+").append(j).toString());
                    } else
                    {
                        c = u.a(d1, o1);
                        return;
                    }
                }
                if (a == null && o1.a != null)
                {
                    b(a(o1.a, c, d));
                    return;
                }
                if (a != null && o1.a == null)
                {
                    b(a(a, o1.c, o1.d));
                    return;
                }
                if (o1.d != null)
                {
                    b(a(a, o1.e(), o1.d));
                    return;
                }
                if (d != null)
                {
                    b(a(o1.a, e(), d));
                    return;
                } else
                {
                    b(a(a, o1.e(), b));
                    return;
                }
            }
        }
    }

    public boolean a()
    {
        return e == d.a || a == null && (c == null || c == d.a);
    }

    public final q b(q q1)
    {
        q q2 = a;
        c = null;
        e = null;
        a = q1;
        return q2;
    }

    public final void c()
    {
        c = null;
        a = null;
        e = null;
    }

    public final int d()
    {
        if (c != null)
        {
            return c.b();
        }
        if (e != null)
        {
            return e.b();
        }
        if (a != null)
        {
            return a.a();
        } else
        {
            return 0;
        }
    }

    public final d e()
    {
        if (c != null)
        {
            return c;
        }
        if (e != null)
        {
            return e;
        }
        this;
        JVM INSTR monitorenter ;
        d d1;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        d1 = e;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e = d.a;
_L1:
        exception = e;
        this;
        JVM INSTR monitorexit ;
        return exception;
        e = a.e();
          goto _L1
    }

}
