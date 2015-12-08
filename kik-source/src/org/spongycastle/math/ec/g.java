// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.math.ec:
//            a, h, ECPoint, ECCurve, 
//            d

final class g
    implements a
{

    g()
    {
    }

    public final ECPoint a(ECPoint ecpoint, BigInteger biginteger, d d)
    {
        h h1;
        ECPoint ecpoint1;
        int i;
        int j;
        int k;
        if (d != null && (d instanceof h))
        {
            h1 = (h)d;
        } else
        {
            h1 = new h();
        }
        i = biginteger.bitLength();
        if (i < 13)
        {
            i = 2;
            j = 1;
        } else
        if (i < 41)
        {
            i = 3;
            j = 2;
        } else
        if (i < 121)
        {
            i = 4;
            j = 4;
        } else
        if (i < 337)
        {
            i = 5;
            j = 8;
        } else
        if (i < 897)
        {
            i = 6;
            j = 16;
        } else
        if (i < 2305)
        {
            i = 7;
            j = 32;
        } else
        {
            i = 8;
            j = 127;
        }
        k = 1;
        d = h1.a();
        ecpoint1 = h1.b();
        if (d == null)
        {
            d = new ECPoint[1];
            d[0] = ecpoint;
        } else
        {
            k = d.length;
        }
        if (ecpoint1 == null)
        {
            ecpoint1 = ecpoint.h();
        }
        if (k < j)
        {
            ECPoint aecpoint[] = new ECPoint[j];
            System.arraycopy(d, 0, aecpoint, 0, k);
            for (; k < j; k++)
            {
                aecpoint[k] = ecpoint1.a(aecpoint[k - 1]);
            }

            d = aecpoint;
        }
        byte abyte0[] = new byte[biginteger.bitLength() + 1];
        int l = (short)(1 << i);
        BigInteger biginteger1 = BigInteger.valueOf(l);
        j = 0;
        k = 0;
        while (biginteger.signum() > 0) 
        {
            if (biginteger.testBit(0))
            {
                BigInteger biginteger2 = biginteger.mod(biginteger1);
                if (biginteger2.testBit(i - 1))
                {
                    abyte0[j] = (byte)(biginteger2.intValue() - l);
                } else
                {
                    abyte0[j] = (byte)biginteger2.intValue();
                }
                biginteger = biginteger.subtract(BigInteger.valueOf(abyte0[j]));
                k = j;
            } else
            {
                abyte0[j] = 0;
            }
            biginteger = biginteger.shiftRight(1);
            j++;
        }
        i = k + 1;
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        i = abyte1.length;
        biginteger = ecpoint.a.b();
        i--;
        while (i >= 0) 
        {
            ECPoint ecpoint2 = biginteger.h();
            biginteger = ecpoint2;
            if (abyte1[i] != 0)
            {
                if (abyte1[i] > 0)
                {
                    biginteger = ecpoint2.a(d[(abyte1[i] - 1) / 2]);
                } else
                {
                    biginteger = ecpoint2.b(d[(-abyte1[i] - 1) / 2]);
                }
            }
            i--;
        }
        h1.a(d);
        h1.a(ecpoint1);
        ecpoint.a(h1);
        return biginteger;
    }
}
