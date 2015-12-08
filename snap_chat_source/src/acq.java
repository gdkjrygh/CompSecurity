// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acq extends abR
{

    public static final abR b = new acq();

    private acq()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        int i = ((ace)abl).b();
        a(aeg, a(abl, adu.b(0).a), (short)i);
    }

    public final boolean a(abL abl)
    {
        boolean flag = true;
        adU adu = abl.e;
        if (!(abl instanceof ace) || ((aeN) (adu)).K.length != 1 || !c(adu.b(0).a))
        {
            flag = false;
        } else
        {
            abl = (ace)abl;
            if (abl.g())
            {
                return a(((ace) (abl)));
            }
        }
        return flag;
    }

    public final boolean a(ace ace1)
    {
        int i = ace1.b();
        return i != 0 && d(i);
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(abl.b(0).a));
        return bitset;
    }

}
