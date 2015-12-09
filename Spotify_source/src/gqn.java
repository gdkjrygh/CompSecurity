// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

final class gqn
    implements gtv
{

    boolean a;
    final gqm b;
    private final gsb c;
    private hcv d;
    private hcv e;

    public gqn(gqm gqm1, gsb gsb1)
    {
        b = gqm1;
        super();
        c = gsb1;
        d = gsb1.a(1);
        e = new hcl(d, gsb1) {

            private gsb a;
            private gqn b;

            public final void close()
            {
label0:
                {
                    synchronized (b.b)
                    {
                        if (!b.a)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                b.a = true;
                gqm gqm3 = b.b;
                gqm3.b = gqm3.b + 1;
                gqm2;
                JVM INSTR monitorexit ;
                super.close();
                a.a();
                return;
                exception;
                gqm2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = gqn.this;
                a = gsb1;
                super(hcv);
            }
        };
    }

    public final void a()
    {
label0:
        {
            synchronized (b)
            {
                if (!a)
                {
                    break label0;
                }
            }
            return;
        }
        a = true;
        gqm gqm1 = b;
        gqm1.c = gqm1.c + 1;
        obj;
        JVM INSTR monitorexit ;
        gsp.a(d);
        try
        {
            c.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final hcv b()
    {
        return e;
    }
}
