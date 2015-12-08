// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bwi
    implements bwk
{

    private bvz a;

    bwi(bvz bvz1)
    {
        a = bvz1;
        super();
    }

    public final void a()
    {
        bvz.d(a);
        bvz.e(a).a();
        bvz.c(a, (bwj)bvz.a(a).b);
    }

    public final void a(cqa cqa1)
    {
        bvz.c(a);
        bvz.a(a, cqa1);
    }

    public final void a(boolean flag)
    {
        bvz.f(a).f(flag);
        bvz.g(a).b.R = true;
    }

    public final void b()
    {
        bvz.h(a);
        Object obj1 = bvz.j(a);
        Object obj = bvz.i(a).c.k;
        obj1 = ((bww) (obj1)).b;
        boolean flag;
        if (obj == null)
        {
            obj = cqc.a;
        } else
        {
            obj = ((cqa) (obj)).e;
        }
        obj1.w = ((cqc) (obj));
        obj = bvz.l(a);
        flag = bvz.k(a).b.Q;
        ((bww) (obj)).b.S = flag;
    }

    public final void c()
    {
        bww bww1;
        cqa cqa1;
        boolean flag1;
        flag1 = true;
        bvz.m(a);
        bww1 = bvz.n(a);
        cqa1 = bww1.c.k;
        if (cqa1 == null && !bww1.b.w.b()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (cqa1 == null) goto _L4; else goto _L3
_L3:
        if (bww1.b.w.b()) goto _L6; else goto _L5
_L5:
        flag = flag1;
_L4:
        if (flag)
        {
            bvz.a(a, bvz.o(a).e());
        }
        bvz.q(a).f(bvz.p(a).b.S);
        return;
_L6:
        flag = flag1;
        if (!cqa1.e.equals(bww1.b.w))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L4; else goto _L7
_L7:
    }
}
