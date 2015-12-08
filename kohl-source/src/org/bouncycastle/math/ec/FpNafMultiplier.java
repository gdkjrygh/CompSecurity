// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECMultiplier, ECPoint, PreCompInfo

class FpNafMultiplier
    implements ECMultiplier
{

    FpNafMultiplier()
    {
    }

    public ECPoint multiply(ECPoint ecpoint, BigInteger biginteger, PreCompInfo precompinfo)
    {
        BigInteger biginteger1 = biginteger.multiply(BigInteger.valueOf(3L));
        ECPoint ecpoint1 = ecpoint.negate();
        int i = biginteger1.bitLength() - 2;
        precompinfo = ecpoint;
        while (i > 0) 
        {
            ECPoint ecpoint2 = precompinfo.twice();
            boolean flag = biginteger1.testBit(i);
            if (flag != biginteger.testBit(i))
            {
                if (flag)
                {
                    precompinfo = ecpoint;
                } else
                {
                    precompinfo = ecpoint1;
                }
                precompinfo = ecpoint2.add(precompinfo);
            } else
            {
                precompinfo = ecpoint2;
            }
            i--;
        }
        return precompinfo;
    }
}
