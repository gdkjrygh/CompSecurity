// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ng.Object
    implements fnl
{

    private boolean a;
    private boolean b;
    private fnk c;

    public final void a()
    {
        if (a || b)
        {
            if (a && ((fni) (fnk.c(c).b)).a && fnk.c(c).o.d())
            {
                fnk.a(c).a(false);
                return;
            }
            if (b)
            {
                fnk.l(c).a(false);
                return;
            }
        }
    }

    public final void b()
    {
label0:
        {
            if (fnk.c(c).o.d())
            {
                if (((fni) (fnk.c(c).c)).a)
                {
                    fnk.a(c).a(true);
                    a = true;
                } else
                {
                    a = false;
                }
                if (!((fni) (fnk.c(c).p)).a)
                {
                    break label0;
                }
                fnk.l(c).a(true);
                b = true;
            }
            return;
        }
        b = false;
    }

    ct(fnk fnk1)
    {
        c = fnk1;
        super();
    }
}
