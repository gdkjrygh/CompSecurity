// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECMultiplier, ECFieldElement, WTauNafPreCompInfo, Tnaf, 
//            ECCurve, PreCompInfo, ZTauElement, ECPoint

class WTauNafMultiplier
    implements ECMultiplier
{

    WTauNafMultiplier()
    {
    }

    private static ECPoint.F2m multiplyFromWTnaf(ECPoint.F2m f2m, byte abyte0[], PreCompInfo precompinfo)
    {
        byte byte0 = ((ECCurve.F2m)f2m.getCurve()).getA().toBigInteger().byteValue();
        int i;
        if (precompinfo == null || !(precompinfo instanceof WTauNafPreCompInfo))
        {
            precompinfo = Tnaf.getPreComp(f2m, byte0);
            f2m.setPreCompInfo(new WTauNafPreCompInfo(precompinfo));
        } else
        {
            precompinfo = ((WTauNafPreCompInfo)precompinfo).getPreComp();
        }
        f2m = (ECPoint.F2m)f2m.getCurve().getInfinity();
        i = abyte0.length - 1;
        while (i >= 0) 
        {
            ECPoint.F2m f2m1 = Tnaf.tau(f2m);
            f2m = f2m1;
            if (abyte0[i] != 0)
            {
                if (abyte0[i] > 0)
                {
                    f2m = f2m1.addSimple(precompinfo[abyte0[i]]);
                } else
                {
                    f2m = f2m1.subtractSimple(precompinfo[-abyte0[i]]);
                }
            }
            i--;
        }
        return f2m;
    }

    private ECPoint.F2m multiplyWTnaf(ECPoint.F2m f2m, ZTauElement ztauelement, PreCompInfo precompinfo, byte byte0, byte byte1)
    {
        ZTauElement aztauelement[];
        BigInteger biginteger;
        if (byte0 == 0)
        {
            aztauelement = Tnaf.alpha0;
        } else
        {
            aztauelement = Tnaf.alpha1;
        }
        biginteger = Tnaf.getTw(byte1, 4);
        return multiplyFromWTnaf(f2m, Tnaf.tauAdicWNaf(byte1, ztauelement, (byte)4, BigInteger.valueOf(16L), biginteger, aztauelement), precompinfo);
    }

    public ECPoint multiply(ECPoint ecpoint, BigInteger biginteger, PreCompInfo precompinfo)
    {
        if (!(ecpoint instanceof ECPoint.F2m))
        {
            throw new IllegalArgumentException("Only ECPoint.F2m can be used in WTauNafMultiplier");
        } else
        {
            ecpoint = (ECPoint.F2m)ecpoint;
            ECCurve.F2m f2m = (ECCurve.F2m)ecpoint.getCurve();
            int i = f2m.getM();
            byte byte0 = f2m.getA().toBigInteger().byteValue();
            byte byte1 = f2m.getMu();
            return multiplyWTnaf(ecpoint, Tnaf.partModReduction(biginteger, i, byte0, f2m.getSi(), byte1, (byte)10), precompinfo, byte0, byte1);
        }
    }
}
