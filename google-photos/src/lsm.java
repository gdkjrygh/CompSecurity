// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lsm
    implements ltq
{

    private lsl a;

    lsm(lsl lsl1)
    {
        a = lsl1;
        super();
    }

    public final void a(lro lro1)
    {
        lsl.a(a, lro1.a);
    }

    public final void b(lro lro1)
    {
        lsl.a(a, lro1.a);
        lqh.d((new StringBuilder("Permanent failure dispatching hitId: ")).append(lro1.a).toString());
    }

    public final void c(lro lro1)
    {
        long l = lro1.b;
        if (l == 0L)
        {
            lsl.a(a, lro1.a, lsl.a(a).a());
        } else
        if (l + 0xdbba00L < lsl.a(a).a())
        {
            lsl.a(a, lro1.a);
            lqh.d((new StringBuilder("Giving up on failed hitId: ")).append(lro1.a).toString());
            return;
        }
    }
}
