// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fmp extends fni
{

    private final fmt b;
    private final fmw c;
    private final fme d;

    public fmp(fmt fmt1, fmw fmw1, fme fme1)
    {
        super("ConnectPlayback");
        b = fmt1;
        c = fmw1;
        d = fme1;
        fmt1 = new fnl() {

            private fmp a;

            public final void a()
            {
                fmp.a(a);
            }

            public final void b()
            {
                fmp.a(a);
            }

            
            {
                a = fmp.this;
                super();
            }
        };
        b.a(fmt1);
        c.a(fmt1);
        d.a(fmt1);
    }

    static void a(fmp fmp1)
    {
        if (((fni) (fmp1.c)).a || ((fni) (fmp1.b)).a || ((fni) (fmp1.d)).a)
        {
            fmp1.c();
            return;
        } else
        {
            fmp1.J_();
            return;
        }
    }
}
