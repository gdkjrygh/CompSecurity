// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fmt extends fni
{

    private final fml b;
    private final fna c;

    public fmt(fml fml1, fna fna1)
    {
        super("Docking");
        b = fml1;
        c = fna1;
        fml1 = new fnl() {

            private fmt a;

            public final void a()
            {
                if (((fni) (fmt.a(a))).a && ((fni) (fmt.b(a))).a)
                {
                    a.J_();
                    return;
                } else
                {
                    a.c();
                    return;
                }
            }

            public final void b()
            {
                a.c();
            }

            
            {
                a = fmt.this;
                super();
            }
        };
        b.a(fml1);
        c.a(fml1);
    }

    static fml a(fmt fmt1)
    {
        return fmt1.b;
    }

    static fna b(fmt fmt1)
    {
        return fmt1.c;
    }
}
