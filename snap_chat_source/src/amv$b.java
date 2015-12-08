// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends amU
{

    private amv c;

    public final long a(long l, int i)
    {
        c.a(l, null);
        l = super.b.a(l, i);
        c.a(l, "resulting");
        return l;
    }

    public final long a(long l, long l1)
    {
        c.a(l, null);
        l = super.b.a(l, l1);
        c.a(l, "resulting");
        return l;
    }

    public final int b(long l, long l1)
    {
        c.a(l, "minuend");
        c.a(l1, "subtrahend");
        return super.b.b(l, l1);
    }

    public final long c(long l, long l1)
    {
        c.a(l, "minuend");
        c.a(l1, "subtrahend");
        return super.b.c(l, l1);
    }

    (amv amv1, alz alz1)
    {
        c = amv1;
        super(alz1, alz1.a());
    }
}
