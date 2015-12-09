// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnp extends fni
{

    public fnp(fnj fnj1, fna fna1)
    {
        super("TransientFocusLoss");
        dvc dvc = new dvc() {

            private fnp a;

            public final void a()
            {
            }

            public final void a(boolean flag, boolean flag1)
            {
                if (flag)
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
            }

            public final void c()
            {
            }

            
            {
                a = fnp.this;
                super();
            }
        };
        fnj1.b.a(dvc);
        fna1.a(new fnl() {

            private fnp a;

            public final void a()
            {
            }

            public final void b()
            {
                a.c();
            }

            
            {
                a = fnp.this;
                super();
            }
        });
    }
}
