// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acB extends abR
{

    public static final abR b = new acB();

    private acB()
    {
    }

    public final int a()
    {
        return 3;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        int i = ((ace)abl).b();
        a(aeg, a(abl, adu.b(0).a), i);
    }

    public final boolean a(abL abl)
    {
        boolean flag = true;
        adU adu = abl.e;
        if (!(abl instanceof ace) || ((aeN) (adu)).K.length != 1 || !c(adu.b(0).a))
        {
            flag = false;
        }
        return flag;
    }

    public final boolean a(ace ace1)
    {
        return true;
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(abl.b(0).a));
        return bitset;
    }

}
