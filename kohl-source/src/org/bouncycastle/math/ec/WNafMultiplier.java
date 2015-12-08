// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECMultiplier, WNafPreCompInfo, ECPoint, ECCurve, 
//            PreCompInfo

class WNafMultiplier
    implements ECMultiplier
{

    WNafMultiplier()
    {
    }

    public ECPoint multiply(ECPoint ecpoint, BigInteger biginteger, PreCompInfo precompinfo)
    {
        byte byte0 = 4;
        int i = 2;
        WNafPreCompInfo wnafprecompinfo;
        ECPoint ecpoint1;
        ECPoint ecpoint2;
        int j;
        if (precompinfo != null && (precompinfo instanceof WNafPreCompInfo))
        {
            wnafprecompinfo = (WNafPreCompInfo)precompinfo;
        } else
        {
            wnafprecompinfo = new WNafPreCompInfo();
        }
        j = biginteger.bitLength();
        if (j < 13)
        {
            byte0 = 2;
            i = 1;
        } else
        if (j < 41)
        {
            byte0 = 3;
        } else
        if (j < 121)
        {
            i = 4;
        } else
        if (j < 337)
        {
            byte0 = 5;
            i = 8;
        } else
        if (j < 897)
        {
            byte0 = 6;
            i = 16;
        } else
        if (j < 2305)
        {
            byte0 = 7;
            i = 32;
        } else
        {
            i = 127;
            byte0 = 8;
        }
        precompinfo = wnafprecompinfo.getPreComp();
        ecpoint2 = wnafprecompinfo.getTwiceP();
        if (precompinfo == null)
        {
            precompinfo = new ECPoint[1];
            precompinfo[0] = ecpoint;
            j = 1;
        } else
        {
            j = precompinfo.length;
        }
        ecpoint1 = ecpoint2;
        if (ecpoint2 == null)
        {
            ecpoint1 = ecpoint.twice();
        }
        if (j < i)
        {
            ECPoint aecpoint[] = new ECPoint[i];
            System.arraycopy(precompinfo, 0, aecpoint, 0, j);
            for (; j < i; j++)
            {
                aecpoint[j] = ecpoint1.add(aecpoint[j - 1]);
            }

            precompinfo = aecpoint;
        }
        byte abyte0[] = windowNaf(byte0, biginteger);
        i = abyte0.length;
        biginteger = ecpoint.getCurve().getInfinity();
        i--;
        while (i >= 0) 
        {
            ECPoint ecpoint3 = biginteger.twice();
            biginteger = ecpoint3;
            if (abyte0[i] != 0)
            {
                if (abyte0[i] > 0)
                {
                    biginteger = ecpoint3.add(precompinfo[(abyte0[i] - 1) / 2]);
                } else
                {
                    biginteger = ecpoint3.subtract(precompinfo[(-abyte0[i] - 1) / 2]);
                }
            }
            i--;
        }
        wnafprecompinfo.setPreComp(precompinfo);
        wnafprecompinfo.setTwiceP(ecpoint1);
        ecpoint.setPreCompInfo(wnafprecompinfo);
        return biginteger;
    }

    public byte[] windowNaf(byte byte0, BigInteger biginteger)
    {
        byte abyte0[] = new byte[biginteger.bitLength() + 1];
        int k = (short)(1 << byte0);
        BigInteger biginteger1 = BigInteger.valueOf(k);
        int j = 0;
        int i = 0;
        while (biginteger.signum() > 0) 
        {
            if (biginteger.testBit(0))
            {
                BigInteger biginteger2 = biginteger.mod(biginteger1);
                if (biginteger2.testBit(byte0 - 1))
                {
                    abyte0[i] = (byte)(biginteger2.intValue() - k);
                } else
                {
                    abyte0[i] = (byte)biginteger2.intValue();
                }
                biginteger = biginteger.subtract(BigInteger.valueOf(abyte0[i]));
                j = i;
            } else
            {
                abyte0[i] = 0;
            }
            biginteger = biginteger.shiftRight(1);
            i++;
        }
        byte0 = j + 1;
        biginteger = new byte[byte0];
        System.arraycopy(abyte0, 0, biginteger, 0, byte0);
        return biginteger;
    }
}
