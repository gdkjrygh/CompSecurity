// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cei extends ckq
{

    cef a;
    private final Object c = new Object();
    private boolean d;
    private int e;

    public cei(cef cef)
    {
        a = cef;
        d = false;
        e = 0;
    }

    private void e()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (e >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        if (!d || e != 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        bka.d("No reference is left (including root). Cleaning up engine.");
        a(new ckp() {

            final cei a;

            public final void a(Object obj1)
            {
                cjj.a(new Runnable(this, (caa)obj1) {

                    private caa a;
                    private _cls3 b;

                    public final void run()
                    {
                        b.a.a.a(a);
                        a.a();
                    }

            
            {
                b = _pcls3;
                a = caa1;
                super();
            }
                });
            }

            
            {
                a = cei.this;
                super();
            }
        }, new cko());
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        bka.d("There are still references to the engine. Not destroying.");
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ceh a()
    {
        ceh ceh1 = new ceh(this);
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        a(new ckp(ceh1) {

            private ceh a;

            public final void a(Object obj1)
            {
                obj1 = (caa)obj1;
                bka.d("Getting a new session for JS Engine.");
                a.a(((caa) (obj1)).b());
            }

            
            {
                a = ceh1;
                super();
            }
        }, new ckn(ceh1) {

            private ceh a;

            public final void a()
            {
                bka.d("Rejecting reference for JS Engine.");
                a.d();
            }

            
            {
                a = ceh1;
                super();
            }
        });
        Exception exception;
        boolean flag;
        if (e >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        e = e + 1;
        obj;
        JVM INSTR monitorexit ;
        return ceh1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (e > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        bka.d("Releasing 1 reference for JS Engine");
        e = e - 1;
        e();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        boolean flag = true;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (e < 0)
        {
            flag = false;
        }
        btl.a(flag);
        bka.d("Releasing root reference. JS Engine will be destroyed once other references are released.");
        d = true;
        e();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
