// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnf extends fni
{

    private final fni b;
    private final fng c;
    private final fmh d;
    private final fmw e;
    private final fni f;
    private final fnm g;

    public fnf(fnm fnm1, fnq fnq, fng fng1, fmh fmh1, fmw fmw1, fni fni1)
    {
        super("PlaybackNotification");
        g = fnm1;
        b = fnq;
        c = fng1;
        d = fmh1;
        e = fmw1;
        f = fni1;
        fnm1 = new fnl() {

            private fnf a;

            public final void a()
            {
                if (((fni) (a)).a)
                {
                    a.c();
                }
            }

            public final void b()
            {
                if (fnf.a(a).a)
                {
                    a.c();
                } else
                if (((fni) (fnf.b(a))).a || ((fni) (fnf.c(a))).a)
                {
                    a.J_();
                    return;
                }
            }

            
            {
                a = fnf.this;
                super();
            }
        };
        fnq = new fnl() {

            private fnf a;

            public final void a()
            {
                if (fnf.d(a).d())
                {
                    a.J_();
                }
            }

            public final void b()
            {
            }

            
            {
                a = fnf.this;
                super();
            }
        };
        fng1 = new fnl() {

            private fnf a;

            public final void a()
            {
            }

            public final void b()
            {
                a.c();
            }

            
            {
                a = fnf.this;
                super();
            }
        };
        c.a(fnq);
        d.a(fng1);
        e.a(fnm1);
    }

    static fni a(fnf fnf1)
    {
        return fnf1.b;
    }

    static fng b(fnf fnf1)
    {
        return fnf1.c;
    }

    static fmh c(fnf fnf1)
    {
        return fnf1.d;
    }

    static fmw d(fnf fnf1)
    {
        return fnf1.e;
    }

    final void J_()
    {
        this;
        JVM INSTR monitorenter ;
        fnn fnn1 = g.j;
        if (((fni) (fnn1)).a)
        {
            fnn1.c();
        }
        super.J_();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        fnn fnn1 = g.j;
        super.c();
        if (f.a)
        {
            fnn1.J_();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
