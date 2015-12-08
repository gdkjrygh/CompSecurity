// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bms
    implements bmy
{

    private bmq a;

    bms(bmq bmq1)
    {
        a = bmq1;
        super();
    }

    public final void a()
    {
        bmq.a(a, 1);
    }

    public final void a(bmw bmw1)
    {
        bmq.b(a).a(true);
        if (bmw1 == bmw.b)
        {
            bmq.b(a).f();
            return;
        } else
        {
            bmq.b(a).g();
            return;
        }
    }

    public final void a(boolean flag)
    {
        bmq.b(a).a(flag);
        if (!flag)
        {
            bmq.c(a).b();
        }
    }

    public final void b()
    {
        bmq.a(a, 2);
    }

    public final void c()
    {
        bmq.a(a, 3);
    }
}
