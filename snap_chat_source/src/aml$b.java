// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class e extends e
{

    private aml h;

    public final long a(long l, int i)
    {
        if (l < c) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = b.a(l, i);
        l = l1;
        if (l1 >= c) goto _L4; else goto _L3
_L3:
        l = l1;
        if (aml.a(h) + l1 >= c) goto _L4; else goto _L5
_L5:
        if (!d) goto _L7; else goto _L6
_L6:
        l = l1;
        if (((alZ) (aml.b(h))).w.a(l1) <= 0)
        {
            l = ((alZ) (aml.b(h))).w.a(l1, -1);
        }
_L11:
        l = h(l);
_L4:
        return l;
_L7:
        l = l1;
        if (((alZ) (aml.b(h))).z.a(l1) <= 0)
        {
            l = ((alZ) (aml.b(h))).z.a(l1, -1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = a.a(l, i);
        l = l1;
        if (l1 < c) goto _L4; else goto _L8
_L8:
        l = l1;
        if (l1 - aml.a(h) < c) goto _L4; else goto _L9
_L9:
        return g(l1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final long a(long l, long l1)
    {
        if (l < c) goto _L2; else goto _L1
_L1:
        l1 = b.a(l, l1);
        l = l1;
        if (l1 >= c) goto _L4; else goto _L3
_L3:
        l = l1;
        if (aml.a(h) + l1 >= c) goto _L4; else goto _L5
_L5:
        if (!d) goto _L7; else goto _L6
_L6:
        l = l1;
        if (((alZ) (aml.b(h))).w.a(l1) <= 0)
        {
            l = ((alZ) (aml.b(h))).w.a(l1, -1);
        }
_L11:
        l = h(l);
_L4:
        return l;
_L7:
        l = l1;
        if (((alZ) (aml.b(h))).z.a(l1) <= 0)
        {
            l = ((alZ) (aml.b(h))).z.a(l1, -1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = a.a(l, l1);
        l = l1;
        if (l1 < c) goto _L4; else goto _L8
_L8:
        l = l1;
        if (l1 - aml.a(h) < c) goto _L4; else goto _L9
_L9:
        return g(l1);
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final int b(long l, long l1)
    {
        if (l >= c)
        {
            if (l1 >= c)
            {
                return b.b(l, l1);
            } else
            {
                l = h(l);
                return a.b(l, l1);
            }
        }
        if (l1 < c)
        {
            return a.b(l, l1);
        } else
        {
            l = g(l);
            return b.b(l, l1);
        }
    }

    public final int c(long l)
    {
        if (l >= c)
        {
            return b.c(l);
        } else
        {
            return a.c(l);
        }
    }

    public final long c(long l, long l1)
    {
        if (l >= c)
        {
            if (l1 >= c)
            {
                return b.c(l, l1);
            } else
            {
                l = h(l);
                return a.c(l, l1);
            }
        }
        if (l1 < c)
        {
            return a.c(l, l1);
        } else
        {
            l = g(l);
            return b.c(l, l1);
        }
    }

    (aml aml1, alt alt1, alt alt2, long l)
    {
        this(aml1, alt1, alt2, null, l, false);
    }

    (aml aml1, alt alt1, alt alt2, alz alz, long l)
    {
        this(aml1, alt1, alt2, alz, l, false);
    }

    (aml aml1, alt alt1, alt alt2, alz alz, long l, boolean flag)
    {
        h = aml1;
        super(aml1, alt1, alt2, l, flag);
        aml1 = alz;
        if (alz == null)
        {
            aml1 = new <init>(e, this);
        }
        e = aml1;
    }
}
