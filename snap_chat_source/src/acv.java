// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acv extends abR
{

    public static final abR b = new acv();

    private acv()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        a(aeg, a(abl, adu.b(0).a), (short)adu.b(1).a);
    }

    public final boolean a(abL abl)
    {
        adU adu = abl.e;
        return (abl instanceof acc) && ((aeN) (adu)).K.length == 2 && c(adu.b(0).a) && e(adu.b(1).a);
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(2);
        bitset.set(0, c(abl.b(0).a));
        bitset.set(1, e(abl.b(1).a));
        return bitset;
    }

}
