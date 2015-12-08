// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.math.ec:
//            a, ECPoint, d

final class b
    implements a
{

    b()
    {
    }

    public final ECPoint a(ECPoint ecpoint, BigInteger biginteger, d d)
    {
        BigInteger biginteger1 = biginteger.multiply(BigInteger.valueOf(3L));
        ECPoint ecpoint1 = ecpoint.g();
        int i = biginteger1.bitLength() - 2;
        d = ecpoint;
        while (i > 0) 
        {
            ECPoint ecpoint2 = d.h();
            boolean flag = biginteger1.testBit(i);
            if (flag != biginteger.testBit(i))
            {
                if (flag)
                {
                    d = ecpoint;
                } else
                {
                    d = ecpoint1;
                }
                d = ecpoint2.a(d);
            } else
            {
                d = ecpoint2;
            }
            i--;
        }
        return d;
    }
}
