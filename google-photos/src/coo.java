// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class coo
    implements cnz
{

    public final nny a;
    public final cop b;
    public final cqi c;
    private final cor d;
    private final boolean e;

    public coo(nny nny1, cop cop1, boolean flag)
    {
        cmf cmf1 = clz.f().a();
        a = (nny)b.a(nny1, "mediaIdentifier", null);
        b = (cop)b.a(cop1, "metadata", null);
        c = cqi.a(cmf1);
        d = cor.a(cmf1);
        nny1 = (cmb)b.a(cmf1.c(), "generalMetrics", null);
        boolean flag1;
        if (((cmi)b.a(cmf1.d(), "pointMetrics", null)).c.b.length == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "pointMetrics.getKeyFrameMetrics().isEmpty()");
        b.a(((cmb) (nny1)).a, "durationUs", 0L, null);
        b.a(((cmb) (nny1)).b, "finalFrameTimestampUs", 0L, null);
        e = flag;
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
        return d;
    }

    public final long e()
    {
        return 0L;
    }

    public final boolean f()
    {
        return e;
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, b, Boolean.valueOf(e)
        });
    }
}
