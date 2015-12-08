// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileNotFoundException;

public final class >
{

    final d a;
    final boolean b[];
    boolean c;
    final XF d;

    public final ain a(int i)
    {
        XF xf = d;
        xf;
        JVM INSTR monitorenter ;
        if (a.f != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        xf;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1;
        if (!a.e)
        {
            b[i] = true;
        }
        obj1 = a.d[i];
        obj1 = XF.h(d).b(((java.io.File) (obj1)));
        obj1 = new XG(((ain) (obj1))) {

            private XF.a a;

            protected final void a()
            {
                synchronized (a.d)
                {
                    a.c = true;
                }
                return;
                exception;
                xf1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = XF.a.this;
                super(ain);
            }
        };
        xf;
        JVM INSTR monitorexit ;
        return ((ain) (obj1));
        obj1;
        obj1 = XF.b();
        xf;
        JVM INSTR monitorexit ;
        return ((ain) (obj1));
    }

    public final void a()
    {
        XF xf = d;
        xf;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        XF.a(d, this, false);
        XF.a(d, a);
_L2:
        return;
        XF.a(d, this, true);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        xf;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (d)
        {
            XF.a(d, this, false);
        }
        return;
        exception;
        xf;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private >(XF xf, nit> nit>)
    {
        d = xf;
        super();
        a = nit>;
        if (nit>.e)
        {
            xf = null;
        } else
        {
            xf = new boolean[XF.a()];
        }
        b = xf;
    }

    >(XF xf, b b1, byte byte0)
    {
        this(xf, b1);
    }
}
