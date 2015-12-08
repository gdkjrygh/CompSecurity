// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acG extends abR
{

    public static final abR b = new acG();

    private acG()
    {
    }

    public final int a()
    {
        return 5;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        long l = ((aeq)((abJ)abl).a).b;
        abR.a(aeg, a(abl, adu.b(0).a), (short)(int)l, (short)(int)(l >> 16), (short)(int)(l >> 32), (short)(int)(l >> 48));
    }

    public final boolean a(abL abl)
    {
        adU adu = abl.e;
        if (!(abl instanceof abJ) || ((aeN) (adu)).K.length != 1 || !c(adu.b(0).a))
        {
            return false;
        } else
        {
            return ((abJ)abl).a instanceof aeq;
        }
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(abl.b(0).a));
        return bitset;
    }

}
