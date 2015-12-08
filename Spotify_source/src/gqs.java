// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.http.RequestException;
import com.squareup.okhttp.internal.http.RouteException;
import java.io.IOException;
import java.net.ProtocolException;

public final class gqs
{

    final gro a;
    volatile boolean b;
    grq c;
    gui d;
    private boolean e;

    protected gqs(gro gro1, grq grq1)
    {
        a = gro1.b();
        c = grq1;
    }

    public final grt a()
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        e = true;
        this;
        JVM INSTR monitorexit ;
        Object obj;
        a.b.a(this);
        obj = a(false);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        throw new IOException("Canceled");
        obj;
        a.b.b(this);
        throw obj;
        a.b.b(this);
        return ((grt) (obj));
    }

    final grt a(grq grq1, boolean flag)
    {
        grs grs1 = grq1.d;
        int i;
        if (grs1 != null)
        {
            grq1 = grq1.c();
            grn grn1 = grs1.a();
            if (grn1 != null)
            {
                grq1.a("Content-Type", grn1.toString());
            }
            long l = grs1.b();
            if (l != -1L)
            {
                grq1.a("Content-Length", Long.toString(l));
                grq1.b("Transfer-Encoding");
            } else
            {
                grq1.a("Transfer-Encoding", "chunked");
                grq1.b("Content-Length");
            }
            grq1 = grq1.b();
        }
        d = new gui(a, grq1, false, false, flag, null, null, null, null);
        i = 0;
        do
        {
            if (b)
            {
                d.g();
                throw new IOException("Canceled");
            }
            Object obj;
            try
            {
                d.a();
                d.j();
            }
            // Misplaced declaration of an exception variable
            catch (grq grq1)
            {
                throw grq1.a();
            }
            // Misplaced declaration of an exception variable
            catch (grq grq1)
            {
                obj = d.a(grq1);
                if (obj != null)
                {
                    d = ((gui) (obj));
                } else
                {
                    throw ((RouteException) (grq1)).lastException;
                }
                continue;
            }
            // Misplaced declaration of an exception variable
            catch (grq grq1)
            {
                obj = d.a(grq1, null);
                if (obj != null)
                {
                    d = ((gui) (obj));
                } else
                {
                    throw grq1;
                }
                continue;
            }
            grq1 = d.f();
            obj = d.k();
            if (obj == null)
            {
                if (!flag)
                {
                    d.g();
                }
                return grq1;
            }
            i++;
            if (i > 20)
            {
                throw new ProtocolException((new StringBuilder("Too many follow-up requests: ")).append(i).toString());
            }
            if (!d.a(((grq) (obj)).a))
            {
                d.g();
            }
            gqz gqz = d.i();
            d = new gui(a, ((grq) (obj)), false, false, flag, gqz, null, null, grq1);
        } while (true);
    }

    final grt a(boolean flag)
    {
        return (new gqt(this, 0, c, false)).a(c);
    }

    public final void a(gqv gqv)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IllegalStateException("Already Executed");
        }
        break MISSING_BLOCK_LABEL_24;
        gqv;
        this;
        JVM INSTR monitorexit ;
        throw gqv;
        e = true;
        this;
        JVM INSTR monitorexit ;
        a.b.a(new gqu(this, gqv, (byte)0));
        return;
    }

    public final void b()
    {
        b = true;
        if (d != null)
        {
            d.h();
        }
    }

    public final boolean c()
    {
        return b;
    }
}
