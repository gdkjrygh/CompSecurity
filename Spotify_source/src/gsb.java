// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileNotFoundException;

public final class gsb
{

    final gsc a;
    final boolean b[];
    boolean c;
    final gsa d;

    private gsb(gsa gsa1, gsc gsc1)
    {
        d = gsa1;
        super();
        a = gsc1;
        if (gsc1.e)
        {
            gsa1 = null;
        } else
        {
            gsa1 = new boolean[gsa.a()];
        }
        b = gsa1;
    }

    gsb(gsa gsa1, gsc gsc1, byte byte0)
    {
        this(gsa1, gsc1);
    }

    public final hcv a(int i)
    {
        gsa gsa1 = d;
        gsa1;
        JVM INSTR monitorenter ;
        if (a.f != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        gsa1;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        if (!a.e)
        {
            b[i] = true;
        }
        obj1 = a.d[i];
        obj1 = gsa.h(d).b(((java.io.File) (obj1)));
        obj1 = new gse(((hcv) (obj1))) {

            private gsb a;

            protected final void a()
            {
                synchronized (a.d)
                {
                    a.c = true;
                }
                return;
                exception;
                gsa2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = gsb.this;
                super(hcv);
            }
        };
        gsa1;
        JVM INSTR monitorexit ;
        return ((hcv) (obj1));
        obj1;
        obj1 = gsa.b();
        gsa1;
        JVM INSTR monitorexit ;
        return ((hcv) (obj1));
    }

    public final void a()
    {
        gsa gsa1 = d;
        gsa1;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        gsa.a(d, this, false);
        gsa.a(d, a);
_L2:
        return;
        gsa.a(d, this, true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        gsa1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (d)
        {
            gsa.a(d, this, false);
        }
        return;
        exception;
        gsa1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
