// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acH extends abR
{

    public static final abR b = new acH();

    private acH()
    {
    }

    public final int a()
    {
        return 5;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        int i = ((abJ)abl).b();
        a(aeg, c(abl), i, (short)adu.b(0).a, (short)adu.b(1).a);
    }

    public final boolean a(abL abl)
    {
        if (a)
        {
            adU adu = abl.e;
            if ((abl instanceof abJ) && ((aeN) (adu)).K.length == 2 && e(adu.b(0).a) && e(adu.b(1).a))
            {
                abl = ((abJ)abl).a;
                if ((abl instanceof aez) || (abl instanceof ael))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(2);
        bitset.set(0, e(abl.b(0).a));
        bitset.set(1, e(abl.b(1).a));
        return bitset;
    }

}
