// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dri
    implements drr
{

    private drc a;

    dri(drc drc1)
    {
        a = drc1;
        super();
    }

    public final int a(long l)
    {
        exh exh1 = drc.b(a).a();
        int i = exh1.a(l);
        int j = drc.c(a).a().a(l);
        if (i == 0x80000000 || j == 0x80000000)
        {
            return -1;
        }
        long l1 = drc.c(a).a().a(j);
        if (l1 == 0x8000000000000000L)
        {
            i = exh1.a(l, 0x7fffffffffffffffL) + 1;
        } else
        {
            i = exh1.a(l, l1);
        }
        return drc.d(a).a((gml)p.b(drc.c(a).a, "must call initializeFactory"), j) + i;
    }
}
