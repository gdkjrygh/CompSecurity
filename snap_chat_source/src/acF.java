// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acF extends abR
{

    public static final abR b = new acF();

    private acF()
    {
    }

    public final int a()
    {
        return 4;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        int i = ((abJ)abl).b();
        short word0 = c(abl);
        short word1 = (short)adu.b(0).a;
        short word2 = (short)i;
        aeg.c(word0);
        aeg.c(word2);
        aeg.c(i >> 16);
        aeg.c(word1);
    }

    public final boolean a(abL abl)
    {
        adU adu;
        if (!a)
        {
            return false;
        }
        if (!(abl instanceof abJ))
        {
            return false;
        }
        adu = abl.e;
        ((aeN) (adu)).K.length;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 54
    //                   2 73;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        adS ads = adu.b(0);
_L5:
        if (!e(ads.a))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L3:
        adS ads1 = adu.b(0);
        ads = ads1;
        if (ads1.a != adu.b(1).a)
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
        abl = ((abJ)abl).a;
        return (abl instanceof aez) || (abl instanceof ael);
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        int i = ((aeN) (abl)).K.length;
        BitSet bitset = new BitSet(i);
        boolean flag = c(abl.b(0).a);
        if (i == 1)
        {
            bitset.set(0, flag);
        } else
        if (abl.b(0).a == abl.b(1).a)
        {
            bitset.set(0, flag);
            bitset.set(1, flag);
            return bitset;
        }
        return bitset;
    }

}
