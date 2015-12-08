// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class aco extends abR
{

    public static final abR b = new aco();

    private aco()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        aer aer1 = (aer)((abJ)abl).a;
        short word0;
        if (adu.b(0).e() == 1)
        {
            word0 = aer1.g() >> 16;
        } else
        {
            word0 = (short)(int)(aer1.h() >>> 48);
        }
        a(aeg, a(abl, adu.b(0).a), word0);
    }

    public final boolean a(abL abl)
    {
        adU adu = abl.e;
        if (!(abl instanceof abJ) || ((aeN) (adu)).K.length != 1 || !c(adu.b(0).a))
        {
            return false;
        }
        abl = ((abJ)abl).a;
        if (!(abl instanceof aer))
        {
            return false;
        }
        abl = (aer)abl;
        if (adu.b(0).e() == 1)
        {
            return (abl.g() & 0xffff) == 0;
        }
        return (abl.h() & 0xffffffffffffL) == 0L;
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(abl.b(0).a));
        return bitset;
    }

}
