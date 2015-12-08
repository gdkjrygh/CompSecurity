// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECMultiplier, ECPoint, ECCurve, PreCompInfo

class ReferenceMultiplier
    implements ECMultiplier
{

    ReferenceMultiplier()
    {
    }

    public ECPoint multiply(ECPoint ecpoint, BigInteger biginteger, PreCompInfo precompinfo)
    {
        precompinfo = ecpoint.getCurve().getInfinity();
        int j = biginteger.bitLength();
        for (int i = 0; i < j;)
        {
            Object obj = precompinfo;
            if (biginteger.testBit(i))
            {
                obj = precompinfo.add(ecpoint);
            }
            ecpoint = ecpoint.twice();
            i++;
            precompinfo = ((PreCompInfo) (obj));
        }

        return precompinfo;
    }
}
