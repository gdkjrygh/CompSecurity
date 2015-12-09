// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fmv extends fni
{

    public fmv(fnj fnj1)
    {
        super("DuckingAudio");
        dvc dvc = new dvc() {

            private fmv a;

            public final void a()
            {
            }

            public final void a(boolean flag, boolean flag1)
            {
                if (flag && flag1)
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
                a.c();
            }

            
            {
                a = fmv.this;
                super();
            }
        };
        fnj1.b.a(dvc);
    }
}
