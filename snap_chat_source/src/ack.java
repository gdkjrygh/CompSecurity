// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class ack extends abR
{

    public static final abR b = new ack();

    private ack()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final void a(aeG aeg, abL abl)
    {
        aeg.c(a(abl, abl.e.b(0).a));
    }

    public final boolean a(abL abl)
    {
        adU adu = abl.e;
        return (abl instanceof acc) && ((aeN) (adu)).K.length == 1 && c(adu.b(0).a);
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(abl.b(0).a));
        return bitset;
    }

}
