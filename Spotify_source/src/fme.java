// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fme extends fni
{

    private final fni b;
    private final fni c;

    public fme(fni fni1, fni fni2)
    {
        super("ActiveLocalPlayback");
        b = fni1;
        c = fni2;
        fni1 = new fnl() {

            private fme a;

            private void c()
            {
                if (fme.a(a).a && fme.b(a).d())
                {
                    a.J_();
                    return;
                } else
                {
                    a.c();
                    return;
                }
            }

            public final void a()
            {
                c();
            }

            public final void b()
            {
                c();
            }

            
            {
                a = fme.this;
                super();
            }
        };
        b.a(fni1);
        c.a(fni1);
    }

    static fni a(fme fme1)
    {
        return fme1.b;
    }

    static fni b(fme fme1)
    {
        return fme1.c;
    }
}
