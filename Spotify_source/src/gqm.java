// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;

public final class gqm
{

    final gsg a;
    int b;
    int c;
    private final gsa d;
    private int e;
    private int f;
    private int g;

    public gqm(File file, long l)
    {
        this(file, l, guw.a);
    }

    private gqm(File file, long l, guw guw1)
    {
        a = new gsg() {

            private gqm a;

            public final grt a(grq grq1)
            {
                return a.a(grq1);
            }

            public final gtv a(grt grt1)
            {
                return a.a(grt1);
            }

            public final void a()
            {
                a.a();
            }

            public final void a(grt grt1, grt grt2)
            {
                gqp gqp1 = new gqp(grt2);
                grt2 = gqo.a((gqo)grt1.g);
                grt1 = null;
                try
                {
                    grt2 = gsa.a(((gsd) (grt2)).d, ((gsd) (grt2)).a, ((gsd) (grt2)).b);
                }
                // Misplaced declaration of an exception variable
                catch (grt grt2)
                {
                    gqm.a(grt1);
                    return;
                }
                if (grt2 == null)
                {
                    break MISSING_BLOCK_LABEL_55;
                }
                grt1 = grt2;
                gqp1.a(grt2);
                grt1 = grt2;
                grt2.a();
            }

            public final void a(gtw gtw1)
            {
                a.a(gtw1);
            }

            public final void b(grq grq1)
            {
                a.b(grq1);
            }

            
            {
                a = gqm.this;
                super();
            }
        };
        d = gsa.a(guw1, file, l);
    }

    static int a(hcj hcj1)
    {
        long l;
        try
        {
            l = hcj1.m();
            hcj1 = hcj1.q();
        }
        // Misplaced declaration of an exception variable
        catch (hcj hcj1)
        {
            throw new IOException(hcj1.getMessage());
        }
        if (l < 0L || l > 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (hcj1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        throw new IOException((new StringBuilder("expected an int but was \"")).append(l).append(hcj1).append("\"").toString());
        return (int)l;
    }

    static void a(gsb gsb1)
    {
        if (gsb1 == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        gsb1.b();
        return;
        gsb1;
    }

    private static String c(grq grq1)
    {
        return gsp.a(grq1.a.toString());
    }

    final grt a(grq grq1)
    {
        boolean flag1 = false;
        Object obj = c(grq1);
        gqp gqp1;
        String s;
        String s1;
        Object obj1;
        gru gru1;
        boolean flag;
        try
        {
            obj = d.a(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (grq grq1)
        {
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        try
        {
            gqp1 = new gqp(((gsd) (obj)).c[0]);
        }
        // Misplaced declaration of an exception variable
        catch (grq grq1)
        {
            gsp.a(((java.io.Closeable) (obj)));
            return null;
        }
        s = gqp1.g.a("Content-Type");
        s1 = gqp1.g.a("Content-Length");
        obj1 = (new grr()).a(gqp1.a).a(gqp1.c, null);
        obj1.c = gqp1.b.b();
        obj1 = ((grr) (obj1)).b();
        gru1 = new gru();
        gru1.a = ((grq) (obj1));
        gru1.b = gqp1.d;
        gru1.c = gqp1.e;
        gru1.d = gqp1.f;
        obj1 = gru1.a(gqp1.g);
        obj1.g = new gqo(((gsd) (obj)), s, s1);
        obj1.e = gqp1.h;
        obj = ((gru) (obj1)).a();
        flag = flag1;
        if (gqp1.a.equals(grq1.a.toString()))
        {
            flag = flag1;
            if (gqp1.c.equals(grq1.b))
            {
                flag = flag1;
                if (gum.a(((grt) (obj)), gqp1.b, grq1))
                {
                    flag = true;
                }
            }
        }
        if (!flag)
        {
            gsp.a(((grt) (obj)).g);
            return null;
        } else
        {
            return ((grt) (obj));
        }
    }

    final gtv a(grt grt1)
    {
label0:
        {
            {
                Object obj = grt1.a.b;
                if (!guk.a(grt1.a.b))
                {
                    break label0;
                }
                IOException ioexception;
                try
                {
                    b(grt1.a);
                }
                // Misplaced declaration of an exception variable
                catch (grt grt1)
                {
                    return null;
                }
            }
            return null;
        }
        if (!((String) (obj)).equals("GET") || gum.b(grt1))
        {
            break MISSING_BLOCK_LABEL_29;
        }
        obj = new gqp(grt1);
        grt1 = d.a(c(grt1.a), -1L);
        if (grt1 == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        ((gqp) (obj)).a(grt1);
        obj = new gqn(this, grt1);
        return ((gtv) (obj));
        grt1;
        grt1 = null;
_L2:
        a(((gsb) (grt1)));
        return null;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(gtw gtw1)
    {
        this;
        JVM INSTR monitorenter ;
        g = g + 1;
        if (gtw1.a == null) goto _L2; else goto _L1
_L1:
        e = e + 1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (gtw1.b != null)
        {
            f = f + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        gtw1;
        throw gtw1;
    }

    final void b(grq grq1)
    {
        d.b(c(grq1));
    }
}
