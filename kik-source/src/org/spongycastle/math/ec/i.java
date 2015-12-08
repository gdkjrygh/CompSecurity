// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.math.ec:
//            a, ECPoint, ECCurve, ECFieldElement, 
//            j, f, d

final class i
    implements a
{

    i()
    {
    }

    private static ECPoint.F2m a(ECPoint.F2m f2m, byte abyte0[], d d)
    {
        byte byte0 = ((ECCurve) ((ECCurve.F2m)((ECPoint) (f2m)).a)).a.a().byteValue();
        int k;
        if (d == null || !(d instanceof j))
        {
            d = f.a(f2m, byte0);
            f2m.a(new j(d));
        } else
        {
            d = ((j)d).a();
        }
        f2m = (ECPoint.F2m)((ECPoint) (f2m)).a.b();
        k = abyte0.length - 1;
        while (k >= 0) 
        {
            ECPoint.F2m f2m1 = f.a(f2m);
            f2m = f2m1;
            if (abyte0[k] != 0)
            {
                if (abyte0[k] > 0)
                {
                    f2m = f2m1.a(d[abyte0[k]]);
                } else
                {
                    f2m = f2m1.b(d[-abyte0[k]]);
                }
            }
            k--;
        }
        return f2m;
    }

    public final ECPoint a(ECPoint ecpoint, BigInteger biginteger, d d)
    {
        if (!(ecpoint instanceof ECPoint.F2m))
        {
            throw new IllegalArgumentException("Only ECPoint.F2m can be used in WTauNafMultiplier");
        }
        ECPoint.F2m f2m = (ECPoint.F2m)ecpoint;
        ecpoint = (ECCurve.F2m)((ECPoint) (f2m)).a;
        int k = ecpoint.h();
        byte byte0 = ((ECCurve) (ecpoint)).a.a().byteValue();
        byte byte1 = ecpoint.f();
        biginteger = f.a(biginteger, k, byte0, ecpoint.g(), byte1);
        BigInteger biginteger1;
        if (byte0 == 0)
        {
            ecpoint = f.a;
        } else
        {
            ecpoint = f.c;
        }
        biginteger1 = f.a(byte1);
        return a(f2m, f.a(byte1, biginteger, BigInteger.valueOf(16L), biginteger1, ecpoint), d);
    }
}
