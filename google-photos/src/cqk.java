// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cqk
    implements cnz
{

    public final nny a;
    public final cql b;
    public final cqi c;
    public final cog d;
    public final long e;
    public final long f;
    private final cor g;
    private final boolean h;

    public cqk(nny nny1, cql cql1, long l, boolean flag)
    {
        cmf cmf1 = clz.f().a();
        a = (nny)b.a(nny1, "mediaIdentifier", null);
        b = (cql)b.a(cql1, "metadata", null);
        b.a(cmf1, "metrics", null);
        c = cqi.a(cmf1);
        g = cor.a(cmf1);
        d = ((cmi)b.a(cmf1.d(), "pointMetrics", null)).c;
        nny1 = (cmb)b.a(cmf1.c(), "generalMetrics", null);
        e = l;
        f = ((cmb) (nny1)).b;
        h = flag;
    }

    public final nny a()
    {
        return a;
    }

    public final coi b()
    {
        return b;
    }

    public final cqi c()
    {
        return c;
    }

    public final cor d()
    {
        return g;
    }

    public final long e()
    {
        return e;
    }

    public final boolean f()
    {
        return h;
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, b, Long.valueOf(e), Long.valueOf(f), Boolean.valueOf(h)
        });
    }
}
