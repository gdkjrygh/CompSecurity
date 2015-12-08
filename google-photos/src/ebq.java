// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ebq
    implements emf
{

    private final elp a;
    private final ebr b;

    public ebq(elp elp1, ebr ebr1)
    {
        a = elp1;
        b = ebr1;
    }

    private elm a(ebt ebt1, ekk ekk)
    {
        nsx nsx1 = null;
        nsx nsx2 = b.a(ebt1.a, ebt1.c);
        nsx1 = nsx2;
        if (nsx2.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        nsx1 = nsx2;
        throw new eku(ebt1);
        ebt1;
        if (nsx1 != null)
        {
            nsx1.close();
        }
        throw ebt1;
        nsx1 = nsx2;
        qgg aqgg[] = ebr.a(nsx2).b.a;
        nsx1 = nsx2;
        int j = aqgg.length;
        int i = 0;
_L2:
        qgg qgg1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        qgg1 = aqgg[i];
        nsx1 = nsx2;
        if (!ebt1.b.equals(qgg1.b.a))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        nsx1 = nsx2;
        ebt1 = a.a(ebt1.a, qgg1, ekk);
        if (nsx2 != null)
        {
            nsx2.close();
        }
        return ebt1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        nsx1 = nsx2;
        throw new eku(ebt1);
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (ebt)ekp;
        return new ebt(((ebt) (ekp)).a, ((ebt) (ekp)).b, ((ebt) (ekp)).c, elm, ((ebt) (ekp)).d, ((ebt) (ekp)).f, ((ebt) (ekp)).e);
    }

    public final volatile elm a(ekp ekp, ekk ekk)
    {
        return a((ebt)ekp, ekk);
    }

    public final Class a()
    {
        return ebt;
    }
}
