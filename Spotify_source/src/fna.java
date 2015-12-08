// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fna extends fni
{

    private final fmy b;
    private final fmm c;

    public fna(fmy fmy1, fmm fmm1)
    {
        super("LocalSpeakerConnected");
        b = fmy1;
        c = fmm1;
        fmy1 = new fnl() {

            private fna a;

            public final void a()
            {
                fna.a(a);
            }

            public final void b()
            {
                fna.a(a);
            }

            
            {
                a = fna.this;
                super();
            }
        };
        b.a(fmy1);
        c.a(fmy1);
    }

    static void a(fna fna1)
    {
        if (((fni) (fna1.b)).a || ((fni) (fna1.c)).a)
        {
            fna1.J_();
            return;
        } else
        {
            fna1.c();
            return;
        }
    }
}
