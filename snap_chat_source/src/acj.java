// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.BitSet;

public final class acj extends abR
{

    public static final abR b = new acj();

    private acj()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final void a(aeG aeg, abL abl)
    {
        adU adu = abl.e;
        int i = ((aer)((abJ)abl).a).g();
        aeg.c(a(abl, b(adu.b(0).a, i & 0xf)));
    }

    public final boolean a(abL abl)
    {
        adU adu = abl.e;
        if (!(abl instanceof abJ) || ((aeN) (adu)).K.length != 1 || !a(adu.b(0).a))
        {
            return false;
        }
        abl = ((abJ)abl).a;
        if (!(abl instanceof aer))
        {
            return false;
        }
        abl = (aer)abl;
        if (abl.f())
        {
            int i = abl.g();
            boolean flag;
            if (i >= -8 && i <= 7)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final BitSet b(abL abl)
    {
        abl = abl.e;
        BitSet bitset = new BitSet(1);
        bitset.set(0, a(abl.b(0).a));
        return bitset;
    }

}
