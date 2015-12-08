// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECPoint, ECCurve

public class ECAlgorithms
{

    public ECAlgorithms()
    {
    }

    public static ECPoint a(ECPoint ecpoint, BigInteger biginteger, ECPoint ecpoint1, BigInteger biginteger1)
    {
        ECCurve eccurve = ecpoint.a;
        if (!eccurve.equals(ecpoint1.a))
        {
            throw new IllegalArgumentException("P and Q must be on same curve");
        }
        if ((eccurve instanceof ECCurve.F2m) && ((ECCurve.F2m)eccurve).e())
        {
            return ecpoint.a(biginteger).a(ecpoint1.a(biginteger1));
        } else
        {
            return b(ecpoint, biginteger, ecpoint1, biginteger1);
        }
    }

    private static ECPoint b(ECPoint ecpoint, BigInteger biginteger, ECPoint ecpoint1, BigInteger biginteger1)
    {
        int i = Math.max(biginteger.bitLength(), biginteger1.bitLength());
        ECPoint ecpoint4 = ecpoint.a(ecpoint1);
        ECPoint ecpoint2 = ecpoint.a.b();
        i--;
        while (i >= 0) 
        {
            ECPoint ecpoint3 = ecpoint2.h();
            if (biginteger.testBit(i))
            {
                if (biginteger1.testBit(i))
                {
                    ecpoint2 = ecpoint3.a(ecpoint4);
                } else
                {
                    ecpoint2 = ecpoint3.a(ecpoint);
                }
            } else
            {
                ecpoint2 = ecpoint3;
                if (biginteger1.testBit(i))
                {
                    ecpoint2 = ecpoint3.a(ecpoint1);
                }
            }
            i--;
        }
        return ecpoint2;
    }
}
