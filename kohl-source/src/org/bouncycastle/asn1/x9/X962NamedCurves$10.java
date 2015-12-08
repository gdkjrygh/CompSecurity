// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X962NamedCurves, X9ECParameters

static class r extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        BigInteger biginteger = new BigInteger("03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309", 16);
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        org.bouncycastle.math.ec.r r = new org.bouncycastle.math.ec.r(163, 1, 2, 8, new BigInteger("07A526C63D3E25A256A007699F5447E32AE456B50E", 16), new BigInteger("03F7061798EB99E238FD6F1BF95B48FEEB4854252B", 16), biginteger, biginteger1);
        return new X9ECParameters(r, r.decodePoint(Hex.decode("0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB")), biginteger, biginteger1, null);
    }

    r()
    {
    }
}
